package com.example.tomon.kadai2_b;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button reset_btn = (Button)findViewById(R.id.button_リセット);


        final int Y = Color.rgb(153,204,0);
        final int X = Color.rgb(0,0,255);


        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"リセットしました。",Toast.LENGTH_SHORT).show();
                TextView message;
                message = (TextView)findViewById(R.id.button_リセット);
                message.setText("リセット");

                //Button
                final View v1 = findViewById(R.id.button1);
                final int color =X;
                v1.setBackgroundColor(color);

                //Button3
                final View v2 = findViewById(R.id.button2);
                v2.setBackgroundColor(color);

                //Button2
                final View v3 = findViewById(R.id.button3);
                v3.setBackgroundColor(color);

                //Button6
                final View v4 = findViewById(R.id.button4);
                v4.setBackgroundColor(color);

                //Button5
                final View v5 = findViewById(R.id.button5);
                v5.setBackgroundColor(color);

                //Buuton4
                View v6 = findViewById(R.id.button6);
                v6.setBackgroundColor(color);

                //Button9
                View v7 = findViewById(R.id.button7);
                v7.setBackgroundColor(color);

                //Button8
                View v8 = findViewById(R.id.button8);
                v8.setBackgroundColor(color);

                //Button7
                View v9 = findViewById(R.id.button9);
                v9.setBackgroundColor(color);


                ColorDrawable d1 = (ColorDrawable)v1.getBackground();
                final int c1 = d1.getColor();
                ColorDrawable d2 = (ColorDrawable)v2.getBackground();
                final int c2 = d2.getColor();
                ColorDrawable d3 = (ColorDrawable)v3.getBackground();
                int c3 = d3.getColor();
                ColorDrawable d4 = (ColorDrawable)v4.getBackground();
                int c4 = d4.getColor();
                ColorDrawable d5 = (ColorDrawable)v5.getBackground();
                int c5 = d5.getColor();
                ColorDrawable d6 = (ColorDrawable)v6.getBackground();
                int c6 = d6.getColor();
                ColorDrawable d7 = (ColorDrawable)v7.getBackground();
                int c7 = d7.getColor();
                ColorDrawable d8 = (ColorDrawable)v8.getBackground();
                int c8 = d8.getColor();
                ColorDrawable d9 = (ColorDrawable)v9.getBackground();
                int c9 = d9.getColor();


            }

        });


    }

    public void check(){
        int Y = Color.rgb(153,204,0);
        int X = -6697984;

        Button b = (Button)findViewById(R.id.button_リセット);
        View v1 = findViewById(R.id.button1);
        View v2 = findViewById(R.id.button2);
        View v3 = findViewById(R.id.button3);
        View v4 = findViewById(R.id.button4);
        View v5 = findViewById(R.id.button5);
        View v6 = findViewById(R.id.button6);
        View v7 = findViewById(R.id.button7);
        View v8 = findViewById(R.id.button8);
        View v9 = findViewById(R.id.button9);

        ColorDrawable d1 = (ColorDrawable)v1.getBackground();
        int c1 = d1.getColor();
        ColorDrawable d2 = (ColorDrawable)v2.getBackground();
        int c2 = d2.getColor();
        ColorDrawable d3 = (ColorDrawable)v3.getBackground();
        int c3 = d3.getColor();
        ColorDrawable d4 = (ColorDrawable)v4.getBackground();
        int c4 = d4.getColor();
        ColorDrawable d5 = (ColorDrawable)v5.getBackground();
        int c5 = d5.getColor();
        ColorDrawable d6 = (ColorDrawable)v6.getBackground();
        int c6 = d6.getColor();
        ColorDrawable d7 = (ColorDrawable)v7.getBackground();
        int c7 = d7.getColor();
        ColorDrawable d8 = (ColorDrawable)v8.getBackground();
        int c8 = d8.getColor();
        ColorDrawable d9 = (ColorDrawable)v9.getBackground();
        int c9 = d9.getColor();

        if (X==(c1&c2&c3&c4&c5&c6&c7&c8&c9)){
            TextView message;
            message = (TextView)this.findViewById(R.id.button_リセット);
            message.setText("ゲームクリア!!");
        }

    }

    public void SetButtonOnClick(View v){
        int Y = Color.rgb(153,204,0);
        int X = Color.rgb(0,0,255);
        ColorDrawable d = (ColorDrawable)v.getBackground();
        int color = d.getColor();
        if (color != Y) {
            v.setBackgroundColor(Y);
        } else {
            v.setBackgroundColor(X);
        }
        check();
    }

}
