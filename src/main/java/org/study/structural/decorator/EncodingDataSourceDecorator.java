package org.study.structural.decorator;

import org.study.structural.decorator.datasource.DataSource;

public class EncodingDataSourceDecorator
        implements DataSource {

    private final DataSource dataSource;

    public EncodingDataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(int data) {
        dataSource.writeData(~data);
    }

    @Override
    public int readData() {
        return ~dataSource.readData();
    }

}
