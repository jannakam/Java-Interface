public class Dog extends AnimalParent implements Animal {

    public Dog(String name, String type, String sound) {
        super(name, type, sound);
    }

    public void eat() {
        System.out.println(this.getName() + " the " + this.getType() + " is eating");
    }

    public void sleep() {
        System.out.println(this.getName() + " the " + this.getType() + "is sleeping");
    }

    public void makeSound() {
        System.out.println(this.getName() + " the " + this.getType() + " makes a " + this.getSound() + " sound");
    }
}
