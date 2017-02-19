package com.example.android.miwok;

/**
 * Created by sreejith on 12/2/17.
 */

public class word {

    private String en_number;
    private String mal_number;
    private int audio_number;
    private int image_number;

    //class constructor 1
    public word(String en, String mal, int audio_id, int image_id) {

        en_number = en;
        mal_number = mal;
        audio_number = audio_id;
        image_number = image_id;
    }

    //class constructor 2
    public word(String en, String mal, int audio_id) {

        en_number = en;
        mal_number = mal;
        audio_number = audio_id;

    }

    // method to return malayalam number
    public String getMal_number() {

        return mal_number;
    }

    // method to return english number
    public String getEng_number() {

        return en_number;
    }

    // method to return audio file
    public int getaudio() {

        return audio_number;
    }

    // method to return image file
    public int getimage() {

        return image_number;
    }
}
