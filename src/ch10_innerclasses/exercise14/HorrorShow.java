package ch10_innerclasses.exercise14;
//Exercise 14: (1) Modify interfaces/HorrorShow.java to implement DangerousMonster and Vampire using anonymous classes.

interface Monster {
    void menace();
}
interface DangerousMonster extends Monster {
    void destroy();
}
interface Lethal {
    void kill();
}
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}
public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            public void menace() {}
            public void destroy() {}
        };
        u(barney);
        v(barney);
        Vampire vlad = new Vampire() {
            public void menace() {}
            public void destroy() {}
            public void kill() {}
            public void drinkBlood() {}
        };
        u(vlad);
        v(vlad);
        w(vlad);
    }
}