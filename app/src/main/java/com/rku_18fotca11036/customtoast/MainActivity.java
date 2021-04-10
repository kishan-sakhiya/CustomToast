package com.rku_18fotca11036.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = (Button) findViewById(R.id.toast);
        Button newToast = (Button) findViewById(R.id.newToast);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//this one type of toast show
//                Toast toast;
//                toast = Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG);
//                toast.setGravity(Gravity.CENTER, 0, 0);
//                toast.show();
            error_toast();

            }
        });

        newToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(MainActivity.this, "ddd", Toast.LENGTH_SHORT).show();
                warning_toast();
                error_toast();


            }
        });
    }

    private void error_toast()
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.viewholder));
        TextView textView = view.findViewById(R.id.txtToast);
        textView.setText("ERROR");

        Toast toast = new Toast(getApplicationContext());
        toast.setView(view);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    private void warning_toast()
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.viewholder));
        TextView textView = view.findViewById(R.id.txtToast);
        textView.setText("WARNING");

        Toast toast = new Toast(getApplicationContext());
        toast.setView(view);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
        return;
    }


}