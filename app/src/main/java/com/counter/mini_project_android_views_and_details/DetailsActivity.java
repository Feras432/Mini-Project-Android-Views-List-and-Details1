package com.counter.mini_project_android_views_and_details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.counter.mini_project_android_views_and_details.data.Transaction;


public class DetailsActivity extends AppCompatActivity {
   private TextView transactionIdTextView, dateTextView, amountTextView, transactionTypeTextView, currentBalanceTextView, accountTextView, transactionDetails;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_details);

        transactionIdTextView = findViewById(R.id.transactionIDTextView);
        dateTextView = findViewById(R.id.dateTextView);
        amountTextView = findViewById(R.id.amountTextView);
        transactionTypeTextView = findViewById(R.id.transactionTypeTextView);
        currentBalanceTextView = findViewById(R.id.currentBalanceTextView);
        accountTextView = findViewById(R.id.accountTextView);
        transactionDetails = findViewById(R.id.transactionDetails);

        Transaction transaction = getIntent().getSerializableExtra(MainActivity.BANK_TRANSACTION_KEY, Transaction.class);

        transactionIdTextView.setText(String.valueOf(transaction.getId()));
        dateTextView.setText(transaction.getDate());
        amountTextView.setText(String.valueOf(transaction.getAmount()));
        transactionTypeTextView.setText(String.valueOf(transaction.getType()));
        currentBalanceTextView.setText(String.valueOf(transaction.getBalance()));
        accountTextView.setText(String.valueOf(transaction.getAccount()));



    }


    }
