package com.balitechy.spacewar.main;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {

    private Player player;
    private BulletController bulletController;
    private IBackgroundView background;

    public Game(GameGraphicsFactory factory) {
        // Crear las vistas a partir de la fábrica
        this.player = new Player(factory.createPlayerView());
        this.bulletController = new BulletController();
        this.background = factory.createBackgroundView();

        // Opcional: inicializar jugador en una posición
        // player.setPosition(100, 500);
    }


    // Dibujado
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Pintar fondo
        background.render(g);

        // Pintar jugador
        player.render(g);

        // Pintar balas
        bulletController.render(g);
    }


    // Método main para arrancar el juego
    public static void main(String[] args) {
        // Cambiar aquí para usar sprites o gráficos vectoriales
        GameGraphicsFactory factory = new SpriteGraphicsFactory();
        // GameGraphicsFactory factory = new VectorGraphicsFactory();

        JFrame frame = new JFrame("Juego Refactorizado - Spacewar");
        Game game = new Game(factory);

        frame.add(game);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Bucle del juego
        while (true) {
            game.repaint();

            try {
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
