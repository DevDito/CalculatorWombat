package com.satriaamrudito.calculator_java.adapters.holder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.satriaamrudito.calculator_java.R;
import com.satriaamrudito.calculator_java.model.OperandResult;

public class ResultHolder extends RecyclerView.ViewHolder {
    private TextView result;
    private TextView date;

    public ResultHolder(View view){
        super(view);
        this.result = view.findViewById(R.id.history_result);
        this.date = view.findViewById(R.id.history_date);
    }

    public void setText(OperandResult op){
        this.result.setText(op.getFormattedValue());
        this.date.setText(op.getDate());
    }
}
