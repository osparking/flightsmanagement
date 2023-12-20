package space.bum.junit.ch11.fliman;

public class Passenger {
  private String identifier;
  private String name;

  public static void main(String args[]) {
    Passenger passenger = new Passenger("123-456-789", "정상표");
    System.out.println(passenger);
  }

  public String getIdentifier() {
    return identifier;
  }

  public String getName() {
    return name;
  }

  public Passenger(String identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Passenger [identifier=" + identifier + ", name=" + name + "]";
  }
}
