package com.lelissoftware.takeme.account

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lelissoftware.takeme.R

class AccountSignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.Theme_Account)
        setContentView(R.layout.activity_account_sign)
    }
}