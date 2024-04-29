Descripción

Este componente nos permite hacer uso de opciones múltiples opciones. Fue pensado para aplicaciones que buscan mejorar su interfaz y diseño, esta implementado en java Swing, puede ser manejado a la conveniencia.
Este compoenente esta desarrollado en clases MEnuPlegable y Panel que hace que nuestra programación y uso sea mas eficiente y rápido.
Usos
Selección de opciones: Son útiles cuando hay varias opciones entre las que elegir y se desea conservar espacio en la pantalla. Por ejemplo, en formularios en línea, pueden usarse para seleccionar el país, el estado o la fecha de nacimiento.
Navegación: En aplicaciones web o sitios, los menús desplegables se pueden utilizar para la navegación, proporcionando categorías o secciones que el usuario puede explorar.
Configuración: En aplicaciones y sistemas, pueden usarse para permitir que los usuarios personalicen su experiencia, como seleccionar preferencias de idioma o ajustes de visualización.
Filtrado y búsqueda: En aplicaciones que manejan grandes cantidades de datos, los menús desplegables pueden utilizarse para filtrar los resultados según ciertos criterios, como precio, fecha o categoría.
Control de formulario: Al construir interfaces de usuario para formularios complejos, los menús desplegables pueden ayudar a organizar y simplificar la entrada de datos, especialmente cuando se trata de selecciones de opciones predefinidas.
Características
Son compactos y hacen que nuestras interfaces sean más visualmente llamativas.
Interactivas al momento de desplegar y mostrar todo el contenido.
Fácil manipulación en paneles y ajuste en ventanas.
Requisitos
Java JDK 8 o superior.
IDE con soporte para Swing si se desea visualizar el componente gráficamente (por ejemplo, NetBeans o IntelliJ IDEA).
API

MenuPlegableComponent
La clase que se encarga de hacer todas las operaciones y que el menú sea desplegado es la de MenuPlegableComponent que es la que contiene todos los label que se muestran en el panel.
Constructor
MenuPlegableComponent()
Que se encarga de inicializar la animación y contiene todas las configuraciones de tamaño e imágenes y color de panel.
 AnimacionPanel(): Crea una nueva instancia de la clase
Que se inicializa para ajustar el tamaño de las imagenes
Métodos
LabelClickListener
Al momento de clicar despliega y repliega el panel
Void initLabel()
Agrega las rutas de las imágenes que se quieran poner en el panel
void setBackground(): este método asegura que cuando se establezca el color de fondo del componente, también se establezca el color de fondo de los JLabels asociados y se garantice que se muestre correctamente.
AnimacionPanel
Campos
final Timer timer; Temporizador de panel
final int delay = 10  retraso del temporizador en milisegundos
final int stepSize = 10 Define la cantidad de píxeles que se moverá el componente en cada paso de la animación.
JComponent firstComponent; Representan los componentes de la interfaz de usuario que se animarán.
JComponent secondComponent;
int endPositionFirst; Representan las posiciones finales a las que se moverán los componentes.
int endPositionSecond;
boolean toRight; Indica la dirección de la animación. Si es verdadero, la animación se moverá hacia la derecha; de lo contrario, se moverá hacia la izquierda.
Constructor
AnimacionPanel()
inicializa el temporizador pero no lo inicia todavía. Configura un ActionListener para escuchar los eventos del temporizador, que serán manejados por una clase interna llamada AnimationListener.
Métodos
animar(): se encarga de configurar los parámetros necesarios para la animación y luego iniciarla mediante el reinicio del temporizador.
AnimationListener(): controla la animación de los componentes desplazándolos gradualmente en la dirección especificada hasta que alcancen sus posiciones finales.
int ActualizarPosicion(): calcula y devuelve la nueva posición actual del componente en la animación, asegurándose de que no se mueva má
