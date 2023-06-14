package com.example.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.verifone.connectors.screens.VerifonePaymentForm

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val examplePublicKey = "="
        val encryptedCard = VerifonePaymentForm.encryptCardData(12,2025,"4111111111111111","123",examplePublicKey)
        Log.d("Card: ", encryptedCard)
    }
}