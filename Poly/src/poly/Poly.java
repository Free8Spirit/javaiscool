// Author: Vert, David  10/30/2018
package poly;
import java.util.ArrayList;
public class Poly {

    public static void main(String[] args) {
        Lion lion = new Lion(6, "beige");
        Fish fish = new Fish(2, "golden");
        Dog dog = new Dog(7, "black");
        
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        aryAnimal.add(lion);
        aryAnimal.add(fish);
        aryAnimal.add(dog);
        
        for (int i = 0; i < aryAnimal.size(); i++) {
            allSpeak(aryAnimal.get(i));
        }
                
//        Animal animal = new Animal(25, "purple");
        
//        LionSpeak(lion);
//        FishSpeak(fish);
//        DogSpeak(dog);
//        AnimalSpeak(animal);
    }
    
//    public static void LionSpeak(Lion lion) {
//        lion.speak();
//    }
//    
//    public static void FishSpeak(Fish fish) {
//        fish.speak();
//    }
//    
//    public static void DogSpeak(Dog dog) {
//        dog.speak();
//    }
//    
//    public static void AnimalSpeak(Animal animal) {
//        animal.speak();
//    }
    
    public static void allSpeak(Animal animal) {
        animal.speak();
    }
}