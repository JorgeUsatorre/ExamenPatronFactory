# Patron Factory

El patrón Factory es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán.

# Explicación del nuevo metodo de transporte 

En este ejercicio teniamos unicamente dos metodos de transportes que eran Camiones y Bicicletas que estan situados en la rama main. 
Posteriormente nos piden crear un nuevo metodo de transporte Barco. Este lo crearemos en una clase diferente llamada barco,
esta clase la crearemos con el comando "git branch barco" una vez tenemos la nueva rama hacemos un "git checkout barco" para situarnos
en la rama barco, una vez en esta rama creamos una nueva clase Barco similar a las anteriores clases de Camiones y Bicicletas. 
Esta clase va a implementar la interfaz ITransportes. Cuando todo este listo implementaremos en el switch de la clase main la opcion Barco 
con su nuevo objeto creado en la interfaz ITransportes.

## Explicación del programa 

Para este necesitamos saber que tipo de transporte se va a usar, ademas necesitamos saber el codigo postal, las dimensiones y el peso del paquete. Para calcular el coste de envio necesitamos sacar la diferencia de los codigos postales.




