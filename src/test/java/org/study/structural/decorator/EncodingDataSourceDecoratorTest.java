package org.study.structural.decorator;

import org.junit.jupiter.api.Test;
import org.study.structural.decorator.datasource.DataSource;
import org.study.structural.decorator.datasource.impl.SequentialDataSource;

import java.lang.reflect.Field;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodingDataSourceDecoratorTest {

    @Test
    @SuppressWarnings({"unchecked", "ConstantConditions"})
    void ensureEncoded()
            throws NoSuchFieldException, IllegalAccessException {
        DataSource dataSource = new SequentialDataSource();
        EncodingDataSourceDecorator decorator = new EncodingDataSourceDecorator(dataSource);
        decorator.writeData(1);
        Field internalStorageField = dataSource.getClass().getDeclaredField("storage");
        internalStorageField.setAccessible(true);
        Integer lastInternallyStored = ((Deque<Integer>) internalStorageField.get(dataSource)).peekLast();
        assertEquals(-2, lastInternallyStored.intValue());
        assertEquals(1, decorator.readData());
    }

}