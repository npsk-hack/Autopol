package com.autopol.customview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.autopol.R;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button feedback = findViewById(R.id.feed);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(settings.this, "Redirecting...", Toast.LENGTH_SHORT).show();
                Intent intention  = new Intent();
                intention.setAction(Intent.ACTION_VIEW);
                intention.addCategory(Intent.CATEGORY_BROWSABLE);
                intention.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdVO7ruv43JBo_4_QjWdh542X6kRj8L8PK5rf4UUFvOioDi3w/viewform?usp=sf_link"));
                startActivity(intention);
            }


        });
        Button bug_rep = findViewById((R.id.bug));
        bug_rep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(settings.this, "Redirecting...", Toast.LENGTH_SHORT).show();
                Intent intention  = new Intent();
                intention.setAction(Intent.ACTION_VIEW);
                intention.addCategory(Intent.CATEGORY_BROWSABLE);
                intention.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeo2FQCk-YkNGFUCdzu2tHpOF63LCJz6yEjXbzYUPZPsRr9iw/viewform?usp=sf_link"));
                startActivity(intention);
            }


        });
    }

}
