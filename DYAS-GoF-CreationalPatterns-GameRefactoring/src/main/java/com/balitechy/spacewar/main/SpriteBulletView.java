package com.balitechy.spacewar.main;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteBulletView implements IBulletView {
    private BufferedImage bulletImg;

    public SpriteBulletView() {
        try {
            SpritesImageLoader loader = new SpritesImageLoader("src\\main\\java\\bullet.png");
            bulletImg  = loader.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.drawImage(bulletImg, x, y, null);
    }
}
