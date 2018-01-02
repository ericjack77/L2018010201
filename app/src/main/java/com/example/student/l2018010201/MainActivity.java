package com.example.student.l2018010201;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity /*3. */implements View.OnClickListener
{
    Button bu3;
    ToggleButton tb;
    Toast to;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu3=findViewById(R.id.button3);
        tb=findViewById(R.id.toggleButton);
        to=new Toast(MainActivity.this);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb.isChecked())
                {
                    //to.cancel();
                    to.makeText(MainActivity.this,"目前開啟中",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //to.cancel();
                    to.makeText(MainActivity.this,"目前關閉中",Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*1.
         Mylistener my = new Mylistener();
        bu3.setOnClickListener(my);*/

        /*2.
        bu3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this,"test3",Toast.LENGTH_LONG).show();
            }
        });//use Anonymous class if only use once.*/

        /*3. */
        bu3.setOnClickListener(this);

    }

    public void click3(View v)
    {
        //to.cancel();
    }

    public void click2(View v)
    {
        if(tb.isChecked())
        {
            Toast.makeText(MainActivity.this,"目前開啟中",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(MainActivity.this,"目前關閉中",Toast.LENGTH_LONG).show();

        }
    }

   /* 1.
   class Mylistener implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Toast.makeText(MainActivity.this,"test3",Toast.LENGTH_LONG).show();
        }
    }*/



    public void click1(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this,"test1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this,"test2",Toast.LENGTH_SHORT).show();

                //Toast.makeText(MainActivity.this,99,1);
                break;
        }
    }

    /*3. */
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button3:
                Toast.makeText(MainActivity.this,"test3",Toast.LENGTH_LONG).show();
                break;
        }

    }
    public void click4(View v)
    {
        Intent in=new Intent();
        in.setClass(MainActivity.this,Main2Activity.class);

    }


}
