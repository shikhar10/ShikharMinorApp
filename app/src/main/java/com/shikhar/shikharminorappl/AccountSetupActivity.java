package com.shikhar.shikharminorappl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class AccountSetupActivity extends AppCompatActivity {
EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setup);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText5);

    }
}
