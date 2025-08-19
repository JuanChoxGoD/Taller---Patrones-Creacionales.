package com.balitechy.spacewar.main;
import java.awt.Color;
import java.awt.Graphics;

public class VectorBackgroundView implements IBackgroundView {

    @Override
    public void render(Graphics g) {
        // Fondo negro
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

        // Dibujar algunas "estrellas" como puntos blancos
        g.setColor(Color.WHITE);
        for (int i = 0; i < 50; i++) {
            int x = (int) (Math.random() * 800);
            int y = (int) (Math.random() * 600);
            g.fillRect(x, y, 2, 2);
        }

        // Línea divisoria como detalle retro
        g.setColor(Color.DARK_GRAY);
        g.drawLine(0, 550, 800, 550);
    }
}