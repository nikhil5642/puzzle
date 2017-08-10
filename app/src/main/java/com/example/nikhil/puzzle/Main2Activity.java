package com.example.nikhil.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText x;
    private Button z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    z=(Button)findViewById(R.id.button_view);
    x=(EditText)findViewById(R.id.text_view);


     z.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String y=x.getText().toString();
             Toast.makeText(Main2Activity.this,y,Toast.LENGTH_SHORT).show();
         }
     });
    }
}
