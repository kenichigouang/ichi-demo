package srp.Better;

import srp.Student;

public class BetterCourse {
  private int courseId;
  private String title;
  private String type;

  public void Subscribe(Student student) {
    Logger.log("Starting Subscribe()");

    // apply business rules based on the course type live, online, offline, if any
    if (type.equals("online")) {
      // subscribe to online course
    } else if (type.equals("live")) {
      // subscribe to offline course
    }

    // payment processing
    PaymentManager.ProcessPayment();

    // create CourseRepository class to save student and course into StudentCourse table

    // send confirmation email
    EmailSender.sendEmail();

    Logger.log("End Subscribe()");
  }
}
