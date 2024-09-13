package ada_currencies;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRatesAPI {
    public static double getCurrency(String from, String to) {
        double rate = 999;
        try {
            String base = from.toLowerCase();
            String target = to.toLowerCase();

            String url = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/" + base + ".json";

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { // means it has worked
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

                StringBuilder responseBuilder = new StringBuilder();
                char[] buffer = new char[8192]; //has to be read in chucks otherwise currencies get cut off for some reason
                int readChars;

                while ((readChars = in.read(buffer)) != -1) {
                    responseBuilder.append(buffer, 0, readChars);
                }
                in.close();

                String r = responseBuilder.toString();

                String[] parts = r.split("[{}:,\\\"\\\\]+");

                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals(target)) {
                        rate = Double.parseDouble(parts[i + 1]);
                        break;
                    }
                }

            } else {
                System.out.println("GET request failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rate;
    }
}
