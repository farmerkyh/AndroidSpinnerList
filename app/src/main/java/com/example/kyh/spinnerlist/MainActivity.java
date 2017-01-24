package com.example.kyh.spinnerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----------------------------------------------------------------------------------------------------------
        //컬러 Spinner (List 방식)
        //-----------------------------------------------------------------------------------------------------------
        String special[] = {"red","blue","white","yello"};
        List<String> list = new ArrayList<String>();
        for(int i=0; i<special.length; i++){
            list.add(i, special[i]);
        }

        Spinner spinner = (Spinner)findViewById(R.id.sp_color);
        // 스피너에 뿌려질 List형식의 Data를 담을 Adapter
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        // Spinner 클릭시 DropDown 모양을 설정
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 스피너에 어답터를 연결
        spinner.setAdapter(spinnerArrayAdapter);
    }
}
