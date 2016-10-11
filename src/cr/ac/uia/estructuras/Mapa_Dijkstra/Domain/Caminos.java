package cr.ac.uia.estructuras.Mapa_Dijkstra.Domain;

public class Caminos {
    //Atributos
    private Lugar LgDest;
    private int intDist;
    private boolean bPerm;
    //Referencias de Lista
    private Caminos sig;
    private Caminos ant;
    
    public Caminos(int intDist, Lugar LgDest){
        this.intDist = intDist;
        this.LgDest = LgDest;
        bPerm = false;
        
        this.sig = null;
        this.ant = null;
    }

    public Lugar getLgDest() {
        return LgDest;
    }

    public void setLgDest(Lugar LgDest) {
        this.LgDest = LgDest;
    }

    public int getIntDist() {
        return intDist;
    }

    public void setIntDist(int intDist) {
        this.intDist = intDist;
    }

    public Caminos getSig() {
        return sig;
    }

    public void setSig(Caminos sig) {
        this.sig = sig;
    }

    public Caminos getAnt() {
        return ant;
    }

    public void setAnt(Caminos ant) {
        this.ant = ant;
    }

    
}
