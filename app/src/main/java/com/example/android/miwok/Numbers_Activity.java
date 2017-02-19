package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers_Activity extends AppCompatActivity {

    private MediaPlayer media_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_);

        // create an array list of numbers.

        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("One","ഒന്ന് ",R.raw.malayalam_one,R.drawable.number_one));
        words.add(new word("Two","രണ്ട്",R.raw.malayalam_two,R.drawable.number_two));
        words.add(new word("Three","മൂന്ന് ",R.raw.malayalam_three,R.drawable.number_three));
        words.add(new word("Four","നാല് ",R.raw.malayalam_four,R.drawable.number_four));
        words.add(new word("Five","അഞ്ച്",R.raw.malayalam_five,R.drawable.number_five));
        words.add(new word("Six","ആറ് ",R.raw.malayalam_six,R.drawable.number_six));
        words.add(new word("Seven","ഏഴ് ",R.raw.malayalam_seven,R.drawable.number_seven));
        words.add(new word("Eight","എട്ട് ",R.raw.malayalam_eight,R.drawable.number_eight));
        words.add(new word("Nine","ഒൻപതു ",R.raw.malayalam_nine,R.drawable.number_nine));
        words.add(new word("Ten","പത്ത്",R.raw.malayalam_ten,R.drawable.number_ten));
//        words.add(new word("Eleven","പതിനൊന്ന്",R.raw.malayalam_eleven,R.drawable.number_));
//        words.add(new word("Twelve","പന്ത്രണ്ടു് ",R.raw.malayalam_twelve));
//        words.add(new word("Thriteen","പതിമുന്നു",R.raw.malayalam_thirteen));
//        words.add(new word("Fourteen","പതിനാല്",R.raw.malayalam_fourteen));
//        words.add(new word("Fifteen","പതിനഞ്ച് ",R.raw.malayalam_fifteen));



        WordAdapter num_input_stream = new WordAdapter(this,0,words,R.color.category_numbers);
        ListView numb_list = (ListView) findViewById(R.id.list);
        numb_list.setAdapter(num_input_stream);


        // setting an onclick listner for playing audio file

        numb_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word current_item = words.get(position);

                media_adapter = MediaPlayer.create(Numbers_Activity.this,current_item.getaudio());
                media_adapter.start();
            }
        });

    }
}
