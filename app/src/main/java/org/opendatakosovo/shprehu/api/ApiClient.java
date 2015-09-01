package org.opendatakosovo.shprehu.api;
import org.opendatakosovo.shprehu.models.AppConfig;
import org.opendatakosovo.shprehu.models.AppVersion;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by pechorin on 9/1/15.
 */
public class ApiClient {
    private static ShprehuApiInterface shprehuApiService;

    public static ShprehuApiInterface getShprehuApiClient(){
        if(shprehuApiService == null){
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://localhost:5000/api")
                    .build();
        }

        return shprehuApiService;
    }

    public interface ShprehuApiInterface{
        @GET("/version.json")
        void getVersion(Callback<AppVersion> callback);

        //@GET("/config.json")
        //void getConfig(Callback<AppConfig> callback);
    }
}
