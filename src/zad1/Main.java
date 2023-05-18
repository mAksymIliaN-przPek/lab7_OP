// Definiowanie interfejsów
interface Plywa {
    void plyn();
}

interface Lata {
    void lec();
}

// Definiowanie klas implementujących interfejsy
class Statek implements Plywa {
    public void plyn() {
        System.out.println("Statek płynie");
    }
}

class Samolot implements Plywa, Lata {
    public void plyn() {
        System.out.println("Samolot nie potrafi pływać");
    }

    public void lec() {
        System.out.println("Samolot lata");
    }
}


public class Main {
    public static void main(String[] args) {
        Statek statek = new Statek();
        statek.plyn();

        Samolot samolot = new Samolot();
        samolot.plyn();
        samolot.lec();
    }
}
