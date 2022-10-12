package com.gamingroom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Entity {
    long id = 0;
    String name;

    Entity() { }

    Entity(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
