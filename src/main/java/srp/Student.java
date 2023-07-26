package srp;

import java.time.LocalDateTime;
import java.util.List;

public class Student {

  private int StudentId;
  private String FirstName;
  private String LastName;
  private LocalDateTime dateOfBirth;
  private String email;
  private String Address1;
  private String Address2;
  private String City;
  private String State;
  private String Zipcode;

  public void Save() {
    System.out.println("Starting Save()");
    // use EF to save student to DB

    System.out.println("End Save()");
  }

  public void Delete() {
    System.out.println("Starting Delete()");

    // check if already subscribed courses then don't delete

    System.out.println("End Delete()");
  }

  public List<Course> Subscribe(Course course) {
    System.out.println("Starting Subscribe()");

    // apply business rules based on the course type
    if (course.getType().equals("online")) {
      // validate
    } else if (course.getType().equals("live")) {

    }

    // payment processing code

    // save course subscription to DB

    // send email confirmation code

    System.out.println("End Subscribe()");

    // return subscribed courses
    return null;
  }
}
