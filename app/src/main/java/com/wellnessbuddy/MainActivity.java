package com.wellnessbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWater(View view) {
        startActivity(new Intent(this, WaterActivity.class));
    }

    public void openWorkout(View view) {
        startActivity(new Intent(this, WorkoutActivity.class));
    }

    public void openTimer(View view) {
        startActivity(new Intent(this, TimerActivity.class));
    }

    public void openMindfulness(View view) {
        startActivity(new Intent(this, MindfulnessActivity.class));
    }
}
