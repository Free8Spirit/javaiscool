// sub
package poly;

public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
        
    }
    
    @Override
    public void speak() {
        System.out.println("I bark");
    }
}
