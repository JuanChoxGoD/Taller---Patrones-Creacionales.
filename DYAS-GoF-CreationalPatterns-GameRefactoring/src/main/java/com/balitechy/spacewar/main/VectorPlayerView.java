package com.balitechy.spacewar.main;
import java.awt.Color;
import java.awt.Graphics;

public class VectorPlayerView implements IPlayerView{
    @Override
    public void render(Graphics g, int x, int y) {
        g.setColor(Color.GREEN);
        g.fillOval(x, y, 40, 40);  
    }
}
