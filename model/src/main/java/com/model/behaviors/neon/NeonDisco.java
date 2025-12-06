package com.model.behaviors.neon;

import com.share.IBehavior;

public class NeonDisco implements IBehavior {
    @Override
    public String getName() {
        return "Disco";
    }

    @Override
    public String getDescription() {
        return "clignotement simulé";
    }
}