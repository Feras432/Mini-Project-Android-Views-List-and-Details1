package com.counter.mini_project_android_views_and_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.counter.mini_project_android_views_and_details.adapter.TransactionAdapter;
import com.counter.mini_project_android_views_and_details.data.Transaction;
import com.counter.mini_project_android_views_and_details.listener.TransactionItemListener;
import com.counter.mini_project_android_views_and_details.repository.TransactionsRepo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TransactionItemListener {

    public static final String BANK_TRANSACTION_KEY = "BANK_TRANSACTION_KEY";
    RecyclerView transactionsRecyclerView;
    ArrayList<Transaction> transactions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        transactionsRecyclerView = findViewById(R.id.transactionRecyclerView);
        transactionsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        transactions = TransactionsRepo.getInstance().generateDummyTransactions();

        TransactionAdapter transactionAdapter = new TransactionAdapter(transactions, this);


        transactionsRecyclerView.setAdapter(transactionAdapter);

    }

    @Override
    public void onTransactionItemClicked(Transaction transactions1) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(BANK_TRANSACTION_KEY, transactions1);
        startActivity(intent);


    }

}