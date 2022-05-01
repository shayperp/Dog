package controller;

import model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.DogRepository;
import services.DogDbService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    DogDbService dogDbService;

    @PostMapping("/addDog/{Dog}")
    public String saveDog(@RequestParam(required = false)Dog dog) {
        dogDbService.add(dog);
        return "Added dog is : "+ dogDbService.getDogByID(123);
    }
    @GetMapping("/findog/{id}")
    public Optional<Dog> returnOneDog(@RequestParam(defaultValue = "123") int id){
        return (Optional) dogDbService.getDogByID(id);
    }


    @GetMapping("/findAllDogs")
    public List<Dog> getDogs(){

        return dogDbService.getAllDog();
    }


}
