package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //int color[]={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five};

        m1= MediaPlayer.create(MainActivity.this,R.raw.one);
        m2= MediaPlayer.create(MainActivity.this,R.raw.dairy);
        m3= MediaPlayer.create(MainActivity.this,R.raw.three);
        m4= MediaPlayer.create(MainActivity.this,R.raw.ae);
        m5= MediaPlayer.create(MainActivity.this,R.raw.peg);
        m6= MediaPlayer.create(MainActivity.this,R.raw.sixth);
        m7= MediaPlayer.create(MainActivity.this,R.raw.choorey);
        m8= MediaPlayer.create(MainActivity.this,R.raw.video);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch(id) {
            case R.id.one:
                m1.start();
                changeColor((Button)findViewById(R.id.one));
                break;
            case R.id.two:
                m2.start();
                changeColor((Button)findViewById(R.id.two));
                break;
            case R.id.three:
                m3.start();
                changeColor((Button)findViewById(R.id.three));
                break;
            case R.id.four:
                m4.start();
                changeColor((Button)findViewById(R.id.four));
                break;
            case R.id.five:
                m5.start();
                changeColor((Button)findViewById(R.id.five));
                break;
            case R.id.six:
                m6.start();
                changeColor((Button)findViewById(R.id.six));
                break;
            case R.id.seven:
                m7.start();
                changeColor((Button)findViewById(R.id.seven));
                break;
            case R.id.eight:
                m8.start();
                changeColor((Button)findViewById(R.id.eight));
                break;
        }
    }
    public void changeColor(Button id)
    {
        int varColor= randomiser();
        id.setBackgroundColor(-varColor);
    }
    public int randomiser()
    {
        Random random=new Random();
        int r=random.nextInt(999999999);
        r++;
        return r;
    }
}
