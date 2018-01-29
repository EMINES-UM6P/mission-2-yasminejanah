package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by khalidbaba on 28/01/2018.
 */



public class MainActivity extends Activity {
    Button Login;
    EditText Email;
    EditText Password;
    String _email;
    // TODO : declare all variables (elements AND variables)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    Login=(Button)findViewById(R.id.btnLogin);
    Email=(EditText)findViewById(R.id.email);
    Password=(EditText)findViewById(R.id.password);
    Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        _email=Email.getText().toString();
            Log.i("btnlogin","button clicked");
            Intent i=new Intent(MainActivity.this,WolcomeActivity.class);
            i.putExtra("Email",_email);
            startActivity(i);
        }
    });

        //TODO Instantiate object (EditText and Button)



        //TODO : handle click listener in button and get values from the editText


        //TODO : Create Intent and send email content to the welcome_activity



    }
}

