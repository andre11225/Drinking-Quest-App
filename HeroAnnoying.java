package com.andvilcreations.drinkingquestcompanionapp;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class HeroAnnoying extends AppCompatActivity {

    // EditText variables on the Hero Screen: Annoying Sidekick
    EditText myGold1, myXp1, myMaxhp1, myCurrent1, myAttack1, myDefense1, mySelf1, mySmarts1, myTolerance1, mySexual1;

    // Array of key values for Annoying Sidekick stats
    String[] heroAnnoying = {"a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "a9"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_annoying);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.andvilcreations.drinkingquestcompanionapp", Context.MODE_PRIVATE);

        // EditText fields that get repopulated when the activity is Created
        myGold1 = (EditText)findViewById(R.id.gold1);
        myXp1 = (EditText)findViewById(R.id.xp1);
        myMaxhp1 = (EditText)findViewById(R.id.maxhp1);
        myCurrent1 = (EditText)findViewById(R.id.current1);
        myAttack1 = (EditText)findViewById(R.id.attack1);
        myDefense1 = (EditText)findViewById(R.id.defense1);
        mySelf1 = (EditText)findViewById(R.id.selfworth1);
        mySmarts1 = (EditText)findViewById(R.id.smarts1);
        myTolerance1 = (EditText)findViewById(R.id.tolerance1);
        mySexual1 = (EditText)findViewById(R.id.sexual1);

        // 1st Get shared pref string  2nd Convert to string  3rd Update the corresponding EditText field
        myGold1.setText( sharedPreferences.getString( heroAnnoying [0], myGold1.getText().toString() ) );
        myXp1.setText( sharedPreferences.getString( heroAnnoying[1], myXp1.getText().toString() ) );
        myMaxhp1.setText( sharedPreferences.getString( heroAnnoying[2], myMaxhp1.getText().toString() ) );
        myCurrent1.setText( sharedPreferences.getString( heroAnnoying[3], myCurrent1.getText().toString() ) );
        myAttack1.setText( sharedPreferences.getString( heroAnnoying[4], myAttack1.getText().toString() ) );
        myDefense1.setText( sharedPreferences.getString( heroAnnoying[5], myDefense1.getText().toString() ) );
        mySelf1.setText( sharedPreferences.getString( heroAnnoying[6], mySelf1.getText().toString() ) );
        mySmarts1.setText( sharedPreferences.getString( heroAnnoying[7], mySmarts1.getText().toString() ) );
        myTolerance1.setText( sharedPreferences.getString( heroAnnoying[8], myTolerance1.getText().toString() ) );
        mySexual1.setText( sharedPreferences.getString( heroAnnoying[9], mySexual1.getText().toString() ) );

    }

    // EditText fields are saved on exit(back button)
    @Override
    protected  void onDestroy() {
        super.onDestroy();
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.andvilcreations.drinkingquestcompanionapp", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString( heroAnnoying[0], myGold1.getText().toString() ).apply();
        editor.putString( heroAnnoying[1], myXp1.getText().toString() ).apply();
        editor.putString( heroAnnoying[2], myMaxhp1.getText().toString() ).apply();
        editor.putString( heroAnnoying[3], myCurrent1.getText().toString() ).apply();
        editor.putString( heroAnnoying[4], myAttack1.getText().toString() ).apply();
        editor.putString( heroAnnoying[5], myDefense1.getText().toString() ).apply();
        editor.putString( heroAnnoying[6], mySelf1.getText().toString() ).apply();
        editor.putString( heroAnnoying[7], myDefense1.getText().toString() ).apply();
        editor.putString( heroAnnoying[8], myTolerance1.getText().toString() ).apply();
        editor.putString( heroAnnoying[9], mySexual1.getText().toString() ).apply();

    }

}
