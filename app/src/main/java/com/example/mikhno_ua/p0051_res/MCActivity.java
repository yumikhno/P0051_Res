package com.example.mikhno_ua.p0051_res;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MCActivity extends AppCompatActivity {

    TextView colorNameTextView;
    ConstraintLayout colorBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       colorNameTextView = (TextView) findViewById(R.id.textView16);
       colorBackground = (ConstraintLayout) findViewById(R.id.colorBackgroud);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/

        colorNameTextView.setText(item.getTitle().toString());

        switch (item.getTitle().toString()) {
            case "Black":
                setColor(getResources().getColor(R.color.colorBlack));
                break;
            case "White":
                colorNameTextView.setTextColor(getResources().getColor(R.color.colorWhite));
                colorBackground.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                colorBackground.getBackground().setAlpha(150);
                break;
            case "Orange":
                setColor(getResources().getColor(R.color.colorOrange));
                break;
            case "Purple":
                setColor(getResources().getColor(R.color.colorPurple));
                break;
            case "Lime":
                setColor(getResources().getColor(R.color.colorLime));
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setColor(int color) {
        colorNameTextView.setTextColor(color);
        colorBackground.setBackgroundColor(color);
        colorBackground.getBackground().setAlpha(30);
    }

}