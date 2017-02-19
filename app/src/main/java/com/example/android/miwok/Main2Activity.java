/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main2);

        // defining the text fields.
        ImageButton numbers = (ImageButton) findViewById(R.id.number_img);
        ImageView colors = (ImageView) findViewById(R.id.imageView2);
        ImageView family = (ImageView ) findViewById(R.id.familyico);
        ImageView phrases = (ImageView) findViewById(R.id.imageView3);

        // Placing Intents.
        final Intent Number_Act = new Intent(this, Numbers_Activity.class);
        final Intent Colors_Act = new Intent(this, Colors_Activity.class);
        final Intent Family_Act = new Intent(this, Family_Members.class);
        final Intent Phrases_Act = new Intent(this, Phrases_Activity.class);
        final Intent dev_Act = new Intent(this, developer.class);

        //on click event for number text
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Check out the numbers here :)", Toast.LENGTH_SHORT).show();
                startActivity(Number_Act);

            }
        });

        //on click event for color text
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Check out the colors here :)",Toast.LENGTH_SHORT).show();
                startActivity(Colors_Act);

            }
        });

        //on click event for family text
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Check out the family names here :)",Toast.LENGTH_SHORT).show();
                startActivity(Family_Act);

            }
        });

        //on click event for phrases text
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Check out the new Phrases here :)", Toast.LENGTH_SHORT).show();
                startActivity(Phrases_Act);

            }
        });


    }
}
