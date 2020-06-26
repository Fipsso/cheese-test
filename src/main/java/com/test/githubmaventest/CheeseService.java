package com.test.githubmaventest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheeseService {


    public Cheese createCheese(String name, String milk){
        Cheese cheese = new Cheese();
        cheese.setMilk(milk);
        cheese.setName(name);
        return cheese;
    }


}
