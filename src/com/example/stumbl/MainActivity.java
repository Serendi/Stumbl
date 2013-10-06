package com.example.stumbl;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images;
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
    
    	iv = (ImageView) findViewById(R.id.imageView5); 
        
    	Button btn = (Button) findViewById(R.id.takephoto);
        btn.setOnClickListener(new OnClickListener()
        {
        	@Override
        	public void onClick(View w)
        	{
        		Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        		startActivityForResult(intent, 0);
        		
        	}
        	
        });
        
        saveImageToGallery(iv);
    
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
    
    private void saveImageToGallery(View b){
    	b = findViewById(R.id.imageView5);
    	
    	b.setDrawingCacheEnabled(true);
        Bitmap bitmap  = b.getDrawingCache();
        String title = new String("My title");
        String description = new String("This is a description");
        MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, title, description);
     
    }
    
}
