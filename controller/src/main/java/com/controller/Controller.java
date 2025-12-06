package com.controller;

import com.model.Car;
import com.model.decorators.*;
import com.share.IBehavior;
import com.share.ICar;
import com.share.IController;
import com.share.IView;
import com.view.View;

public class Controller implements IController {
    private final ICar car;
    private final IView view;

    public Controller(IBehavior spoiler, IBehavior neon, IBehavior rims, IBehavior exhaust) {
        this.view = new View();
        this.car = buildCar(spoiler, neon, rims, exhaust);
    }

    private ICar buildCar(IBehavior spoiler, IBehavior neon, IBehavior rims, IBehavior exhaust) {
        ICar c = new Car();

        if (neon != null) c = new Neon(c, neon);
        if (rims != null) c = new Rims(c, rims);
        if (exhaust != null) c = new Exhaust(c, exhaust);
        if (spoiler != null) c = new Spoiler(c, spoiler);

        return c;
    }

    @Override
    public void start() {
        view.display(car);
    }
}