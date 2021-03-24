package org.study.structural.decorator.datasource.impl;

import org.study.structural.decorator.datasource.DataSource;

import java.util.Deque;
import java.util.LinkedList;

public class SequentialDataSource
        implements DataSource {

    private final Deque<Integer> storage = new LinkedList<>();

    @Override
    public void writeData(int data) {
        storage.offerFirst(data);
    }

    @Override
    public int readData() {
        Integer last = storage.pollLast();
        return last == null ? -1 : last;
    }

}
