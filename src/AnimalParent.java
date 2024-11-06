public class AnimalParent {
    private String name;
    private String type;
    private String sound;

    // made this because I wanted to test using a superclass and interface at the same time
    public AnimalParent(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    //setters - no setter for type because that shouldn't change
    public void setName() {
        this.name = name;
    }

    public void setSound() {
        this.sound = sound;
    }





}
