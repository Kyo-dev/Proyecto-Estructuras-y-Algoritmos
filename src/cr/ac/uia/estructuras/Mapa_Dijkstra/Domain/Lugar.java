
package cr.ac.uia.estructuras.Mapa_Dijkstra.Domain;

import cr.ac.uia.estructuras.Mapa_Dijkstra.bl.Lista_Caminos;

public class Lugar {
    private int intX;
    private int intY;
    private String strNom;
    private final Lista_Caminos list;
    
    //Referencias
    private Lugar sig;
    private Lugar ant;
    
    public Lugar(String strNom, int intX, int intY){
        this.strNom = strNom;
        this.intX =intX;
        this.intY = intY;
        list = new Lista_Caminos();
        
        sig = null;
        ant = null;
    }

    public int getIntX() {
        return intX;
    }

    public void setIntX(int intX) {
        this.intX = intX;
    }

    public int getIntY() {
        return intY;
    }

    public void setIntY(int intY) {
        this.intY = intY;
    }

    public String getStrNom() {
        return strNom;
    }

    public void setStrNom(String strNom) {
        this.strNom = strNom;
    }

    public Lista_Caminos getList() {
        return list;
    }

    public Lugar getSig() {
        return sig;
    }

    public void setSig(Lugar sig) {
        this.sig = sig;
    }

    public Lugar getAnt() {
        return ant;
    }

    public void setAnt(Lugar ant) {
        this.ant = ant;
    }
    
    
}
