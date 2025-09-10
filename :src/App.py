from flask import Flask, request, jsonify
import joblib
import os

app = Flask(_name_)

model_path = '/Users/aravsingh/PycharmProjects/smartFarming/crop_recommendation_model.pkl'

if not os.path.exists(model_path):
    raise FileNotFoundError(f"Model file not found at {model_path}")

model = joblib.load(model_path)

@app.route('/predict', methods=['POST'])
def predict():
    try:
        data = request.json

        features = data['features']

        prediction = model.predict([features])

        return jsonify({'predicted_crop': prediction[0]})

    except Exception as e:
        return jsonify({'error': str(e)}), 400

if _name_ == '_main_':
    app.run(debug=True)
