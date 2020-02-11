package behavioral.command.receiver;

public class Light {
    String place;

    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println("Light On");
    }
    public void off() {
        System.out.println("Light Off");
    }
}
