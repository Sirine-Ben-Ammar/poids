package com.example.poids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bCalculer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bCalculer= (Button) this.findViewById(R.id.buttonCalculer);

        this.bCalculer.setOnClickListener((View)->{
            EditText tailleView = (EditText) findViewById(R.id.taille);
            String taille = tailleView.getText().toString();
            float poidsIdial = (3* Float.parseFloat(taille) -250/4);

            Context context =getApplicationContext();

            CharSequence text = "poid est" + poidsIdial;
            int x  = Toast.LENGTH_SHORT;

            Toast toast =Toast.makeText(context, text , x);
            toast.setGravity(Gravity.CENTER, 0, 0 );
            toast.show();



        });

    }
}