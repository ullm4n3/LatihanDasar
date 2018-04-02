package com.blogspot.be_unix.latihandasar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtChange = (TextView)findViewById(R.id.txtChange);
        Button btnRed = (Button)findViewById(R.id.btnRed);
        Button btnBlue = (Button)findViewById(R.id.btnBlue);
        Button btnGreen = (Button)findViewById(R.id.btnGreen);
        Button btnYellow = (Button)findViewById(R.id.btnYellow);
        Button btnBlack = (Button)findViewById(R.id.btnBlack);
        Button btnWhite  = (Button)findViewById(R.id.btnWhite);

        btnRed.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(Color.parseColor("#AA0000"));
                txtChange.setText("MERAH");
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(Color.parseColor("#0000AA"));
                txtChange.setText("BIRU");
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(Color.parseColor("#0A0A0A"));
                txtChange.setText("KUNING");
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(Color.parseColor("#00F0AA"));
                txtChange.setText("HIJAU");
            }
        });

        btnWhite.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(Color.parseColor("#AAAAAA"));
                txtChange.setText("PUTIH");
            }
        });

        btnBlack.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtChange.setTextColor(Color.parseColor("#000000"));
                txtChange.setText("HITAM");
            }
        });
    }
}