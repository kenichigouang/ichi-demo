package ocp;

class Engine {
  public Engine() {}

  public Engine(Engine engine) {
  }

  protected Engine copy() {
    return new Engine(this);
  }

  public String toString() {
    return getClass().getName() + ":" + hashCode();
  }
}

class Car {
  private final int year;
  private final Engine engine;

  public Car(int year, Engine engine) {
    this.year = year;
    this.engine = engine;
  }

//    public Car(Car car) {
//      year = car.year;
//      engine = new Engine(car.engine);
//    }

  // handle TurboEngine while violating OCP
  // creating new type of engine causes code to change
  // car is coupled to every new type of engine
//  public Car(Car car) {
//    year = car.year;
//
//    if (car.engine instanceof TurboEngine) {
//      engine = new TurboEngine((TurboEngine) car.engine);
//    } else engine = new Engine(car.engine);
//  }

  // use inheritance and abstraction to avoid changing car class
  public Car(Car car) {
    year = car.year;
    engine = car.engine.copy();
  }

  public String toString() {
    return year + " - " + engine;
  }
}

public class OcpExample {
  public static void main(String[] args) {
    //        Car car1 = new Car(2015, new Engine());
    //        System.out.println(car1);

    //     What if we want to copy a car?
    //        Car car2 = new Car(car1);
    //        System.out.println(car2);

    //     What if we want to add a new engine?
    Car car1 = new Car(2015, new PistonEngine());
    System.out.println(car1);

    Car car2 = new Car(car1);
    System.out.println(car2);

    // What if we want to add 2 engines to any car?
    // Extensibility is not always feasible or less expensive
  }
}

class TurboEngine extends Engine {
  public TurboEngine() {
    super();
  }

  public TurboEngine(TurboEngine turboEngine) {
    super(turboEngine);
  }

  public TurboEngine copy() {
    return new TurboEngine(this);
  }
}

class PistonEngine extends Engine {
  public PistonEngine() {
    super();
  }

  public PistonEngine(PistonEngine pistonEngine) {
    super(pistonEngine);
  }

// notice this violates DRY
  public Engine copy() {
    return new PistonEngine(this);
  }
}
