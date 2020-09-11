package me.daemon.flowlayout.demo;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import me.daemon.flowlayout.FlowLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FlowLayout fl = findViewById(R.id.fl);

        final TextView tv = new TextView(this);
        tv.setText("Added programmatically");
        tv.setBackgroundResource(R.drawable.bg_label);

        final ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        fl.addView(tv, lp);
    }
}