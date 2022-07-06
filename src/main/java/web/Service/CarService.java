package web.Service;

import web.model.Car;
import org.springframework.ui.ModelMap;

import java.util.List;

public interface CarService {

    public List<Car> cars();

    public List<Car> cars( int n);


}
