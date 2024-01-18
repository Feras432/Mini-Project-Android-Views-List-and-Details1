package com.counter.mini_project_android_views_and_details.repository;

import com.counter.mini_project_android_views_and_details.data.Transaction;
import com.counter.mini_project_android_views_and_details.data.type;

import java.util.ArrayList;

public class TransactionsRepo {
    private static TransactionsRepo instance;

    private TransactionsRepo(){};


    public static TransactionsRepo getInstance(){
        if (instance == null){
            instance = new TransactionsRepo();
        }
        return instance;
    }
    public ArrayList<Transaction> generateDummyTransactions(){
        ArrayList<Transaction> transactions = new ArrayList<>();
        Transaction transactions1 = new Transaction(234, 343253,"Jan 6", 121.5,1123.9, type.withdraw);
        Transaction transactions2 = new Transaction(235, 343254,"Jan 8", 1326.5,19003.9, type.deposit);
        Transaction transactions3 = new Transaction(236, 343255,"Jan 10", 1234.5,6788.9, type.withdraw);

        transactions.add(transactions1);
        transactions.add(transactions2);
        transactions.add(transactions3);
        return transactions;
    }

}
