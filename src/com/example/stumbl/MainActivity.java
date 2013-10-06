package com.example.stumbl;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView iv; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        iv = (ImageView) findViewById(R.id.imageView); 
        
        Button btn = (Button) findViewById(R.id.takephoto);
        btn.setOnClickListener(new OnClickListener()
        {
        	
        	public void onClick(View w)
        	{
        		Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        		startActivityForResult(intent,0);	
        		
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
    
}
