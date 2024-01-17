package com.counter.mini_project_android_views_and_details.repository;

import com.counter.mini_project_android_views_and_details.data.Transactions;
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
    public ArrayList<Transactions> generateDummyTransactions(){
        ArrayList<Transactions> transactions = new ArrayList<>();
        Transactions transactions1 = new Transactions(234, 343253,"Jan 6", 121.5,1123.9, type.withdraw);
        Transactions transactions2 = new Transactions(235, 343254,"Jan 8", 1326.5,19003.9, type.deposit);
        Transactions transactions3 = new Transactions(236, 343255,"Jan 10", 1234.5,6788.9, type.withdraw);

        transactions.add(transactions1);
        transactions.add(transactions2);
        transactions.add(transactions3);
        return transactions;
    }

}
