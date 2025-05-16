package com.wellnessbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WorkoutActivity extends AppCompatActivity {
    int workoutCount = 0;
    TextView workoutDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        workoutDisplay = findViewById(R.id.workoutText);
    }

    public void logWorkout(View view) {
        workoutCount++;
        workoutDisplay.setText("Workouts: " + workoutCount);
    }

    public void resetWorkout(View view) {
        workoutCount = 0;
        workoutDisplay.setText("Workouts: 0");
    }
}
