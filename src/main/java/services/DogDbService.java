package services;

import model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.DogRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DogDbService {
    @Autowired
    private DogRepository repository;

    @GetMapping("/findog/{id}")
    public Optional<Dog> returnOneDog(@RequestParam(defaultValue = "123") int id){
        return repository.findById(id);
    }



    public List<Dog> getAllDog(){
        List<Dog> listOfDogs;
        try{
            listOfDogs = repository.findAll();
        }catch (Exception e){
            listOfDogs = new ArrayList<>();
            listOfDogs.add(new Dog( "some problem as come ",null,false,0,0));
        }
        return listOfDogs;
    }
    public Optional<Dog> getDogByID(int i) {
        return repository.findById(i);
    }

   public void  add(Dog dog) {
        repository.save(new Dog("leo","Ausi",true,2,123));
    }

    public List<Dog> getAllDogs() {
        List<Dog> listOfDogs;
        try{
            listOfDogs = repository.findAll();
        }catch (Exception e){
            listOfDogs = new ArrayList<>();
            listOfDogs.add(new Dog( "some problem as come ",null,false,0,0));
        }
        return listOfDogs;
    }
}
