
        package com.example.approleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

        public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Sortear(View view)
    {
        Random random = new Random();
        int numero = random.nextInt(10) + 1;

        TextView result = findViewById(R.id.textView);
        TextView parabens = findViewById(R.id.parabens);
        EditText inputedNumber = findViewById(R.id.editTextNumber);

        result.setText("Resultado: " + numero);

        if(Integer.parseInt(inputedNumber.getText().toString()) == numero)
        {
            parabens.setText("Parabéns!! Você é o cara!! o/");
        }
        else
        {
            parabens.setText("Não foi dessa vez... :(");
        }
    }
}