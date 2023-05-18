package zad2;

interface Pływanie {
    void plyn();
    void wynurz();
    void zanurz();
}

interface Latanie {
    void lec();
    void wyladuj();
}

abstract class Zwierze {
    abstract void jedz();
    abstract void wydalaj();
}


abstract class Ryba extends Zwierze implements Pływanie {
    public void jedz() {
        System.out.println("Ryba je");
    }

    public void wydalaj() {
        System.out.println("Ryba wydala");
    }

    public void plyn() {
        System.out.println("Ryba płynie");
    }

    public void wynurz() {
        System.out.println("Ryba wynurza się");
    }

    public void zanurz() {
        System.out.println("Ryba zanurza się");
    }
}
class Wieloryb extends Ryba { }

public class Main {
    public static void main(String[] args) {
        Wieloryb wieloryb = new Wieloryb();
        wieloryb.jedz();
        wieloryb.wydalaj();
        wieloryb.plyn();
        wieloryb.wynurz();
        wieloryb.zanurz();
    }
}
