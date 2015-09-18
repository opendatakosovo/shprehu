package org.opendatakosovo.shprehu.activities.harassment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.opendatakosovo.shprehu.api.ApiClient;
import org.opendatakosovo.shprehu.models.AppVersion;




import opendatakosovo.org.shprehu.R;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class HarassmentTypeActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harassment_type);

        // Do the async request for version.json (AppVersion) using ApiClient.
        ApiClient.getShprehuApiClient().getVersion(new Callback<AppVersion>() {

            @Override
            public void success(AppVersion appVersion, Response response) {
                processVersion(appVersion);
                Log.d("","A?"+appVersion);
            }


            @Override
            public void failure(RetrofitError retrofitError) {
                Log.d("","ERROR");
            }
        });
    }

    private void processVersion(AppVersion appVersion){

      appVersion.getVersions();




        }

    private void processConfig(){
        // Gives you the AppConfig object
        // Then you do what you gotta do
    }



}
