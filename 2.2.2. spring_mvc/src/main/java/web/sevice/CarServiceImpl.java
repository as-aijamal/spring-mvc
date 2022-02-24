package web.sevice;

import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDao();

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCar(int num) {
        return carDao.getCar(num);
    }
}
