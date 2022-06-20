package com.example.block01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonBlue , buttonPink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue= (Button) findViewById(R.id.BlueButton);
        buttonPink=(Button) findViewById(R.id.PinkButton);

    }

    public void toDo(View v)
    {
        if(v.equals(buttonBlue))
        {
           v.setVisibility(View.INVISIBLE);
        }
        if(v.equals(buttonPink))
    {
        Toast.makeText(getApplicationContext(), "Pink Button Clicked", Toast.LENGTH_SHORT).show();
    }




    }


}