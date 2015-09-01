package org.opendatakosovo.shprehu.activities.harassment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        ApiClient.getShprehuApiClient().getVersion(new Callback<AppVersion>(){
            @Override
            public void success(AppVersion appVersion, Response response){
                processVersion(appVersion);
            }

            @Override
            public void failure(RetrofitError retrofitError){
                // log error.
            }
        });
    }

    private void processVersion(AppVersion appVersion){
        // Give you the AppVersion object
        // Then you do what you have to do.

        if(false){
            //ApiClient.getShprehuApiClient().getConfig(processConfig);
        }
    }

    private void processConfig(){
        // Gives you the AppConfig object
        // Then you do what you gotta do
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_harassment_type, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
