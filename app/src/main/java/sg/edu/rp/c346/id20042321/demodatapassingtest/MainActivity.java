package sg.edu.rp.c346.id20042321.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInteger;
    Button btnPassChar;
    TextView tvClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        btnPassInteger = findViewById (R.id.buttonPassInteger);
        btnPassChar = findViewById (R.id.buttonPassChar);
        tvClick = findViewById (R.id.tvClick);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent j = new Intent (MainActivity.this, ThirdActivity.class);
                j.putExtra ("char", "a");
                startActivity (j);
            }
        });

        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this,FourthActivity.class );
                k.putExtra("double",99.99);
                startActivity(k);
            }
        });



    }
}
