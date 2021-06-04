package com.dreamproject.registrationactivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    //    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");


        RadioButton Male = findViewById(R.id.Male);
        RadioButton Female = findViewById(R.id.Female);
        EditText nameEt = findViewById(R.id.nameEt);
        EditText emailEt = findViewById(R.id.emailEt);
        EditText mobileEt = findViewById(R.id.mobileEt);
        EditText PasswordEt = findViewById(R.id.passwordEt);
        EditText hobby1Et = findViewById(R.id.hobby1Et);
        EditText hobby2Et = findViewById(R.id.hobby2Et);
        EditText hobby3Et = findViewById(R.id.hobby3Et);
        EditText hobby4Et = findViewById(R.id.hobby4Et);
//        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        Button btnEt= findViewById(R.id.btnEt);


        btnEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //get data
                String name = nameEt.getText().toString();
                String email = emailEt.getText().toString();
                String mobile = mobileEt.getText().toString();
                String password = PasswordEt.getText().toString();
                String hobby1 = hobby1Et.getText().toString();
                String hobby2 = hobby2Et.getText().toString();
                String hobby3 = hobby3Et.getText().toString();
                String hobby4 = hobby4Et.getText().toString();


                Intent intent = new Intent( MainActivity.this, SecondActivity.class);
                String gender;
                if (Male.isChecked()==true) {
//                    gender = "Male";
                    intent.putExtra("gender","Male");

                } else if (Female.isChecked()==true) {
//                    gender = "Female";
                    intent.putExtra("gender","Female");

                }
                intent.putExtra("Name",name);
                intent.putExtra("Email",email);
                intent.putExtra("mobile",mobile);
                intent.putExtra("password",password);
                intent.putExtra("hobby1",hobby1);
                intent.putExtra("hobby2",hobby2);
                intent.putExtra("hobby3",hobby3);
                intent.putExtra("hobby4",hobby4);
                startActivity(intent);





            }
        });

    }

}
