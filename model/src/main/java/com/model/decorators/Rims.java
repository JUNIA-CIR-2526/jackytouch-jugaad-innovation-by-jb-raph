package com.model.decorators;

import com.share.IBehavior;
import com.share.ICar;

public class Rims extends CarDecorator {
    public Rims(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "rims.txt", behavior);
    }
}