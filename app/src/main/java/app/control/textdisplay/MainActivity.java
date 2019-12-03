package app.control.textdisplay;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    EditText edittext1;
    EditText edittext2;
    EditText edittext3;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button1 = findViewById(R.id.button2);
        edittext1 = findViewById(R.id.editText);
        edittext2 = findViewById(R.id.editText2);
        edittext3 = findViewById(R.id.editText3);
        textView = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(edittext1.getText());
                edittext1.setText("");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = String.valueOf(edittext2.getText());
                String s2 = String.valueOf(edittext3.getText());

                if (s1.trim().length() != 0 && s2.trim().length() != 0) {
                    int from = Integer.parseInt(s1);
                    int end = Integer.parseInt(s2);

                    if (from >= end) {
                        textView.setText("Не верный диапазон");
                    } else {
                        Random rand = new Random();
                        int random = rand.nextInt(end) + from; // int random = from + (int) (Math.random() * end);

                        while (true) {
                            if (random > end) {
                                random = rand.nextInt(end) + from;
                            } else {
                                break;
                            }
                        }

                        textView.setText(String.valueOf(random));
                    }
                } else {
                    textView.setText("Поля диапозона не заполнены!");
                }
            }
        });

    }
}