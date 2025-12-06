package com.model.behaviors.neon;

import com.share.IBehavior;

public class NeonRandom implements IBehavior {
    @Override
    public String getName() {
        return "Aléatoire";
    }

    @Override
    public String getDescription() {
        return "affichage imprévisible";
    }
}