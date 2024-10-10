package StructuralDesignPatterns.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}
