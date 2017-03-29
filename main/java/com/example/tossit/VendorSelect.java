package com.example.tossit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VendorSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_select);
    }

    public void openBreadList(View view) {
        Intent intent = new Intent(this, ItemSelect.class);
        startActivity(intent);
    }

    public void openPandaList(View view) {
        Intent intent2 = new Intent(this, PandaSelect.class);
        startActivity(intent2);
    }
}
