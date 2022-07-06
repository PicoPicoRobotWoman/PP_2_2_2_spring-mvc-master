package web.controller;

import web.Service.CarService;
import web.Service.CarServiceImp;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count , ModelMap model) {
        model.addAttribute("cars", carService.cars(count == null || count < 0 ?  carService.cars().size() : count ));
        return "cars";
    }
}
