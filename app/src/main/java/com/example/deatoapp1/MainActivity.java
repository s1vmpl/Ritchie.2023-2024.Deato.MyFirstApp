package com.example.deatoapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name;
    TextView myName;
    TextView email;
    TextView myEmail;
    TextView contact;
    TextView myContact;
    TextView myDisplay;
    Button myButton;
    Button myClear;
    EditText myInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (TextView) findViewById(R.id.txtName);
        myName = (TextView) findViewById(R.id.txtMyName);
        email = (TextView) findViewById(R.id.txtEmail);
        myEmail = (TextView) findViewById(R.id.txtMyEmail);
        contact = (TextView) findViewById(R.id.txtContact);
        myContact = (TextView) findViewById(R.id.txtMyContact);
        myDisplay = (TextView) findViewById(R.id.txtDisplay);
        myButton = (Button) findViewById(R.id.btnClick);
        myClear = (Button) findViewById(R.id.btnClear);

        myInput = (EditText) findViewById(R.id.txtInputname);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = myInput.getText().toString();
                myDisplay.setText("Hello \n" + myValue +"!");
            }
        });

        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = myInput.getText().toString();
                myDisplay.setText("Hello!");
            }
        });
    }
}