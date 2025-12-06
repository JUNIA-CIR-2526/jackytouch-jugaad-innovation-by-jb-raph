package com.model.decorators;

import com.share.IBehavior;
import com.share.ICar;

public class Exhaust extends CarDecorator {
    public Exhaust(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "exhaust.txt", behavior);
    }
}