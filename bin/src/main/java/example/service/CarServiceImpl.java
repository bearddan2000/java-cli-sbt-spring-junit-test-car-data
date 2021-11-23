package example.service;

import example.model.Car;
import example.repository.*;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CarServiceImpl implements CarService {

  CarRepository carRepository;

  public CarServiceImpl(){
    carRepository = new  CarRepositoryImpl();
  }

  Car createOneCar(){
    return carRepository.createCar(0, 0, "test", "test");
  }

  List<Car> createList(){
    return new ArrayList<Car>(){
      {
        add(carRepository.createCar(0, 0, "0", "0"));
        add(carRepository.createCar(1, 1, "1", "1"));
        add(carRepository.createCar(2, 2, "2", "2"));
      }
    };
  }

  @Override
  public Car createCar(){
    return createOneCar();
  }

  @Override
  public Car createRandomCar(){
    List<Car> lst = createList();
    int x = 0;
    int y = lst.size() - 1;
    Random r = new Random();
    int number = x+((int)(r.nextDouble()*(y-x)));
    return lst.get(number);
  }

  @Override
  public List<Car> addCar(){
    List<Car> lst = createList();
    lst.add(createOneCar());
    return lst;
  }

  @Override
  public List<Car> deleteCar() {
    List<Car> lst = createList();
    lst.remove(0);
    return lst;
  }

  @Override
  public List<Car> findAll(){ return createList(); }

}
