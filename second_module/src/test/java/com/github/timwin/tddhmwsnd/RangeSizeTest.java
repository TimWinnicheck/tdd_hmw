package com.github.timwin.tddhmwsnd;

import com.github.timwin.tddhmw.LazyRange;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RangeSizeTest {
    @Test
    public void testGetSize() throws Exception {

        LazyRange testRange = new LazyRange(10, 40);
        RangeSize rangeSize = new RangeSize();
        assertThat(rangeSize.getSize(testRange),is(30L) );
    }

}