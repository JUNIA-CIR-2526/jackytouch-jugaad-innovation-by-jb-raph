package com.model.behaviors.exhaust;

import com.share.IBehavior;

public class ExhaustSport implements IBehavior {
    @Override
    public String getName() {
        return "Sport";
    }

    @Override
    public String getDescription() {
        return "bruit puissant";
    }
}