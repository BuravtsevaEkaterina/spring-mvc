package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer num, ModelMap model) {
        model.addAttribute("cars", carService.carList(num));
        return "car";
    }
}
