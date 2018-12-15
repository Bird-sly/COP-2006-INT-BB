package main;
import java.util.Scanner;
/*
 * Inheritance minimize the amount of duplicate code 
 * Inheritance can also make application code more flexible to change 
 * 
 */
public class Creature {
//this stream is to connect to main
  public static void do10() {
    System.out.println("Module 10");
    Fox foxMcCloud = new Fox();
    Felcon felcoLombardi = new Felcon();
    Animal[] myPets = { foxMcCloud, felcoLombardi }; // this is better polymorphism
    for (Animal anAnimal : myPets) {
      System.out.println(anAnimal.showSpecies());
      anAnimal.makeSound();
    }
  }
}

class Animal {

  protected String species;

  public String showSpecies() {
    return "Animal";
  }

  public void makeSound() {
    System.out.println("Ogga Booga");
  }
}

class Fox extends Animal {

  public Fox() {
    species = "Canine";  // this demonstrates inheritance
  }
  

  public String showSpecies() {
    return "Fox McCloud";
  }
//this will print 
  public void makeSound() {
    System.out.println("Come One!");
  }

}

class Felcon extends Animal {

  public Felcon() {
    species = "felco";
  }

  public String showSpecies() {
    return species;
  }
//print in end
  public void makeSound() {
    System.out.println("Is that all you got?");
  }
  
}