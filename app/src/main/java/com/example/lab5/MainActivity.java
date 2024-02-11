package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final LinearLayout mylayout = (LinearLayout)findViewById(R.id.root);
        int itId = item.getItemId();
        if (itId == R.id.red){
            mylayout.setBackgroundColor(getResources().getColor(R.color.red));
            return true;}
        else if (itId == R.id.green){
            mylayout.setBackgroundColor(getResources().getColor(R.color.green));
            return true;}
        else if (itId == R.id.blue){
            mylayout.setBackgroundColor(getResources().getColor(R.color.blue));
            return true;}
        else if (itId == R.id.show_text){
            Toast.makeText(getApplicationContext(),"Hello world!", Toast.LENGTH_LONG).show();
        return true;}
        else if (itId == R.id.change_background){
            mylayout.setBackground(getDrawable(R.drawable.polytechlogomainblack));
        return true;}
        else if (itId == R.id.exit){
            finish();
            return true;}
        else return super.onOptionsItemSelected(item);
    }
}
