package example.repository;

import example.model.Car;
import org.springframework.stereotype.Repository;

@Repository("carRepository")
public interface CarRepository {

  Car createCar(double price, int year, String model, String make);

}
