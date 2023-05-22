package Lesson14;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private double price;
    private String opis;
    private ArrayList<Otziv> otzivs;
    private ArrayList<Forum> forums;

    public Tovar() {
    }

    public Tovar(String name, double price, String opis) {
        this.name = name;
        this.price = price;
        this.opis = opis;
        this.otzivs = new ArrayList<>();
        this.forums = new ArrayList<>();
    }

    public Tovar(String name, double price, String opis, ArrayList<Otziv> otzivs, ArrayList<Forum> forums) {
        this.name = name;
        this.price = price;
        this.opis = opis;
        this.otzivs = otzivs;
        this.forums = forums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public void setOtzivs(Otziv otzivs) {
        this.otzivs.add(otzivs);
    }

    public ArrayList<Forum> getForums() {
        return forums;
    }

    public void setForums(ArrayList<Forum> forums) {
        this.forums = forums;
    }

    public void setForums(Forum forum) {
        this.forums.add(forum);
    }

    public double getAvarageRate() {
        if (otzivs.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Otziv otziv : otzivs) {
            sum += otziv.getRete();

        }
        return sum / otzivs.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (Double.compare(tovar.price, price) != 0) return false;
        if (!Objects.equals(name, tovar.name)) return false;
        if (!Objects.equals(opis, tovar.opis)) return false;
        if (!Objects.equals(otzivs, tovar.otzivs)) return false;
        return Objects.equals(forums, tovar.forums);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (forums != null ? forums.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", opis='" + opis + '\'' +
                ", otzivs=" + otzivs +
                ", forums=" + forums +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {// this текущий товар. о - приходящий товар.
        if (this.getPrice() != o.getPrice()) {
            return Double.compare(this.getPrice(), o.getPrice());
        }
        if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        if (!this.getOpis().equals(o.getOpis())) {
            return this.getOpis().compareTo(o.getOpis());
        }
        if (this.getAvarageRate() != o.getAvarageRate()) {
            return Double.compare(this.getAvarageRate(), o.getAvarageRate());
        }
        if (this.getForums().size() != o.getForums().size()) {
            return o.getForums().size() - this.getForums().size();
        }

        return 0;
    }

    public static TreeSet<Tovar> sortByPriceToFrom(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>(new SortByPriceToFrom());
        res.addAll(tovars);
        return res;
    }

    public static TreeSet<Tovar> SortByRateToFrom(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>(new SortByRateToFrom());
        res.addAll(tovars);
        return res;
    }

    public static TreeSet<Tovar> SortByUnderDiscussion(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o1.getForums().size() != o2.getForums().size()) {
                return o2.getForums().size() - o1.getForums().size();
            }
            if (!o1.getName().equals(o2.getName())) {
                return o2.getName().compareTo(o1.getName());
            }

            if (o1.getPrice() != o2.getPrice()) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }

            if (!o1.getOpis().equals(o2.getOpis())) {
                return o2.getOpis().compareTo(o1.getOpis());
            }

            if (o1.getAvarageRate() != o2.getAvarageRate()) {
                return Double.compare(o2.getAvarageRate(), o1.getAvarageRate());
            }

            return 0;
        });
        res.addAll(tovars);
        return res;
    }
}




