package extend;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiJ
 * Date: 2021-11-14
 * Time: 9:07
 */
public class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal.eat");
    }
    public void run() {
        System.out.println("Animal.run");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Dog.run");
    }
    public void fly() {
        System.out.println("Dog.fly");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat");;
    }
}
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Cat.run");
    }
}


