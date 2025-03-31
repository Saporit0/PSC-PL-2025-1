import javax.swing.JOptionPane;

public class exercicio1012 {

    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * (c * c);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        JOptionPane.showMessageDialog(null, "Triangulo = " + areaTriangulo + " | Circulo = " + areaCirculo +
                " | Trapézio = " + areaTrapezio + " | Quadrado = " + areaQuadrado + " | Retângulo = " + areaRetangulo);
    }

}
