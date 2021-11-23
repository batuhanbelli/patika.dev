package boksMaçı;

public class main {
    public static void main(String[] args) {
        fighter f1 = new fighter("Batuhan", 20, 100, 87, 30);
        fighter f2 = new fighter("Caner", 20, 100, 85, 40);

        match match = new match(f1, f2, 80, 110);
        match.run();
    }

}
