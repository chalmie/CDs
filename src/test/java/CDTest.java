import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

@Test
public void CD_instantiatesCorrectly_true() {
  CD testCD = new CD("Lady Gaga");
  assertEquals(true, testCD instanceof CD);
}

// @Test
// public void getsTitle_getsCdTitleFromUserInput_badRomance() {
//   CD testCD = new CD("Bad Romance", "Lady Gaga");
//   assertEquals("Bad Romance", testCD.getsTitle());
// }

@Test
public void getsArtist_getsCdArtistFromUserInput_ladyGaga() {
  CD testCD = new CD("Lady Gaga");
  assertEquals("Lady Gaga", testCD.getsArtist());
}

@Test
public void listArtists_returnsAllInstancesofArtistsAdded_true() {
  CD firstCD = new CD("Lady Gaga");
  CD secondCD = new CD("The Beatles");
  assertTrue(CD.listArtists().contains(firstCD));
  assertTrue(CD.listArtists().contains(secondCD));
}

@Test
public void newId_CDInstantiateWithAnID_true() {
  CD myCD = new CD ("Lady Gaga");
  assertEquals(CD.listArtists().size(), myCD.getId());
}

@Test
public void findInArray_returnsTaskWithSameId_secondCD() {
  CD firstCD = new CD("Lady Gaga");
  CD secondCD = new CD("The Beatles");
  assertEquals(CD.findInArray(secondCD.getId()), secondCD);
}

@Test
public void findInArray_returnsNullWhenNoTaskFound_null() {
  assertTrue(CD.findInArray(999) == null);
}

@Test
public void clear_emptiesAllTasksFromArrayList() {
  CD myCD = new CD("Lady Gaga");
  CD.clear();
  assertEquals(CD.listArtists().size(), 0);
}
}
  // UNIT TESTING
