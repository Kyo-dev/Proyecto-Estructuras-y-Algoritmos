package cr.ac.uia.estructuras.Mapa_Dijkstra.Ventanas;

import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Lugar;
import cr.ac.uia.estructuras.Mapa_Dijkstra.view.InterfazMapa;
import cr.ac.uia.estructuras.Mapa_Dijkstra.view.JMain;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class MainVentana extends JFrame {

    JPanel ruta;
    JPanel agregar;
    JPanel eliminar;
    public static JPanel mapa;
    
    public MainVentana(Lugar ini) {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(700, 500));
        setLocationRelativeTo(null);
        setTitle("Mapa de grafos");   
        JPanel ruta;
        setComponents(ini);
        
    }
    public final void setComponents(Lugar ini) {
        mapa = new JPanel(new GridLayout(1, 1));
        mapa.setBorder(BorderFactory.createTitledBorder("Mapa"));
        mapa.add(new InterfazMapa(ini));
        add(mapa, BorderLayout.CENTER);
        
        JPanel menu = new JPanel(new BorderLayout());
        menu.setBorder(BorderFactory.createTitledBorder("Opciones"));
        menu.setLayout(new GridLayout(3, 1));
        BoxRuta();
        BoxEliminar();
        //Cargar Primer comboBox
        JPanel agregar = new JPanel();
        agregar.setBorder(BorderFactory.createTitledBorder("Eliminar"));
        menu.add(ruta);
        menu.add(eliminar);
        add(menu, BorderLayout.WEST);

    }

    public void BoxRuta() {
        ruta = new JPanel();
        ruta.setBorder(BorderFactory.createTitledBorder("Ruta mas corta"));
        ruta.setLayout(new GridLayout(3, 1));
        
        JComboBox strini = new JComboBox();
        JComboBox strfin = new JComboBox();

        Lugar aux = JMain.list.getIni();
        while (aux != null) {
            strini.addItem(aux.getStrNom());
            strfin.addItem(aux.getStrNom());
            aux = aux.getSig();
        }
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        p1.add(new JLabel("Inicio"));
        p1.add(strini);
        p2.add(new JLabel("Fin"));
        p2.add(strfin);
        JButton buscar = new JButton("Buscar ruta");
        p3.add(buscar);
        
        ruta.add(p1);
        ruta.add(p2);
        ruta.add(p3);
    }
    
    public void BoxEliminar(){
        eliminar = new JPanel(new GridLayout(2,1));
        
        JButton btnLugar = new JButton("Eliminar Lugar");
        JButton btnCamino = new JButton("Eliminar Lugar");
        eliminar.add(new JPanel().add(btnLugar));
        eliminar.add(new JPanel().add(btnCamino));
    }
}

