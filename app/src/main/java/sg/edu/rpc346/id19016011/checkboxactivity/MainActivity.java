package sg.edu.rpc346.id19016011.checkboxactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb;
    Button btnCheck;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb= findViewById(R.id.checkBoxDiscount);
        btnCheck= findViewById(R.id.buttoncheck);
        tv= findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb.isChecked()){
                    tv.setText("The discount is given");
                }
                else{
                    tv.setText("The discount is not given");
                }
                cb.setChecked(false);

                Toast.makeText(MainActivity.this, "Check being requested", Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "CheckBox status" + cb.isChecked());
            }
        });
    }
}
