package Lesson12;

import java.util.Objects;

public class Coin {
    private int nominal;
    private String metall;
    private double diametr;
    private int year;

    public Coin() {

    }

    public Coin(int nominal, String metall, double diametr, int year) {
        this.nominal = nominal;
        this.metall = metall;
        this.diametr = diametr;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", metall='" + metall + '\'' +
                ", diametr=" + diametr +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (Double.compare(coin.diametr, diametr) != 0) return false;
        if (year != coin.year) return false;
        return Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + year;
        return result;
    }
}
