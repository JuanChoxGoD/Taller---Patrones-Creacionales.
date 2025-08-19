package com.balitechy.spacewar.main;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpritePlayerView implements IPlayerView {
    private BufferedImage playerImg;

    public SpritePlayerView() {
        try {
            SpritesImageLoader loader = new SpritesImageLoader("src\\main\\java\\sprites.png");
            playerImg = loader.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.drawImage(playerImg, x, y, null);
    }
}