package boksMaçı;

public class match {
    fighter f1;
    fighter f2;
    int minWeight;
    int maxWeight;

    match(fighter f1, fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        int x = 1;
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("====================================");
                System.out.println("ROUND " + x);
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(" ");
                System.out.println(this.f1.name + " Kalan Can " + this.f1.health);
                System.out.println(" ");
                System.out.println(this.f2.name + " Kalan can " + this.f2.health);
                x = x + 1;
            }

        } else {
            System.out.println("Sporcuların Sikletleri Uymuyor");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f2.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health <= 0) {
            System.out.println(this.f2.name + " Kazandı !");
        }
        if (this.f2.health <= 0) {
            System.out.println(this.f1.name + " Kazandı !");
        }
        return false;
    }
}
