package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases_Activity extends AppCompatActivity {

    MediaPlayer media_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_);

        // create an array list of family names.

        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Hello","നമസ്കാരം",R.raw.hello));
        words.add(new word("What is your name?","എന്താ അങ്ങയുടെ പേര് ?",R.raw.what_is_your_name));
        words.add(new word("Where are you from?","എവിടുന്ന് വരുകയാ?",R.raw.where_are_you_from));
        words.add(new word("How much is this?","ഇതിനു എത്രയാ?",R.raw.how_much_is_this));
        words.add(new word("What is this?","ഇതെന്താണ്",R.raw.what_is_this));
        words.add(new word("A little bit","കുറച്ച്",R.raw.just_a_little));

        words.add(new word("Can I help you?","സഹായിക്കട്ടെ?",R.raw.can_i_help_you));
        words.add(new word("Can you help me?","നിങ്ങൾ എന്നെ സഹായിക്കുമോ ?",R.raw.can_you_help_me));
        words.add(new word("Call the ambulance","ആംബുലൻസ്  വിളിക്ക് ",R.raw.call_the_ambulance));
        words.add(new word("Call the police","പോലീസിനെ വിളിക്ക് ",R.raw.call_the_police));

        words.add(new word("Go straight","നേരെ പോകു",R.raw.go_straight));
        words.add(new word("Turn left","ഇടത്തേക്ക് തിരിയു",R.raw.turn_left));
        words.add(new word("Turn right","വലത്തേക്ക് തിരിയു",R.raw.turn_right));

        words.add(new word("I am sick","എനിക്ക് സുഖമില്ല",R.raw.i_am_sick));
        words.add(new word("I don't know","എനിക്ക് അറിയില്ല",R.raw.i_dont_know));
        words.add(new word("I need a doctor","ഡോക്ടോരെ വിളിക്ക്",R.raw.i_need_a_doctor));








        WordAdapter num_input_stream = new WordAdapter(this,0,words,R.color.category_phrases);
        ListView numb_list = (ListView) findViewById(R.id.activity_phrases_);
        numb_list.setAdapter(num_input_stream);


        // setting an onclick listner for playing audio file

        numb_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word current_item = words.get(position);

                media_adapter = MediaPlayer.create(Phrases_Activity.this,current_item.getaudio());
                media_adapter.start();
            }
        });
    }
}
