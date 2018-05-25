package com.example.arkantesfaymekonen.s2project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name;
    Button goBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText) findViewById(R.id.name_input);
        goBtn=(Button)findViewById(R.id.gobutton);

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"enter ",Toast.LENGTH_SHORT).show();

                }else
                {

                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("username",name.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
