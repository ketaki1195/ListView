package com.example.handleruntimechange2;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            ((ImageView) findViewById(R.id.imgVw)).setImageResource(R.drawable.index);

        }else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            ((ImageView) findViewById(R.id.imgVw)).setImageResource(R.drawable.ketaki);
        }else{
            ((ImageView) findViewById(R.id.imgVw)).setImageResource(R.drawable.logo);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
