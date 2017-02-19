package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors_Activity extends AppCompatActivity {

    private MediaPlayer media_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors_);


        // create an array list of colors.

        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Black","കറുപ്പ്",R.raw.malayalam_black,R.drawable.color_black));
        words.add(new word("White","വെള്ള",R.raw.malayalam_white,R.drawable.color_white));
       // words.add(new word("Blue","നീല ",R.raw.malayalam_blue,R.drawable.color_b));
        words.add(new word("Green","പച്ച",R.raw.malayalam_green,R.drawable.color_green));
        words.add(new word("brown","ചവുണ്ട",R.raw.malayalam_brown,R.drawable.color_brown));
       // words.add(new word("purple","പർപ്പിൾ",R.raw.purple));
        words.add(new word("Red","ചുവപ്പ് ",R.raw.malayalam_red,R.drawable.color_red));
       // words.add(new word("Orange","ഓറഞജ് ",R.raw.malayalam_orange));
        words.add(new word("Yellow","മഞ്ഞ",R.raw.malayalam_yellow,R.drawable.color_dusty_yellow));




        WordAdapter num_input_stream = new WordAdapter(this,0,words,R.color.category_colors);
        ListView numb_list = (ListView) findViewById(R.id.list_colors);
        numb_list.setAdapter(num_input_stream);


        // setting an onclick listner for playing audio file

        numb_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word current_item = words.get(position);

                media_adapter = MediaPlayer.create(Colors_Activity.this,current_item.getaudio());
                media_adapter.start();
            }
        });
    }
}
