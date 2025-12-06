package com.model.behaviors.rims;

import com.share.IBehavior;

public class RimsLowCost implements IBehavior {
    @Override
    public String getName() {
        return "Low-cost";
    }

    @Override
    public String getDescription() {
        return "aucun effet";
    }
}