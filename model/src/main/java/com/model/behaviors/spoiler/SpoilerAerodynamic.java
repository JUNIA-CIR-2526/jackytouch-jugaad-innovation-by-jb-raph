package com.model.behaviors.spoiler;

import com.share.IBehavior;

public class SpoilerAerodynamic implements IBehavior {
    @Override
    public String getName() {
        return "Aérodynamique";
    }

    @Override
    public String getDescription() {
        return "stabilité accrue";
    }
}