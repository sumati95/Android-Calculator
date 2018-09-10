package sumati.com.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private Button squarebutton;
    private Button cubebutton;
    private Button gcdbutton;
    private Button lcmbutton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.inpOpt1);
        number2 = findViewById(R.id.inpOPt2);
        squarebutton = findViewById(R.id.btnSquare);
        cubebutton = findViewById(R.id.btnCube);
        gcdbutton = findViewById(R.id.btnGcd);
        lcmbutton = findViewById(R.id.btnLcm);
        result = findViewById(R.id.txtResult);

        squarebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num1 = Integer.parseInt(number1.getText().toString());
                result.setText(String.valueOf(num1 * num1));
            }
        });

        cubebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num1 = Integer.parseInt(number1.getText().toString());
                result.setText(String.valueOf(num1 * num1 * num1));
            }
        });

        gcdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num1 = Integer.parseInt(number1.getText().toString());
                Integer num2 = Integer.parseInt(number2.getText().toString());
                for (int i = 1; i <= num1 && i <= num2; ++i) {
                    if (num1 % i == 0 && num2 % i == 0) {
                        int gcd = i;
                        result.setText(String.valueOf(gcd));
                    }
                }
            }
        });

        lcmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num1 = Integer.parseInt(number1.getText().toString());
                Integer num2 = Integer.parseInt(number2.getText().toString());
                int max, min, x;
                int lcm = 1;
                if (num1 > num2)
                {
                    max = num1;
                    min = num2;
                }
                else
                {
                    max = num2;
                    min = num1;
                }
                for (int i=1;i<=min;i++)
                {
                    x = max*i;
                    if (x % min == 0) {
                        lcm = x;
                        break;
                    }
                }
                result.setText(String.valueOf(lcm));
            }
        });
    }
}
