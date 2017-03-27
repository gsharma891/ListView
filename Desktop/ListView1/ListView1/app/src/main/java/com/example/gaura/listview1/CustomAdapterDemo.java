package com.example.gaura.listview1;


import android.app.ListActivity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;



public class CustomAdapterDemo extends AppCompatActivity {

    private ArrayList<Item> m_parts = new ArrayList<Item>();
    private ItemAdapter m_adapter;
    ListView listView1;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_demo);
        loaddata();

        // instantiate our ItemAdapter class
        m_adapter = new ItemAdapter(this, R.layout.activity_list_view, m_parts);
        listView1 = (ListView) findViewById(R.id.listSG);
        listView1.setAdapter(m_adapter);



       /* // here we are defining our runnable thread.
        viewParts = new Runnable(){
            public void run(){
                handler.sendEmptyMessage(0);
            }
        };

        // here we call the thread we just defined - it is sent to the handler below.
        Thread thread =  new Thread(null, viewParts, "MagentoBackground");
        thread.start();*/
    }


    private void loaddata(){
        m_parts.add(new Item("Book", "This is item #1", 0));
        m_parts.add(new Item("Apple #2", "This is item #2", 0));
        m_parts.add(new Item("Mobiles", "This is item #1", 0));
        m_parts.add(new Item("TV #2", "This is item #2", 0));
        m_parts.add(new Item("Computer", "This is item #1", 0));
        m_parts.add(new Item("Laptop #2", "This is item #2", 0));
        m_parts.add(new Item("MyItemName 12", "This is item #1", 0));
        m_parts.add(new Item("MyItemName #221", "This is item #2", 0));
        m_parts.add(new Item("MyItemName44", "This is item #1", 0));
        m_parts.add(new Item("MyItemName #2", "This is item #2", 0));
        m_parts.add(new Item("MyItemName55", "This is item #1", 0));
        m_parts.add(new Item("MyItemName #2", "This is item #2", 0));


    }
    /*private Handler handler = new Handler()
    {
        public void handleMessage(Message msg)
        {
            // create some objects
            // here is where you could also request data from a server
            // and then create objects from that data.
            m_parts.add(new Item("Book", "This is item #1", 0));
            m_parts.add(new Item("Apple #2", "This is item #2", 0));
            m_parts.add(new Item("Mobiles", "This is item #1", 0));
            m_parts.add(new Item("TV #2", "This is item #2", 0));
            m_parts.add(new Item("Computer", "This is item #1", 0));
            m_parts.add(new Item("Laptop #2", "This is item #2", 0));
            m_parts.add(new Item("MyItemName 12", "This is item #1", 0));
            m_parts.add(new Item("MyItemName #221", "This is item #2", 0));
            m_parts.add(new Item("MyItemName44", "This is item #1", 0));
            m_parts.add(new Item("MyItemName #2", "This is item #2", 0));
            m_parts.add(new Item("MyItemName55", "This is item #1", 0));
            m_parts.add(new Item("MyItemName #2", "This is item #2", 0));
            m_adapter = new ItemAdapter(CustomAdapterDemo.this, R.layout.activity_list_view, m_parts);

            // display the list.

        }
    };*/
}

//public class CustomAdapterDemo extends ListActivity {

    // declare class variables
