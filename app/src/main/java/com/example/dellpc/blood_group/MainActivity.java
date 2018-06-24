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
    }

    final Button donate_b = (Button)findViewById(R.id.donate_b);
    final Button collect_b = (Button)findViewById(R.id.collect_b);
    final Button signup_b = (Button)findViewById(R.id.signup_b);
    final Button signin_b = (Button)findViewById(R.id.signin_b);
    final Button search_b = (Button)findViewById(R.id.search_b);

    public void OnClickButtonListener() {
        donate_b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.dellpc.blood_group.MainActivity.Donate_Form");
                        startActivity(intent);
                    }
                }
        );

        collect_b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent("com.example.dellpc.blood_group.MainActivity.Collect_Form");
                        startActivity(intent2);
                    }
                }
        );

        signup_b.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent3 = new Intent("com.example.dellpc.blood_group.MainActivity.Sign_Up");
                                            startActivity(intent3);
                                        }
                                    }
        );

        signin_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent("com.example.dellpc.blood_group.MainActivity.Sign_In");
                startActivity(intent4);
            }
        });

        search_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent("com.example.dellpc.blood_group.MainActivity.Search");
                startActivity(intent5);
            }
        });

    }

}
