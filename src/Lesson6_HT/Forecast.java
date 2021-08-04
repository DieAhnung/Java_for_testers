package Lesson6_HT;


import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class Forecast {
    private static final String PROTOCOL = "HTTP";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String LOCATIONS = "locations";
    private static final String API_VERSION = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";
    private static final String API_KEY = "Ip6EdKDbr16vYSyF1YdkBwd8oKbKCC4S";
    private static final String CITES = "cities";
    private static final String SEARCH = "search";
    private static final String CITY = "Санкт-Петербург";
    private static final String FILE = "forecastForSPB.json";

    public static void main(String args[]) throws IOException {
        System.out.println("Forecast in " + CITY);
        OkHttpClient accuClient = new OkHttpClient();


        // first we must find locationKey for SPB. Crate URL
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(API_VERSION)
                .addPathSegment(CITES)
                .addPathSegment(SEARCH)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", CITY)
                .build();

        //Create request
        Request request = new Request.Builder()
                .url(httpUrl)
                .build();

        //execute request
        Response respGetLocnKey = accuClient.newCall(request).execute();


        //get locationKey from response
        String responseBody = respGetLocnKey.body().string();
        ObjectMapper objectMapper = new ObjectMapper();
        String locationKey = objectMapper.readTree(responseBody).get(0).at("/Key").asText();
        System.out.println(locationKey);


        httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(API_VERSION)
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(locationKey)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        request = new Request.Builder()
                .url(httpUrl)
                .build();

        Response respGetForecast = accuClient.newCall(request).execute();

        responseBody = respGetForecast.body().string();

        //and try to save forecast to json file
        try (PrintWriter out = new PrintWriter(FILE)) {
            out.println(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(responseBody);

    }
}