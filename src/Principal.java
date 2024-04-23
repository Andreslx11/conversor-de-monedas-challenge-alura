public class Principal {
    public static void main(String[] args) {
        ConsultarMoneda moneda = new ConsultarMoneda();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ConversorMoneda conversorMoneda = new ConversorMoneda();


        boolean continuar = true;
        while (continuar) {

            // Diespliega el menu
            interfaceUsuario.menu();

            /*
            retorna 2 valores tipo String que son codigos  ISO para indentificar
            las monedas ejemplo: "USD" dolar y "COP" peso Colombiano
            son guardados en menoria con indetificador monedaPar
             */

            Pair<String, String> monedaPar = interfaceUsuario.opcionInput();


            String salida = monedaPar.getFirst();
            if (salida == "salir") {
                continuar = false;
            } else {
                // se extrae los valores del Pair monedaPAr
                String monedaInicial = monedaPar.getFirst();
                String monedaFinal = monedaPar.getSecond();

                // hace la consulta moneda (interviene el proceso: record MonedaExchangeRateApi,
                // class ConsultarMoneda ) consume la api
                var monedaDeCambio = moneda.buscarMoneda(monedaInicial);

                // extrae lo valores de las monedas del json aninidado conversion_rates
                // que de la api
                Double monedaOrigen = monedaDeCambio.conversion_rates().get(monedaInicial);
                Double monedaDestino = monedaDeCambio.conversion_rates().get(monedaFinal);


                // hace la conversión e imprime por consola los resultado con un string informativo
                //para el usuario
                conversorMoneda.conversorMoneda(monedaDestino, monedaOrigen, monedaInicial, monedaFinal);
            }


        }

    }
}


