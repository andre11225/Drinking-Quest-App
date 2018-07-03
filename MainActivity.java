package com.andvilcreations.drinkingquestcompanionapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    // Resets game's progress and data back to default values
    public void newGame (View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("com.andvilcreations.drinkingquestcompanionapp", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();

        //  Chuglox Stats:  Gold, Xp,  MaxHP, Current Hp, Attack, Defense, Self Worth, Smarts, Tolerance, Sexual Prowness
        String[] chuglox = {" ",  " ",  "8",   "8",        "D6",   "0",     "9",        "6",    "10",         "15"};
        String[] heroChug = {"c0", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9"};

        int x = 0;
        while ( x < 10 ) {
            editor.putString(heroChug[x], chuglox[x]).apply();
            x++;
        }
        // ---------------------------------------------------------------------------------------------------------------

        //  Bartlebut Stats:  Gold, Xp,  MaxHP, Current Hp, Attack, Defense, Self Worth, Smarts, Tolerance, Sexual Prowness
        String[] bartlebut = {" ",  " ",  "9",   "9",        "D6",   "0",     "12",        "9",    "9",         "7"};
        String[] heroBartlebut = {"b0", "b1, ", "b2", "b3", "b4", "b5", "b6", "b7", "b8", "b9"};

        x = 0;
        while ( x < 10 ) {
            editor.putString(heroBartlebut[x], bartlebut[x]).apply();
            x++;
        }
        // ---------------------------------------------------------------------------------------------------------------

        //  Daiquirin Stats:  Gold, Xp,  MaxHP, Current Hp, Attack, Defense, Self Worth, Smarts, Tolerance, Sexual Prowness
        String[] daiquirin = {" ",  " ",  "7",   "7",        "D4",   "0",     "14",        "12",    "14",         "12"};
        String[] heroDaiquirin = {"d0", "d1, ", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9"};

        x = 0;
        while ( x < 10 ) {
            editor.putString(heroDaiquirin[x], daiquirin[x]).apply();
            x++;
        }
        // ---------------------------------------------------------------------------------------------------------------

        // Annoying Sidekick Stats:  Gold, Xp,  MaxHP, Current Hp, Attack, Defense, Self Worth, Smarts, Tolerance, Sexual Prowness
        String[] annoying = {       " ",  " ",  "6",   "6",        "D4+1",   "0",     "6",        "13",    "15",         "9"};
        String[] heroAnnoying = {"a0", "a1, ", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "a9"};

        x = 0;
        while ( x < 10 ) {
            editor.putString(heroAnnoying[x], annoying[x]).apply();
            x++;
        }
        // ---------------------------------------------------------------------------------------------------------------

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button leading to Chuglox Activity ---------------------------------//
        Button buttonChuglox = (Button) findViewById(R.id.buttonChuglox);

        buttonChuglox.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(getApplicationContext(), HeroChuglox.class);
                startActivity(intent);
            }

        });
        //---------------------------------------------------------------------//


        // Button leading to Bartlebut Activity -------------------------------//
        Button buttonBartlebut = (Button) findViewById(R.id.buttonBartlebut);

        buttonBartlebut.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(getApplicationContext(), HeroBartlebut.class);
                startActivity(intent);
            }

        });
        //---------------------------------------------------------------------//


        // Button leading to Daiquirin Activity -------------------------------//
        Button buttonDaiquirin = (Button) findViewById(R.id.buttonDaiquirin);

        buttonDaiquirin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(getApplicationContext(), HeroDaiquirin.class);
                startActivity(intent);
            }

        });
        //---------------------------------------------------------------------//


        // Button leading to Annoying Sidekick Activity -------------------------------//
        Button buttonAnnoying = (Button) findViewById(R.id.buttonAnnoying);

        buttonAnnoying.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(getApplicationContext(), HeroAnnoying.class);
                startActivity(intent);
            }

        });
        //---------------------------------------------------------------------//

    }
}
