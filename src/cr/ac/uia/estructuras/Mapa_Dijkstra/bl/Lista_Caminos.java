package cr.ac.uia.estructuras.Mapa_Dijkstra.bl;

import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Caminos;
import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Lugar;


public class Lista_Caminos {
    private Caminos ini;
    private Caminos fin;
    
    public Lista_Caminos(){
        ini = null;
        fin = null;
    }
    
    public void añadirCamino(int dist, Lugar dest){
        Caminos nuevo = new Caminos(dist, dest);
        if(ini == null && fin == null){
            ini = nuevo;
            fin = nuevo;
        }else{
            nuevo.setSig(ini);
            ini.setAnt(nuevo);
            ini = nuevo;
        }
    }

    
    public Caminos getIni() {
        return ini;
    }

    public void setIni(Caminos ini) {
        this.ini = ini;
    }

    public Caminos getFin() {
        return fin;
    }

    public void setFin(Caminos fin) {
        this.fin = fin;
    }
    
}
