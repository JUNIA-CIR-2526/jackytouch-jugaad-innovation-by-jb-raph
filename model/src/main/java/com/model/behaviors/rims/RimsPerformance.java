package com.model.behaviors.rims;

import com.share.IBehavior;

public class RimsPerformance implements IBehavior {
    @Override
    public String getName() {
        return "Performance";
    }

    @Override
    public String getDescription() {
        return "accélération améliorée";
    }
}