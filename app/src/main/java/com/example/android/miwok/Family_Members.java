package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Family_Members extends AppCompatActivity {

    MediaPlayer media_adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__members);


        // create an array list of family names.

        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Father","അച്ഛൻ",R.raw.malayalam_father,R.drawable.family_father));
        words.add(new word("Mother","അമ്മ",R.raw.malayalam_mother,R.drawable.family_mother));
        words.add(new word("Son","മകൻ",R.raw.malayalam_son,R.drawable.family_son));
        words.add(new word("Daughter","മകൾ",R.raw.malayalam_daughter,R.drawable.family_daughter));
        words.add(new word("Brother","സഹോദരൻ",R.raw.malayalam_brother,R.drawable.family_younger_brother));
        words.add(new word("Sister","സഹോദരി",R.raw.malayalam_sister,R.drawable.family_younger_sister));
        words.add(new word("Grandfather","അപ്പൂപ്പൻ",R.raw.malayalam_grandfather,R.drawable.family_grandfather));
        words.add(new word("Grandmother","അമ്മുമ്മ ",R.raw.malayalam_grandmother,R.drawable.family_grandmother));
        words.add(new word("Husband","ഭർത്താവ്",R.raw.malayalam_husband,R.drawable.family_older_brother));
        words.add(new word("Wife","ഭാര്യ",R.raw.malayalam_wife,R.drawable.family_older_sister));



        WordAdapter num_input_stream = new WordAdapter(this,0,words,R.color.category_family);
        ListView numb_list = (ListView) findViewById(R.id.activity_family__members);
        numb_list.setAdapter(num_input_stream);


        // setting an onclick listner for playing audio file

        numb_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word current_item = words.get(position);

                media_adapter = MediaPlayer.create(Family_Members.this,current_item.getaudio());
                media_adapter.start();
            }
        });
    }
}
