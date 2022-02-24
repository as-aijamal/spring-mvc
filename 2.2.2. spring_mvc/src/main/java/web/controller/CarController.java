package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String getAllCars(Model model) {
        model.addAttribute("cars", carDao.getAllCars());
        return "/getAllCars";
    }

    @GetMapping("/{num}")
    public String getCar(@PathVariable("num") int num, Model model) {
        model.addAttribute("car", carDao.getCar(num));
        return "/getCar";
    }
}
