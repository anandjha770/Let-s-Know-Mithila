package com.anandjha.letsknowmithila.persons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.anandjha.letsknowmithila.R;

public class AboutPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_person);

        Intent intent = getIntent();
        String str = intent.getStringExtra("itemName");
        this.setTitle(str);
    }
}