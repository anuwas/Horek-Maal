import pandas as pd
csv_input = pd.read_csv('abc.csv')

csv_input.insert(1, column = "Stream", value = "B.Sc")
csv_input.head()

#csv_input[1] = csv_input['Name']
csv_input.to_csv('output.csv', index=False)

