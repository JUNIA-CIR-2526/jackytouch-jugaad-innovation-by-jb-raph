package com.model.decorators;

import com.share.IBehavior;
import com.share.ICar;

public class Neon extends CarDecorator {
    public Neon(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "neon.txt", behavior);
    }
}