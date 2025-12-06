package com.model.behaviors.spoiler;

import com.share.IBehavior;

public class SpoilerAesthetic implements IBehavior {
    @Override
    public String getName() {
        return "Esthétique";
    }

    @Override
    public String getDescription() {
        return "aucun effet mécanique";
    }
}