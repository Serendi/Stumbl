package com.example.stumbl;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView iv; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    
    	iv = (ImageView) findViewById(R.id.imageView1); 
        
    	ImageButton btn = (ImageButton) findViewById(R.id.takephoto);
        btn.setOnClickListener(new OnClickListener()
        {
        	@Override
        	public void onClick(View w)
        	{
        		Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        		startActivityForResult(intent, 0);
        		
        	}
        	
        });
    
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
    	if(requestCode == 0)
    	{
    		Bitmap theImage = (Bitmap) data.getExtras().get("data");
    		iv.setImageBitmap(theImage);
    		
    	}
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
