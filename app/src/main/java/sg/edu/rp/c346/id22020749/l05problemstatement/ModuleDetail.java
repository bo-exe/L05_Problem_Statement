package sg.edu.rp.c346.id22020749.l05problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetail extends AppCompatActivity {
    // STEP 1 - Declare the variable
    TextView ModCode;
    TextView ModName;
    TextView AcadYear;
    TextView Sem;
    TextView ModCred;
    TextView Venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        // STEP 2 - Set the variable
        ModCode = findViewById(R.id.textView);
        ModName = findViewById(R.id.textView2);
        AcadYear = findViewById(R.id.textView3);
        Sem = findViewById(R.id.textView4);
        ModCred = findViewById(R.id.textView5);
        Venue = findViewById(R.id.textView6);

        // Get intent object
        Intent intent = getIntent();

        // Get values from the intent object
        String ModCode1 = intent.getStringExtra("ModCode");
        String ModName1 = intent.getStringExtra("ModName");
        String AcadYear1 = intent.getStringExtra("AcadYear");
        String Sem1 = intent.getStringExtra("Sem");
        String ModCred1 = intent.getStringExtra("ModCred");
        String Venue1 = intent.getStringExtra("Venue");
        int ValueYear1 = intent.getIntExtra("IntYear", 0);
        int ValueSem1 = intent.getIntExtra("IntSem", 0);
        int ValueCred1 = intent.getIntExtra("IntCred", 0);

        // Update the UI
        ModCode.setText(ModCode1);
        ModName.setText(ModName1);
        AcadYear.setText(AcadYear1 + ValueYear1);
        Sem.setText(Sem1 + ValueSem1);
        ModCred.setText(ModCred1 + ValueCred1);
        Venue.setText(Venue1);
    }
}