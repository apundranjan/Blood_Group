package com.example.dellpc.blood_group;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class Collect_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect__form);
    }

    final Button submit = (Button)findViewById(R.id.Submit);

    public void sendForm(View button) {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add intent //
            }
        });
    }

    final EditText nameField = (EditText) findViewById(R.id.EditTextName);
    String name = nameField.getText().toString();

    final EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
    String email = emailField.getText().toString();

    final EditText feedbackField = (EditText) findViewById(R.id.EditTextFeedbackBody);
    String address = feedbackField.getText().toString();

    final Spinner feedbackSpinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
    String feedbackType = feedbackSpinner.getSelectedItem().toString();

    final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.CheckBoxResponse);
    boolean bRequiresResponse = responseCheckbox.isChecked();


}
