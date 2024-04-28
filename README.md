INTRUCCIONES
***************************************

Para poder controlar las acciones que hara el panel se necesita del siguiente codigo:

public NewJFrame1() {
        initComponents();
        
        menuPlegableComponent1.addJLabel2MouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Label 2 presionado");
            }
        });

Este codigo se tendra que pegar en el metodo main y conigurara de la siguiente manera.
El menu contiene 6 Labels que sugerimos modificar dependiendo de las necesidades, el primero es el que contiene el texto
"Inicio" llamado 'JLabel2' para controlar lo que realiza este label al hacer click sobre el necesitamos del codigo proporcionado anteriormente, y modificaremos el contenido que hay dentro del metodo llamado mouseClicked por la accion que queremos que se realice, en este caso al ser un ejemplo solo imprimira un texto.

Para mayor claridad sugerimos ver el video adjuntado
