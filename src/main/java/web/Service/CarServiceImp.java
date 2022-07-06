package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp  implements CarService {

    @Autowired
    CarDao carDao;
    @Override
    public List<Car> cars() {
        return carDao.cars();
    }

    @Override
    public List<Car> cars(int n) {

        Car[] cars = new Car[Math.min(cars().size(),n)];
        System.arraycopy(cars().toArray(),0, cars,0, cars.length);

        return List.of(cars);
    }
}
