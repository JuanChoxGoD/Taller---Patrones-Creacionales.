package com.balitechy.spacewar.main;

public interface GameGraphicsFactory {
    IPlayerView createPlayerView();
    IBulletView createBulletView();
    IBackgroundView createBackgroundView();
}
