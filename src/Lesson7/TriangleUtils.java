package Lesson7;

public  class TriangleUtils {


    private int Fa;
    private int Fb;
    private int Fc;
    double S;
    double P;
   String vid;


    public String  Vidtreug(String treug) {
        treug = vid;


        int a = Fa;
        int b = Fb;
        int c = Fc;


        String ravnobedrennii = "Равнобедренный треугольник";
        String ravnostoronnii = "Равносторонний треугольник";
        String raznostoronnii = "Разносторонний треугольник";
        String nevozmozhnii = "Невозможный треугольник";
        if (a == b && b != c ||
                a == c && c != b ||
                c == b && b != a) {
            return "ravnobedrennii";
        } else if (a == b && b == c && c == a) {
            return "ravnostoronnii";

            } else if (a != b && b != c && c != a) {
                return "raznostoronnii";

            } else {
                return "nevozmozhnii";

            }
        }

    public void setFa(int a) {
        Fa = a;

    }

    public void setFb(int b) {
        Fb = b;

    }

    public void setFc(int c) {
        Fc = c;

    }

    public int getFa() {
        return Fa;
    }

    public int getFb() {
        return Fb;
    }

    public int getFc() {
        return Fc;

    }

    public double getP() {
        P = Fa + Fb + Fc;
        return P;
    }

    public double getS() {
        int p, x;
        p = (int) (P / 2);
        x = p * (p - Fa) * (p - Fb) * (p - Fc);
        S = Math.sqrt(x);
        return S;
    }

}



