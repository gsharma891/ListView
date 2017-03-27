package com.example.gaura.listview1;

/**
 * Created by gaura on 3/25/2017.
 */

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

//import com.practice.R;

import java.util.ArrayList;

/**
 * Created by inskavvala on 11/17/2016.
 */

public class ItemAdapter extends ArrayAdapter {
    private ArrayList<Item> objects;

    /* here we must override the constructor for ArrayAdapter
    * the only variable we care about now is ArrayList<Item> objects,
    * because it is the list of objects we want to display.
    */
    public ItemAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        this.objects = objects;
    }

    /*
     * we are overriding the getView method here - this is what defines how each
     * list item will look.
     */
    public View getView(int position, View convertView, ViewGroup parent){

        Log.d("ItemAdapter","getView"+position);

        // assign the view we are converting to a local variable
        View v = convertView;

        // first check to see if the view is null. if so, we have to inflate it.
        // to inflate it basically means to render, or show, the view.
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.row_student, null);
        }

      /*
       * Recall that the variable position is sent in as an argument to this method.
       * The variable simply refers to the position of the current object in the list. (The ArrayAdapter
       * iterates through the list we sent it)
       *
       * Therefore, i refers to the current Item object.
       */
        Item i = objects.get(position);

        if (i != null) {

            // This is how you obtain a reference to the TextViews.
            // These TextViews are created in the XML files we defined.


            TextView title = (TextView) v.findViewById(R.id.title);
            TextView desc = (TextView) v.findViewById(R.id.desc);


            // check to see if each individual textview is null.
            // if not, assign some text!
           /* if (title != null){
                tt.setText("Name: ");
            }*/

            if (title != null){
                title.setText(i.getName());
            }
            if (desc != null){
                desc.setText("$" + i.getPrice());
            }
        }


        return v;

    }
}
