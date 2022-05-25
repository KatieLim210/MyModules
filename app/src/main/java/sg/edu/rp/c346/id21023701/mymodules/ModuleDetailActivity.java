package sg.edu.rp.c346.id21023701.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tvmodulecode;
TextView tvmodulename;
TextView tvAcadYear;
TextView tvSemester;
TextView tvModuleCredit;
TextView tvVenue;
Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tvmodulecode = findViewById(R.id.TextViewModuleCode);
        tvmodulename = findViewById(R.id.textViewModuleName);
        tvAcadYear = findViewById(R.id.textViewAcadYear);
        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
        tvSemester = findViewById(R.id.textViewSemester);
        tvVenue = findViewById(R.id.textViewVenue);
        btnback = findViewById(R.id.buttonbck);

        Intent intentReceived = getIntent();
        String modulecode = intentReceived.getStringExtra("modulecode");
        String modulename = intentReceived.getStringExtra("modulename");
        String venue = intentReceived.getStringExtra("venue");
        int acadYear = intentReceived.getIntExtra("acadYear",0);
        int semester = intentReceived.getIntExtra("semester",0);
        int modulecredit = intentReceived.getIntExtra("modulecredit",0);
        tvmodulecode.setText("Module Code: " + modulecode);
        tvmodulename.setText("Module Name: " + modulename);
        tvModuleCredit.setText("Module Credit: " + modulecredit);
        tvSemester.setText("Semester: " + semester);
        tvVenue.setText("Venue: " + venue);
        tvAcadYear.setText("Academic Year: " + acadYear);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}