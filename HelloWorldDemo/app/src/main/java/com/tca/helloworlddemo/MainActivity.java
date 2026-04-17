package com.tca.helloworlddemo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayResult(View view){
        //To take user Input
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);

        //To display Output
        TextView nameOutput = findViewById(R.id.nameOutput);
        TextView ageOutput = findViewById(R.id.ageOutput);

        try{
            int a = Integer.parseInt( age.getText().toString() );
            if(a > 100){
                nameOutput.setText("Age is Invalid !!");
            }
            else{
                nameOutput.setText( "Name :" + name.getText().toString() );
                ageOutput.setText( "Age :" + a );
            }
        }catch(NumberFormatException e){
            nameOutput.setText("Age is Invalid !!");
        }




    }

}
