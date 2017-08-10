package com.example.nikhil.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView x[][]=new ImageView[3][3];

    int y[][]=new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x[0][0]=(ImageView)findViewById(R.id.image_00);
        x[0][1]=(ImageView)findViewById(R.id.image_01);
        x[0][2]=(ImageView)findViewById(R.id.image_02);
        x[1][0]=(ImageView)findViewById(R.id.image_10);
        x[1][1]=(ImageView)findViewById(R.id.image_11);
        x[1][2]=(ImageView)findViewById(R.id.image_12);
        x[2][0]=(ImageView)findViewById(R.id.image_20);
        x[2][1]=(ImageView)findViewById(R.id.image_21);
        x[2][2]=(ImageView)findViewById(R.id.image_22);

        setX(0,0,R.drawable.image0);
        setX(0,1,R.drawable.image1);
        setX(0,2,R.drawable.image2);
        setX(1,0,R.drawable.image3);
        setX(1,1,R.drawable.image4);
        setX(1,2,R.drawable.image5);
        setX(2,0,R.drawable.image6);
        setX(2,1,R.drawable.image7);
        setX(2,2,R.drawable.image_8);


    }

    public void setX(int a,int b, int c) {
        x[a][b].setImageResource(c);
        y[a][b]=c;
    }

    public void onImage0Click(View view){
    if(y[0][1]==R.drawable.image_8){
        setX(0,1,y[0][0]);
        setX(0,0,R.drawable.image_8);
    }else if(y[1][0]==R.drawable.image_8){
            setX(1,0,y[0][0]);
            setX(0,0,R.drawable.image_8);
        }

    }
    public void onImage1Click(View view){
        if(y[0][0]==R.drawable.image_8){
            setX(0,0,y[0][1]);
            setX(0,1,R.drawable.image_8);
        }else if(y[0][2]==R.drawable.image_8){
            setX(0,2,y[0][1]);
            setX(0,1,R.drawable.image_8);
        }else if(y[1][1]==R.drawable.image_8){
            setX(1,1,y[0][1]);
            setX(0,1,R.drawable.image_8);
        }

    }
    public void onImage2Click(View view){
        if(y[0][1]==R.drawable.image_8){
            setX(0,1,y[0][2]);
            setX(0,2,R.drawable.image_8);
        }else if(y[1][2]==R.drawable.image_8){
            setX(1,2,y[0][2]);
            setX(0,2,R.drawable.image_8);
        }

    }
    public void onImage3Click(View view){
        if(y[0][0]==R.drawable.image_8){
            setX(0,0,y[1][0]);
            setX(1,0,R.drawable.image_8);
        }else if(y[2][0]==R.drawable.image_8){
            setX(2,0,y[1][0]);
            setX(1,0,R.drawable.image_8);
        }else if(y[1][1]==R.drawable.image_8){
            setX(1,1,y[1][0]);
            setX(1,0,R.drawable.image_8);
        }

    }
    public void onImage4Click(View view){
        if(y[0][1]==R.drawable.image_8){
            setX(0,1,y[1][1]);
            setX(1,1,R.drawable.image_8);
        }else if(y[1][0]==R.drawable.image_8){
            setX(1,0,y[1][1]);
            setX(1,1,R.drawable.image_8);
        }else if(y[2][1]==R.drawable.image_8){
            setX(2,1,y[1][1]);
            setX(1,1,R.drawable.image_8);
        }else if(y[1][2]==R.drawable.image_8){
            setX(1,2,y[1][1]);
            setX(1,1,R.drawable.image_8);
        }

    }
    public void onImage5Click(View view){
        if(y[2][2]==R.drawable.image_8){
            setX(2,2,y[1][2]);
            setX(1,2,R.drawable.image_8);
        }else if(y[0][2]==R.drawable.image_8){
            setX(0,2,y[1][2]);
            setX(1,2,R.drawable.image_8);
        }else if(y[1][1]==R.drawable.image_8){
            setX(1,1,y[1][2]);
            setX(1,2,R.drawable.image_8);
        }

    }
    public void onImage6Click(View view){
        if(y[1][0]==R.drawable.image_8){
            setX(1,0,y[2][0]);
            setX(2,0,R.drawable.image_8);
        }else if(y[2][1]==R.drawable.image_8){
            setX(2,1,y[2][0]);
            setX(2,0,R.drawable.image_8);
        }

    }
    public void onImage7Click(View view){

        if(y[2][0]==R.drawable.image_8){
            setX(2,0,y[2][1]);
            setX(2,1,R.drawable.image_8);
        }else if(y[1][1]==R.drawable.image_8){
            setX(1,1,y[2][1]);
            setX(2,1,R.drawable.image_8);
        }else if(y[2][2]==R.drawable.image_8){
            setX(2,2,y[2][1]);
            setX(2,1,R.drawable.image_8);
        }}

    public void onimage8Click(View view){

        if(y[1][2]==R.drawable.image_8){
            setX(1,2,y[2][2]);
            setX(2,2,R.drawable.image_8);
        }else if(y[2][1]==R.drawable.image_8){
            setX(2,1,y[2][2]);
            setX(2,2,R.drawable.image_8);
        }

    }
public void solved(View view){
    if(y[0][0]==R.drawable.image0&&
            y[0][1]==R.drawable.image1&&
            y[0][2]==R.drawable.image2&&
            y[1][0]==R.drawable.image3&&
            y[1][1]==R.drawable.image4&&
            y[1][2]==R.drawable.image5&&
            y[2][0]==R.drawable.image6&&
            y[2][1]==R.drawable.image7&&
            y[2][2]==R.drawable.image_8
            ){
        Toast.makeText(MainActivity.this,"Well done",Toast.LENGTH_SHORT).show();
    }else{

        Toast.makeText(MainActivity.this,"Try more",Toast.LENGTH_SHORT).show();

    }
}

}
