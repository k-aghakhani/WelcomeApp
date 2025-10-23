package com.aghakhani.welcomeapp;


import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;

public class SignUpActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText confirmPasswordInput;
    private CheckBox termsCheckbox;
    private ImageView passwordToggle;
    private ImageView confirmPasswordToggle;
    private MaterialButton signUpButton;

    private boolean isPasswordVisible = false;
    private boolean isConfirmPasswordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Set status bar color
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.status_bar));

        // Initialize views
        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        confirmPasswordInput = findViewById(R.id.confirmPasswordInput);
        termsCheckbox = findViewById(R.id.termsCheckbox);
        passwordToggle = findViewById(R.id.passwordToggle);
        confirmPasswordToggle = findViewById(R.id.confirmPasswordToggle);
        signUpButton = findViewById(R.id.signUpButton);

        // Password toggle functionality
        passwordToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPasswordVisible) {
                    // Hide password
                    passwordInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordToggle.setImageResource(R.drawable.ic_visibility);
                    isPasswordVisible = false;
                } else {
                    // Show password
                    passwordInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    passwordToggle.setImageResource(R.drawable.ic_visibility_off);
                    isPasswordVisible = true;
                }
                // Move cursor to end
                passwordInput.setSelection(passwordInput.getText().length());
            }
        });

        // Confirm Password toggle functionality
        confirmPasswordToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isConfirmPasswordVisible) {
                    // Hide password
                    confirmPasswordInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    confirmPasswordToggle.setImageResource(R.drawable.ic_visibility);
                    isConfirmPasswordVisible = false;
                } else {
                    // Show password
                    confirmPasswordInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    confirmPasswordToggle.setImageResource(R.drawable.ic_visibility_off);
                    isConfirmPasswordVisible = true;
                }
                // Move cursor to end
                confirmPasswordInput.setSelection(confirmPasswordInput.getText().length());
            }
        });


        // Sign Up button click
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString().trim();
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();
                String confirmPassword = confirmPasswordInput.getText().toString().trim();

                // Validation
                if (name.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please enter your full name", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (email.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(SignUpActivity.this, "Please enter a valid email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please enter a password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(SignUpActivity.this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (confirmPassword.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please confirm your password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(SignUpActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Terms checkbox validation (optional)
                // if (!termsCheckbox.isChecked()) {
                //     Toast.makeText(SignUpActivity.this, "Please accept terms and conditions", Toast.LENGTH_SHORT).show();
                //     return;
                // }

                // Sign up successful
                Toast.makeText(SignUpActivity.this, "Sign up successful!", Toast.LENGTH_SHORT).show();

                // Navigate to Sign In or Main Activity
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}