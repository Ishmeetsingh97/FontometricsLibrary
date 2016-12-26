package com.example.warmachine.awesomefonts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.fontometrics.Fontometrics;

public class MainActivity extends AppCompatActivity {

    TextView admiration_pains;
    TextView amatic_bold;
    TextView amatic_regular;
    TextView back_black;
    TextView bella_donna;
    TextView capture_it;
    TextView christians_united;
    TextView coffee_with_sugar;
    TextView elephant;
    TextView electricity;
    TextView eyes_wide;
    TextView la_bataille;
    TextView mybigheart;
    TextView myepicselfie;
    TextView pacifico;
    TextView ricard_crime;
    TextView safira_shine;
    TextView seasrn;
    TextView sentimental;
    TextView the_quest;
    TextView tunderstrike;
    TextView tunderstrike3d;
    TextView TooFreakinCute;
    TextView windsong;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admiration_pains = (TextView) findViewById(R.id.admiration_pains);
        admiration_pains.setTypeface(Fontometrics.admiration_pains(this));

        amatic_bold = (TextView) findViewById(R.id.amatic_bold);
        amatic_bold.setTypeface(Fontometrics.amatic_bold(this));

        amatic_regular = (TextView) findViewById(R.id.amatic_regular);
        amatic_regular.setTypeface(Fontometrics.amatic_regular(this));

        back_black = (TextView) findViewById(R.id.back_black);
        back_black.setTypeface(Fontometrics.back_black(this));

        capture_it = (TextView) findViewById(R.id.capture_it);
        capture_it.setTypeface(Fontometrics.capture_it(this));

        christians_united = (TextView) findViewById(R.id.christians_united);
        christians_united.setTypeface(Fontometrics.christians_united(this));

        coffee_with_sugar = (TextView) findViewById(R.id.coffee_with_sugar);
        coffee_with_sugar.setTypeface(Fontometrics.coffee_with_sugar(this));

        electricity = (TextView) findViewById(R.id.electricity);
        electricity.setTypeface(Fontometrics.electricity(this));

        elephant = (TextView) findViewById(R.id.elephant);
        elephant.setTypeface(Fontometrics.elephant(this));

        eyes_wide = (TextView) findViewById(R.id.eyes_wide);
        eyes_wide.setTypeface(Fontometrics.eyes_wide(this));

        la_bataille = (TextView) findViewById(R.id.la_bataille);
        la_bataille.setTypeface(Fontometrics.la_bataille(this));

        TooFreakinCute = (TextView) findViewById(R.id.too_frekin);
        TooFreakinCute.setTypeface(Fontometrics.too_freakin_cute(this));

        bella_donna = (TextView) findViewById(R.id.bella_donna);
        bella_donna.setTypeface(Fontometrics.bella_donna(this));

        mybigheart = (TextView) findViewById(R.id.mybigheart);
        mybigheart.setTypeface(Fontometrics.mybigheart(this));

        myepicselfie = (TextView) findViewById(R.id.myepicselfie);
        myepicselfie.setTypeface(Fontometrics.myepicselfie(this));

        pacifico = (TextView) findViewById(R.id.pacifico);
        pacifico.setTypeface(Fontometrics.pacifico(this));

        ricard_crime = (TextView) findViewById(R.id.ricard_crime);
        ricard_crime.setTypeface(Fontometrics.ricard_crime(this));

        safira_shine = (TextView) findViewById(R.id.safira_shine);
        safira_shine.setTypeface(Fontometrics.safira_shine(this));

        seasrn = (TextView) findViewById(R.id.seasrn);
        seasrn.setTypeface(Fontometrics.seasrn(this));

        sentimental = (TextView) findViewById(R.id.sentimental);
        sentimental.setTypeface(Fontometrics.sentimental(this));

        the_quest = (TextView) findViewById(R.id.the_quest);
        the_quest.setTypeface(Fontometrics.the_quest(this));

        tunderstrike = (TextView) findViewById(R.id.tunderstrike);
        tunderstrike.setTypeface(Fontometrics.thunderstrike(this));

        tunderstrike3d = (TextView) findViewById(R.id.tunderstrike3d);
        tunderstrike3d.setTypeface(Fontometrics.tunderstrike3d(this));

        windsong = (TextView) findViewById(R.id.windsong);
        windsong.setTypeface(Fontometrics.windsong(this));




    }
}
