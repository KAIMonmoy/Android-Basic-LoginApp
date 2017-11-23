package com.monmoy.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class LoggedInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in_page);

        String name = getIntent().getExtras().getString("Username");

        ImageView imageView_login = (ImageView) findViewById(R.id.imageView2);
        if(name.equals("Adiba")){
            imageView_login.setImageResource(R.drawable.adiba);
        }
        else if(name.equals("Sunan")){
            imageView_login.setImageResource(R.drawable.sunan);
        }
        else if(name.equals("Doha")){
            imageView_login.setImageResource(R.drawable.doha);
        }
        else if(name.equals("Muntaka")){
            imageView_login.setImageResource(R.drawable.muntaka);
        }
        else{
            imageView_login.setImageResource(R.drawable.prescripxionlogo);
        }


        Button button_logout = (Button) findViewById(R.id.button2);
        button_logout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"Please use the Log Out Button", Toast.LENGTH_SHORT).show();
    }
}
