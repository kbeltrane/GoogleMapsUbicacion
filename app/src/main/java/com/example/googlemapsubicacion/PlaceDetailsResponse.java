package com.example.googlemapsubicacion;

public class PlaceDetailsResponse {
    private Result result;

    public Result getResult() {
        return result;
    }

    public static class Result {
        private String name;
        private float rating;
        private String formatted_phone_number;

        // getters y setters para estos campos
    }
}
