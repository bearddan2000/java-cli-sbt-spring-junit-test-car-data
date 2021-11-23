package example.repository;

import org.springframework.stereotype.Repository;
import example.model.Car;

@Repository
public class CarRepositoryImpl implements CarRepository {
  @Override
  public Car createCar(double price, int year, String model, String make) {
    Car o = new Car();
    o.setPrice(price);
    o.setYear(year);
    o.setModel(model);
    o.setMake(make);
    return o;
  }
}
