package com.model.behaviors.neon;

import com.share.IBehavior;

public class NeonSober implements IBehavior {
    @Override
    public String getName() {
        return "Sobre";
    }

    @Override
    public String getDescription() {
        return "lumière fixe";
    }
}