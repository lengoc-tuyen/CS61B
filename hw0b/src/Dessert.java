public class Dessert {
    int flavor;
    int price;
    int numDesserts = 0;
    public Dessert(int flavor, int price) {
        flavor = flavor;
        price = price;
        numDesserts++;
    }
    public void printDessert() {
        System.out.println(this.flavor);
        System.out.println(this.price);
    }
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
