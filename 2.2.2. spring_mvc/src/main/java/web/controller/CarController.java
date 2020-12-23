package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.Model.Car;

@Controller
@RequestMapping("/cars")
public class CarController {

    @RequestMapping(method = RequestMethod.GET)
    public String printCars(@RequestParam(value = "count", required = false) Integer num, ModelMap model) {
        if (num == null || num < 0 || num >= 5) {
            model.addAttribute("cars", Car.getCarsList(5));
        } else {
            model.addAttribute("cars", Car.getCarsList(num));
        }
        return "car";
    }
}
