package com.balitechy.spacewar.main;

public class VectorGraphicsFactory implements GameGraphicsFactory {
    @Override
    public IPlayerView createPlayerView() {
        return new VectorPlayerView();
    }
    @Override
    public IBulletView createBulletView() {
        return new VectorBulletView();
    }
    @Override
    public IBackgroundView createBackgroundView() {
        return new VectorBackgroundView();
    }
}
