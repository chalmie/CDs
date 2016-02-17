import java.util.*;
import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> instances = new ArrayList<CD>();
  // private String mTitle;
  private String mArtist;
  private int mId;


  public CD(String artist) {
    instances.add(this);
    mId = instances.size();
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

  public int getId() {
    return mId;
  }

  public static CD findInArray(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
    }

}
