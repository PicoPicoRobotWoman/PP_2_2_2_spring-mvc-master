package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    int increment = 0;
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++increment,"name" + increment,increment + 20));
        cars.add(new Car(++increment,"name" + increment,increment + 20));
        cars.add(new Car(++increment,"name" + increment,increment + 20));
        cars.add(new Car(++increment,"name" + increment,increment + 20));
        cars.add(new Car(++increment,"name" + increment,increment + 20));
    }

    @Override
    public List<Car> cars() {
        return cars;
    }
}
