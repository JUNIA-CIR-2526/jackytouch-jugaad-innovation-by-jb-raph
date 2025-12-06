package com.view;

import com.share.ICar;
import com.share.IView;

import java.util.List;

public class View implements IView {
    @Override
    public void display(ICar car) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║       JACKYTOUCH CUSTOM GARAGE       ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        for (String line : car.getRenderedImage()) {
            System.out.println(line);
        }

        List<String> stats = car.getStats();
        if (!stats.isEmpty()) {
            System.out.println("\n--- EFFETS MÉCANIQUES ---");
            for (String stat : stats) {
                System.out.println("> " + stat);
            }
        }
        System.out.println();
    }
}