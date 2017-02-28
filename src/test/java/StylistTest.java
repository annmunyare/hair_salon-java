import java.util.Arrays;
import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class StylistTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  // @Test
  // public void Stylist_instantiatesCorrectly_true() {
  //   Stylist testStylist = new Stylist("Ben");
  //   assertTrue(testStylist instanceof Stylist);
  // }
  //
  // @Test
  // public void getName_StylistInstantiatesWithName_Joe() {
  //   Stylist testStylist = new Stylist("Joe");
  //   assertEquals("Joe", testStylist.getName());
  // }
  //
  // @Test
  // public void all_returnsAllInstancesOfStylist_true() {
  //   Stylist firstStylist = new Stylist("Joe");
  //   firstStylist.save();
  //   Stylist secondStylist = new Stylist("Doe");
  //   secondStylist.save();
  //   assertTrue(Stylist.all().get(0).equals(firstStylist));
  //   assertTrue(Stylist.all().get(1).equals(secondStylist));
  // }
  //
  // @Test
  // public void clear_emptiesAllStylistsFromArrayList_0() {
  //   Stylist testStylist = new Stylist("JOe");
  //   assertEquals(Stylist.all().size(), 0);
  // }
  //
  // @Test
  // public void getId_stylistsInstantiateWithAnId_1() {
  //   Stylist testStylist = new Stylist("Joe");
  //   testStylist.save();
  //   assertTrue(testStylist.getId() > 0);
  // }
  //
  //
  // @Test
  // public void save_savesIntoDatabase_true() {
  //   Stylist myStylist = new Stylist("Dalo");
  //   myStylist.save();
  //   assertTrue(Stylist.all().get(0).equals(myStylist));
  // }
  //
  // @Test
  // public void save_assignsIdToObject() {
  //   Stylist myStylist = new Stylist("Dalo");
  //   myStylist.save();
  //   Stylist savedStylist = Stylist.all().get(0);
  //   assertEquals(myStylist.getId(), savedStylist.getId());
  // }
  //
  //
  //
  // @Test
  // public void delete_deletesStylist_true() {
  //   Stylist myStylist = new Stylist("Dalo");
  //   myStylist.save();
  //   int myStylistId = myStylist.getId();
  //   myStylist.delete();
  //   assertEquals(null, Stylist.find(myStylistId));
  // }
}
