# Noción de Encapsulación

La encapsulación es uno de los cuatro conceptos fundamentales de la programación orientada a objetos (POO), los otros tres son **la abstracción, la herencia y el polimorfismo**. 

En Java, la encapsulación se refiere a la práctica de ocultar los detalles internos de una clase y proporcionar una interfaz pública para interactuar con la clase. Esto se logra mediante la definición de atributos (variables) y métodos (funciones) dentro de una clase con diferentes niveles de visibilidad. Los atributos pueden ser privados, lo qu
e significa que solo se pueden acceder desde dentro de la propia clase, mientras que los métodos pueden ser públicos para permitir el acceso controlado a los atributos y funcionalidades de la clase. La encapsulación ayuda a garantizar la integridad de los datos y facilita el mantenimiento y la modificación del código al permitir cambios internos en la clase sin afectar el código que la utiliza.

# Noción de Abstracción
La abstracción es otro principio clave de la POO y se refiere a la simplificación y representación de objetos del mundo real en un programa de una manera que es relevante para la tarea que se está resolviendo. En Java, se logra a través de la creación de clases y objetos que encapsulan datos y funcionalidades relacionados en una entidad única. Una clase es una abstracción de un concepto o entidad, y un objeto es una instancia concreta de esa clase. La abstracción permite a los programadores trabajar con conceptos más amplios en lugar de lidiar con todos los detalles internos. Por ejemplo, puedes tener una clase "Coche" que abstractamente representa un coche, y luego puedes crear múltiples objetos "Coche" para representar coches específicos, cada uno con sus propios atributos y comportamientos.


# Noción de Clase
En Java, una clase es un plano o una plantilla para crear objetos. Define la estructura y el comportamiento de los objetos que se crearán a partir de ella. Una clase contiene atributos (variables) que representan datos relacionados y métodos (funciones) que definen las operaciones que los objetos de esa clase pueden realizar. Las clases son la base de la programación orientada a objetos y se utilizan para modelar entidades y conceptos del mundo real en un programa. Por ejemplo, puedes tener una clase "Persona" que define atributos como nombre, edad y dirección, junto con métodos que permiten interactuar con esta información.

# Noción de Instancia
Una instancia es un objeto concreto que se crea a partir de una clase. En Java, para usar una clase y acceder a sus atributos y métodos, primero debes crear una instancia de esa clase. Cada instancia tiene su propio conjunto de datos (atributos) y puede llamar a los métodos definidos en la clase. Por ejemplo, si tienes una clase "Coche", puedes crear múltiples instancias de coches específicos, como "Coche1" y "Coche2", cada una con sus propios valores de atributos (por ejemplo, marca, modelo, color) y métodos (como acelerar y frenar) que se pueden invocar en cada instancia de coche.

# Herencia
La herencia es un concepto fundamental en la programación orientada a objetos (POO) que permite crear nuevas clases basadas en clases preexistentes. En Java, la herencia se utiliza para modelar relaciones "es un" o "es una versión especializada de" entre las clases. Una clase que hereda de otra se llama "subclase" o "clase derivada", y la clase de la que hereda se llama "superclase" o "clase base". La subclase hereda los atributos y métodos de la superclase y puede agregar sus propios atributos y métodos o incluso sobrescribir los métodos heredados para personalizar su comportamiento. La herencia promueve la reutilización de código y permite organizar y estructurar las clases de manera jerárquica.

Un ejemplo común de herencia en Java podría ser una jerarquía de clases relacionadas con vehículos. Puedes tener una superclase llamada "Vehiculo" que contiene atributos y métodos genéricos compartidos por todos los vehículos, y luego crear subclases como "Coche" y "Bicicleta" que heredan de la clase "Vehiculo" y agregan sus propios atributos y métodos específicos.

# Polimorfismo
El polimorfismo es otro principio importante de la programación orientada a objetos que permite a los objetos de diferentes clases responder de manera uniforme a mensajes similares. En Java, el polimorfismo se logra de varias maneras, pero la más común es a través de la herencia y el uso de interfaces. Cuando varias clases comparten una interfaz común o heredan de la misma superclase, puedes tratar objetos de estas clases de manera polimórfica, es decir, puedes utilizar un objeto sin conocer su tipo concreto.

El polimorfismo permite escribir código genérico que trabaja con objetos de múltiples clases relacionadas. Por ejemplo, si tienes una variedad de formas, como círculos, cuadrados y triángulos, que heredan de una superclase "Forma", puedes escribir un método que acepte una lista de "Forma" y aplicar operaciones comunes a todas ellas sin preocuparte por el tipo específico de forma. Esto hace que el código sea más flexible y extensible.

Supongamos que tienes una jerarquía de clases que representan diferentes formas geométricas, como círculos y cuadrados. Todas estas clases tienen un método llamado `calcularArea()` que calcula el área de la forma respectiva.

```java
// Clase base para formas geométricas
public abstract class Forma {
    public abstract double calcularArea();
}

// Clase para círculos
class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase para cuadrados
class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
```

Ahora puedes crear objetos de diferentes clases, como círculos y cuadrados, y tratarlos de manera polimórfica:

```java
public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Circulo(5.0);
        Forma forma2 = new Cuadrado(4.0);

        System.out.println("Área del círculo: " + forma1.calcularArea());
        System.out.println("Área del cuadrado: " + forma2.calcularArea());
    }
}
```

En este ejemplo, hemos creado dos objetos, `forma1` y `forma2`, que son de tipos diferentes (`Circulo` y `Cuadrado`), pero ambos son tratados como objetos de la clase base `Forma`. Luego, llamamos al método `calcularArea()` en cada uno de ellos, y el polimorfismo permite que se ejecute el método apropiado de la subclase (`Circulo` o `Cuadrado`) según el tipo de objeto al que se refieren.

El polimorfismo simplifica el código al permitir trabajar con objetos de clases diferentes utilizando una interfaz común, lo que facilita la extensibilidad y el mantenimiento del código.

# Constructores
Los constructores en Java son métodos especiales que se utilizan para inicializar objetos cuando se crea una instancia de una clase. Aquí tienes una explicación detallada de su función y otros aspectos importantes relacionados con los constructores en Java:

1. **Propósito de los Constructores:**
   - **Inicialización de Objetos:** Los constructores se utilizan para inicializar los atributos de un objeto cuando se crea una instancia de una clase. Esto asegura que el objeto tenga un estado inicial válido y funcional.

2. **Características de los Constructores:**
   - **Nombre Igual al de la Clase:** Un constructor tiene el mismo nombre que la clase a la que pertenece. Por ejemplo, si tienes una clase llamada "Persona," su constructor se llama "Persona."
   - **No tiene un Tipo de Retorno:** Los constructores no tienen un tipo de retorno (ni siquiera `void`). Esto los diferencia de los métodos regulares.

3. **Tipos de Constructores:**
   - **Constructor Predeterminado:** Si no defines ningún constructor en tu clase, Java proporciona automáticamente un constructor predeterminado sin argumentos. Este constructor inicializa los atributos a sus valores predeterminados (por ejemplo, 0 para enteros, `null` para objetos).
   - **Constructores Personalizados:** Puedes definir tus propios constructores personalizados en una clase, y pueden tener argumentos que permiten inicializar los atributos de la instancia de la clase con valores específicos.

4. **Sobrecarga de Constructores:**
   - Puedes tener varios constructores en una clase, siempre que tengan diferentes listas de argumentos. Esto se conoce como sobrecarga de constructores. Por ejemplo, puedes tener un constructor sin argumentos y otro con argumentos para flexibilidad en la creación de objetos.

5. **Uso de la Palabra Clave `this`:**
   - La palabra clave `this` se utiliza dentro de un constructor para hacer referencia a la instancia actual de la clase. Esto puede ser útil cuando el nombre de los parámetros del constructor coincide con el nombre de los atributos de la clase.

6. **Llamada a Otro Constructor:**
   - Puedes llamar a otro constructor de la misma clase utilizando `this(...)` como la primera instrucción en el cuerpo del constructor. Esto se llama "llamada a constructor superflua" y se utiliza para reutilizar la lógica de inicialización entre constructores.

7. **Constructor de Superclase:**
   - Cuando una clase hereda de otra, el constructor de la superclase se ejecuta antes del constructor de la subclase. Puedes llamar explícitamente al constructor de la superclase usando `super(...)`. Esto garantiza que la inicialización de la superclase se realice adecuadamente.

8. **Ejemplo de Uso:**
   Aquí tienes un ejemplo sencillo de un constructor en Java:

   ```java
   public class Persona {
       private String nombre;
       private int edad;

       // Constructor personalizado
       public Persona(String nombre, int edad) {
           this.nombre = nombre;
           this.edad = edad;
       }

       // Otros métodos y atributos de la clase...
   }
   ```

   En este ejemplo, el constructor `Persona` se utiliza para inicializar los atributos `nombre` y `edad` cuando se crea una instancia de la clase.

# Composición

La composición en Java es un concepto de la programación orientada a objetos que se refiere a la creación de objetos complejos al combinar o "componer" objetos más simples. En lugar de heredar propiedades y comportamientos de una clase base, como lo harías en la herencia, en la composición, construyes un objeto utilizando otros objetos como componentes.

La composición se basa en la idea de que un objeto puede contener referencias a otros objetos como atributos. Estos objetos a menudo se denominan "componentes" o "subobjetos". La composición permite crear objetos complejos que constan de varios componentes, cada uno de los cuales se encarga de una parte específica de la funcionalidad.

Un ejemplo común de composición en Java es la creación de una clase "Coche" que contiene objetos de las clases "Motor," "Ruedas," "Transmisión," y así sucesivamente. Cada uno de estos objetos representa una parte del coche y proporciona su funcionalidad específica. En lugar de heredar estas características de una clase base, se componen juntas para construir un coche completo.

Aquí hay un ejemplo simple en código Java que ilustra la composición:

```java
public class Motor {
    public void arrancar() {
        System.out.println("Motor arrancando...");
    }
}

public class Ruedas {
    public void girar() {
        System.out.println("Ruedas girando...");
    }
}

public class Coche {
    private Motor motor;
    private Ruedas ruedas;

    public Coche() {
        motor = new Motor();
        ruedas = new Ruedas();
    }

    public void conducir() {
        motor.arrancar();
        ruedas.girar();
        System.out.println("Coche en movimiento.");
    }
}
```

En este ejemplo, la clase "Coche" está compuesta por un "Motor" y "Ruedas" como atributos. La composición permite que el coche tenga un motor y ruedas, y puede realizar acciones como arrancar y conducir utilizando estos componentes.

La composición es útil cuando deseas construir objetos complejos a partir de partes más pequeñas y cuando la herencia no es apropiada o deseable. Proporciona una mayor flexibilidad y reutilización de código al permitir que los componentes sean modificados o reemplazados fácilmente sin afectar la clase principal.

# Patron contenedor
El patrón de diseño "Contenedor" (también conocido como el patrón de diseño "Container") no es un patrón de diseño comúnmente reconocido en la literatura de diseño de software, como lo son el Singleton, el Factory, o el Observer, por ejemplo. En cambio, es un concepto más amplio y genérico que se refiere a la idea de que un objeto puede contener o envolver otros objetos, lo que se relaciona con la composición y la estructura de datos en la programación.

Sin embargo, es importante destacar que la programación en Java y en muchos otros lenguajes de programación utiliza ampliamente el concepto de contenedores en varias formas. Los contenedores son objetos que almacenan y gestionan otros objetos, a menudo permitiendo la agregación, eliminación y acceso a los objetos contenidos. Aquí hay algunos ejemplos comunes de contenedores en Java:

- **ArrayList y Listas en General:** En Java, las listas, como ArrayList, son ejemplos de contenedores que pueden almacenar varios objetos en una estructura de datos ordenada y dinámica.

- **Mapas (HashMap, TreeMap, etc.):** Los mapas en Java son contenedores que almacenan pares clave-valor, lo que permite acceder y recuperar valores basados en claves únicas.

- **Conjuntos (HashSet, TreeSet, etc.):** Los conjuntos en Java son contenedores que almacenan elementos únicos sin duplicados.

- **Contenedores GUI:** En aplicaciones de interfaz gráfica de usuario (GUI), los elementos de la interfaz de usuario, como botones, paneles y ventanas, son contenedores que pueden contener otros elementos de interfaz de usuario.

- **Contenedores personalizados:** Los desarrolladores pueden crear sus propios contenedores personalizados que almacenan y gestionan objetos de acuerdo a las necesidades específicas de la aplicación.

# Reglas de visibilidad en Java

<table><thead><tr><th>Modificador</th><th>Accesible en la misma clase</th><th>Accesible en paquetes (package)</th><th>Accesible en subclases</th><th>Accesible en otras clases</th></tr></thead><tbody><tr><td><code>public</code></td><td>Sí</td><td>Sí</td><td>Sí</td><td>Sí</td></tr><tr><td><code>protected</code></td><td>Sí</td><td>Sí</td><td>Sí</td><td>No</td></tr><tr><td>(sin modificador)</td><td>Sí</td><td>Sí</td><td>No</td><td>No</td></tr><tr><td><code>private</code></td><td>Sí</td><td>No</td><td>No</td><td>No</td></tr></tbody></table>

# Interfaces

Las interfaces en Java son una forma de lograr la abstracción y la implementación de múltiples herencias. En términos simples, una interfaz define un conjunto de métodos que deben ser implementados por cualquier clase que la utilice. Las interfaces proporcionan un contrato que las clases deben seguir, lo que garantiza que se cumplan ciertas reglas y comportamientos. Algunos puntos clave sobre las interfaces en Java son:


- **Métodos Abstractos:** Las interfaces solo pueden contener métodos abstractos (es decir, sin implementación). Los métodos en una interfaz son, por lo tanto, implícitamente públicos y abstractos.

- **Implementación Múltiple:** Una clase en Java puede implementar múltiples interfaces. Esto permite que una clase herede comportamientos de varias fuentes diferentes.

- **No se Puede Instanciar:** Las interfaces no se pueden instanciar directamente. En cambio, se implementan mediante clases concretas que proporcionan implementaciones de los métodos definidos en la interfaz.

- **Public por Defecto:** Todos los métodos en una interfaz son públicos, por lo que las clases que implementan la interfaz deben proporcionar una implementación pública de esos métodos.