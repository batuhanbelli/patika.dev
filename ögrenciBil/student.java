package ögrenciBil;

public class student {
    course c1;
    course c2;
    course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean ispass;

    student(String name, String stuNo, String classes, course c1, course c2, course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.ispass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void printNote() {
        System.out.println(c1.name + " Notu\t" + this.c1.note);
        System.out.println(c2.name + " Notu\t" + this.c2.note);
        System.out.println(c3.name + " Notu\t" + this.c3.note);

    }

    void ispass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (avarage >= 50) {
            System.out.println("Öğrenci Sınıfı Geçti!");
        } else {
            System.out.println("Öğrenci Sınıfta Kaldı!");
        }
        printNote();
        System.out.println(this.avarage);
    }
}
