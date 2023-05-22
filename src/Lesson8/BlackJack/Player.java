package Lesson8.BlackJack;


import java.util.Arrays;

public class Player {
    private String name;
    private Cart[] carts = new Cart[10];

    public Player() {
    }

    public Player(String name, Cart[] carts) {
        this.name = name;
        this.carts = carts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }

    //carts[0] = tyz
    //carts[1] = dama

    public void setCarts(Cart cart) {
        for (int i = 0; i < this.carts.length; i++) {
            if (this.carts[i] == null) {
                this.carts[i] = cart;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (name != null ? !name.equals(player.name) : player.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(carts, player.carts);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(carts);
        return result;
    }

    @Override
    public String toString() {
        return "Deller{" +
                "name='" + name + '\'' +
                ", carts=" + Arrays.toString(carts) +
                '}';
    }

    public void printCart() {
        for (Cart cart : carts) {
            if (cart != null)
                System.out.println(cart);
        }
    }

    public int getValue() {
        int res = 0;
        for (Cart cart : carts) {
            if (cart != null) {
                res += cart.getValue();
            }
        }
        return res;
    }

}