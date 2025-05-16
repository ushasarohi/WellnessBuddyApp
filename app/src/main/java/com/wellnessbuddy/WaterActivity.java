package com.wellnessbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WaterActivity extends AppCompatActivity {
    int waterCount = 0;
    TextView waterDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        waterDisplay = findViewById(R.id.waterText);
    }

    public void addWater(View view) {
        waterCount += 250;
        waterDisplay.setText("Water: " + waterCount + " ml");
    }

    public void resetWater(View view) {
        waterCount = 0;
        waterDisplay.setText("Water: 0 ml");
    }
}
