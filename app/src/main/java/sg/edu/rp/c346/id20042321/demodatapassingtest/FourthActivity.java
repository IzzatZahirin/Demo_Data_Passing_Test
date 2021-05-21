package sg.edu.rp.c346.id20042321.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_fourth);
        tvAnswer=findViewById(R.id.tvClick);
        Intent intentReceived=getIntent();
        double value=intentReceived.getDoubleExtra("double",99.99);
        tvAnswer.setText("Char value received is: "+ value);

        }
}