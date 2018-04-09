package com.santander.isban;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CountryPopulations {


    private static final String BASE_URL = "https://jsonmock.hackerrank.com/api/countries/search?name=";

    static int getCountries(String str, int p) {

        int page = 1;
        int counter = 0;

        while (true) {

            JSONObject result = get(BASE_URL + str, page);

            JSONArray array = (JSONArray) result.get("data");

            for (Object object : array) {
                JSONObject json = (JSONObject) object;
                Long population = (Long) json.get("population");
                if (population > p) {
                    counter++;
                }
            }

            page++;
            Long total = (Long) result.get("total");
            if(total <= 0){
                break;
            }

        }

        return counter;

    }


    private static JSONObject get(String url, final int page) {

        BufferedReader in = null;

        try {

            if (page > 1) {
                url = url + "?page=" + page;
            }

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET");

            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            JSONParser parser = new JSONParser();
            return (JSONObject) parser.parse(response.toString());


        } catch (Exception e) {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            return new JSONObject();
        }

    }


}
