package com.design_patterns.abstractFactory.infra;

import com.design_patterns.abstractFactory.model.Chair;
import com.design_patterns.abstractFactory.model.ClassicChair;
import com.design_patterns.abstractFactory.model.ClassicTable;
import com.design_patterns.abstractFactory.model.Table;

public class ClassicSegment extends AbstractSegment{
    @Override
    public Table craftTable() {
        return new ClassicTable();
    }

    @Override
    public Chair craftChair() {
        return new ClassicChair();
    }
}
