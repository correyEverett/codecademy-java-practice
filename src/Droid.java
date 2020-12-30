public class Droid {

    // properties/instance fields
    String name;
    int batteryLevel;

    // constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // toString method
    public String toString() {
        return "Hello! My name is " + name + ". I am a Droid";
    }


}