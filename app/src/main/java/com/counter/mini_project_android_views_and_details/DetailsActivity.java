package com.counter.mini_project_android_views_and_details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class DetailsActivity extends AppCompatActivity {
    TextView transactionId, date, amount, transactionType, currentBalance, account, transactionDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_details);
        transactionId = findViewById(R.id.transactionID);
        date = findViewById(R.id.date);
        amount = findViewById(R.id.amount);
        transactionType = findViewById(R.id.transactionType);
        currentBalance = findViewById(R.id.currentBalance);
        account = findViewById(R.id.account);
        transactionDetails = findViewById(R.id.transactionDetails);

    }
}