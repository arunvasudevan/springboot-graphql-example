package main.java.com.arunvasudevan.example.graphql_spring_boot_tutorial.resolvers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import main.java.com.arunvasudevan.example.graphql_spring_boot_tutorial.entities.Pet;
import main.java.com.arunvasudevan.example.graphql_spring_boot_tutorial.enums.Animal;

@Component
public class Query implements GraphQLQueryResolver{

    public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();

        Pet aPet = new Pet();
        aPet.setId(1);
        aPet.setName("Jimmy");
        aPet.setAge(9);
        aPet.setType(Animal.DOG);

        pets.add(aPet);

        return pets;
    }
}
