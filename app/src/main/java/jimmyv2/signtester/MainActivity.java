package jimmyv2.signtester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import jimmyv2.signtester.R;


public class MainActivity extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Buttons
        Button button1;
        Button button2;
        Button button3;
        Button button4;

        // Map Buttons to IDs
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        //Map TextView
        answerText = (TextView) findViewById(R.id.answerText);

        // Create Button Click Listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText.setText("Incorrect");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText.setText("Incorrect");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText.setText("Incorrect");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerText.setText("Correct");
            }
        });
    }}