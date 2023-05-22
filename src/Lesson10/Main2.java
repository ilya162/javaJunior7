package Lesson10;

public class Main2 {
    public static void main(String[] args) {
        Book book = new Book("Moby dik ", 1950, "Mayak ", 567, "Dami");
        Book book1 = new Book("Alladin ", 1987, "Russia ", 383, "Ilya ");
        Book book2 = new Book("Kolobok ", 1963, "Mayak ", 15, "Narodnaya");
        Book book3 = new Book("Master i Margarita ", 1971, "Moskva ", 438, "Bulgakov");
        Jurnal jurnal = new Jurnal("Veselii sadovnik ", 2003, "Ogorod ", 11);
        Jurnal jurnal1 = new Jurnal("Cosmopolitan ", 2010, "ADF ", 60);
        Jurnal jurnal2 = new Jurnal("Mens Health ", 2015, "89 ", 55);
        Jurnal jurnal3 = new Jurnal("Liza ", 2009, "Liza+ ", 11);
        Libryri[] libryris = new Libryri[8];
        libryris[0] = book;
        libryris[1] = book1;
        libryris[2] = book2;
        libryris[3] = book3;
        libryris[4] = jurnal;
        libryris[5] = jurnal1;
        libryris[6] = jurnal2;
        libryris[7] = jurnal3;
        for (Libryri l : libryris) {
            System.out.println(l.toString());


        }
        Libryri.getMaxLibryri(libryris);
        System.out.println();



    }
}

