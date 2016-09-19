package com.example.mul13.a1137050127;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nama,email, nim, angkatan;
    Button tampil;
    TextView namaOut, emailOut, nimOut, angkatanOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.EdNama);
        email = (EditText) findViewById(R.id.EdEmail);
        nim = (EditText) findViewById(R.id.EdNim);
        angkatan = (EditText) findViewById(R.id.EdAngkatan);
        namaOut = (TextView) findViewById(R.id.TextNama);
        emailOut = (TextView) findViewById(R.id.TextEmail);
        nimOut = (TextView) findViewById(R.id.TextNim);
        angkatanOut = (TextView) findViewById(R.id.TextAngkatan);
        tampil = (Button) findViewById(R.id.BtnTampil);
        tampil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        namaOut.setText(nama.getText().toString());
        emailOut.setText(email.getText().toString());
        nimOut.setText(nim.getText().toString());
        angkatanOut.setText(angkatan.getText().toString());
    }
}
