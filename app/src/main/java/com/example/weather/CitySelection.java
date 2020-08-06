package com.example.weather;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CitySelection  extends AppCompatActivity{
    final static String datakey ="datakey";
    private EditText editText;
    private Button apply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cityselectionlayout);
        findView();
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString();
                Intent dataintent = new Intent();
                dataintent.putExtra(datakey,text);
                setResult(RESULT_OK,dataintent);
                finish();
            }
        });
    }

    public void findView(){
        editText=findViewById(R.id.citytextView);
        apply = findViewById(R.id.applyButton);
    }
}
