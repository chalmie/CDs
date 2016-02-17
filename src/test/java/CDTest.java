import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

@Test
public void CD_instantiatesCorrectly_true() {
  CD testCD = new CD("Bad Romance","Lady Gaga");
  assertEquals(true, testCD instanceof CD);
}

@Test
public void getsTitle_getsCdTitleFromUserInput_badRomance() {
  CD testCD = new CD("Bad Romance", "Lady Gaga");
  assertEquals("Bad Romance", testCD.getsTitle());
}

@Test
public void getsArtist_getsCdArtistFromUserInput_ladyGaga() {
  CD testCD = new CD("Bad Romance", "Lady Gaga");
  assertEquals("Lady Gaga", testCD.getsArtist());
}
  // UNIT TESTING



}
