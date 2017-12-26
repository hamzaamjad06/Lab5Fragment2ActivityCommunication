package com.example.hamza.lab5fragment2activitycommunication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.hamza.lab5fragment2activitycommunication.fragments.SampleFragment;

public class MainActivity extends AppCompatActivity implements SampleFragment.OnSampleFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonPressed(String message) {
        TextView txtMessage = (TextView) findViewById(R.id.txtMessage);
        txtMessage.setText(message);
        Log.d("MTAG", "onButtonPressed: ");
    }
}
