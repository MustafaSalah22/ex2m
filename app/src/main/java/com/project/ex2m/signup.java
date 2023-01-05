package com.project.ex2m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.project.ex2m.databinding.ActivitySignupBinding;

public class signup extends AppCompatActivity {
private ActivitySignupBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pagelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(signup.this,MainActivity.class));
            }
        });
        binding.btnSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validateData();
            }
        });
    }


    private String name="",password="";

    private void validateData() {
        name=binding.etUsername.getText().toString().trim();
        password=binding.etPassword.getText().toString().trim();
        String cPassword=binding.etPassword2.getText().toString().trim();

        if(TextUtils.isEmpty(name)) {
            Toast.makeText(this,"enter username",Toast.LENGTH_SHORT).show();

        }

        else if(TextUtils.isEmpty(password)) {
            Toast.makeText(this,"enter password",Toast.LENGTH_SHORT).show();

        }
        else if(TextUtils.isEmpty(password)) {
            Toast.makeText(this,"confirm passsword",Toast.LENGTH_SHORT).show();

        }
        else if(!password.equals(cPassword)) {
            Toast.makeText(this,"password is not  match",Toast.LENGTH_SHORT).show();

        }
        else {

            startActivity(new Intent(signup.this,MainActivity.class));
            finish();
        }
    }
}
