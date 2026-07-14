# Requisitos para la Aplicación de Diario

## Inicio de Sesión
* El usuario debe dar un nombre de usuario obligatoriamente.
* El usuario puede dar una foto de perfil opcionalmente.
* El nombre debe contener únicamente letras.
* El nombre debe estar en un rango de 2 a 10 letras.
* El usuario debe agregar una contraseña si es que lo desea.
* El usuario puede agregar o eliminar la contraseña en cualquier momento.
* Para que el usuario pueda hacer un cambio en la contraseña debe cumplir con lo siguiente:
  1. Si el usuario no ingresó o no cuenta con contraseña al momento, este puede hacer los cambios necesarios sin ningún inconveniente.
  2. En caso de que el usuario cuente con una contraseña, el usuario deberá ingresarla antes de hacer un cambio.
* Cada vez que el usuario ingrese a la aplicación se le solicitará la contraseña en caso de poseer una.

## Perfil del Usuario
* El usuario solamente puede visualizar la foto de perfil y el nombre de usuario.
* En el apartado del perfil el usuario puede hacer las modificaciones a la contraseña.
* El usuario puede editar la foto de perfil y el nombre de usuario sin la necesidad de introducir la contraseña.

## Formato de Introducción de Datos
* El usuario puede agregar un título y el contenido principal.
* La fecha se agrega automáticamente.
* En caso de que el usuario no agregue un título, se tomará la fecha como título.
* El formato de la fecha será el siguiente: *20 de abril de 2026*, aplica para todo lo que conlleve una fecha.
* La fecha siempre se muestra en el apartado superior.
* Se pueden añadir fotos.

## Feed Principal (Home)
* El usuario puede visualizar lo siguiente: Título y fecha.
* El usuario puede dar un clic en cada carta (Título y fecha) para visualizar el contenido en modo lectura.
* Cada carta puede modificarse, por ello en la carta se podrá visualizar un botón que indique que se puede editar.
* Las cartas no se pueden eliminar.
* Solamente existe una carta para un día y no más.
* En el caso de las cartas del día actual, estas no mostrarán un botón de modificar ya que con solamente dar clic a la carta puedes entrar en modo editor.
* Cuando termina el día, la carta que estaba como actual pasará a tener botón de editar ya que pasaría a ser la carta del día anterior.
* El feed solamente muestra las cartas que se añadieron; en caso de que en un día el usuario no añadió ninguna carta, este no aparecerá en el feed.

## Añadir una Carta
* En el feed principal se cuenta con un botón para añadir cartas.
* Existe una carta por día, así que en caso de que el usuario dé clic varias veces al botón añadir, este mostrará la misma carta y no una nueva.
* Cada carta se guarda automáticamente, pero también se contará con un botón de guardar.
* El hecho de que se presione el botón guardar indica que se guardó la información, pero puede seguir editándose.
* Antes de crear una nueva carta, primero se verificará que haya una de ese día; si no hay, se crea una nueva, y en dado caso de que haya una, se redirige a esa carta.
