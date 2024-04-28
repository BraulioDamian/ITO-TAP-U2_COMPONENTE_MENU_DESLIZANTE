/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menudesplegable;


/**
 *
 * @author braul
 */

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class MenuPlegableComponent extends JPanel {
    // Declaración de los JLabel como propiedades privadas
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private Color foldedColor = new Color(204, 204, 204); // Color por defecto cuando está plegado
    private Color unfoldedColor = new Color(51, 51, 51); // Color por defecto cuando está desplegado
    private LabelClickListener listener;  // Listener customizado

    private AnimacionPanel animador; // Añade esta línea

    // Propiedad adicional para el espaciado
    private int verticalSpacing = 50;
    
public interface LabelClickListener {
    void onLabelClick(MouseEvent e);
}

    
    
    
    public MenuPlegableComponent() {
        initComponents();
        animador = new AnimacionPanel(); // Inicializa el animador

        // Configuración del panel
        setLayout(null);
        setBackground(new Color(51, 51, 51));
        setBounds(0, 0, 220, 492);
        setBackground(unfoldedColor);  // Establecer el color inicial según la posición inicial
        if (this.getX() == -170) {
            setBackground(foldedColor);
         }
    
        // Agrega los event listeners a los labels
        jLabel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jLabel1MouseClicked(e);
            }
        });
        

        
    }
    

    private void initLabel(JLabel label, String text, String iconPath, int yPos) {
        URL imgURL = getClass().getResource(iconPath);
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            label.setIcon(icon); 
        } else {
            System.err.println("No se pudo encontrar el archivo de icono: " + iconPath);
        }
        
        label.setText(text);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        label.setBounds(0, yPos, 220, 50);
        label.setHorizontalTextPosition(JLabel.LEADING);
        label.setIconTextGap(15);
        label.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 10));            
    }
    private void initComponents() {
        
        // Inicialización y configuración de los JLabel
        initLabel(jLabel6, "Usuarios","/Icons/usuario2.png",250);
        initLabel(jLabel1, "Menu","/Icons/menu2.png",  0);
        initLabel(jLabel2, "Inicio", "/Icons/inicio2.png ", 50);
        initLabel(jLabel3, "Venta", "/Icons/venta2.png ", 100);
        initLabel(jLabel4, "Intenet", "/Icons/router2.png", 150);
        initLabel(jLabel5, "Analisis", "/Icons/analitica2.png", 200);
        initLabel(jLabel6, "Usuarios","/Icons/usuario2.png",250);
        initLabel(jLabel7, "Configuraciones","/Icons/configuracion2.png", 300);

        
        // Agrega los JLabels al panel
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);

        positionLabels();

    }
        


        // Método para permitir la adición de MouseListeners externos a jLabel2
    public void addJLabel2MouseListener(MouseAdapter adapter) {
        jLabel2.addMouseListener(adapter);
    }
    
    public void addJLabel3MouseListener(MouseAdapter adapter) {
        jLabel3.addMouseListener(adapter);
    }
    public void addJLabel4MouseListener(MouseAdapter adapter) {
        jLabel4.addMouseListener(adapter);
    }
    public void addJLabel5MouseListener(MouseAdapter adapter) {
        jLabel5.addMouseListener(adapter);
    }
    public void addJLabel6MouseListener(MouseAdapter adapter) {
        jLabel6.addMouseListener(adapter);
    }
    public void addJLabel7MouseListener(MouseAdapter adapter) {
        jLabel7.addMouseListener(adapter);
    }


    
    
        // Método para cambiar el color de fondo del panel
    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        if (jLabel1 != null) { // Asegúrate de que los JLabels ya están inicializados
            for (JLabel label : new JLabel[]{jLabel1 /*, jLabel2, jLabel3...*/}) {
                label.setBackground(bg); // Cambiar el fondo de los JLabels si es necesario
                label.setOpaque(true); // Necesario para que los JLabels muestren su fondo
            }
        }
    }
    
    
        // Métodos para manejar eventos
    private void jLabel1MouseClicked(MouseEvent e) {
        // Mover el panel MenuPlegableComponent
        if (this.getX() == 0) {
            // Mover el MenuPlegableComponent hacia la izquierda
            animador.animar(this, null, -170, 0, false);
            this.setBackground(foldedColor); // Usar color personalizado
        } else if (this.getX() == -170) {
            // Mover el MenuPlegableComponent hacia la derecha
            animador.animar(this, null, 0, 0, true);
            this.setBackground(unfoldedColor); // Usar color personalizado
        }
    }
    
    
     private void positionLabels() {
        // Actualizar la posición de cada etiqueta basándose en el espaciado vertical
        int yPos = 0;
        for (JLabel label : new JLabel[]{jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7}) {
            label.setBounds(0, yPos, 220, 50);
            yPos += verticalSpacing; // Usar el espaciado vertical para posicionar la siguiente etiqueta
        }
    }

    // Getters y Setters para la propiedad verticalSpacing
    public int getVerticalSpacing() {
        return verticalSpacing;
    }

    public void setVerticalSpacing(int spacing) {
        this.verticalSpacing = spacing;
        positionLabels(); // Reposicionar los JLabels cuando el espaciado cambie
        revalidate(); // Esto asegura que el JPanel se actualice en tiempo real
        repaint();
    }

    public void setLabelClickListener(LabelClickListener listener) {
        this.listener = listener;
    }
   // Getters y Setters para jLabel1
    public JLabel getJLabel1() {
        return jLabel1;
    }
    public Color getJLabel1TextColor() {
        return jLabel1.getForeground();
    }
    public void setJLabel1Text(String text) {
        jLabel1.setText(text);
    }
    public void setJLabel1Icon(Icon icon) {
        jLabel1.setIcon(icon);
    }
    public void setJLabel1TextColor(Color color) {
        jLabel1.setForeground(color);
    }
    
    // Repetir Getters y Setters para jLabel2
    public JLabel getJLabel2() {
        return jLabel2;
    }
    public Color getJLabel2TextColor() {
        return jLabel2.getForeground();
    }
    public void setJLabel2Text(String text) {
        jLabel2.setText(text);
    }
    public void setJLabel2Icon(Icon icon) {
        jLabel2.setIcon(icon);
    }
    public void setJLabel2TextColor(Color color) {
        jLabel2.setForeground(color);
    }
    
    
    public JLabel getJLabel3() {
        return jLabel3;
    }
    public Color getJLabel3TextColor() {
        return jLabel3.getForeground();
    }
    public void setJLabel3Text(String text) {
        jLabel3.setText(text);
    }
    public void setJLabel3Icon(Icon icon) {
        jLabel3.setIcon(icon);
    }
    public void setJLabel3TextColor(Color color) {
        jLabel3.setForeground(color);
    }
    
    public JLabel getJLabel4() {
        return jLabel4;
    }
    public Color getJLabel4TextColor() {
        return jLabel4.getForeground();
    }
    public void setJLabel4Text(String text) {
        jLabel4.setText(text);
    }
    public void setJLabel4Icon(Icon icon) {
        jLabel4.setIcon(icon);
    }
        public void setJLabel4TextColor(Color color) {
        jLabel4.setForeground(color);
    }
        
    
    public JLabel getJLabel5() {
        return jLabel5;
    }
    public Color getJLabel5TextColor() {
        return jLabel5.getForeground();
    }
    public void setJLabel5Text(String text) {
        jLabel5.setText(text);
    }
    public void setJLabel5Icon(Icon icon) {
        jLabel5.setIcon(icon);
    }
    public void setJLabel5TextColor(Color color) {
        jLabel5.setForeground(color);
    }
    
    
    public JLabel getJLabel6() {
        return jLabel6;
    }
    public Color getJLabel6TextColor() {
        return jLabel6.getForeground();
    }
    public void setJLabel6Text(String text) {
        jLabel6.setText(text);
    }
    public void setJLabel6Icon(Icon icon) {
        jLabel6.setIcon(icon);
    }
    public void setJLabel6TextColor(Color color) {
        jLabel6.setForeground(color);
    }
    
    
    public JLabel getJLabel7() {
        return jLabel7;
    }
    public Color getJLabel7TextColor() {
        return jLabel7.getForeground();
    }
    public void setJLabel7Text(String text) {
        jLabel7.setText(text);
    }
    public void setJLabel7Icon(Icon icon) {
        jLabel7.setIcon(icon);
    }
    public void setJLabel7TextColor(Color color) {
        jLabel7.setForeground(color);
    }

    
    //getter para camiar el color del panel plegado y desplegado
    public Color getPlegarColor() {
    return foldedColor;

    }

public void setPlegarColor(Color color) {
    foldedColor = color;
}

public Color getDesplegarColor() {
    return unfoldedColor;

}

public void setDesplegarColor(Color color) {
    unfoldedColor = color;
}



}
