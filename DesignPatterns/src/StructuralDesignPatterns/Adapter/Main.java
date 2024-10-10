package StructuralDesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Brown Rang");
        audioPlayer.play("mp4", "Blue Eyes");
        audioPlayer.play("vlc", "Desi Kalakar");
    }
}
