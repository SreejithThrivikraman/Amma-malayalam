package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreejith on 14/2/17.
 */

public class WordAdapter extends ArrayAdapter<word>
{

    private int color_id;
    public WordAdapter(Context context, int resource, ArrayList<word> words,int color_resource) {

        super(context, resource, (List<word>) words);
        color_id = color_resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitem = convertView;

        if (listitem == null)
        {
            listitem = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item,parent,false);
        }

        word current_item = getItem(position);

        TextView english_number = (TextView) listitem.findViewById(R.id.eng_textView);
        english_number.setText(current_item.getEng_number());

        TextView malayalam_number = (TextView) listitem.findViewById(R.id.mal_textView);
        malayalam_number.setText(current_item.getMal_number());

        // code to set the image for each item.
        ImageView current_image = (ImageView) listitem.findViewById(R.id.item_image);
        current_image.setImageResource(current_item.getimage());

        // code to set the color for each item.

        View color_object = listitem.findViewById(R.id.layer);
        int color = ContextCompat.getColor(getContext(),color_id);
        color_object.setBackgroundColor(color);

        return listitem;
    }
}
