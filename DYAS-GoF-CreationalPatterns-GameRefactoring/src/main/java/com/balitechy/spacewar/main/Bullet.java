package com.balitechy.spacewar.main;

import java.awt.Graphics;

public class Bullet {
    private int x, y, speed;
    private IBulletView view;

    public Bullet(IBulletView view, int startX, int startY) {
        this.view = view;
        this.x = startX;
        this.y = startY;
        this.speed = 10;
    }

    public void update() {
        y -= speed;
    }

    public void render(Graphics g) {
        view.render(g, x, y);
    }
	public void tick() {
        y -= speed;  // Mueve la bala hacia arriba
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

