package com.example.chatmyway;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class more extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);
        setTitle("More Features");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void myNews(View view){
        Intent NewsIntent = new Intent(more.this, News.class);
        startActivity(NewsIntent);
    }
    public void myFact(View view){
        Intent FactIntent = new Intent(more.this, Fact.class);
        startActivity(FactIntent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
