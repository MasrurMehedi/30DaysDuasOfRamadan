package com.example.masror_mehedi.a30daysduasoframadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BtnDua1,BtnDua2,BtnDua3,BtnDua4,BtnDua5,BtnDua6,BtnDua7,BtnDua8,BtnDua9,BtnDua10,BtnDua11,
            BtnDua12,BtnDua13,BtnDua14,BtnDua15,BtnDua16,BtnDua17,BtnDua18,BtnDua19,BtnDua20,BtnDua21,BtnDua22,BtnDua23,
            BtnDua24,BtnDua25, BtnDua26,BtnDua27,BtnDua28,BtnDua29,BtnDua30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnDua1 = findViewById(R.id.dua1_btn);
        BtnDua2 = findViewById(R.id.dua2_btn);
        BtnDua3 = findViewById(R.id.dua3_btn);
        BtnDua4 = findViewById(R.id.dua4_btn);
        BtnDua5 = findViewById(R.id.dua5_btn);
        BtnDua6= findViewById(R.id.dua6_btn);
        BtnDua7 = findViewById(R.id.dua7_btn);
        BtnDua8 = findViewById(R.id.dua8_btn);
        BtnDua9 = findViewById(R.id.dua9_btn);
        BtnDua10 = findViewById(R.id.dua10_btn);
        BtnDua11 = findViewById(R.id.dua11_btn);
        BtnDua12 = findViewById(R.id.dua12_btn);
        BtnDua13 = findViewById(R.id.dua13_btn);
        BtnDua14 = findViewById(R.id.dua14_btn);
        BtnDua15 = findViewById(R.id.dua15_btn);
        BtnDua16 = findViewById(R.id.dua16_btn);
        BtnDua17 = findViewById(R.id.dua17_btn);
        BtnDua18 = findViewById(R.id.dua18_btn);
        BtnDua19 = findViewById(R.id.dua19_btn);
        BtnDua20 = findViewById(R.id.dua20_btn);
        BtnDua21 = findViewById(R.id.dua21_btn);
        BtnDua22 = findViewById(R.id.dua22_btn);
        BtnDua23 = findViewById(R.id.dua23_btn);
        BtnDua24 = findViewById(R.id.dua24_btn);
        BtnDua25 = findViewById(R.id.dua25_btn);
        BtnDua26 = findViewById(R.id.dua26_btn);
        BtnDua27 = findViewById(R.id.dua27_btn);
        BtnDua28 = findViewById(R.id.dua28_btn);
        BtnDua29 = findViewById(R.id.dua29_btn);
        BtnDua30 = findViewById(R.id.dua30_btn);


        BtnDua1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D1");
                Toast.makeText(MainActivity.this,"D1",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D2");
                Toast.makeText(MainActivity.this,"D2",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D3");
                Toast.makeText(MainActivity.this,"D3",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D4");
                Toast.makeText(MainActivity.this,"D4",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D5");
                Toast.makeText(MainActivity.this,"D5",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D6");
                Toast.makeText(MainActivity.this,"D6",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D7");
                Toast.makeText(MainActivity.this,"D7",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D8");
                Toast.makeText(MainActivity.this,"D8",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D9");
                Toast.makeText(MainActivity.this,"D9",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D10");
                Toast.makeText(MainActivity.this,"D10",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D11");
                Toast.makeText(MainActivity.this,"D11",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D12");
                Toast.makeText(MainActivity.this,"D12",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D13");
                Toast.makeText(MainActivity.this,"D13",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D14");
                Toast.makeText(MainActivity.this,"D14",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D15");
                Toast.makeText(MainActivity.this,"D15",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D16");
                Toast.makeText(MainActivity.this,"D16",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D17");
                Toast.makeText(MainActivity.this,"D17",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D18");
                Toast.makeText(MainActivity.this,"D18",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D19");
                Toast.makeText(MainActivity.this,"D19",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D20");
                Toast.makeText(MainActivity.this,"D20",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D21");
                Toast.makeText(MainActivity.this,"D21",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

        BtnDua22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D22");
                Toast.makeText(MainActivity.this,"D22",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D23");
                Toast.makeText(MainActivity.this,"D23",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D24");
                Toast.makeText(MainActivity.this,"D24",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D25");
                Toast.makeText(MainActivity.this,"D25",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D26");
                Toast.makeText(MainActivity.this,"D26",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D27");
                Toast.makeText(MainActivity.this,"D27",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D28");
                Toast.makeText(MainActivity.this,"D28",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D29");
                Toast.makeText(MainActivity.this,"D29",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });
        BtnDua30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra( "place","D30");
                Toast.makeText(MainActivity.this,"D30",Toast.LENGTH_SHORT);

                startActivity(i);
            }
        });

    }
}
