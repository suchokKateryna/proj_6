package ucu.edu.ua.com.proj_6.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.com.proj_6.flower.Flower;
import ucu.edu.ua.com.proj_6.flower.FlowerColor;
import ucu.edu.ua.com.proj_6.flower.FlowerType;

@RestController
public class FlowerController {

    @GetMapping("/flowers")
    public List<Flower> getFlowers(){
        return List.of(
            new Flower(5.2, FlowerColor.RED, 10.0, FlowerType.ROSE)
            );
    }

}
