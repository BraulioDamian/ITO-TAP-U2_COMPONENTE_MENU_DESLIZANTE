<h1> COMPONENTE MENU DESLIZANTE</h1>

### Tecnologia 
![JavaScript](https://img.shields.io/badge/-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

<H2>Descripción </H2>

 Este componente nos permite hacer uso de opciones múltiples opciones. Fue pensado para aplicaciones que buscan mejorar su interfaz y diseño, esta implementado en java Swing, puede ser manejado a la conveniencia.
Esta desarrollado en clases MEnuPlegable y Panel que hace que nuestra programación y uso sea mas eficiente y rápido.

<H3> Usos </H3>

**Selección de opciones:** Son útiles cuando hay varias opciones entre las que elegir y se desea conservar espacio en la pantalla. Por ejemplo, en formularios en línea, pueden usarse para seleccionar el país, el estado o la fecha de nacimiento.

**Navegación:** En aplicaciones web o sitios, los menús desplegables se pueden utilizar para la navegación, proporcionando categorías o secciones que el usuario puede explorar.

**Configuración:** En aplicaciones y sistemas, pueden usarse para permitir que los usuarios personalicen su experiencia, como seleccionar preferencias de idioma o ajustes de visualización.

**Filtrado y búsqueda:** En aplicaciones que manejan grandes cantidades de datos, los menús desplegables pueden utilizarse para filtrar los resultados según ciertos criterios, como precio, fecha o categoría.

**Control de formulario:** Al construir interfaces de usuario para formularios complejos, los menús desplegables pueden ayudar a organizar y simplificar la entrada de datos, especialmente cuando se trata de selecciones de opciones predefinidas.

## Características

- Son compactos y hacen que nuestras interfaces sean más visualmente llamativas.
- Interactivas al momento de desplegar y mostrar todo el contenido.
- Fácil manipulación en paneles y ajuste en ventanas.

## Requisitos

- Java JDK 8 o superior.
- IDE con soporte para Swing si se desea visualizar el componente gráficamente (por ejemplo, NetBeans o IntelliJ IDEA).

## API

### MenuPlegableComponent
La clase que se encarga de hacer todas las operaciones y que el menú sea desplegado es la de MenuPlegableComponent que es la que contiene todos los label que se muestran en el panel.

#### Constructor
**`MenuPlegableComponent()`:** Que se encarga de inicializar la animación y contiene todas las configuraciones de tamaño e imágenes y color de panel.

**`AnimacionPanel()`:** Crea una nueva instancia de la clase que se inicializa para ajustar el tamaño de las imagenes

#### Métodos


**`LabelClickListener`:** Al momento de clicar despliega y repliega el panel

**`Void initLabel()`:** Agrega las rutas de las imágenes que se quieran poner en el panel

**`void setBackground()`:** este método asegura que cuando se establezca el color de fondo del componente, también se establezca el color de fondo de los JLabels asociados y se garantice que se muestre correctamente.

### AnimacionPanel
Gestiona la animación del menú desplegable.

#### Campos

- `final Timer timer;`: Temporizador para la animación.
- `final int delay = 10;`: Retraso del temporizador en milisegundos.
- `final int stepSize = 10;`: Cantidad de píxeles que se moverá el componente por paso.
- `JComponent firstComponent;`: Primer componente de la animación.
- `JComponent secondComponent;`: Segundo componente de la animación.
- `int endPositionFirst;`: Posición final del primer componente.
- `int endPositionSecond;`: Posición final del segundo componente.
- `boolean toRight;`: Dirección de la animación (hacia la derecha si es verdadero).

#### Constructor

**`AnimacionPanel()`:** Inicializa el temporizador pero no lo inicia todavía. Configura un ActionListener para escuchar los eventos del temporizador, que serán manejados por una clase interna llamada `AnimationListener`.

#### Métodos

**`animar()`:** Se encarga de configurar los parámetros necesarios para la animación y luego iniciarla mediante el reinicio del temporizador.

**`AnimationListener()`:** Controla la animación de los componentes desplazándolos gradualmente en la dirección especificada hasta que alcancen sus posiciones finales.

**`int ActualizarPosicion()`:** Calcula y devuelve la nueva posición actual del componente en la animación, asegurándose de que no se mueva más allá de su posición final.

## Instalación
1.- Si solo deseas Usar el componente entra a la carpeta Menu Desplegable y en la carpeta dist encontraras el archivo jar ya compilado para usarse directamente en tu proyecto
![image](https://github.com/BraulioDamian/ITO-TAP-U2_COMPONENTE_MENU_DESLIZANTE/assets/142832691/0c18a4a8-7da6-449d-aef7-ca10b93e3c87)

2.- O importa el proyecto en tu IDE si deseas hacer modificaiones o cambios.

![image](https://github.com/BraulioDamian/ITO-TAP-U2_COMPONENTE_MENU_DESLIZANTE/assets/142832691/772500d9-bd72-4588-9a2f-4df71d1e536f)

## Uso

1.- Crear un nuevo proyecto y despues agregar este componente a la paleta (Tools -> Palette -> Swing/AWT Components)

![image](https://github.com/BraulioDamian/ITO-TAP-U2_COMPONENTE_MENU_DESLIZANTE/assets/142832691/c8aaac1f-acdb-4ee4-97f1-9ad425fd9ba0)

2.- puedes agregar una carpeta especifica para agregar el componente y despues en añadir desde un JAR

3.- Buscas la ruta donde se descargo el .jar

![image](https://github.com/BraulioDamian/ITO-TAP-U2_COMPONENTE_MENU_DESLIZANTE/assets/142832691/ca95dee1-c90b-44f0-9c90-739564f470a6)

4.- Seleccionar MenuPlegableComponent y se agrega a la carpeta especifica donde se desea añadir este componente 

![image](https://github.com/BraulioDamian/ITO-TAP-U2_COMPONENTE_MENU_DESLIZANTE/assets/142832691/844b251e-6905-4c0f-8c96-0028e7577276)

5.- Ahora solo creamos un nuevo frame y podriamos agregar el componente dentro de un Panel, para que la animacion funcione el componente debe estar siempre pegado a  un lado del panel o del frame ya que trabaja con pociciones en el eje X.

![image](https://github.com/BraulioDamian/ITO-TAP-U2_COMPONENTE_MENU_DESLIZANTE/assets/142832691/3d80dd0e-1a35-4765-81ac-632826fd3bbc)

6.- Este componenete ya trae incluida dentro de sus propiedades, el poder cambiar el color del texto, cambiar el color de todo el menu, cambiar el color cuando se despliega y se pliega las distancias que hay entre cada opcion.

#### Recomendaciones

Para poder controlar las acciones que hara el panel se necesita del siguiente codigo:

public NewJFrame1() { initComponents();

    menuPlegableComponent1.addJLabel2MouseListener(new MouseAdapter() {
    @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Label 2 presionado");
        }
    });
Este codigo se tendra que pegar en el metodo main y conigurara de la siguiente manera. El menu contiene 6 Labels que sugerimos modificar dependiendo de las necesidades, el primero es el que contiene el texto "Inicio" llamado 'JLabel2' para controlar lo que realiza este label al hacer click sobre el necesitamos del codigo proporcionado anteriormente, y modificaremos el contenido que hay dentro del metodo llamado mouseClicked por la accion que queremos que se realice, en este caso al ser un ejemplo solo imprimira un texto.

## Funcionamiento 

Video de como Funciona este componente Visual ya integrado


## Autores

Braulio Antonio Damian Gonzalez - Estudiante del ITO - [Contacto](https://github.com/BraulioDamian)
Luis Enrique Rodrigez Antonio - Estudiante del ITO - [Contacto](https://github.com/LuisEnchiladasVerdes)
Said Oton - Estudiante del ITO - [Contacto](https://github.com/frixx4731)

