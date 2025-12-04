package com.jad.cartune.share;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {

    public static String loadFile(String filename) {
        try {
            String path = "src/main/resources/" + filename;
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            System.err.println("Erreur lors du chargement du fichier: " + filename);
            return "";
        }
    }

    public static char[][] parseToGrid(String content) {
        if (content == null || content.isEmpty()) {
            return new char[0][0];
        }

        String[] lines = content.split("\n", -1);

        if (lines.length == 0) {
            return new char[0][0];
        }

        int maxWidth = 0;
        for (String line : lines) {
            maxWidth = Math.max(maxWidth, line.length());
        }

        char[][] grid = new char[lines.length][maxWidth];

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            for (int j = 0; j < maxWidth; j++) {
                if (j < line.length()) {
                    grid[i][j] = line.charAt(j);
                } else {
                    grid[i][j] = ' ';
                }
            }
        }

        return grid;
    }
}
