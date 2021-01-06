package com.satriaamrudito.calculator_java.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.satriaamrudito.calculator_java.R;
import com.satriaamrudito.calculator_java.adapters.holder.ResultHolder;
import com.satriaamrudito.calculator_java.model.OperandResult;
import com.satriaamrudito.calculator_java.presenter.HistoryPresenter;

public class HistoryAdapter extends RecyclerView.Adapter<ResultHolder> {
    private HistoryPresenter presenter;

    public HistoryAdapter(HistoryPresenter presenter) {
        this.presenter = presenter;
    }

    public ResultHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.result_layout, parent, false);
        ResultHolder rh = new ResultHolder(view);

        return rh;
    }

    @Override
    public void onBindViewHolder(ResultHolder holder, int position) {
        OperandResult target = this.presenter.getOperandResults().get(position);

        holder.setText(target);
    }

    @Override
    public int getItemCount() {
        return this.presenter.getOperandResults().size();
    }
}
