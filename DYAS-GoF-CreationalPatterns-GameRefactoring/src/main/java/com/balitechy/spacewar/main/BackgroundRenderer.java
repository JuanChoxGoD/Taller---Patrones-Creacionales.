package com.balitechy.spacewar.main;
import java.awt.Graphics;


public class BackgroundRenderer {
    private IBackgroundView view;

    public BackgroundRenderer(IBackgroundView view) {
        this.view = view;
    }

    public void render(Graphics g) {
        view.render(g);
    }
}
