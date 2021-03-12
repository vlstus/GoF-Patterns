package org.study.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testReturnSameObject() {
        assertSame(Highlander.getHighLander(), Highlander.getHighLander());
    }

    @Test
    void testToString() {
        assertEquals("There can be only one Highlander", Highlander.getHighLander().toString());
    }

}