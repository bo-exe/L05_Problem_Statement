package sg.edu.rp.c346.id22020749.l05problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ModC346;
    TextView ModC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModC346 = findViewById(R.id.TextViewC346);
        ModC218 = findViewById(R.id.TextViewC218);

        ModC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetail.class);
                intent.putExtra("ModCode", "Module Code: C346");
                intent.putExtra("ModName", "Module Name: Android Programming");
                intent.putExtra("AcadYear", "Academic Year: ");
                intent.putExtra("IntYear", 2023);
                intent.putExtra("Sem", "Semester: ");
                intent.putExtra("IntSem", 1);
                intent.putExtra("ModCred", "Module Credit: ");
                intent.putExtra("IntCred", 4);
                intent.putExtra("Venue", "Venue : E63A");
                startActivity(intent);
            }
        });

        ModC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetail.class);
                intent.putExtra("ModCode", "Module Code: C218");
                intent.putExtra("ModName", "Module Name: UI/UX Design for Apps");
                intent.putExtra("AcadYear", "Academic Year: ");
                intent.putExtra("IntYear", 2023);
                intent.putExtra("Sem", "Semester: ");
                intent.putExtra("IntSem", 1);
                intent.putExtra("ModCred", "Module Credit: ");
                intent.putExtra("IntCred", 4);
                intent.putExtra("Venue", "Venue : W65D");
                startActivity(intent);
            }
        });
    }
}