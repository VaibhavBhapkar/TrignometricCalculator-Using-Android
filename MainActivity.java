package com.example.dell.trig_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {


    EditText first;
    EditText second;
    Button btnadd;
    Button btnsub;
    Button btnmul;
    Button btndiv;
    Button btnsin;
    Button btncos;
    Button btntan;
    Button btnsqrt;
    Button btnshow;
    Button btncler;
    TextView result;
    Double num1,num2,res;
    String file="calculation";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText) findViewById(R.id.editText);
        second=(EditText) findViewById(R.id.editText2);
        btnadd = (Button) findViewById(R.id.button);
        btnsub = (Button) findViewById(R.id.button3);
        btnmul = (Button) findViewById(R.id.button4);
        btndiv = (Button) findViewById(R.id.button5);
        btnsin = (Button) findViewById(R.id.button2);
        btncos = (Button) findViewById(R.id.button6);
        btntan = (Button) findViewById(R.id.button7);
        btnsqrt = (Button) findViewById(R.id.button8);
        btnshow = (Button) findViewById(R.id.button9);
        btncler = (Button) findViewById(R.id.button10);
        result = (TextView)findViewById(R.id.textView2);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                num2=Double.parseDouble(second.getText().toString());
                res=num1+num2;
                rest=num1 + "+" +num2 +"=" +res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                num2=Double.parseDouble(second.getText().toString());
                res=num1-num2;
                rest=num1 + "-" +num2 +"=" +res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                num2=Double.parseDouble(second.getText().toString());
                res=num1*num2;
                rest=num1 + "*" +num2 +"=" +res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                num2=Double.parseDouble(second.getText().toString());
                res=num1/num2;
                rest=num1 + "/" +num2 +"=" +res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                res=Math.sin(Math.PI*(num1)/180);
                rest="sin(" +num1 +")" + "=" + res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                res=Math.cos(Math.PI*(num1)/180);
                rest="cos(" +num1 +")" + "=" + res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                res=Math.tan(Math.PI*(num1)/180);
                rest="tan(" +num1 +")" + "=" + res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btnsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rest;
                num1=Double.parseDouble(first.getText().toString());
                res=Math.sqrt(num1);
                rest="SQRT(" +num1 +")" + "=" + res;
                result.setText(rest);
                try
                {
                    FileOutputStream fout = openFileOutput(file,MODE_APPEND);
                    fout.write(rest.getBytes());
                    fout.close();
                    String filepath=String.valueOf(getFileStreamPath(file));
                    Toast.makeText(getBaseContext(),"Noted in:"+filepath,Toast.LENGTH_SHORT).show();


                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    FileInputStream fin=openFileInput(file);
                    int c;
                    String temp="";
                    while((c=fin.read())!=-1)
                    {
                        temp=temp+Character.toString((char) c);
                        result.setText(temp);
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btncler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream fout = openFileOutput(file,0);
                    OutputStreamWriter fwr=new OutputStreamWriter(fout);
                    fwr.write(0);
                    fwr.flush();
                    fwr.close();
                    Toast.makeText(getBaseContext(),"File Cleared",Toast.LENGTH_SHORT).show();
                    fout.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }
}
