import pandas as pd

from sklearn.model_selection import train_test_split

from sklearn.ensemble import RandomForestClassifier

import joblib
import os

data = pd.read_csv('/Users/aravsingh/Downloads/Crop_recommendation.csv')

X = data.drop('label', axis=1)  # Features: drop the 'label' column
y = data['label']  # Target variable: 'label' column

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

model = RandomForestClassifier()

model.fit(X_train, y_train)

model_path = '/Users/aravsingh/PycharmProjects/smartFarming/crop_recommendation_model.pkl'

joblib.dump(model, model_path)

print("Model saved at:", model_path)
