import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {


        Ejercicio ejercicio = new Ejercicio();

        int opcionElegida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Una Operacion a Realizar:" + "\n1.SUMA"+ "\n2.RESTA" + "\n3.MULTIPLICACION" +"\n4.DIVISION"));
        double num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
       
        double num2;
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));

        double resultadoOperacion = ejercicio.CalcularResultadoOperacion(num1, num2, opcionElegida);
        JOptionPane.showMessageDialog(null, "El resultado de la Operacion es : " + resultadoOperacion);


    }

}
