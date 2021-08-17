package ru.nosov;


import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;




public class ServerRequest {
    private static final String URL = "https://ru.wikipedia.org/w/api.php";

    public static void requestData(String query) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SearchWiki endpoint = retrofit.create(SearchWiki.class);

        endpoint.search(query)
                .enqueue(new Callback<WikiResponse>() {
                    @Override
                    public void onResponse(Call<WikiResponse> call,
                                           Response<WikiResponse> response) {

                    }

                    @Override
                    public void onFailure(Call<WikiResponse> call, Throwable t) {

                    }
                });



    }

    public interface SearchWiki{
        @GET("?action=queryURL&list=search&utf8=&format=json")
        Call<WikiResponse>search(@Query("srsearch") String srsearch);

    }






}



