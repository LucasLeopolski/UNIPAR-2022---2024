package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btHomem;
    private Button btMulher;
    private EditText edTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btHomem = findViewById(R.id.btHomem);
        edTexto = findViewById(R.id.edTexto);
    }
}