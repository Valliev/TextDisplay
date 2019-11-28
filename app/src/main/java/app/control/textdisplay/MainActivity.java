package app.control.textdisplay;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        final Button button1 = findViewById(R.id.button2);
        final EditText edittext = findViewById(R.id.editText);
        final EditText edittext2 = findViewById(R.id.editText2);
        final EditText edittext3 = findViewById(R.id.editText3);
        final TextView textView = findViewById(R.id.textview);

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
                textView.setText("Ты не написал код");
            }
        });

    }
}