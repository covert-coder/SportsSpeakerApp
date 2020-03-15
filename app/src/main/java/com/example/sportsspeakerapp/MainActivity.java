package com.example.sportsspeakerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ImageButton mBoxingButton, mKickBoxingButton, mKarateButton, mAkidoButton,
        mTaekwondoButton,mJudoButton;

    @Override
    public void onClick(View imgButtonView) {
        switch (imgButtonView.getId()) {
            // play video button
            case  R.id.imgBoxing:

                break;
            case R.id.imgAkido:

                break;
            case R.id.imgJudo:

                break;
            case R.id.imgTaekwondo:

                break;
            case R.id.imgKickBoxing:

                break;
            case R.id.imgKarate:
                
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBoxingButton = findViewById(R.id.imgBoxing);
        mAkidoButton = findViewById(R.id.imgAkido);
        mJudoButton = findViewById(R.id.imgJudo);
        mKickBoxingButton= findViewById(R.id.imgKickBoxing);
        mKarateButton = findViewById(R.id.imgKarate);
        mTaekwondoButton = findViewById(R.id.imgTaekwondo);

    }
}
