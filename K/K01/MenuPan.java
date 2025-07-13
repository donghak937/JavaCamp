public class MenuPan {
    int num;
    String name;
    String origin;
    int price;

    public void input(int num, String name, String origin, int price) {
        this.num = num;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }

    public void printall() {
        System.out.println("================================================");
        System.out.println("num     name     origin     price");
        System.out.printf("%3d     %-7s %-9s %6d\n", num, name, origin, price);
    }
}
