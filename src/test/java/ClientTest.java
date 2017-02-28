import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class ClientTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

//   @Test
// public void Stylist_instantiates_true() {
//   assertTrue(stylist instanceof Stylist);
// }
//
// @Test
// public void Stylist_getId_true() {
//   assertTrue(stylist.getId() > 0);
// }
//
// @Test
// public void Stylist_getFirstName_string() {
//   assertEquals("John", stylist.getFirstName());
// }
//
//
// @Test
// public void Stylist_all_ArrayList() {
//   assertTrue(stylist.all().size() > 0);
// }

@After
public void tearDown() {
  try(Connection con = DB.sql2o.open()) {
    String sql = "DELETE FROM stylists *;";
    con.createQuery(sql).executeUpdate();
  }
}

}
