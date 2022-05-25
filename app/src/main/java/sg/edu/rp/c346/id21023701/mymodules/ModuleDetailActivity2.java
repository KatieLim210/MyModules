package sg.edu.rp.c346.id21023701.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity2 extends AppCompatActivity {
    TextView tvmodulecode2;
    TextView tvmodulename2;
    TextView tvAcadYear2;
    TextView tvSemester2;
    TextView tvModuleCredit2;
    TextView tvVenue2;
    Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail2);
        tvmodulecode2 = findViewById(R.id.textViewModuleCode2);
        tvmodulename2 = findViewById(R.id.textViewModuleName2);
        tvAcadYear2 = findViewById(R.id.textViewAcadYear2);
        tvModuleCredit2 = findViewById(R.id.textViewModuleCredit2);
        tvSemester2 = findViewById(R.id.textViewSemester2);
        tvVenue2 = findViewById(R.id.textViewVenue2);
        btnback = findViewById(R.id.buttonbck2);

        Intent intentReceived = getIntent();
        String modulecode2 = intentReceived.getStringExtra("modulecode2");
        String modulename2 = intentReceived.getStringExtra("modulename2");
        String venue2 = intentReceived.getStringExtra("venue2");
        int acadYear2 = intentReceived.getIntExtra("acadYear2",0);
        int semester2 = intentReceived.getIntExtra("semester2",0);
        int modulecredit2 = intentReceived.getIntExtra("modulecredit2",0);
        tvmodulecode2.setText("Module Code: " + modulecode2);
        tvmodulename2.setText("Module Name: " + modulename2);
        tvModuleCredit2.setText("Module Credit: " + modulecredit2);
        tvSemester2.setText("Semester: " + semester2);
        tvVenue2.setText("Venue: " + venue2);
        tvAcadYear2.setText("Academic Year: " + acadYear2);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}