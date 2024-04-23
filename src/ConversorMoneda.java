import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorMoneda {

    Scanner scanner;

    public ConversorMoneda() {
        this.scanner = new Scanner(System.in);
    }

    /*Conversor de moneda, hace una operación matematica
     * con los valores obtenidos del proceso de las clases
     * interfaceUsuario que obtiene las claves del par clave-valor
     * del json aninido conversion_rates y con eso lo valores númericos
     * para realizar la operación este conversor e imprime el resultado  */
    public void conversorMoneda(Double monedaDestino, Double monedaOrigen,
                                String monedaInicial, String monedaFinal) {
        try {
            System.out.println("Ingrese el monto a cambiar: ");
            Double cantidadACambiar = scanner.nextDouble();
            Double cambio = monedaDestino * cantidadACambiar;
            System.out.println(" - Su cambio es: " + cambio + " " + monedaFinal + "\n"
                    + " - la taza fue  de " + monedaOrigen + " " + monedaInicial +
                    " = " + monedaDestino + " " + monedaFinal);
        } catch (InputMismatchException e) {
            System.out.println("Error ingrese el monto en números por favor");
            scanner.close();

        }
    }


}

