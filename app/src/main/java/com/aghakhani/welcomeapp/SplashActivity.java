package com.aghakhani.welcomeapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3500; // 3 seconds

    private CardView logoContainer;
    private ImageView appLogo;
    private TextView appName;
    private TextView appTagline;
    private ProgressBar progressBar;
    private TextView versionText;
    private View circle1;
    private View circle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Set status bar color
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.coral_primary));

        // Initialize views
        logoContainer = findViewById(R.id.logoContainer);
        appLogo = findViewById(R.id.appLogo);
        appName = findViewById(R.id.appName);
        appTagline = findViewById(R.id.appTagline);
        progressBar = findViewById(R.id.progressBar);
        versionText = findViewById(R.id.versionText);
        circle1 = findViewById(R.id.circle1);
        circle2 = findViewById(R.id.circle2);

        // Set initial state (invisible)
        logoContainer.setAlpha(0f);
        appName.setAlpha(0f);
        appTagline.setAlpha(0f);
        progressBar.setAlpha(0f);
        versionText.setAlpha(0f);

        // Start animations
        startAnimations();

        // Navigate to Welcome screen after delay
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToWelcome();
            }
        }, SPLASH_DURATION);
    }

    private void startAnimations() {
        // Animate logo container (scale + fade in)
        logoContainer.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(800)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        // After logo appears, show app name
                        animateAppName();
                    }
                })
                .start();

        // Scale animation for logo
        logoContainer.setScaleX(0.5f);
        logoContainer.setScaleY(0.5f);

        // Rotate circles slowly
        animateCircles();
    }

    private void animateAppName() {
        // Fade in app name
        appName.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(600)
                .setStartDelay(200)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .start();

        appName.setTranslationY(20f);

        // Fade in tagline
        appTagline.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(600)
                .setStartDelay(400)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .start();

        appTagline.setTranslationY(20f);

        // Fade in progress bar
        progressBar.animate()
                .alpha(1f)
                .setDuration(600)
                .setStartDelay(600)
                .start();

        // Fade in version text
        versionText.animate()
                .alpha(1f)
                .setDuration(600)
                .setStartDelay(800)
                .start();
    }

    private void animateCircles() {
        // Rotate circle 1 with ObjectAnimator
        ObjectAnimator rotateCircle1 = ObjectAnimator.ofFloat(circle1, "rotation", 0f, 360f);
        rotateCircle1.setDuration(20000);
        rotateCircle1.setRepeatCount(ObjectAnimator.INFINITE);
        rotateCircle1.setInterpolator(new AccelerateDecelerateInterpolator());
        rotateCircle1.start();

        // Rotate circle 2 (opposite direction)
        ObjectAnimator rotateCircle2 = ObjectAnimator.ofFloat(circle2, "rotation", 360f, 0f);
        rotateCircle2.setDuration(15000);
        rotateCircle2.setRepeatCount(ObjectAnimator.INFINITE);
        rotateCircle2.setInterpolator(new AccelerateDecelerateInterpolator());
        rotateCircle2.start();

        // Scale animation for circle 1 - با ObjectAnimator
        ObjectAnimator scaleX1 = ObjectAnimator.ofFloat(circle1, "scaleX", 1f, 2.2f);
        scaleX1.setDuration(2000);
        scaleX1.setRepeatCount(ObjectAnimator.INFINITE);
        scaleX1.setRepeatMode(ObjectAnimator.REVERSE);
        scaleX1.start();

        ObjectAnimator scaleY1 = ObjectAnimator.ofFloat(circle1, "scaleY", 1f, 2.2f);
        scaleY1.setDuration(2000);
        scaleY1.setRepeatCount(ObjectAnimator.INFINITE);
        scaleY1.setRepeatMode(ObjectAnimator.REVERSE);
        scaleY1.start();

        // Scale animation for circle 2 - با ObjectAnimator
        ObjectAnimator scaleX2 = ObjectAnimator.ofFloat(circle2, "scaleX", 1f, 2.5f);
        scaleX2.setDuration(2500);
        scaleX2.setRepeatCount(ObjectAnimator.INFINITE);
        scaleX2.setRepeatMode(ObjectAnimator.REVERSE);
        scaleX2.start();

        ObjectAnimator scaleY2 = ObjectAnimator.ofFloat(circle2, "scaleY", 1f, 2.5f);
        scaleY2.setDuration(2500);
        scaleY2.setRepeatCount(ObjectAnimator.INFINITE);
        scaleY2.setRepeatMode(ObjectAnimator.REVERSE);
        scaleY2.start();
    }

    private void navigateToWelcome() {
        // Check if user is already logged in
        // boolean isLoggedIn = checkLoginStatus();

        // For now, always go to Welcome screen
        Intent intent = new Intent(SplashActivity.this, SignInActivity.class);
        startActivity(intent);

        // Add fade transition
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        // Finish splash activity
        finish();
    }

    // Method to check if user is logged in (implement later)
    private boolean checkLoginStatus() {
        // Check SharedPreferences or database
        // return PreferenceManager.getDefaultSharedPreferences(this)
        //         .getBoolean("is_logged_in", false);
        return false;
    }

    @Override
    public void onBackPressed() {
        // Disable back button on splash screen
        // Do nothing
    }
}