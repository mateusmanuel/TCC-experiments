#!/usr/bin/python

import matplotlib.pyplot as plt
import pandas as pd
import numpy as np

df = pd.read_csv('statistics_generation.csv')
df = df.groupby(['seconds']).mean()
df.loc[:,'coverage'] *= 100.0

font = {'family' : 'serif',
        'size' : 10 }
plt.rc('font', **font)

x = np.arange(1, 31, step=1)

fig, ax1 = plt.subplots()
plt.xticks(x)

ax1.plot(x, df['coverage'], 'C0-', linewidth=2.0)
ax1.set_xlabel('Massa de dados')
# Make the y-axis label, ticks and tick labels match the line color.
ax1.set_ylabel('Cobertura (%)', color='C0')
ax1.tick_params('y', colors='C0')
ax1.xaxis.set_tick_params(labelsize=7)
# ax1.grid()

ax2 = ax1.twinx()
ax2.plot(x, df['time'], 'C1--', linewidth=2.0)
ax2.set_ylabel('Esforço computacional (ms)', color='C1')
ax2.tick_params('y', colors='C1')

fig.tight_layout()
fig = plt.gcf()
fig.savefig('jsoup.parser_generation.png')

plt.show()