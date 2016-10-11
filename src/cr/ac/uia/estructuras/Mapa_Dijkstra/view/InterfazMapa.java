package cr.ac.uia.estructuras.Mapa_Dijkstra.view;

import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Caminos;
import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Lugar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public  class InterfazMapa extends JPanel{

    
    public InterfazMapa(Lugar ini){
        setLayout(null);
        setBackground(new Color(0, 148, 28));
        Lugar aux = ini;
        while (aux!=null) {
            
            JButton btn = new JButton();
            btn.setFont(new Font("New Times Roman", Font.BOLD, 15));
            btn.setText(aux.getStrNom());
            btn.setIcon(new ImageIcon(getClass().getResource("/cr/ac/uia/estructuras/Practica_Estructuras_Mapa/Resources/Location.png")));;
            btn.setSize(btn.getMinimumSize());
            btn.setLocation(aux.getIntX(), aux.getIntY());
            
            Caminos auxC = aux.getList().getIni();
            
            String tooltip = "";
            while (auxC != null) {
                tooltip += auxC.getLgDest().getStrNom()+". Distnacia: "+auxC.getIntDist()+"\n";
                auxC = auxC.getSig();
            }
            
           btn.addActionListener(new EventoClick(tooltip));
            add(btn);
            aux = aux.getSig();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        Lugar aux = JMain.list.getIni();
        while(aux!=null){
            
            Caminos auxC = aux.getList().getIni();
            
            while (auxC != null) {
                g.drawLine(aux.getIntX()+10, aux.getIntY()+10, auxC.getLgDest().getIntX()+10, auxC.getLgDest().getIntY()+10);
                auxC = auxC.getSig();
            } 
            aux = aux.getSig();
        }
    }    
    
    private class EventoClick implements ActionListener{
        String text;
        
        public EventoClick(String text){
            this.text = text;
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, text);
        }
        
    }

}
