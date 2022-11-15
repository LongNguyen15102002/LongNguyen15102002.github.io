package com.example.miniexamplebuoi2spring.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ColorService {
    public String randomColor(int type) {
        return switch (type) {
            case 1 -> randomColorName();
            case 2 -> randomHexColor();
            case 3 -> randomRgbColor();
            default -> throw new RuntimeException("Type không hợp lệ");
        };
    }

    private String randomColorName() {
        List<String> colors = List.of("black", "green", "yellow", "blue");
        int random = new Random().nextInt(colors.size());
        return colors.get(random);
    }
    public String randomRgbColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return "rgb(" + red + "," + green + "," + blue + ")";
    }

    private String randomHexColor() {
        Random random = new Random();
        int nextInt = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", nextInt);
        return colorCode;
    }
}
