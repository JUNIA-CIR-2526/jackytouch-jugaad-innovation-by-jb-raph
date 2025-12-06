package com.model.decorators;

import com.share.IBehavior;
import com.share.ICar;

public class Spoiler extends CarDecorator {
    public Spoiler(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "spoiler.txt", behavior);
    }
}