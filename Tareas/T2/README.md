Para esta tarea se describe el TDA de un token

Del cual se tiene los atributos de ID, nombre y lista de dueños.

Para empezar se tiene que aclarar que tambien se encuentra con un TDA de tipo Dueño, el cual cuenta con un ID, y el int el cual
define el total de monedas que posee. 
El dueño con ID "0" es lo que conoceremos como monedero
El monedero contendra todas las monedas las cuales aun no se les ah asignado un sueño inicial

Una de las funciones de este TDA son las siguientes: 

Crear Moneda: La cual creara la moneda virtual y automatimente agregara como dueño al mondero
Crear Propietario: El cual creara un posible dueño para alguna de estas monedas, empezara teniendo 0 monedas
Transferencia Monedero-Propietario: En este se hara la trasnferencia de la moneda que se encuentra en el monedere a algun propietario existente
Transferencia Propietario-Propietario: Este hara la transfenrencia entre dueños, verificara si es posible hacer la transferencia correspondiente validando la cantidad de monedas que cuenta el propietario que quiera transferrir.
