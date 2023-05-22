package Lesson8;

public class Tursutils {


    public static Ture[] sortByPrice(int price, Ture[] tures) {


        //сортировка по Стране
        //Сортирока по зведам
        //сортировка по цене и звездам
        //сортировка Цене и питанию
        //Сортировка цене и стране
        //сортровка по стране и звездам
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getPrice() <= price)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getPrice() <= price) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }


//    public static void SortByPriceandCountry(int price, String coutry, Ture[] tures) {
//        for (int i = 0; i < tures.length; i++) {
//            if (tures[i].getPrice() <= price && tures[i].getCountry() == coutry) {
//                System.out.println(tures[i]);
//            }
//        }
//    }
//
//    public static void SortByCoutryandStar(String country, int star, Ture[] tures) {
//        for (int i = 0; i < tures.length; i++) {
//            if (tures[i].getCountry() == country && tures[i].getStar() == star) {
//                System.out.println(tures[i]);
//            }
//        }
//    }
//
//
//    public static Ture[] sortByPrice2(int price, Ture[] tures) {
//
//        int count = 0;
//        for (Ture qwe : tures) {
//            if (qwe.getPrice() <= price)
//                count++;
//        }
//        if (count == 0) {
//            return null;
//        } else {
//            Ture[] res = new Ture[count];
//            int i = 0;
//            for (Ture qwe : tures) {
//                if (qwe.getPrice() <= price) {
//                    res[i] = qwe;
//                    i++;
//                }
//
//            }
//            return res;
//        }
    }

    public static Ture[] sortByCountry(String country, Ture[] tures) {
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getCountry() == country)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getCountry() == country) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }
    }

    public static Ture[] sortByStar(int star, Ture[] tures) {
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getStar() == star)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getStar() == star) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }
    }

    public static Ture[] SortByPriceandStar(int price, int star, Ture[] tures) {
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getStar() == star && qwe.getPrice() == price)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getStar() == star && qwe.getPrice() == price) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }
    }

    public static Ture[] SortByPriceandPit(int price, String pit, Ture[] tures) {
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getPrice() == price && qwe.getPit() == pit)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getPrice() == price && qwe.getPit() == pit) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }
    }

    public static Ture[] SortByPriceandCountry(int price, String country, Ture[] tures) {
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getPrice() == price && qwe.getCountry() == country)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getPrice() == price && qwe.getCountry() == country) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }
    }

    public static Ture[] SortByCoutryandStar(String country, int star,Ture[] tures) {
        int count = 0;
        for (Ture qwe : tures) {
            if (qwe.getCountry() == country && qwe.getStar() == star)
                count++;
        }
        if (count == 0) {
            return null;
        } else {
            Ture[] res = new Ture[count];
            int i = 0;
            for (Ture qwe : tures) {

                if (qwe.getCountry() == country && qwe.getStar() == star) {
                    res[i] = qwe;
                    i++;

                }
            }
            return res;
        }
    }

}



