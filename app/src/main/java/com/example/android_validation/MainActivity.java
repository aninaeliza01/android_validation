package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,password;
    String validUser="godwin",validPassword="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.et1);
        password=findViewById(R.id.et2);
    }

    public void validate(View view) {
        String username=user.getText().toString();
        String pass=password.getText().toString();
        if(username.equals(validUser) & pass.equals(validPassword)){
            Toast.makeText(MainActivity.this,"Validated",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_LONG).show();
        }
    }
}