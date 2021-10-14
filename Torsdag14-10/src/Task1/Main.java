package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Owner frederik = new Owner("Frederik");
	    Dog thobias = new Dog("Thobias",frederik, false);
        System.out.println("the dog "+thobias.getDogName()+ " has an owner called "+thobias.getOwner().getName());
        ArrayList<Dog> puppies = thobias.getOffSpring();
        for(Dog e : puppies){
            System.out.println("My dog thobias has gotten some cute puppies called " +e);
        }
        thobias.feedDog();
    }
}
