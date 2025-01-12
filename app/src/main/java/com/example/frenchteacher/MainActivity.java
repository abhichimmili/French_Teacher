package com.example.frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackBtn,whiteBtn,redBtn,greenBtn,purpleBtn,yellowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        blackBtn =findViewById(R.id.button2);
        whiteBtn =findViewById(R.id.button);
        redBtn =findViewById(R.id.button4);
        greenBtn =findViewById(R.id.button3);
        purpleBtn =findViewById(R.id.button5);
        yellowBtn =findViewById(R.id.button6);
        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        whiteBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedBtnId = v.getId();
        if(clickedBtnId== R.id.button4){
                    PlaySounds(R.raw.red);
        }else if(clickedBtnId== R.id.button){
            PlaySounds(R.raw.white);
        }else if(clickedBtnId== R.id.button2){
            PlaySounds(R.raw.black);
        }else if(clickedBtnId== R.id.button3){
            PlaySounds(R.raw.green);
        }else if(clickedBtnId== R.id.button5){
            PlaySounds(R.raw.purple);
        }else if(clickedBtnId== R.id.button6){
            PlaySounds(R.raw.yellow);
        }
    }
    public void PlaySounds(int id){
        MediaPlayer mediaPlayer =MediaPlayer.create(getApplicationContext(),id);
        mediaPlayer.start();
    }
}