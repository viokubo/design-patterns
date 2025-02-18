package com.design_patterns.abstractFactory.infra;

import com.design_patterns.abstractFactory.model.Chair;
import com.design_patterns.abstractFactory.model.ModernChair;
import com.design_patterns.abstractFactory.model.ModernTable;
import com.design_patterns.abstractFactory.model.Table;

public class ModernSegment extends AbstractSegment {
    @Override
    public Table craftTable() {
        return new ModernTable();
    }

    @Override
    public Chair craftChair() {
        return new ModernChair();
    }
}
