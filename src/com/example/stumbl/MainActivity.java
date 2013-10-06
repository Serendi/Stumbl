package com.example.stumbl;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Loader;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
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
 
        });
 
    }
    
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
