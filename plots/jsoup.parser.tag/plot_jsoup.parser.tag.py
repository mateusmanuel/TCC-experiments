#!/usr/bin/python

import matplotlib.pyplot as plt
import pandas as pd
import numpy as np

# df = pd.read_csv('statistics_execution.csv')
df = pd.read_csv('statistics_generation.csv')
df.loc[:,'coverage'] *= 100.0
# df.loc[:,'time'] /= 1000.0

font = {'family' : 'serif',
        'size' : 10 }
plt.rc('font', **font)

fig, ax1 = plt.subplots()

x = np.arange(2, 21, step=2)
ax1.plot(x, df['coverage'], 'C0-', linewidth=2.0, label="test1")
ax1.set_xlabel('Massa de dados')

ax1.set_ylabel('Cobertura (%)', color='C0')
ax1.tick_params('y', colors='C0')
ax1.xaxis.set_tick_params(labelsize=7)
# ax1.grid()

ax2 = ax1.twinx()
ax2.plot(x, df['time'], 'C1--', linewidth=2.0, label="test2")
ax2.set_ylabel('Esforço computacional (ms)', color='C1')
ax2.tick_params('y', colors='C1')

plt.xticks(x)

fig.tight_layout()
fig = plt.gcf()
fig.savefig('jsoup.parser.tag_generation.png')
# fig.savefig('jsoup.parser.tag_execution.png')

plt.show()