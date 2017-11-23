package com.monmoy.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String given_username;
    public String given_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText_username = (EditText) findViewById(R.id.editText);
        final EditText editText_password = (EditText) findViewById(R.id.editText2);
        final Button button_login = (Button) findViewById(R.id.button);

        button_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                         given_username = editText_username.getText().toString();
                         given_password = editText_password.getText().toString();
                        if((given_username.equals("Adiba") && given_password.equals("1605097")) ||
                                (given_username.equals("Sunan") && given_password.equals("1605073")) ||
                                (given_username.equals("Doha") && given_password.equals("1605108")) ||
                                (given_username.equals("Muntaka") && given_password.equals("1605106"))){
                            Intent myIntent = new Intent(MainActivity.this, LoggedInPage.class);
                            myIntent.putExtra("Username", given_username);
                            startActivity(myIntent);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

    }

    @Override
    protected void onPostResume() {
        final EditText editText_username = (EditText) findViewById(R.id.editText);
        final EditText editText_password = (EditText) findViewById(R.id.editText2);

        editText_username.setText("");
        editText_password.setText("");
        super.onPostResume();
    }
}
