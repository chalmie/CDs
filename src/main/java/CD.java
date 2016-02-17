import java.util.*;

public class CD {
  private String mTitle;
  private String mArtist;

  public CD(String title, String artist) {
    mTitle = title;
    mArtist = artist;
  }

  public String getsTitle() {
    return mTitle;
  }

  public String getsArtist() {
    return mArtist;
  }
}
