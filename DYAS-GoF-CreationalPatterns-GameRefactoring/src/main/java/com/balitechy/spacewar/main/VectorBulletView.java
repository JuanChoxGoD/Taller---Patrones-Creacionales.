package com.balitechy.spacewar.main;
import java.awt.Color;
import java.awt.Graphics;

public class VectorBulletView implements IBulletView {
    @Override
    public void render(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 5, 10);  // Bala como rectángulo rojo
    }
}