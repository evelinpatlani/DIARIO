# Diario

## Descripción

Diario es una aplicación de escritorio desarrollada en Java que permite a los usuarios registrar y consultar sus experiencias diarias de forma sencilla y organizada. Su propósito es ofrecer una alternativa digital al diario tradicional en papel, facilitando el almacenamiento y la gestión de las entradas desde una computadora.

Además del desarrollo de la aplicación, este proyecto tiene como objetivo servir como práctica para aprender el trabajo colaborativo utilizando Git y GitHub, aplicando un flujo de trabajo basado en ramas, Issues y GitHub Projects.

---

## Objetivos

- Desarrollar una aplicación de escritorio utilizando Java y JavaFX.
- Implementar una arquitectura organizada y mantenible.
- Aplicar buenas prácticas de programación.
- Aprender a trabajar de forma colaborativa mediante Git y GitHub.
- Gestionar el desarrollo utilizando GitHub Issues y GitHub Projects.

---

## Tecnologías

### Desarrollo

- Java 25
- JavaFX 25
- SQLite

### Herramientas

- Git
- GitHub
- IntelliJ IDEA

---

## Requisitos

Los requisitos del proyecto se clasifican de la siguiente manera:

- **RF:** Requisito Funcional.
- **RNF:** Requisito No Funcional.

### Requisitos Funcionales

#### RF-01 Gestión del usuario

Este módulo permite registrar y administrar la información básica del usuario para acceder a la aplicación.

- El usuario debe proporcionar un nombre de usuario obligatorio.
- El usuario puede agregar una fotografía de perfil de forma opcional.
- El nombre de usuario solo puede contener letras.
- El nombre de usuario debe tener una longitud entre 2 y 10 caracteres.
- El usuario puede establecer una contraseña de forma opcional.
- El usuario puede agregar o eliminar la contraseña en cualquier momento.
- Si el usuario no tiene una contraseña registrada, podrá establecerla o modificarla sin restricciones.
- Si el usuario ya tiene una contraseña registrada, deberá ingresarla antes de realizar cualquier modificación.
- Cada vez que el usuario inicie la aplicación y tenga una contraseña registrada, deberá introducirla para acceder.

---

#### RF-02 Perfil del usuario

Este módulo permite consultar y modificar la información del perfil del usuario.

- El perfil únicamente mostrará la fotografía y el nombre del usuario.
- El usuario podrá modificar su contraseña desde el apartado de perfil.
- El usuario podrá cambiar su fotografía y nombre de usuario sin necesidad de ingresar la contraseña.

---

#### RF-03 Gestión de cartas

Este módulo permite crear y administrar las cartas correspondientes al diario.

- El usuario puede agregar un título y el contenido principal.
- La fecha se asignará automáticamente al momento de crear la carta.
- Si el usuario no proporciona un título, la fecha será utilizada como título.
- El formato de la fecha será: **20 de abril de 2026**.
- La fecha siempre se mostrará en la parte superior de la carta.
- El usuario podrá agregar fotografías a la carta.
- Solo podrá existir una carta por día.
- Cada carta se guardará automáticamente.
- La aplicación dispondrá de un botón para guardar manualmente la carta.
- Presionar el botón **Guardar** confirmará que la información fue almacenada, sin impedir que la carta continúe siendo editada.

---

#### RF-04 Feed principal

Este módulo permite visualizar y acceder a todas las cartas registradas.

- Cada carta mostrará únicamente el título y la fecha.
- El usuario podrá seleccionar una carta para visualizar su contenido en modo lectura.
- Las cartas podrán modificarse mediante un botón de edición.
- Las cartas no podrán eliminarse.
- La carta correspondiente al día actual se abrirá directamente en modo edición.
- Cuando termine el día, la carta pasará automáticamente al historial y mostrará el botón de edición.
- El feed únicamente mostrará los días que contengan una carta registrada.

---

#### RF-05 Creación de cartas

Este módulo controla la creación de nuevas cartas.

- El feed principal dispondrá de un botón para crear una nueva carta.
- Antes de crear una carta, el sistema verificará si ya existe una correspondiente al día actual.
- Si la carta ya existe, el usuario será redirigido a ella.
- Si la carta no existe, el sistema creará una nueva.

---

### Requisitos No Funcionales

#### RNF-01 Compatibilidad

- La aplicación deberá ejecutarse en sistemas operativos Windows.

---

#### RNF-02 Persistencia

- Toda la información de la aplicación deberá almacenarse utilizando SQLite.

---

#### RNF-03 Arquitectura

- El proyecto deberá seguir una arquitectura en capas para separar la interfaz, la lógica de negocio y el acceso a los datos.

---

#### RNF-04 Mantenibilidad

- Todo el código deberá seguir las convenciones establecidas en el archivo `CONTRIBUTING.md`.

---

#### RNF-05 Seguridad

- Las contraseñas nunca deberán almacenarse en texto plano.

---

#### RNF-06 Usabilidad

- La interfaz deberá mantener un diseño uniforme y consistente en todas las ventanas de la aplicación.

---

#### RNF-07 Rendimiento

- Las operaciones principales de la aplicación deberán responder de forma fluida y sin retrasos perceptibles para el usuario.

---

#### RNF-08 Escalabilidad

- La estructura del proyecto deberá facilitar la incorporación de nuevas funcionalidades sin requerir modificaciones significativas en los módulos existentes.

---

#### RNF-09 Calidad del código

- Todo el código deberá compilar correctamente antes de integrarse a la rama principal de desarrollo.

---

#### RNF-10 Colaboración

- El desarrollo del proyecto se realizará utilizando GitHub como plataforma de colaboración mediante ramas, Issues, Pull Requests y GitHub Projects.

---

## Arquitectura

La aplicación seguirá una arquitectura en capas. Cada capa tendrá una responsabilidad específica con el objetivo de mantener el código organizado, facilitar el mantenimiento y evitar que una misma clase tenga múltiples responsabilidades.

### Capa de Presentación (UI)

Es la encargada de mostrar la interfaz al usuario mediante JavaFX.

**Responsabilidades**

- Mostrar ventanas.
- Mostrar botones.
- Mostrar listas y formularios.
- Recibir las acciones del usuario.

**Ejemplo**

Cuando el usuario presiona el botón **Guardar**, la interfaz detecta el evento y envía la información al controlador.

---

### Capa de Controladores (Controller)

Actúa como intermediaria entre la interfaz y la lógica del sistema.

**Responsabilidades**

- Recibir eventos de la interfaz.
- Obtener la información ingresada por el usuario.
- Comunicarse con la capa de servicios.

**Ejemplo**

El controlador obtiene el título y contenido de la carta y solicita al servicio que procese la información.

---

### Capa de Servicios (Service)

Contiene toda la lógica de negocio de la aplicación.

**Responsabilidades**

- Validar reglas del negocio.
- Procesar información.
- Coordinar el acceso a los datos.

**Ejemplo**

Antes de crear una nueva carta, el servicio verifica si ya existe una correspondiente al día actual.

- Si existe, devuelve esa carta.
- Si no existe, crea una nueva.

---

### Capa de Persistencia (Repository / DAO)

Se encarga exclusivamente de la comunicación con la base de datos.

**Responsabilidades**

- Guardar información.
- Consultar información.
- Actualizar registros.

**Ejemplo**

Guardar una nueva carta o recuperar todas las cartas almacenadas en SQLite.

---

### Base de Datos

Almacena toda la información persistente de la aplicación utilizando SQLite.

**Responsabilidades**

- Usuarios.
- Cartas.
- Fotografías (mediante rutas de acceso).
- Configuración de la aplicación.

---

## Estructura del proyecto

> Ya cree las carpetas necesarias para comenzar a trabajar.

---

## Ejecución

La aplicación podrá ejecutarse desde la clase `Launcher.java`.

---

## Estado del proyecto

🟡 Fase de documentación.
