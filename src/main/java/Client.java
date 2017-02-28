import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Client {
  private boolean completed;
  private LocalDateTime createdAt;
  private int id;
  private String firstname;
  private String lastname;
  private String notes;
  private int stylistid;

//constructor
  public Client(String firstname, /*String lastname, String notes,*/ int stylistid) {
    this.firstname = firstname;
    // this.lastname = lastname;
    // this.notes = notes;
    this.stylistid = stylistid;

  }
//check this out
  @Override
  public boolean equals(Object otherClient) {
    if (!(otherClient instanceof Client)) {
      return false;
    } else {
      Client newClient = (Client) otherClient;
      return this.getFirstname().equals(newClient.getFirstname()) &&
            //  this.getLastname().equals(newClient.getLastname()) &&
            //  this.getNotes().equals(newClient.getNotes()) &&
             this.getId() == newClient.getId() &&
             this.getStylistid() == newClient.getStylistid();
    }
  }
//returning all objects
  public static List<Client> all() {
    String sql = "SELECT id, firstname,  stylistId FROM clients";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Client.class);
    }
  }
//saving new objects and assigning unique ids
  public void save() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO clients (firstname, stylistid) VALUES (:firstname, :stylistid)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("firstname", this.firstname)
        // .addParameter("lastname", this.lastname)
        // .addParameter("notes", this.notes)
        .addParameter("stylistid", this.stylistid)
        .executeUpdate()
        .getKey();
    }
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNotes() {
    return notes;
  }
  //getter method for stylistId
  public int getStylistid() {
      return stylistid;
    }

  public boolean isCompleted() {
    return completed;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public int getId() {
    return id;
  }
//finding objects
  public static Client find(int id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM clients where id=:id";
      Client client = con.createQuery(sql)
      .addParameter("id", id)
      .executeAndFetchFirst(Client.class);
    return client;
    }
  }

//updating a given clients
  public  void update(int id, String firstname, String lastname, String notes, int stylistid) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "UPDATE clients SET firstname = :firstname,  stylistid = :stylistid WHERE id = :id";
      con.createQuery(sql)
        .addParameter("id", id)
        .addParameter("firstname", firstname)
        // .addParameter("lastname", lastname)
        // .addParameter("notes", notes)
        .addParameter("stylistid", stylistid)
        .executeUpdate();
    }
  }


//we call a delete() method upon an instance of Client
  public void delete() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM clients WHERE id = :id;";
      con.createQuery(sql)
      .addParameter("id", id)
      .executeUpdate();
    }
  }
}
