package space.bum.junit.ch11.fliman;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Passenger {
  private String identifier;
  private String name;

  public static void main(String args[]) {
    Passenger passenger = new Passenger("123-456-789", "정 상표");
    System.out.println(passenger);
  }
}
