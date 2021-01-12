# Animales
La clase Animal será la representación abstracta de los objetos de tipo Animal. De los Animales queremos mantener la siguiente información:

    Fecha de nacimiento, un objeto de tipo LocalDate
    Nombre
    Tipo, que puede ser: "gato", "perro", "lagarto", "cobaya", "periquito"
    Peso en gramos
    Estado, que podrá ser: "comiendo", "durmiendo", "despierto/reposo" o "jugando".

El estado y el tipo lo puedes implementar como quieras, usando String, enteros, etc.

La clase tendrá un constructor por defecto, que creará un gato con fecha de nacimiento según la fecha actual del sistema, de nombre "Turrón", 
peso 2200 gramos y durmiendo. Además tendrá un constructor parametrizado, recibiendo un objeto LocalDate para indicar la fecha de nacimiento, el 
nombre del animal, el tipo, el peso y el estado en el que estará. La clase Animal implementará un contador de instancias en los respectivos 
constructores. Los atributos de esta clase estarán encapsulados.

Otros métodos de la clase mascota:

comer(double cantidadGramos). Incrementará el peso del animal, aumentándolo según el parámetro indicado en cantidad. Este método no devuelve nada. Si 
el parámetro es negativo se considera como positivo.

dormir(), que pone a dormir al animal.

despertar(), que despierta al bicho.

descansar(), que pone al animal en reposo.

jugar(int cantidadMinutos), este método le indica a la mascota que está jugando y recibe como parámetro la cantidad de minutos que estará el 
animal jugando. Por cada 30 minutos completos de juego, el peso del animal se verá reducido en 20 gr. Si la cantidad es menor de 30 minutos, se 
reducirá en 10 gramos. Si la cantidad de minutos es negativa se considera positiva. Un animal no puede jugar más de 180 minutos, por lo tanto si se 
supera esa cantidad se lanzará una excepción de tipo IllegalArgument.
toString(), que devolverá una cadena con la información actualizada de la mascota.
Animal clonar(Animal pet), método de clase para clonar Animales, que recibe el objeto Animal que queremos clonar, llamado pet,  y devuelve el objeto 
con la copia de pet. Ten en cuenta que este método crea un objeto nuevo. Controla excepciones NullPointer en este método.

getContadorInstancias(), método de clase que devolverá el número de objetos creados en el sistema.

Dentro del paquete incluye la clase Persona. La información relevante de las personas es: Nombre y Edad

Esta clase tendrá un constructor parametrizado y los atributos estarán encapsulados. 

Además, un objeto Persona tiene las siguientes responsabilidades:

llamar (Animal pet). Este método hace que la persona en cuestión despierte al animal pet.

alimentar (Animal pet, double cantidadGramos). En este caso la persona alimenta a pet con una cantidad de comida.

jugar(Animal pet, int cantidadMinutos). La persona juega con pet la cantidad de minutos indicada en el parámetro. Este método debe controlar 
la excepción IllegalArgument, de forma que si la excepción se presenta entonces debe jugar con el animal la cantidad máxima de minutos.

Incluye otro paquete, con otra clase llamada Prueba que contenga el método main(). Dentro de este método:

Crea dos objetos animal (a1 y a2), uno por defecto y otro con los valores que tú quieras. 
Crea dos personas (p1 y p2) con los valores que tú quieras.
Imprime por consola los valores de a1 y a2 usando toString.
Imprime por consola el valor del contador de instancias.
Clona al animal a2 en un nuevo animal a3.
Imprime por consola el valor del contador de instancias.
p1 debe despertar a todos los animales.
p2 juega con a2 durante 120 minutos.
p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1.
p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.
