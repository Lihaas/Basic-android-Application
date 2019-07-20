package com.example.android.tiktaktoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
int a = 3;
boolean b11=true,b12=true,b13=true,b14=true,b15=true,b16=true,b17=true,b18=true,b19=true;
String x,y,z,p,q,r,k,l,m;
TextView t;
int v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t = findViewById(R.id.name);
        findId();

    }




    public void findId(){
        b1 = findViewById(R.id.aa);
        b2 = findViewById(R.id.bb);
        b3 = findViewById(R.id.cc);
        b4 = findViewById(R.id.dd);
        b5 = findViewById(R.id.ee);
        b6 = findViewById(R.id.ff);
        b7 = findViewById(R.id.gg);
        b8 = findViewById(R.id.hh);
        b9 = findViewById(R.id.ii);

    }

    public void buttonClick(View v){
        switch (v.getId()){
            case R.id.aa:
                if(b11){ if(a%2==0){ b1.setText("X"); a+=1; b11 = false;  x = "X";finals(); }
                    else { b1.setText("0");a+=1;b11 = false;x = "0"; finals();} }
                     break;
            case R.id.bb:
                if(b12){ if(a%2==0){ b2.setText("X"); a+=1; b12 = false; y = "X";finals(); }
                else { b2.setText("0");a+=1;b12 = false;y= "0";finals(); } }
                break;
            case R.id.cc:
                if(b13){ if(a%2==0){ b3.setText("X"); a+=1; b13 = false; z= "X"; finals();}
                else { b3.setText("0");a+=1;b13 = false;z= "0";finals(); } }
                break;
            case R.id.dd:
                if(b14){ if(a%2==0){ b4.setText("X"); a+=1; b14 = false;  p = "X";finals();}
                else { b4.setText("0");a+=1;b14 = false;p = "0";finals(); } }
                break;
            case R.id.ee:
                if(b15){ if(a%2==0){ b5.setText("X"); a+=1; b15 = false;q = "X"; finals(); }
                else { b5.setText("0");a+=1;b15 = false;q = "0";finals(); } }
                break;
            case R.id.ff:
                if(b16){ if(a%2==0){ b6.setText("X"); a+=1; b16 = false;  r = "X";finals();}
                else { b6.setText("0");a+=1;b16 = false; r = "0";finals(); } }
                break;
            case R.id.gg:
                if(b17){ if(a%2==0){ b7.setText("X"); a+=1; b17 = false;k = "X"; finals(); }
                else { b7.setText("0");a+=1;b17 = false;k = "0";finals(); } }
                break;
            case R.id.hh:
                if(b18){ if(a%2==0){ b8.setText("X"); a+=1; b18 = false; l = "X";finals(); }
                else { b8.setText("0");a+=1;b18 = false; l = "0";finals();} }
                break;
            case R.id.ii:
                if(b19){ if(a%2==0){ b9.setText("X"); a+=1; b19 = false;m = "X"; finals(); }
                else { b9.setText("0");a+=1;b19 = false;m = "0";finals(); } }
                break;
        }
    }

    public void finals(){
        if(x=="X"&&y=="X"&&z=="X"||x=="0"&&y=="0"&&z=="0"){
            if(x=="0"){
                alertBox("Player1");
                v=1;
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        if(x=="X"&&p=="X"&&k=="X"||x=="0"&&p=="0"&&k=="0"){
            if(x=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        if(x=="X" && q=="X" && m=="X"||x=="0" && q=="0" && m=="0"){
            if(x=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        if(y=="X" && q=="X" && l=="X"||y=="0" && q=="0" && l=="0"){
            if(q=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        if(z=="X" && q=="X" && k=="X"||z=="0" && q=="0" && k=="0"){
            if(z=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        if(z=="X" && r=="X" && m=="X"||z=="0" && r=="0" && m=="0"){
            if(z=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }


        }

        if(p=="X" && q=="X" && r=="X"||p=="0" && q=="0" && r=="0"){
            if(q=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        if(k=="X" && l=="X" && m=="X"||k=="0" && l=="0" && m=="0"){
            if(k=="0"){ v=1;
                alertBox("Player1");
            }
            else{ v=1;
                alertBox("Player2");
            }

        }

        else if(a==12 && v==0){
            alertBox("Draw");
        }

    }

    public  void alertBox(String winner) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        if(winner=="Draw"){
            builder1.setMessage("Match is Draw");
        }
        else {
            builder1.setMessage(winner + " is a winner ");
        }

        builder1.setCancelable(false);

        builder1.setPositiveButton(
                "Play Again !!",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        reset();
                        dialog.cancel();
                    }
                });


        AlertDialog alert = builder1.create();
        alert.show();
    }

    public void reset(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b11=true;
        b12=true;
        b13=true;
        b14=true;
        b15=true;
        b16=true;
        b17=true;
        b18=true;
        b19=true;
        a = 3;
        x ="";
        y="";
        z="";
        p="";
        q="";
        r="";
        k="";
        l="";
        m="";
        v=0;



    }


}
