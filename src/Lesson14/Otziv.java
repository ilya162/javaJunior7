package Lesson14;

import java.util.Objects;

public class Otziv {
    private int rete;
    private String coment;

    public Otziv() {
    }

    public Otziv(int rete, String coment) {
        this.rete = rete;
        this.coment = coment;
    }

    public int getRete() {
        return rete;
    }

    public void setRete(int rete) {
        this.rete = rete;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (rete != otziv.rete) return false;
        return Objects.equals(coment, otziv.coment);
    }

    @Override
    public int hashCode() {
        int result = rete;
        result = 31 * result + (coment != null ? coment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "rete=" + rete +
                ", coment='" + coment + '\'' +
                '}';
    }

}
