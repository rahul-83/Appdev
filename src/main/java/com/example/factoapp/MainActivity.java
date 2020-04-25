package com.example.factoapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.*;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<n, j> extends AppCompatActivity {

    private EditText mnum;
    private Button mg_opt;
    private Button mopt_1;
    private Button mopt_2;
    private Button mopt_3;
    private TextView mscore;

    private String Answer;
    private int score=0;

    public int get_num(){
        return Integer.parseInt(mnum.getText().toString());
    }

    public int[] addX(int arr[], int x) {
        int i;
        // create a new array of size n+1
        int newarr[] = new int[arr.length + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < arr.length; i++)
            newarr[i] = arr[i];

        newarr[arr.length] = x;

        return newarr;
    }

    public int[] factorarray(){
        int i;
        int k=get_num();
        int[] arr={};
        for (i=1;i<k;i++){
            if(get_num()%i==0){
                addX(arr,i);
            }
        }
        return arr;
    }

    public int[] nonfactorarray(){
        int i;
        int k=get_num();
        int[] arr={};
        for (i=1;i<k;i++){
            if(get_num()%i!=0){
                addX(arr,i);
            }
        }
        return arr;
    }

    public String get_option_1()
    {
        int k=get_num();
        int i;
        int[] arr =factorarray();
        if(k%2==0)
        return String.valueOf(k/2);
        else{
            for(i=3;i<k;i+=2){
                if(k%i==0){
                    break;
                }
            }
        }
        return String.valueOf(k/i);
    }
    public String get_option_2()
    {
        int k=get_num();
        int i;
        int[] arr =factorarray();
        if(k==4)
            return String.valueOf(0);
        if(k==6)
            return String.valueOf(5);
        if(k%2==0)
            return String.valueOf(k/2-1);
        else{
            for(i=3;i<k;i+=2){
                if(k%i==0){
                    break;
                }
            }
        }
        return String.valueOf(k/i-1);
    }
    public String get_option_3()
    {
        int k=get_num();
        int i;
        int[] arr =factorarray();
        if(k==2)
            return String.valueOf(3);
        if(k%2==0)
            return String.valueOf(k/2+1);
        else{
            for(i=3;i<k;i+=2){
                if(k%i==0){
                    break;
                }
            }
        }
        return String.valueOf(k/i+1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mnum= (EditText)findViewById(R.id.etNum1);
        mg_opt= (Button)findViewById(R.id.btnfactor);
        mopt_1= (Button)findViewById(R.id.button1);
        mopt_2= (Button)findViewById(R.id.button2);
        mopt_3= (Button)findViewById(R.id.button3);

        mg_opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mopt_1.setText(String.valueOf(get_option_1()));
                mopt_2.setText(String.valueOf(get_option_2()));
                mopt_3.setText(String.valueOf(get_option_3()));
            }
        });
        mopt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   score = score + 1;
                   Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();


        }
    });
        mopt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(MainActivity.this, "Wrong.The Correct answer is option A", Toast.LENGTH_SHORT).show();
            }
        });
        mopt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(MainActivity.this, "Wrong.The Correct answer is option A", Toast.LENGTH_SHORT).show();
            }
        });

    };
}








