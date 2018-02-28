public class Vækkeur implements OnOff {

    private Lokation lokation;
    private OnOff onOff;

    public Vækkeur() {
    }

    public Vækkeur(Lokation lokation) {
        this.lokation = lokation;
    }

    public Lokation getLokation() {
        return lokation;
    }

    public void setLokation(Lokation lokation) {
        this.lokation = lokation;
    }

    @Override
    public void on() {
        onOff.on();
    }

    @Override
    public void off() {
        onOff.off();
    }
}