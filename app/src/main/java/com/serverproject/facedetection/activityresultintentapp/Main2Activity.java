package com.serverproject.facedetection.activityresultintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText txtname;
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtname=(EditText)findViewById(R.id.txtname);
        btnback=(Button)findViewById(R.id.btnback);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {

            String result = bundle.getString("name");

            txtname.setText(result);
        }
            btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = getIntent();
                    intent.setData(Uri.parse(txtname.getText().toString()));

                    setResult(RESULT_OK,intent);
                   finish();

                }

        });
    }
}
