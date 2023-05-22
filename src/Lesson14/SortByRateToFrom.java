package Lesson14;

import java.util.Comparator;

public class SortByRateToFrom implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getAvarageRate() != o2.getAvarageRate()) {
            return Double.compare(o2.getAvarageRate(), o1.getAvarageRate());
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

        if (o1.getForums().size() != o2.getForums().size()) {
            return o2.getForums().size() - o1.getForums().size();
        }
        return 0;
    }
}
