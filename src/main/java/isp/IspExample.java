package isp;

import java.sql.Time;
import java.time.LocalDateTime;

public class IspExample {
//  interface Clock {
//    public void setTime();
//
//    public Object getTime();
//
//    public void setAlarm();
//
//    public Object getAlarm();
//
//    public void setRadio();
//
//    public Object getRadio();
//  }

  class Clock implements TimePiece, Alarm, Radio {}

  interface TimePiece {
    public void setTime();

    public LocalDateTime getTime();
  }

  interface Alarm {
    public void setAlarm();

    public Object getAlarm();
  }

  interface Radio {
    public void setRadio();

    public Object getRadio();
  }

  class Watch implements TimePiece, Alarm {}

  // if user needs a TimePiece then send a Clock
  // Can also now have a Watch
}
