package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private static int PEOPLE_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++PEOPLE_COUNT, "lexus", "USA"));
        cars.add(new Car(++PEOPLE_COUNT, "Toyota", "Japan"));
        cars.add(new Car(++PEOPLE_COUNT, "Mercedes", "Germany"));
        cars.add(new Car(++PEOPLE_COUNT, "KIA", "Korea"));
        cars.add(new Car(++PEOPLE_COUNT, "BMW", "USA"));
    }

    public List<Car> getCar(int num) {
        List<Car>carList=new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if(num<=5){
                carList.add(cars.get(i));
            }else {
                return cars;
            }
        }
        return carList;
    }

    public List<Car>getAllCars(){
        return cars;
    }
}
