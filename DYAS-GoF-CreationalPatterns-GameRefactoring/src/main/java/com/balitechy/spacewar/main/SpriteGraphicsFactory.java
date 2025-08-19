package com.balitechy.spacewar.main;

public class SpriteGraphicsFactory  implements GameGraphicsFactory {
    @Override
    public IPlayerView createPlayerView() {
        return new SpritePlayerView();
    }
    @Override
    public IBulletView createBulletView() {
        return new SpriteBulletView();
    }
    @Override
    public IBackgroundView createBackgroundView() {
        return new BitmapBackgroundView();
    }
}