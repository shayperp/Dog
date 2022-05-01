package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@Document(collation = "Dog")
public class Dog {

    @Field(name = "name")
    private String dogName;
    private String breed;
    private boolean sex;
    private int age;
    @Id
    private int id;

    public Dog(String dogName, String breed, boolean sex, int age, int id) {
        this.dogName = dogName;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.id = id;
    }


}
