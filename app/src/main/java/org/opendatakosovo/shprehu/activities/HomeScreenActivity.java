package org.opendatakosovo.shprehu.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.opendatakosovo.shprehu.activities.harassment.HarassmentTypeActivity;
import org.opendatakosovo.shprehu.adapters.HomeScreenAdapter;

import opendatakosovo.org.shprehu.R;


public class HomeScreenActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        GridView gridView = (GridView)findViewById(R.id.gridview);

        // Create the Custom Adapter Object
        HomeScreenAdapter homScreenAdapter = new HomeScreenAdapter(this);
        // Set the Adapter to GridView
        gridView.setAdapter(new HomeScreenAdapter(this));

        // Handling touch/click Event on GridView Item

        /**Interface definition for a callback to be invoked when an item in this AdapterView has been clicked.
         * please read more at http://developer.android.com/reference/android/widget/AdapterView.OnItemClickListener.html

         This gridView OnItemClickListener it would be used to be clicked on gridView Items
         this how it's right now it would open every items on the GridView but to specify every each button
         we need to implement any of the Conditions things (like Switch, for etc)!
         */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent typeReport = new Intent(getApplicationContext(), HarassmentTypeActivity.class);
                startActivity(typeReport);
            }
        });



        //TODO: Get version.json and config.json
        //TODO: When clicking on the "Report" image, it loads the HarassmentTypeActivity.

    }

}
