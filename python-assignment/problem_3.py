from tokenize import group
import pandas as pd
import numpy as np

csvFile = pd.read_csv('ratings.csv')
df = csvFile[["itemId", "rating"]]

df2 = df.groupby(['itemId'], as_index=False)['rating'].mean().rename({'itemId': 'itemId',
'rating': 'avg_rating'}, axis=1)
newDf = df2.sort_values(['avg_rating'], ascending=[False])

newDf.to_csv('ratings-sorted.csv')


print(newDf)
