import java.text.NumberFormat;
import java.util.Locale;

class Dinheiro {

    private double centavos;

    Dinheiro(int reais, int centavos) {
        this.centavos = reais * 100 + centavos;
    }

    Dinheiro(Double reais) {
        this.centavos = reais * 100f;
    }

    Dinheiro(String reais) {
        double p1 = Integer.parseInt(reais.split(",")[0]) * 100;
        double p2 = Integer.parseInt(reais.split(",")[1]);
        this.centavos = p1 + p2;
    }

    double getReais() {
        return this.centavos / 100f;
    }

    double getCentavos() {
        return this.centavos % 100f;
    }

    void somar(Dinheiro d) {
        this.centavos += d.centavos;
    }

    private static NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    @Override // facilitei tua vida aqui, né
    public String toString() {
        return moeda.format(this.centavos / 100 + (this.centavos % 100) / 100.0);
    }

    void imprimir() { // Não é ilegal imprimir Dinheiro?
        System.out.println(this.toString());
    }
}