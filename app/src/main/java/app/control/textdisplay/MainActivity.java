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
                int from    = Integer.parseInt(String.valueOf(edittext2.getText()));
                int end     = Integer.parseInt(String.valueOf(edittext3.getText()));


                if(from >= end) {
                    textView.setText("Не верный диапазон");
                } else {
                    Random rand = new Random();
                    int random = rand.nextInt(end) + from;// int random = from + (int) (Math.random() * end);

                    while (true) {
                        if (random > end) {
                            random = rand.nextInt(end) + from;
                        } else {
                            break;
                        }
                    }

                    textView.setText(String.valueOf(random));
                }
            }
        });

    }
}
