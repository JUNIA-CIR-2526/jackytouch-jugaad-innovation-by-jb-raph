package com.main;

import com.controller.Controller;
import com.model.behaviors.exhaust.ExhaustDrag;
import com.model.behaviors.exhaust.ExhaustSilent;
import com.model.behaviors.exhaust.ExhaustSport;
import com.model.behaviors.neon.NeonDisco;
import com.model.behaviors.neon.NeonRandom;
import com.model.behaviors.rims.RimsLowCost;
import com.model.behaviors.rims.RimsPerformance;
import com.model.behaviors.rims.RimsShowOff;
import com.model.behaviors.spoiler.SpoilerAesthetic;
import com.model.behaviors.spoiler.SpoilerExaggerated;
import com.model.decorators.Exhaust;
import com.model.decorators.Neon;
import com.model.decorators.Rims;
import com.model.decorators.Spoiler;
import com.share.IBehavior;

public class Main {
    public static void main(String[] args) {
        IBehavior spoiler = new SpoilerAesthetic();
        IBehavior neon = new NeonRandom();
        IBehavior rims = new RimsPerformance();
        IBehavior exhaust = new ExhaustSilent();

        Controller controller = new Controller(spoiler, neon, rims, exhaust);

        System.out.println("--- ÉTAT INITIAL ---");
        controller.start();

        System.out.println("--- CHANGEMENT DYNAMIQUE ---");

        controller.setSpoilerBehavior(new SpoilerExaggerated());
        controller.setNeonBehavior(new NeonDisco());
        controller.setRimsBehavior(new RimsLowCost());
        controller.setExhaustBehavior(new ExhaustDrag());

        controller.start();
    }
}