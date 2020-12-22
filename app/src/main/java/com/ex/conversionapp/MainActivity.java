package com.ex.conversionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.ex.conversionapp.unit_convert;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner sub_cat, main_cat;
    String[] curr_sub_cat, len_sub_cat, wei_sub_cat, temp_sub_cat, time_sub_cat, speed_sub_cat;
    ArrayAdapter<String> sub_cat_adap;
    Button btn_conv;
    TextView lbl_res;
    EditText txt_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbl_res = (TextView) findViewById(R.id.lbl_res);
        txt_num= (EditText) findViewById(R.id.txt_num);
        btn_conv= (Button) findViewById(R.id.btn_conv);
        main_cat= (Spinner) findViewById(R.id.txt_main_cat);
        sub_cat= (Spinner) findViewById(R.id.txt_sub_cat);
        sub_cat.setEnabled(false);
        init_sub_cat_array();

        btn_conv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                conv_btn_click();
            }


        });


        main_cat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                check_main_cat(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }
    );


    }

    private void conv_btn_click() {
        double value = Double.parseDouble(txt_num.getText().toString());

        unit_convert uc=new unit_convert(value, main_cat.getSelectedItem().toString(), sub_cat.getSelectedItem().toString());
        lbl_res.setText(Double.toString(uc.get_res()));
    }

    private void init_sub_cat_array(){
        curr_sub_cat=getResources().getStringArray(R.array.curr_cat);
        len_sub_cat=getResources().getStringArray(R.array.len_cat);
        wei_sub_cat=getResources().getStringArray(R.array.wei_cat);
        temp_sub_cat=getResources().getStringArray(R.array.temp_cat);
        time_sub_cat=getResources().getStringArray(R.array.time_cat);
        speed_sub_cat=getResources().getStringArray(R.array.speed_cat);
    }


    private void check_main_cat(String main_cat){

        sub_cat.setEnabled(true);


        switch(main_cat){
            case "Currency":
                sub_cat_adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,curr_sub_cat);
                sub_cat_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                break;
            case "Length":
                sub_cat_adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,len_sub_cat);
                sub_cat_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                break;
            case "Weight":
                sub_cat_adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,wei_sub_cat);
                sub_cat_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                break;
            case "Temperature":
                sub_cat_adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,temp_sub_cat);
                sub_cat_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                break;
            case "Time":
                sub_cat_adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,time_sub_cat);
                sub_cat_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                break;
            case "Speed":
                sub_cat_adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,speed_sub_cat);
                sub_cat_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                break;
            default:
                sub_cat.setEnabled(false);

        }


        if(main_cat!="Select Option") {


            sub_cat.setAdapter(sub_cat_adap);

        }



    }
}