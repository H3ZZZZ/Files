package Task1;

import java.util.ArrayList;

public class Dog {
    private String dogName;
    private Owner owner;
    private boolean isHungry = true;
    private ArrayList<Dog> offSpring;


    public Dog(String dogName, Owner owner, boolean isHungry) {
        this.owner = owner;
        this.dogName = dogName;
        this.isHungry = isHungry;
        offSpring = new ArrayList<>();

    }

    public void feedDog() {
        if(isHungry==true){
            System.out.println("Your dog is hungry, lets give it some food");
            isHungry = false;
        }else{
            System.out.println("Your dog is not hungry");
        }
    }
    public String getDogName() {
        return dogName;
    }

    public Owner getOwner() {
        return owner;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }
    public void setOffSpring(ArrayList<Dog> offSpring) {
        this.offSpring = offSpring;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

}
