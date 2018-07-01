package com.example.dellpc.blood_group;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* final Button donate_b = (Button)findViewById(R.id.donate_b);
        final Button collect_b = (Button)findViewById(R.id.collect_b);
        final Button signup_b = (Button)findViewById(R.id.signup_b);
        final Button signin_b = (Button)findViewById(R.id.signin_b);
        final Button search_b = (Button)findViewById(R.id.search_b);
*/


    final Button donate_b = (Button)findViewById(R.id.donate_b);
    final Button collect_b = (Button)findViewById(R.id.collect_b);
    final Button signup_b = (Button)findViewById(R.id.signup_b);
    final Button signin_b = (Button)findViewById(R.id.signin_b);
    final Button search_b = (Button)findViewById(R.id.search_b);


    donate_b.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),Donate_Form.class);
                    startActivity(i);
                }
            }
    );

    collect_b.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),Collect_Form.class);
                    startActivity(i);
                }
            }
    );

    signup_b.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent i = new Intent(getApplicationContext(),Sign_Up.class);
                                        startActivity(i);
                                    }
                                }
    );

    signin_b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),Sign_In.class);
            startActivity(i);
        }
    });

    search_b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),Search.class);
            startActivity(i);
        }
    });

    }

}
