package Lesson14;

import java.util.ArrayList;
import java.util.Objects;

public class Forum {
    private String tema;
    private ArrayList<String> koments;

    public Forum() {
    }


    public Forum(String tema) {
        this.tema = tema;
        this.koments = new ArrayList<>();
    }

    public Forum(String tema, ArrayList<String> koments) {
        this.tema = tema;
        this.koments = koments;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<String> getKoments() {
        return koments;
    }

    public void setKoments(ArrayList<String> koments) {
        this.koments = koments;
    }

    public void setKoments(String koment) {
        this.koments.add(koment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forum forum = (Forum) o;

        if (!Objects.equals(tema, forum.tema)) return false;
        return Objects.equals(koments, forum.koments);
    }

    @Override
    public int hashCode() {
        int result = tema != null ? tema.hashCode() : 0;
        result = 31 * result + (koments != null ? koments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "tema='" + tema + '\'' +
                ", koments=" + koments +
                '}';
    }
}
