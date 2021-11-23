package ögrenciBil;

public class main {
    public static void main(String[] args) {

        teacher t1 = new teacher("Ahmet Hoca", "TRH", "0538");
        teacher t2 = new teacher("Ali Hoca", "FZK", "0530");
        teacher t3 = new teacher("Ayşe Hoca", "MAT", "0536");

        course tarih = new course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        course fizik = new course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        course matematik = new course("Matematik", "103", "MAT");
        matematik.addTeacher(t3);

        student s1 = new student("Ali", "123", "1", tarih, fizik, matematik);
        s1.addBulkExamNote(100, 50, 70);
        s1.ispass();
    }

}
