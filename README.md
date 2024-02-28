### Middleware

Este proyecto de middleware desarrollado en Spring Boot proporciona una solución eficiente para publicar un backend que admite certificados SSL y conectarse con un backend que carece de la capacidad de soportar SSL. Esta solución permite la comunicación segura entre sistemas, incluso cuando uno de ellos no es compatible con SSL.

#### Funcionalidades clave:
- **SSL Gateway**: Actúa como intermediario entre el backend que requiere SSL y el backend que no admite SSL, proporcionando una capa de seguridad para la comunicación.
- **Configuración flexible**: Permite configurar fácilmente los certificados SSL y las rutas de comunicación entre los backends.
- **Gestión de errores**: Maneja de manera efectiva posibles errores de comunicación y SSL para garantizar una experiencia robusta.

#### Requisitos previos:
- Java Development Kit (JDK) 8 o superior.
- Maven para la gestión de dependencias y compilación del proyecto.

#### Configuración:
1. Clona el repositorio desde GitHub:

   ```
   git clone https://github.com/alexVma/middleware-siim.git
   ```

2. Importa el proyecto en tu IDE preferido.

3. Configura los certificados SSL necesarios para tu backend seguro.

4. Ajusta la configuración del middleware en el archivo `application.properties` según las necesidades de tu entorno.

#### Uso:
1. Compila el proyecto utilizando Maven:

   ```
   mvn clean install
   ```

2. Ejecuta la aplicación Spring Boot:

   ```
   mvn spring-boot:run
   ```

3. La aplicación estará disponible en la URL especificada en la configuración. Puedes acceder a ella para comenzar a utilizar el middleware y conectar tus backends de manera segura.
