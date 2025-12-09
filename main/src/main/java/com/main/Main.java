package com.main;

import com.controller.Controller;
import com.model.behaviors.exhaust.ExhaustSilent;
import com.model.behaviors.exhaust.ExhaustSport;
import com.model.behaviors.neon.NeonDisco;
import com.model.behaviors.neon.NeonRandom;
import com.model.behaviors.rims.RimsPerformance;
import com.model.behaviors.rims.RimsShowOff;
import com.model.behaviors.spoiler.SpoilerAesthetic;
import com.model.behaviors.spoiler.SpoilerExaggerated;
import com.share.IBehavior;

public class Main {
    public static void main(String[] args) {
        IBehavior spoiler = new SpoilerAesthetic();
        IBehavior neon = new NeonRandom();
        IBehavior rims = new RimsPerformance();
        IBehavior exhaust = new ExhaustSilent();

        Controller controller = new Controller(spoiler, neon, rims, exhaust);
        controller.start();
    }
}