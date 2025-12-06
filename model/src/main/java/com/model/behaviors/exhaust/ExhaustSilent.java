package com.model.behaviors.exhaust;

import com.share.IBehavior;

public class ExhaustSilent implements IBehavior {
    @Override
    public String getName() {
        return "Silencieux";
    }

    @Override
    public String getDescription() {
        return "bruit discret";
    }
}