package Lesson10;

public class Jurnal extends Libryri {
    private int number;

    public Jurnal() {

    }

    public Jurnal(String name, int year, String izdatelstvo, int number) {
        super(name, year, izdatelstvo, number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jurnal jurnal = (Jurnal) o;

        return number == jurnal.number;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Jurnal{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", izdatelstvo='" + getIzdatelstvo() + '\'' +
                "number=" + getNumber() +

                '}';
    }
}
