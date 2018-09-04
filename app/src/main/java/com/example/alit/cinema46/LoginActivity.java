package com.example.alit.cinema46;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editUsername;
    EditText editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();
                //mengisi nilai, dari parameter method validate login dengan hasil inputan
                validateLogin(username,password); //penamaan validate login bebas
            }
        });
    }

    //method
    private void validateLogin(String username, String password){
        if (username.equals("")){
            Toast.makeText(this, "username is required", Toast.LENGTH_SHORT).show();
        }else if (password.equals("")){
            Toast.makeText(this, "password is required", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent= new Intent(this,ListActivity.class);
            startActivity(intent);
        }
    }
}
