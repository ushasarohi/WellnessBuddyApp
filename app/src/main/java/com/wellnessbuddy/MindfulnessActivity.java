package com.wellnessbuddy;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MindfulnessActivity extends AppCompatActivity {
    TextView breathText;
    String[] cycle = {"Inhale...", "Hold...", "Exhale..."};
    int index = 0;

    Handler handler = new Handler();
    Runnable breathingCycle = new Runnable() {
        @Override
        public void run() {
            breathText.setText(cycle[index]);
            index = (index + 1) % cycle.length;
            handler.postDelayed(this, 3000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindfulness);
        breathText = findViewById(R.id.breathText);
        handler.post(breathingCycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(breathingCycle);
    }
}
