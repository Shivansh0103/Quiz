package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView q,t;
    Button Y,N,next;
    int i=0;
    static int Score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q=findViewById(R.id.textView2);
        t=findViewById(R.id.textView7);
        Y=findViewById(R.id.Yes);
        N=findViewById(R.id.No);
        next=findViewById(R.id.NEXT);
        String[] arr={"Boolean is a keyword in java.","Size of long is 64 bits.","Default value of a boolean type variable is null.","Try blocks can be nested","Arrays.sort() has a time complexity of O(n+log n)"};
        String[] ans={"NO","YES","NO","YES","NO"};
        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Y.getText().toString().equalsIgnoreCase(ans[i])) {
                    t.setText("Correct Answer");
                    Score++;
                }
                    else
                    t.setText("Wrong Answer");
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (N.getText().toString().equalsIgnoreCase(ans[i]))
                {        t.setText("Correct Answer");
                Score++;
            }
                else
                    t.setText("Wrong Answer");
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i < 5) {
                    q.setText(arr[i]);
                    t.setText("");
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }
}