import java.util.Map;

/*Record para procesar los datos del Json de la api,
 *para representar la estructura del json de ingreso desde la api,
 *
 * De este record para la  ExchangeRateApi el json es tipo anidado
 * en el primer campo :base_code  es el codigo de la moneda tipo ISO
 * que se esta consultado
 *
 *En el segundo campo hay map para poder haceder a los campos del json
 * aninidado que contiene la taza cambio representadose con clave-valor
 * inicia  con la moneda consultada y luego pares clave-valor de equivalencia
 * en otras monedas
 *
 *  */
public record MonedaExchangeRateApi(String base_code, Map<String, Double> conversion_rates) {
}
