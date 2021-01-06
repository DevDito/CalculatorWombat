package com.satriaamrudito.calculator_java.presenter;

import com.satriaamrudito.calculator_java.model.OperandResult;

import java.util.ArrayList;
import java.util.List;

public class HistoryPresenter {
    List<OperandResult> list;

    public HistoryPresenter() {
        this.list = new ArrayList<>();
    }

    public void addOperandResult(OperandResult result) {
        this.list.add(result);
    }

    public void clearOperandResult() {
        this.list.clear();
    }

    public List<OperandResult> getOperandResults() {
        return this.list;
    }
}
