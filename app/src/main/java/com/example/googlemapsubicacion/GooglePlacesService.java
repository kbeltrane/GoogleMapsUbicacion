package com.example.googlemapsubicacion;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GooglePlacesService {

    @GET("maps/api/place/details/json")
    Call<PlaceDetailsResponse> getPlaceDetails(
            @Query("place_id") String placeId,
            @Query("fields") String fields,
            @Query("key") String apiKey
    );

    @GET("maps/api/place/photo")
    Call<ResponseBody> getPlacePhoto(
            @Query("maxwidth") int maxWidth,
            @Query("photo_reference") String photoReference,
            @Query("key") String apiKey
    );
}

