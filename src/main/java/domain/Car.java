package domain;

import java.util.Objects;

public class Car {
    String name;
    int forward;

    public Car(String name){
        this.name = name;
        forward=0;
    }
    public void moveForward(){
        forward++;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car otherCar = (Car)obj;
        return Objects.equals(this.name,otherCar.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
