package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Toast toast;
    EditText ed1;
    EditText ed2;
    String str1;
    String str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();
    }

    public void OnclickButtonLister(){
        button = (Button)findViewById(R.id.button);
        ed1 = findViewById(R.id.editTextTextPersonName);
        ed2 = findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Navigating to Activity 2";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context , text , duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                        toast.show();

                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);

                        str1 = ed1.getText().toString();
                        intent.putExtra("Value1",str1);
                        str2 = ed2.getText().toString();
                        intent.putExtra("Value2",str2);

                        startActivity(intent);
                        finish();



                    }
                }
        );

    }


}