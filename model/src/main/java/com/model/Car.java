package com.model;

import com.share.ICar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car implements ICar {
    private List<String> baseShape;

    public Car() {
        try {
            this.baseShape = loadFile("car_base.txt");
        } catch (Exception e) {
            this.baseShape = new ArrayList<>();
            this.baseShape.add("ERROR BASE");
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
        return baseShape;
    }

    @Override
    public List<String> getStats() {
        return new ArrayList<>();
    }
}