package app.control.textdisplay;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    EditText edittext1;
    EditText edittext2;
    EditText edittext3;
    TextView textView1;
    Image image1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        edittext1 = findViewById(R.id.editText);
        edittext2 = findViewById(R.id.editText2);
        edittext3 = findViewById(R.id.editText3);
        textView1 = findViewById(R.id.textview);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(edittext1.getText());
                edittext1.setText("");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = String.valueOf(edittext2.getText());
                String s2 = String.valueOf(edittext3.getText());

                if (s1.trim().length() != 0 && s2.trim().length() != 0) {
                    int from = Integer.parseInt(s1);
                    int end = Integer.parseInt(s2);

                    if (from >= end) {
                        textView1.setText("Не верный диапазон");
                    } else {
                        Random rand = new Random();
                        int dist = end -from;
                        int random = rand.nextInt(dist + 1) + from;
                        textView1.setText(String.valueOf(random));
                    }
                } else {
                    textView1.setText("Поля диапозона не заполнены!");
                }
            }
        });

    }
}