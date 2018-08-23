package com.example.jhumpi.orientation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by jhumpi on 6/1/18.
 */

public class dynamicOrientation extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamicorien);
    }
    public void onConfigurationChanged(Configuration configuration){
        super.onConfigurationChanged(configuration);
        TextView t  = findViewById(R.id.dytv2);
        if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            t.setText("Orientation : Portrait");

        }else if(configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){
            t.setText("Orientation : Landscape");
        }
    }
}
