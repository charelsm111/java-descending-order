package com.charel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTest {

    @Test
    public void testSortDesc() {
        assertEquals(321, DescendingOrder.mySortDesc(123));
        assertEquals(321, DescendingOrder.bestSortDesc(123));

        assertEquals(2110, DescendingOrder.bestSortDesc(1012));
        assertEquals(2110, DescendingOrder.bestSortDesc(1012));

        assertEquals(987654321, DescendingOrder.bestSortDesc(123654789));
        assertEquals(987654321, DescendingOrder.bestSortDesc(123654789));
    }

}
