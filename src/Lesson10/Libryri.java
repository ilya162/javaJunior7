package Lesson10;

import java.util.Objects;

public class Libryri {
    private String name;
    private int year;
    private String izdatelstvo;
    private int countPages;

    public Libryri() {
    }


    public Libryri(String name, int year, String izdatelstvo, int countPages) {
        this.name = name;
        this.year = year;
        this.izdatelstvo = izdatelstvo;
        this.countPages = countPages;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libryri libryri = (Libryri) o;

        if (year != libryri.year) return false;
        if (countPages != libryri.countPages) return false;
        if (!Objects.equals(name, libryri.name)) return false;
        return Objects.equals(izdatelstvo, libryri.izdatelstvo);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (izdatelstvo != null ? izdatelstvo.hashCode() : 0);
        result = 31 * result + countPages;
        return result;
    }

    @Override
    public String toString() {
        return "Libryri{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", izdatelstvo='" + izdatelstvo + '\'' +
                ", countPages=" + countPages +
                '}';
    }

    public static void getMaxLibryri(Libryri[] arr) {
        int max = 0;
        Book b = null;

        for (Libryri l : arr) {
            if (l instanceof Book) {
                if (max < ((Book) l).getCountPages()) {
                    max = ((Book) l).getCountPages();
                    b = (Book) l;
                }


            }


        }
        System.out.println(b);


    }
}


