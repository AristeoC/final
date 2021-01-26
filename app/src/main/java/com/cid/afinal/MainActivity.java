package com.cid.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //ANIMACIONES
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        //TextView detextView = findViewById(R.id.detextView);
        //TextView acidtextView = findViewById(R.id.acidtextView);
        ImageView logoimageView = findViewById(R.id.logoimageView);

        //detextView.setAnimation(animacion2);
        //acidtextView.setAnimation(animacion2);
        logoimageView.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent =new Intent(MainActivity.this, LoginActivity.class);

                startActivity(intent);
                finish();
            }
        }, 4000);
    }

}