# Calculadora
Microservicio de una calculadora realizado con Spring Boot, Swagger 2 y Spring Fox.
 
La calculadora traza todos los resultados usando la librería tracer-1.0.0.jar.

#### Tecnologías

Apache Maven 3.6.0

Java openjdk 8

#### Librerías necesarias
<!-- librería de tracer -->
		<dependency>
              <groupId>io.corp.calculator</groupId>
              <artifactId>tracer</artifactId>
              <version>1.0</version>
              <scope>system</scope>
              <systemPath>${basedir}/lib/tracer-1.0.0.jar</systemPath>
            </dependency>
---

#### Cómo compilar el microservicio en local

Para construir el proyecto se utilizarán los siguientes comandos:

> mvn clean install

Este comando ejecuta:
 1. Limpiar el target del proyecto.
 2. Recogerá las librerías necesarias para el microservicio.
 3. Compilará el proyecto con las propiedades de la carpeta `src/main/resources/application.properties`

---

#### Cómo ejecutar el microservicio en local
Siguiendo los pasos anteriores, bastaría con ejecutar el comando en la carpeta raíz del proyecto:

> mvn spring-boot:run

---

#### Servicios disponibles
Una vez lanzado el microservicio se podrá acceder al API accediente a la siguiente URL:
> **local**: http://localhost:8081/swagger-ui.html

---

#### Buenas prácticas

Siempre se realizará el contrato del API antes de implementar nada y deberá ser validado por el equipo.
Para el contrato se tendrán en cuenta las siguientes consideraciones:
- Recursos: Serán las entidades sobre las que actuamos. Las acciones sobre estas entidades se realizarán con los
métodos HTTP. En inglés, minúsculas y spinal-case. Siempre nombres y nunca acciones ni verbos. URIs cortas para mejorar posicionamiento.

- Path parameters: Siempre seguidos de la entidad a la que hacen referencia. Nunca usar varios seguidos.

- Query parameters: Sólo se usarán para los métodos GET que devuelvan una lista. Su propósito sólo puede ser filtrar, paginar, expandir o similares.

Para la salida de los servicios se usará JSON, camelCase, y se incluirá siempre un objeto data que envolverá la salida de cualquier petición.

Cualquier implementación se realizará con TDD. Primero se creará el test que cubra el requisito, se lanzará el test, y se implementará lo
necesario para que pase el test (y nada más). Este proceso se repetirá hasta cubrir todos los requisitos.

Se deben respetar los objetos de las diferentes capas y nunca saltárselos ni pasar el mismo objeto por varias capas.

Se debe mapear el objeto de salida y de entrada a través de los "mappers".

Todo lo que se diseñe debe tener responsabilidad única, estar lo más desacoplado posible y estar lo más preparado para ser reutilizable.



