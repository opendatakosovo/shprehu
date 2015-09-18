package org.opendatakosovo.shprehu.api;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import org.opendatakosovo.shprehu.models.AppVersion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Type;


import retrofit.Callback;
import retrofit.RestAdapter;

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.http.GET;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;


public class ApiClient {

    private static ShprehuApiInterface shprehuApiService;

    public static ShprehuApiInterface getShprehuApiClient(){
        if(shprehuApiService == null){
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://10.0.2.2:8080/api")
                    //.setConverter(new DynamicJsonConverter())
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();
            shprehuApiService = restAdapter.create(ShprehuApiInterface.class);
        }

        return shprehuApiService;


    }

    public interface ShprehuApiInterface{

        @GET("/version.json")
        void getVersion(Callback<AppVersion> callback);


        //@GET("/config.json")
        //void getConfig(Callback<AppConfig> callback);

    }
    /**
    static class DynamicJsonConverter implements Converter {

        private Context contextMain;
        @Override public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
            try {
                InputStream in = typedInput.in(); // convert the typedInput to String
                String fromStream = fromStream(in);
                Log.d("", "" + fromStream);


                if (type == String.class) {
                    return fromStream;
                } else {
                    return new Gson().fromJson(fromStream, type); // convert to the supplied type, typically Object, JsonObject or Map<String, Object>
                }
            } catch (Exception e) { // a lot may happen here, whatever happens
                throw new ConversionException(e); // wrap it into ConversionException so retrofit can process it
            }

        }

        @Override public TypedOutput toBody(Object object) { // not required
            return null;
        }

        private String fromStream(InputStream in) throws IOException {




            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);

            }

            reader.close();

            String fileName = "version.json";

            try {

                FileWriter fileWriter = new FileWriter(fileName);

                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(response.toString());
                bufferedWriter.close();

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(contextMain.openFileOutput(fileName, Context.MODE_PRIVATE));
                outputStreamWriter.write(response.toString());
                outputStreamWriter.close();


            }
            catch (IOException e) {
                Log.e("Exception", "File write failed: " + e.toString());
            }

            in.close(); // we are responsible to close the InputStream after use
            return response.toString();


        }
    }
**/

}
