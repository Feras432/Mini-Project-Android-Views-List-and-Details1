package com.counter.mini_project_android_views_and_details.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.counter.mini_project_android_views_and_details.R;
import com.counter.mini_project_android_views_and_details.data.Transactions;
import com.counter.mini_project_android_views_and_details.listener.TransactionItemListener;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionsViewHolder> {


//    private static ArrayList<Transactions> transactionList;
    private static TransactionItemListener transactionItemListener;
    private static ArrayList<Transactions> transactionsList;
    public TransactionAdapter (ArrayList<Transactions> transactionsList, TransactionItemListener transactionItemListener){
        this.transactionsList = transactionsList;
        this.transactionItemListener = transactionItemListener;

    }
    @NonNull
    @Override
    public TransactionAdapter.TransactionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_card, parent,false);
        return new TransactionsViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.TransactionsViewHolder holder, int position) {
        Transactions transactions1 = transactionsList.get(position);
        holder.dateViewTextView.setText(String.valueOf(transactions1.getDate()));
        holder.typeViewTextView.setText(String.valueOf(transactions1.getType()));
        holder.amountViewTextView.setText(String.valueOf(transactions1.getAmount()));
        holder.balanceViewTextView.setText(String.valueOf(transactions1.getBalance()));

    }


    @Override
    public int getItemCount() {
        return transactionsList.size();
    }

    public static class TransactionsViewHolder extends RecyclerView.ViewHolder {
        TextView dateViewTextView, typeViewTextView, amountViewTextView, balanceViewTextView;

        public TransactionsViewHolder(@NonNull View itemview){
            super(itemview);
            itemView.setOnClickListener(v -> {
                transactionItemListener.onTransactionItemClicked(transactionsList.get(getAdapterPosition()));
            });
            dateViewTextView = itemview.findViewById(R.id.dateView);
            typeViewTextView = itemview.findViewById(R.id.typeView);
            amountViewTextView = itemview.findViewById(R.id.amountView);
            balanceViewTextView = itemview.findViewById(R.id.balanceView);

        }
    }


}
