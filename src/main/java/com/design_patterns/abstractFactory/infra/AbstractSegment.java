package com.design_patterns.abstractFactory.infra;

import com.design_patterns.abstractFactory.model.Chair;
import com.design_patterns.abstractFactory.model.Table;

public abstract class AbstractSegment {
    public abstract Table craftTable();
    public abstract Chair craftChair();
}
