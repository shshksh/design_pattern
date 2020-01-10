package headFirstDP.command.product;

public class Stereo {
    String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCD() {
        System.out.println("Set CD");
    }

    public void  setDVD() {
        System.out.println("Set DVD");
    }

    public void setRadio() {
        System.out.println("Set Radio");
    }

    public void setVolume(int i) {
        System.out.println("Volume is "+i);
    }

}
