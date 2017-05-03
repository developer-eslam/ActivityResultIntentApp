package com.serverproject.facedetection.activityresultintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int requestcodeactivty = 1;
    EditText txtname;
    Button btngo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname=(EditText)findViewById(R.id.txtname);
        btngo=(Button)findViewById(R.id.btngo);

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getdata = txtname.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",getdata);

                startActivityForResult(intent,requestcodeactivty);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestcodeactivty==requestCode){
            if(resultCode==RESULT_OK){
                txtname.setText(data.getData().toString());

            }

        }
    }


}
