package example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Car {
  double price;
  int year;
  String make, model;
}
