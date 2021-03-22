package com.example.pamactivity2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //mendeklarasikan variabel dengan tipe data textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //mengubungkan variabel txEmail dengan componen textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variabel txemail dengan componen textview pada layput
        txPassword = findViewById(R.id.tvPassword);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil pesan yg dikirimkan melalui method intent
        Bundle bundle =getIntent().getExtras();

        //mendeklarasikan variabel bundle yang akan di gunakan untuk mengambil pesan yang dikirim dari activity sebelumnya dengan kunci "a'
        String email = bundle.getString("a");

        //mendeklarasikan variabel bundle yang akan di gunakan untuk mengambil pesan yang dikirim dari activity sebelumnya dengan kunci "b'
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel pass kedalam txpassword
        txPassword.setText(pass);
    }
}
