package cr.ac.uia.estructuras.Mapa_Dijkstra.view;

import cr.ac.uia.estructuras.Mapa_Dijkstra.Ventanas.MainVentana;
import cr.ac.uia.estructuras.Mapa_Dijkstra.bl.Algoritmo;
import cr.ac.uia.estructuras.Mapa_Dijkstra.bl.Lista_Principal_Lugares;
import javax.swing.*;

public class JMain {

    public static Lista_Principal_Lugares list = new Lista_Principal_Lugares();

    public static void main(String[] args) {
        
        MainVentana main2 = new MainVentana(list.getIni());
        main2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main2.setVisible(true);
    }

}

