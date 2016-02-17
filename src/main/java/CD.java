import java.util.*;
import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> instances = new ArrayList<CD>();
  // private String mTitle;
  private String mArtist;



  public CD(String artist) {
    instances.add(this);
    // mTitle = title;
    mArtist = artist;
  }

  // public String getsTitle() {
  //   return mTitle;
  // }

  public String getsArtist() {
    return mArtist;
  }

  public static ArrayList<CD> listArtists() {
    return instances;

  }
}
