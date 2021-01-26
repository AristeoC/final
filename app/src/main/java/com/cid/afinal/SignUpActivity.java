package com.cid.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {

TextView nuevoUsuario, bienvenidoLabel, continuarLabel;
ImageView signUpImageView;
TextInputLayout usuarioSignUpTextField, passTextField;
MaterialButton inicioSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpImageView = findViewById(R.id.signUpImageView);



    }
}