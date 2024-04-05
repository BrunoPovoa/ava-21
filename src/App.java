
public class App {
    public static void main(String[] args) {
        Dinheiro d1 = new Dinheiro(32323, 45); // R$ 32.323,45
        d1.imprimir();

        Dinheiro d2 = new Dinheiro(32323.45); // R$ 32.323,45
        d2.imprimir();

        Dinheiro d3 = new Dinheiro("32323,45"); // R$ 32.323,45
        d3.imprimir();

    }
}