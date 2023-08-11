package apps.musicplayer;

import interfaces.MusicPlayerInterface;

public class MusicPlayer implements MusicPlayerInterface {

  public void playSong() {
    System.out.println("Playing Song");
  }


  public void pauseSong() {
      System.out.println("Paused song");
  }


  public void nextSong() {
      System.out.println("Playing next song");
  }


  public void previousSong() {
      System.out.println("Playing previous song");
  }

  public void deleteSong() {
      System.out.println("Song Deleted");
  }


}
  

