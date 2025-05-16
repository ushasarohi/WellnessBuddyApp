package com.wellnessbuddy;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TimerActivity extends AppCompatActivity {
    TextView timerText;
    CountDownTimer countDownTimer;
    boolean isRunning = false;
    long timeLeft = 60000; // 1 minute

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        timerText = findViewById(R.id.timerText);
        updateTimerText();
    }

    public void startPauseTimer(View view) {
        if (isRunning) {
            countDownTimer.cancel();
            isRunning = false;
        } else {
            countDownTimer = new CountDownTimer(timeLeft, 1000) {
                public void onTick(long millisUntilFinished) {
                    timeLeft = millisUntilFinished;
                    updateTimerText();
                }

                public void onFinish() {
                    isRunning = false;
                }
            }.start();
            isRunning = true;
        }
    }

    public void resetTimer(View view) {
        timeLeft = 60000;
        updateTimerText();
        if (countDownTimer != null) countDownTimer.cancel();
        isRunning = false;
    }

    private void updateTimerText() {
        int seconds = (int) (timeLeft / 1000);
        timerText.setText("Time: " + seconds + "s");
    }
}
