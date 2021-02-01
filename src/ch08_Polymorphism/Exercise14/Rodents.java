package ch08_Polymorphism.Exercise14;

import java.util.Random;

//Exercise 14: (4) Modify Exercise 12 so that one of the member objects is a shared object with reference counting,
// and demonstrate that it works properly.
public class Rodents {
    public static int refs = 0;

    public static void main(String[] args) {
        Rodents[] rodents = new Rodents[3];
        Wheat wheat = new Wheat();
        for (int i = 0; i < 3; i++) {
            Random rand = new Random();
            switch (rand.nextInt(1)) {
                case 0:
                    rodents[i] = new Mouse(wheat);
                    break;
                case 1:
                    rodents[i] = new Gerbil();
                    break;
                case 2:
                    rodents[i] = new Hamster();
                    break;
            }
        }
        for (Rodents rodent : rodents) {
            rodent.run();
            rodent.dispose();
        }
        wheat.dispose();

    }
    public void dispose () {
        System.out.println("Rodent disposed!");
    }
    void run() {
        System.out.println("Rodent is running...");
    }
}

class Mouse extends Rodents {
    Wheat wheat;

    Mouse(Wheat wheat) {
        this.wheat = wheat;
        wheat.addRef();
    }

    public Mouse() {
    }

    public void dispose () {
        System.out.println("Mouse disposed!");
        wheat.delRef();
        super.dispose();
    }

    void run() {
        System.out.println("Mouse is running...");
    }
}

class Gerbil extends Rodents {
    void run() {
        System.out.println("Gerbil is running...");
    }
}

class Hamster extends Rodents {
    void run() {
        System.out.println("Hamster is running...");
    }
}

class Wheat {
    private int refCount = 0;

    Wheat() {
        System.out.println("Wheat created.");
    }

    public void addRef() {
        refCount++;
    }

    public void delRef() {
        refCount--;
    }
    public void dispose() {
        if ( refCount == 0 )
            System.out.println("Wheat disposed!");
        else
            System.out.println("Too many refs: " + refCount);
    }
}