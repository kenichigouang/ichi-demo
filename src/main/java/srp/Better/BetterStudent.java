package srp.Better;

import java.time.LocalDateTime;

public class BetterStudent {

  private int studentId;
  private String firstName;
  private String lastName;
  private LocalDateTime dateOfBirth;
  private String email;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String zipcode;

  public void Save() {
    Logger.log("Starting Save()");

    StudentRepository.save(this);

    Logger.log("End Save()");
  }

  public void Delete() {
    Logger.log("Starting Delete()");

    // check if already subscribed courses

    StudentRepository.delete(this);

    Logger.log("End Delete()");
  }
}
