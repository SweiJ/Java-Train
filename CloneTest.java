package interfacePack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: SweiJ
 * Date: 2021-11-21
 * Time: 15:53
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal("ะกร๗", 21);
        Animal animal1 = (Animal) animal.clone();
        animal1.dog.rise = 10;
        System.out.println(animal.toString());
        System.out.println(animal1.toString());
    }
}
class Dog implements Cloneable {
    public int rise = 80;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "rise=" + rise +
                '}';
    }
}
class Animal implements Cloneable {
    private String name;
    private int age;
    public Dog dog = new Dog();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Animal tmp = (Animal) super.clone();
        tmp.dog = (Dog) tmp.dog.clone();
        return tmp;
    }
}
