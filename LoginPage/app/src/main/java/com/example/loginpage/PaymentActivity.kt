package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PaymentActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
    }

}

/**
 * Socials: Update Subscription
 * Billing Address
 * Check: Ad same as profile ad used (fills in with details) 0000
 * Forename*
 * Surname*
 * DoB*
 * Ad1*
 * Ad2
 * Ad3
 * Town/City*
 * Country*
 * Postcode*
 * Phone*
 * email*
 * check: all
 *  check: Terms of Use + Privacy Policy*
 *  check: emails/special offers etc
 *
 *  Payment Details
 *  Card/PayPal/GooglePay (use logo etc)
 *  Card=
 *  Name on Card*
 *  Card Number*
 *  Expiration Date*
 *  CVV*
 *  PayPal=
 *  email*
 *  password*
 *  GooglePay=
 *  something*
 */