public class Main {
    public static void main(String[] args) {

        // testing dog
        Dog dog1 = new Dog("Jimmy", "dog", "bark");
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();

        // testing cat
        Cat cat1 = new Cat("Sabeecha", "cat", "meow");
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();

    }
}