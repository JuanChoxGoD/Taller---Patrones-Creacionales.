package com.balitechy.spacewar.main;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BitmapBackgroundView implements IBackgroundView {
    private BufferedImage bgImg;

    public BitmapBackgroundView() {
        try {
            SpritesImageLoader loader = new SpritesImageLoader("src\\main\\java\\bg.png");
            bgImg  = loader.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(bgImg, 0, 0, null);
    }
}