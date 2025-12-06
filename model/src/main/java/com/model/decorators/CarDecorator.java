package com.model.decorators;

import com.share.IBehavior;
import com.share.ICar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CarDecorator implements ICar {
    protected ICar decoratedCar;
    protected IBehavior behavior;
    protected List<String> asciiArt;

    public CarDecorator(ICar decoratedCar, String fileName, IBehavior behavior) {
        this.decoratedCar = decoratedCar;
        this.behavior = behavior;
        try {
            this.asciiArt = loadFile(fileName);
        } catch (IOException e) {
            this.asciiArt = new ArrayList<>();
        }
    }

    private List<String> loadFile(String fileName) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) throw new IOException(fileName);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            return reader.lines().collect(Collectors.toList());
        }
    }

    @Override
    public List<String> getRenderedImage() {
        return mergeImages(decoratedCar.getRenderedImage(), this.asciiArt);
    }

    @Override
    public List<String> getStats() {
        List<String> stats = new ArrayList<>(decoratedCar.getStats());
        stats.add(behavior.getName() + " : " + behavior.getDescription());
        return stats;
    }

    private List<String> mergeImages(List<String> bottom, List<String> top) {
        if (bottom.isEmpty()) return top;
        int height = bottom.size();
        int width = bottom.get(0).length();
        char[][] canvas = new char[height][width];

        for (int y = 0; y < height; y++) {
            canvas[y] = bottom.get(y).toCharArray();
        }

        for (int y = 0; y < Math.min(height, top.size()); y++) {
            String line = top.get(y);
            for (int x = 0; x < Math.min(width, line.length()); x++) {
                char c = line.charAt(x);
                if (c != ' ' && c != '.') {
                    canvas[y][x] = c;
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int y = 0; y < height; y++) {
            result.add(new String(canvas[y]));
        }
        return result;
    }
}