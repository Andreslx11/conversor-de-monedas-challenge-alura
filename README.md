# Conversor de monedas challenge Alura Latam 

  
Es un conversor de cambio monetario de divisas 
internacionales. 

  

## Tecnologías usadas: 
-java jdk 17  
-librería Gson 

  

## Api 

Consume una API exchangerate que provee 
los datos, los valores de las divisas 
su relación para la conversión. 

  

## Uso 

En un entorno de desarrollo java 
como intellej, por consola el usuario 
puede interactuar con el conversor 

  

## Funcionamiento 

Se compone de  6 clases: 

-class record MonedaExchangeRateApi  para procesar los datos del Json de la api, 
 para representar la estructura del json de ingreso desde la api. 
 De este record para la  ExchangeRateApi el json es tipo anidado 
 en el primer campo  base_code  es la clave que tiene el valor de la moneda tipo ISO 
que se esta consultado, en el segundo campo hay map para poder acceder   a los campos del  
conversion_rates  json anidado que contiene las tazas de cambio 
 representado con clave-valor 
 ejemplo { base_code: "USD" , conversion_rates: {"USD":1, "COP:3700", "BRL":2000}. 

  
 -class ConsultarMoneda para consultar la api, trasnforma el json enviado de la api 
 a un objeto class record MonedaExchangeRateAp. 

 
 -class ConversorMoneda  para realizar la operación aritmética de conversión. 
 
 
-class InterfaceUsuario consta de tres pasos despliega el menú, pone un objeto tipo 
 Scanner a la escucha y luego un switch que según la opción ingresada obtenida 
 por el scanner ejecuta un caso, cada caso retorna Pair que permite retornar dos  
 valores primer valor la moneda que va ser cambiada y segundo valor la moneda  
 a la que va ser convertida, esto valores son usados  
 valor primero su primera función se ingresado media  
 una variable en la URI para la consulta a la api de la taza de cambio para esa 
 moneda, luego va ser la clave de para clave-valor  para obtener el valor 
 numérico de relación de conversión respeto a otras monedas ejemplo un dólar por diez pesos 1 a 10, el 
 segundo valor es la clave del par clave-valor para obtener el valor numérico de su equivalencia 
 a la moneda inicial  
 ejemplo { base_code: "USD" , conversion_rates: {"USD":1, "COP:3700", "BRL":2000}. 

 -class Principal donde se ejecuta el codigo por medio de un main

