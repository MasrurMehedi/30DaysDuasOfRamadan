package com.example.masror_mehedi.a30daysduasoframadan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgPlace;
    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace = findViewById(R.id.img_place);
        textName = findViewById(R.id.txt_name);
        String getPlace = getIntent().getExtras().getString("place");


        if (getPlace.equals("D1"))
        {
            imgPlace.setImageResource(R.drawable.a);

            textName.setText(R.string.D1);
        }
        else if (getPlace.equals("D2")){
            imgPlace.setImageResource(R.drawable.b);

            textName.setText(R.string.D2);

        }
        else if (getPlace.equals("D3")){
            imgPlace.setImageResource(R.drawable.c);

            textName.setText(R.string.D3);
        }
        else if (getPlace.equals("D4")){
            imgPlace.setImageResource(R.drawable.d);

            textName.setText(R.string.D4);
        }
        else if (getPlace.equals("D5")){
            imgPlace.setImageResource(R.drawable.e);

            textName.setText(R.string.D5);
        }
        else if (getPlace.equals("D6")){
            imgPlace.setImageResource(R.drawable.f);

            textName.setText(R.string.D6);
        }
        else if (getPlace.equals("D7")){
            imgPlace.setImageResource(R.drawable.g);

            textName.setText(R.string.D7);
        }
        else if (getPlace.equals("D8")){
            imgPlace.setImageResource(R.drawable.h);

            textName.setText(R.string.D8);
        }

        else if (getPlace.equals("D9")){
            imgPlace.setImageResource(R.drawable.i);

            textName.setText(R.string.D9);
        }
        else if (getPlace.equals("D10")){
            imgPlace.setImageResource(R.drawable.j);

            textName.setText(R.string.D10);
        }
        else if (getPlace.equals("D11")){
            imgPlace.setImageResource(R.drawable.k);

            textName.setText(R.string.D11);
        }
        else if (getPlace.equals("D12")){
            imgPlace.setImageResource(R.drawable.l);

            textName.setText(R.string.D12);
        }
        else if (getPlace.equals("D13")){
            imgPlace.setImageResource(R.drawable.m);

            textName.setText(R.string.D13);
        }
        else if (getPlace.equals("D14")){
            imgPlace.setImageResource(R.drawable.n);

            textName.setText(R.string.D14);
        }
        else if (getPlace.equals("D14")){
            imgPlace.setImageResource(R.drawable.o);

            textName.setText(R.string.D15);
        }
        else if (getPlace.equals("D16")){
            imgPlace.setImageResource(R.drawable.p);

            textName.setText(R.string.D16);
        }else if (getPlace.equals("D17")){
            imgPlace.setImageResource(R.drawable.q);

            textName.setText(R.string.D17);
        }else if (getPlace.equals("D18")){
            imgPlace.setImageResource(R.drawable.r);

            textName.setText(R.string.D18);
        }else if (getPlace.equals("D19")){
            imgPlace.setImageResource(R.drawable.s);

            textName.setText(R.string.D19);
        }else if (getPlace.equals("D20")){
            imgPlace.setImageResource(R.drawable.t);

            textName.setText(R.string.D20);
        }else if (getPlace.equals("D21")){
            imgPlace.setImageResource(R.drawable.u);

            textName.setText(R.string.D21);
        }else if (getPlace.equals("D22")){
            imgPlace.setImageResource(R.drawable.v);

            textName.setText(R.string.D22);
        }
        else if (getPlace.equals("D23")){
            imgPlace.setImageResource(R.drawable.w);

            textName.setText(R.string.D23);
        }
        else if (getPlace.equals("D24")){
            imgPlace.setImageResource(R.drawable.x);

            textName.setText(R.string.D24);
        }else if (getPlace.equals("D25")){
            imgPlace.setImageResource(R.drawable.y);

            textName.setText(R.string.D25);
        }else if (getPlace.equals("D26")){
            imgPlace.setImageResource(R.drawable.z);

            textName.setText(R.string.D26);
        }else if (getPlace.equals("D27")){
            imgPlace.setImageResource(R.drawable.aa);

            textName.setText(R.string.D27);
        }else if (getPlace.equals("D28")){
            imgPlace.setImageResource(R.drawable.bb);

            textName.setText(R.string.D28);
        }
        else if (getPlace.equals("D29")){
            imgPlace.setImageResource(R.drawable.cc);

            textName.setText(R.string.D29);
        }
        else {
            imgPlace.setImageResource(R.drawable.dd);

            textName.setText(R.string.D30);
        }
    }
}
