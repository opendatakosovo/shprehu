package org.opendatakosovo.shprehu.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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


        // Set the Adapter to GridView
        gridView.setAdapter(new HomeScreenAdapter(this));



        /**Interface definition for a callback to be invoked when an item in this AdapterView has been clicked.
         * please read more at http://developer.android.com/reference/android/widget/AdapterView.OnItemClickListener.html
         */

        /** Handling touch/click Event on GridView Item
         * for every each Item!
         */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                Intent typeReport = new Intent(getApplicationContext(), HarassmentTypeActivity.class);
                startActivity(typeReport);
                        break;
            }
        }
    });



        //TODO: Get version.json and config.json
        //TODO: When clicking on the "Report" image, it loads the HarassmentTypeActivity.

    }

}
