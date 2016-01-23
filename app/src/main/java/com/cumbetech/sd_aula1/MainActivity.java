package com.cumbetech.sd_aula1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openChat(View v){
        EditText edtPort = (EditText) findViewById(R.id.edtPorta);
        EditText edtNome = (EditText) findViewById(R.id.edtNome);
        Intent i = new Intent(this, Chat.class);
        try {
            i.putExtra("oi", "oi");
            i.putExtra("nome", edtNome.getText().toString());
            i.putExtra("port", Integer.parseInt(edtPort.getText().toString()));
        } catch (Exception e){}
        startActivity(i);
    }
}
