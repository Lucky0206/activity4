package com.example.pamactivity2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    //deklarasi variabel untuk button
    Button btnlogin;

    //deklarasi variabel untuk edittext
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnlogin dengan componen button pada layout
        btnlogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //mengeset email yang benar
                String email = "admin@mail.com";

                //mengeset password yang benar
                String pass = "123";

                //mengecek apakah isi dari email dan password sudah sama dengan email dan password sudah di set

                if (nama.isEmpty() || password.isEmpty()) {
                    //membuat variabel toast dan menampilkan pesan edittext tidak boleh kosong
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email dan password harus diisi!!!",
                            Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                } else {

                    //mengecek apakah isi dari email dan password sudah di set
                if (nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "login sukses",
                            Toast.LENGTH_LONG);

                    //menampilkan toast
                    t.show();

                    //membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukkan value dari variabel nama depan kunci "a" dan dimasukkan kedalam bundle
                    b.putString("a", nama.trim());

                    //memasukkan value dari variabel password dengan kunci "b" dan dimasukkan kedalam bundle
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke activityhasil
                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                    //memasukkan bundle kedalam intent untuk dikirimkan ke activityHasil
                    i.putExtras(b);

                    //beripindah ke activityHasil
                    startActivity(i);
                } else {
                    //membuat variabel toast dan membuat toast menampilkan pesan login gagal
                    Toast t = Toast.makeText(getApplicationContext(),
                    "login gagal", Toast.LENGTH_LONG);

                    //menampilkan toast
                    t.show();
                     }
                }
            }
        });
    }
}