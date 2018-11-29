for FILE in *.xml.gz; do
	gunzip $FILE
done

echo "seconds,coverage,time" > statistics_execution.csv

I=2

for FILE in *.xml; do
	sed -n '2,4p;5q' $FILE > $FILE.out

	# Calculate delta time
	END=$(grep -oP "(?<=generated=\")[^ ]+" $FILE.out)
	END=${END%?}
	
	START=$(grep -oP "(?<=timestamp=\")[^ ]+" $FILE.out)
	START=${START%?}
	START=${START%?}

	TOTAL_TIME=`expr $END - $START`
	# echo $TOTAL_TIME

	# Calculate coverage
	COV_ELEMENTS=$(grep -oP "(?<=coveredelements=\")[^ ]+" $FILE.out)
	COV_ELEMENTS=${COV_ELEMENTS%?}

	UNCOV_ELEMENTS=$(grep -oP "(?<= elements=\")[^ ]+" $FILE.out)
	UNCOV_ELEMENTS=${UNCOV_ELEMENTS%?}
	# echo $UNCOV_ELEMENTS

	COVERAGE=$(bc -l <<< "scale=16; $COV_ELEMENTS/$UNCOV_ELEMENTS")

	echo "$I,$COVERAGE,$TOTAL_TIME" >> statistics_execution.csv
	((I+=2))
done

rm *.out