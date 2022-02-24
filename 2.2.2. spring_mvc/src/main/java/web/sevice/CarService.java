package web.sevice;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car>getAllCars();
    List<Car>getCar(int num);
}
