import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class APICall  {

static String InitialDecisionNumber;



public String generateRandomNumber(int digits,String txtBefore,String txtAfter){
//    this function generates random number with specific digits and add text before and after the number
    long min = (long) Math.pow(10, digits - 1);
    long max = (long) Math.pow(10, digits) - 1;
    long range = max - min + 1;
    long fraction = (long) (range * Math.random());
    long randomNumber = fraction + min;
    String randomNum = "" + randomNumber;
    return txtBefore+randomNumber+txtAfter;
}

    public String makeUniqueFile(String s) throws IOException {
        File jsonFile = new File(s);

        String jsonString = FileUtils.readFileToString(jsonFile);

        JsonElement jelement = new JsonParser().parse(jsonString);
        JsonObject jobject = jelement.getAsJsonObject();
        //        use faker to generate 4 digit random number
        var randomNum = (System.currentTimeMillis());
// need to handle if generated duplicate number
        jobject.addProperty("initialDecisionNumber", "" + randomNum);
        InitialDecisionNumber= "" + randomNum;
        jobject.addProperty("inheritanceName", "generated Inheritance" + randomNum % 100);
        jobject.addProperty("appellateDecisionNumber", "" + randomNum % 100000000);
        jobject.addProperty("poNumber", "PO-" + randomNum % 1000000000);
        jobject.addProperty("assetEvaluationResponsibility", "2");


        Gson gson = new Gson();

        String resultingJson = gson.toJson(jelement);
        String api = "api";

        FileUtils.writeStringToFile(jsonFile, resultingJson);
        return ""+randomNum;

    }

    public void sendCreateInheritance(String s) {

//        send file to url as a http post request
        try {
            // Define the URL of the API you want to send a POST request to
            String apiUrl = "https://es-qa.infath.sa/Integration_ERP_API/rest/Inheritance_Request/CreateInheritance";

            // Create a URL object from the API URL
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the HTTP request method to POST
            connection.setRequestMethod("POST");

            // Set request headers if needed (e.g., authentication headers)
            connection.setRequestProperty("Authorization", "Basic U0E6UEBzc3cwcmRAMTIzNjU0");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Connection", "keep-alive");
            connection.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
            connection.setRequestProperty("Accept", "*/*");

            // Enable input and output streams for the connection
            connection.setDoOutput(true);

            // Define the path to your JSON file
            String jsonFilePath = s;

            // Read the JSON data from the file
            StringBuilder jsonPayload = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(new File(jsonFilePath)));
            String line;
            while ((line = reader.readLine()) != null) {
                jsonPayload.append(line);
            }
            reader.close();

            // Write the JSON payload to the connection's output stream
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            dataOutputStream.writeBytes(jsonPayload.toString());
            dataOutputStream.flush();
            dataOutputStream.close();

            // Get the response code to check if the request was successful
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Create a BufferedReader to read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Read the response line by line
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Print the response
                System.out.println(response.toString());
            } else {
                System.out.println("Request failed with response code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}


