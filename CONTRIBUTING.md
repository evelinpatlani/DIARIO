# Guía de Contribución

Este documento define las convenciones y el flujo de trabajo que deberán seguir todos los colaboradores del proyecto. Su objetivo es mantener un código consistente, facilitar el trabajo en equipo y reducir conflictos durante el desarrollo.

---

# Objetivos

- Mantener un estilo de código uniforme.
- Organizar el desarrollo mediante GitHub.
- Facilitar la revisión del código.
- Reducir conflictos entre ramas.
- Favorecer el aprendizaje del trabajo colaborativo.

---

# Flujo de trabajo

Todo desarrollo deberá seguir el siguiente flujo:

1. Seleccionar un requisito funcional (RF) o una mejora.
2. Crear una **Issue** en GitHub.
3. Asignar la Issue a un integrante del equipo.
4. Crear una nueva rama desde `develop`.
5. Implementar la funcionalidad.
6. Realizar commits siguiendo la convención del proyecto.
7. Subir la rama al repositorio.
8. Crear un Pull Request hacia `develop`.
9. Esperar la revisión del otro integrante.
10. Realizar el Merge una vez aprobado.

---

# Estrategia de ramas

El proyecto utilizará las siguientes ramas:

| Rama | Descripción |
|-------|-------------|
| `main` | Contiene únicamente versiones estables del proyecto. |
| `develop` | Rama principal de desarrollo. |
| `feature/*` | Desarrollo de nuevas funcionalidades. |
| `fix/*` | Corrección de errores. |
| `docs/*` | Cambios relacionados con la documentación. |

---

# Convención para nombrar ramas

Las ramas deberán seguir alguno de los siguientes formatos:

```text
feature/login
feature/profile
feature/create-entry

fix/database
fix/login

docs/readme
docs/contributing
```

Los nombres deberán escribirse en minúsculas utilizando `kebab-case`.

---

# Convención para los commits

Todos los commits deberán seguir el formato de Conventional Commits.

| Prefijo | Uso |
|----------|-----|
| `feat:` | Nueva funcionalidad |
| `fix:` | Corrección de errores |
| `docs:` | Cambios en documentación |
| `refactor:` | Mejora del código sin cambiar el comportamiento |
| `style:` | Cambios de formato |
| `test:` | Pruebas |
| `chore:` | Tareas de mantenimiento |

Ejemplos:

```text
feat: agregar creación de cartas

fix: corregir validación del usuario

docs: actualizar README

refactor: separar lógica del controlador
```

---

# Convenciones de código

## Variables

Utilizar `camelCase`.

Ejemplo:

```java
userName
profileImage
currentDate
```

---

## Métodos

Utilizar `camelCase`.

Ejemplo:

```java
createEntry()
saveEntry()
deleteEntry()
```

---

## Clases

Utilizar `PascalCase`.

Ejemplo:

```java
User
EntryService
LoginController
```

---

## Interfaces

Utilizar `PascalCase`.

Ejemplo:

```java
EntryRepository
UserRepository
```

---

## Constantes

Utilizar `UPPER_SNAKE_CASE`.

Ejemplo:

```java
MAX_TITLE_LENGTH
DEFAULT_PROFILE_IMAGE
```

---

## Archivos

Utilizar `kebab-case`.

Ejemplo:

```text
login-view.fxml
profile-view.fxml
home-view.fxml
```

---

## Carpetas

Utilizar nombres completamente en minúsculas.

Ejemplo:

```text
controllers
services
repositories
models
views
```

---

## Paquetes

Utilizar nombres completamente en minúsculas.

Ejemplo:

```text
com.diario.controllers
com.diario.services
com.diario.repositories
```

---

# Organización del trabajo

Todas las funcionalidades deberán estar asociadas a una **Issue**.

Cada Issue deberá contener:

- Título.
- Descripción.
- Responsable.
- Criterios de aceptación.

Una vez creada, la Issue deberá agregarse al tablero de **GitHub Projects** para dar seguimiento a su estado.

El tablero utilizará las siguientes columnas:

- Pendiente
- En progreso
- En revisión
- Finalizado

Cada integrante será responsable de mantener actualizado el estado de las tareas que tenga asignadas.

---

# Pull Requests

Antes de crear un Pull Request se deberá verificar que:

- La funcionalidad esté terminada.
- El proyecto compile correctamente.
- No existan errores conocidos.
- El código siga las convenciones del proyecto.
- La documentación haya sido actualizada si es necesario.

---

# Revisión de código

Ningún cambio deberá integrarse a la rama `develop` sin haber sido revisado por el otro integrante del equipo.

Durante la revisión se verificará:

- Correcto funcionamiento.
- Legibilidad del código.
- Cumplimiento de las convenciones.
- Posibles mejoras.

---

# Principios del proyecto

Durante el desarrollo se seguirán los siguientes principios:

- Priorizar la claridad sobre la complejidad.
- Mantener una única responsabilidad por clase.
- Evitar la duplicación de código.
- Documentar las decisiones importantes.
- Escribir código fácil de entender y mantener.
- Mantener una comunicación constante sobre el avance del proyecto.