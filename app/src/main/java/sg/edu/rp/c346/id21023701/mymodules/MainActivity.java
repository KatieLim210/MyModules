package sg.edu.rp.c346.id21023701.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvC346;
TextView tvC349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.textViewC346);
        tvC349 =findViewById(R.id.textViewC349);
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modulecode", "C346");
                intent.putExtra("modulename", "Android Programming");
                intent.putExtra("acadYear",2020);
                intent.putExtra("semester", 1);
                intent.putExtra("modulecredit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });
        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity2.class);
                intent.putExtra("modulecode2", "C349");
                intent.putExtra("modulename2", "iPad Programming");
                intent.putExtra("acadYear2",2020);
                intent.putExtra("semester2", 1);
                intent.putExtra("modulecredit2", 4);
                intent.putExtra("venue2", "W65M");
                startActivity(intent);
            }
        });
    }

}