package example.service;

import example.model.Car;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CarService {
  Car createCar();

  Car createRandomCar();

  List<Car> addCar();

  List<Car> deleteCar();

  List<Car> findAll();

}
