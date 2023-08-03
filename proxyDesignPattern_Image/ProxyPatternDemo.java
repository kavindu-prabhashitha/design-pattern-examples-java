package proxyDesignPattern_Image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image img01 = new ProxyImage("flower.jpg");
        img01.display();

        img01.display();
    }
}
