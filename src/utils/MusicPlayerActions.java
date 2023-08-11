package utils;
import apps.musicplayer.MusicPlayer;

public class MusicPlayerActions {

    public static ActionFunction playSongAction() {
        return () -> {
            MusicPlayer musicPlayer = new MusicPlayer();
            musicPlayer.playSong();
        };
    }

    public static ActionFunction pauseSongAction() {
        return () -> {
            MusicPlayer musicPlayer = new MusicPlayer();
            musicPlayer.pauseSong();
        };
    }

    public static ActionFunction nextSongAction() {
        return () -> {
            MusicPlayer musicPlayer = new MusicPlayer();
            musicPlayer.nextSong();
        };
    }

    public static ActionFunction previousSongAction() {
        return () -> {
            MusicPlayer musicPlayer = new MusicPlayer();
            musicPlayer.previousSong();
        };
    }

    public static ActionFunction deleteSongAction() {
        return () -> {
            MusicPlayer musicPlayer = new MusicPlayer();
            musicPlayer.deleteSong();
        };
    }
}
