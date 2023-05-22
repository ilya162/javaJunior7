package Lesson8;

import java.util.Objects;

public class Ture {
    private int price;
    private String country;
    private int star;
    private String transfer;
    private String pit;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCountry(String country) {

        this.country = country;
    }


    public void setStar(int star) {

        this.star = star;
    }

    public void setTransfer(String transfer) {

        this.transfer = transfer;
    }

    public void setPit(String pit) {
        this.pit = pit;

    }

    public int getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }


    public int getStar() {
        return star;
    }

    public String getTransfer(String transfer) {
        return transfer;

    }

    public String getPit() {
        return pit;

    }

    public Ture() {

    }

    public Ture(int price, String country, int star, String transfer, String pit) {
        this.price = price;
        this.country = country;
        this.star = star;
        this.transfer = transfer;
        this.pit = pit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ture ture = (Ture) o;

        if (price != ture.price) return false;
        if (star != ture.star) return false;
        if (!Objects.equals(country, ture.country)) return false;
        if (!Objects.equals(transfer, ture.transfer)) return false;
        return Objects.equals(pit, ture.pit);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + star;
        result = 31 * result + (transfer != null ? transfer.hashCode() : 0);
        result = 31 * result + (pit != null ? pit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Òóð{" +
                "price=" + price +
                ", country='" + country + '\'' +
                ", star=" + star +
                ", transfer='" + transfer + '\'' +
                ", pit='" + pit + '\'' +
                '}';
    }
}

