package com.example.stumbl;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

	ImageView iv;
	//Camera mCamera = Camera.open();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    
        /* elements */
        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(this, image_details));

        lv1.setOnItemClickListener(new OnItemClickListener() {
 
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                EventItem eventData = (EventItem) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + eventData, Toast.LENGTH_LONG).show();
            }
 
        }); /* end elements */
        
//    	/* camera */
//        
//    	ImageButton btn = (ImageButton) findViewById(R.id.takephoto);
//        btn.setOnClickListener(new OnClickListener()
//        {
//        	@Override
//        	public void onClick(View w)
//        	{
//        		Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
//        		startActivityForResult(intent, 0);
//        		
//        	}
//        	
//        }); /* end camera */
        
        /* camera attempt 2 */
        //safeCameraOpen(0);
    
        /* camera attempt 3 */
        
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
        
        /* create dummy elements */
        private ArrayList getListData() {
            ArrayList results = new ArrayList();
            EventItem eventData = new EventItem();
            eventData.setHeadline("Dance of Democracy");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            //eventData.setImageSource("")
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Major Naxal attacks in the past");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("BCCI suspends Gurunath pending inquiry ");
            eventData.setReporterName("Rajiv Chandan");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Life convict can`t claim freedom after 14 yrs: SC");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Indian Army refuses to share info on soldiers mutilated at LoC");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("French soldier stabbed; link to Woolwich attack being probed");
            eventData.setReporterName("Sudeep Nanda");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
            
            eventData = new EventItem();
            eventData.setHeadline("Major Naxal attacks in the past");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("BCCI suspends Gurunath pending inquiry ");
            eventData.setReporterName("Rajiv Chandan");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Life convict can`t claim freedom after 14 yrs: SC");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Indian Army refuses to share info on soldiers mutilated at LoC");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("French soldier stabbed; link to Woolwich attack being probed");
            eventData.setReporterName("Sudeep Nanda");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
            
            eventData = new EventItem();
            eventData.setHeadline("Major Naxal attacks in the past");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("BCCI suspends Gurunath pending inquiry ");
            eventData.setReporterName("Rajiv Chandan");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Life convict can`t claim freedom after 14 yrs: SC");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("Indian Army refuses to share info on soldiers mutilated at LoC");
            eventData.setReporterName("Pankaj Gupta");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            eventData = new EventItem();
            eventData.setHeadline("French soldier stabbed; link to Woolwich attack being probed");
            eventData.setReporterName("Sudeep Nanda");
            eventData.setDate("May 26, 2013, 13:35");
            results.add(eventData);
     
            return results;
        }
    
}


