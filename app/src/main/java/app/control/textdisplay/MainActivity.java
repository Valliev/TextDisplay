package app.control.textdisplay;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.Math; 
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
    Button button;
    Button button1;
    EditText edittext;
    EditText edittext2;
    EditText edittext3;
    TextView textView;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        
        button = findViewById(R.id.button1);
        button1 = findViewById(R.id.button2);
        edittext = findViewById(R.id.editText);
        edittext2 = findViewById(R.id.editText2);
        edittext3 = findViewById(R.id.editText3);
        textView = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(edittext.getText());
                edittext.setText("");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int from    = Integer.parseInt(edittext1.getText());
                int end     = Integer.parseInt(String.valueOf(edittext2.getText()));
                
                Random rand = new Random();
                
                int random = rand(end);
                textView.setText(random);
            }
        });

    }
}
