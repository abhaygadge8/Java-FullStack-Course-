package com.practisetest.java8timedataapimay14;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResizeExample {
    public static void main(String[] args) {
        try {
            BufferedImage originalImage = ImageIO.read(new File("input.jpg"));
            int newWidth = 200;
            int newHeight = 150;

            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, originalImage.getType());
            Graphics2D g = resizedImage.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
            g.dispose();

            ImageIO.write(resizedImage, "jpg", new File("output.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
