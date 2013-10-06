package com.example.stumbl;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.media.ExifInterface; // For ExifInterface method to deal with Exif
import java.io.IOException; // For catching IOExceptions

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public float[] getGeolocation(String fileName) {
    	ExifInterface inter;
    	try {
    		inter = new ExifInterface(fileName);
    	}
    	catch(IOException e) {
    		return null;
    	}
    	float[] output = new float[2];
    	inter.getLatLong(output);
    	
    	return output;
    }
    
}
