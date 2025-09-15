package smart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CropRecommendation {
   public static void main(String[] args) {
      try {
         String apiUrl = "http://localhost:5000/predict";
         URL url = new URL(apiUrl);
         HttpURLConnection conn = (HttpURLConnection)url.openConnection();
         conn.setRequestMethod("POST");
         conn.setRequestProperty("Content-Type", "application/json; utf-8");
         conn.setDoOutput(true);
         String jsonInputString = "{\"features\": [90, 42, 43, 20.0, 82, 6.5, 202]}";
         OutputStream os = conn.getOutputStream();

         try {
            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
         } catch (Throwable var13) {
            if (os != null) {
               try {
                  os.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }
            }

            throw var13;
         }

         if (os != null) {
            os.close();
         }

         int responseCode = conn.getResponseCode();
         System.out.println("POST Response Code :: " + responseCode);
         if (responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();

            String line;
            while((line = in.readLine()) != null) {
               response.append(line);
            }

            in.close();
            JSONParser parser = new JSONParser();
            JSONObject jsonResponse = (JSONObject)parser.parse(response.toString());
            String predictedCrop = (String)jsonResponse.get("predicted_crop");
            System.out.println("Predicted Crop: " + predictedCrop);
         } else {
            System.out.println("POST request failed.");
         }
      } catch (Exception var14) {
         var14.printStackTrace();
      }

   }
}
