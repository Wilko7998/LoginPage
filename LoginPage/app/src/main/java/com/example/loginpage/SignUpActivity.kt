package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

}
/**
 * Ad1 = Street Address
 * Ad2 = Apartment/Suite/Unit/Building/Number
 * Ad3 = Address Name (Optional)
 * Use asterisk for required fields
 */