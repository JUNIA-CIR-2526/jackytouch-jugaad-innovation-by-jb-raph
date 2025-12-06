package com.model.behaviors.spoiler;

import com.share.IBehavior;

public class SpoilerExaggerated implements IBehavior {
    @Override
    public String getName() {
        return "Exagéré";
    }

    @Override
    public String getDescription() {
        return "vitesse max réduite, effet visuel accentué";
    }
}