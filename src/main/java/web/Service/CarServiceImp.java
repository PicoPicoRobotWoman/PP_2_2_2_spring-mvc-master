package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.Dao.CarDaoImp;
import web.model.Car;

import java.util.ArrayList;
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
        List<Car> selectedCars = new ArrayList<>();

        n = Math.min(cars().size(), n);

        for(int i = 0; i < n; i++) {
            selectedCars.add(cars().get(i));
        }

        return selectedCars;
    }
}
