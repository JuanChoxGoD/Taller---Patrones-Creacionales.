package com.balitechy.spacewar.main;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Player {
    private int x, y;
    private IPlayerView view;

    private boolean up, down, left, right;
    private int speed = 5; // velocidad del jugador

    public Player(IPlayerView view) {
        this.view = view;
        this.x = 100;
        this.y = 100;
    }

    public void render(Graphics g) {
        view.render(g, x, y);
    }
	
    // Llamar en cada frame desde Game (ej: dentro de gameLoop)
    public void update() {
        if (up) y -= speed;
        if (down) y += speed;
        if (left) x -= speed;
        if (right) x += speed;
    }

    // --- Manejo de teclas ---
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP)    up = true;
        if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN)  down = true;
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT)  left = true;
        if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) right = true;
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP)    up = false;
        if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN)  down = false;
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT)  left = false;
        if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) right = false;
    }

    // Getter para la posición (si lo necesitas en BulletController)
    public int getX() { return x; }
    public int getY() { return y; }
}
