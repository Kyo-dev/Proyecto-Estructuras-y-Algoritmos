
package cr.ac.uia.estructuras.Mapa_Dijkstra.bl;

import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Caminos;
import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Lugar;
import cr.ac.uia.estructuras.Mapa_Dijkstra.view.JMain;

public class Algoritmo {
    
    public static Lista_Principal_Lugares copiarListaLugares(Lugar ini){
        Lista_Principal_Lugares copia = new Lista_Principal_Lugares();
        copia.setIni(null);
        copia.setFin(null);
        
        Lugar aux = ini;
        
        while (aux!=null) {
            Lugar nuevo = new Lugar(aux.getStrNom(), aux.getIntX(), aux.getIntY());
//            copia.agregarLugar(aux.getStrNom(), aux.getIntX(), aux.getIntY());
            Caminos auxC =  aux.getList().getIni();
            while (auxC != null) {
                nuevo.getList().añadirCamino(auxC.getIntDist(), auxC.getLgDest());
                auxC = auxC.getSig();
            }
            aux = aux.getSig();
        }
        return copia;
    }
    
    public static Lista_Principal_Lugares Dijkstra(String ini, String fin){
        Lugar iniL, finL;
        Lugar aux = JMain.list.getIni();
        while (aux!=null) {
            if(aux.getStrNom().equals(ini)){
                iniL = aux;
            }
            if(aux.getStrNom().equals(fin)){
                finL = aux;
            }
        }
        return null;
    }
}
