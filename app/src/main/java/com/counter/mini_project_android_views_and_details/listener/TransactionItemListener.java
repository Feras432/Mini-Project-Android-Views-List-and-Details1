package com.counter.mini_project_android_views_and_details.listener;

import android.content.Intent;

import com.counter.mini_project_android_views_and_details.MainActivity;
import com.counter.mini_project_android_views_and_details.data.Transactions;
import com.counter.mini_project_android_views_and_details.DetailsActivity;

public interface TransactionItemListener {
    void onTransactionItemClicked(Transactions transaction);
}
