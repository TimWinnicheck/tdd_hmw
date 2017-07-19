package com.github.timwin.tddhmwsnd;


import com.github.timwin.tddhmw.LazyRange;

public class RangeSize {

    public long getSize(LazyRange range) {
        return range.getUpperBound() - range.getLowerBound();
    }
}
