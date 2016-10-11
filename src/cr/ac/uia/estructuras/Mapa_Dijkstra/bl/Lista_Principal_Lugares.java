package cr.ac.uia.estructuras.Mapa_Dijkstra.bl;

import cr.ac.uia.estructuras.Mapa_Dijkstra.Domain.Lugar;

public class Lista_Principal_Lugares {

    private Lugar ini;
    private Lugar fin;

    public Lista_Principal_Lugares() {
        ini = null;
        fin = null;

        String[] nomLugares = {"Turrialba", "Pavones", "Jabillos","Chitaria","Santa Teresita","Guayabo","La Suiza","Canada","Tuis","Tres Equis","El Mora","Carmen Lyra", "Noche Buena", "Alto Cruz", "Santa Cruz", "Santa Rosa", "Cedros", "Capellades", "Platanillo", "Sin Manzanas", "San Juan Norte", "San Juan Sur", "Pacayitas", "Turrialba Centro", "Volcan Turrialba", "San Rafael"};
        int x;
        int y;
        int cant = 0;
        System.out.println(nomLugares.length);
        for (String nom : nomLugares) {
            x = (int) (Math.random() * 950);
            y = (int) (Math.random() * 700);
            Lugar nuevo = new Lugar(nom, x, y);
            if (ini == null && fin == null) {
                ini = nuevo;
                fin = nuevo;
            } else {
                nuevo.setSig(ini);
                ini.setAnt(nuevo);
                ini = nuevo;
            }
        }
        Lugar aux = ini;
        int dist;
        int cont = 0;
        while (aux != null) {
            
            if (aux.getSig() != null) {
                dist = (int)(Math.random() * 1000);
                
                aux.getList().añadirCamino(dist, aux.getSig());
                aux.getSig().getList().añadirCamino(dist, aux);
                cont++;
                if (aux.getSig().getSig() != null) {
                     dist = (int)(Math.random() * 1000);
                     cont++;
                    aux.getList().añadirCamino(dist, aux.getSig().getSig());
                    aux.getSig().getSig().getList().añadirCamino(dist, aux);
                    
                    if (aux.getSig().getSig().getSig() != null) {
                         dist = (int)(Math.random() * 1000);
                         
                        aux.getList().añadirCamino(dist, aux.getSig().getSig().getSig());
                        aux.getSig().getSig().getSig().getList().añadirCamino(dist, aux);
                        cont++;
                    }
                }
            }
            aux = aux.getSig();
        }
        System.out.println(cont);
    }

    public void agregarLugar(String strNom, int intX, int intY) {
        Lugar nuevo = new Lugar(strNom, intX, intY);
        if (ini == null && fin == null) {
            ini = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSig(ini);
            ini.setAnt(nuevo);
            ini = nuevo;
        }
    }

    public void agregarCaminoALugar(Lugar destino, String strnom, int dist) {
        Lugar aux = ini;

        while (aux != null) {
            if (aux.getStrNom().equalsIgnoreCase(strnom)) {
                aux.getList().añadirCamino(dist, destino);
                break;
            }
            aux = aux.getSig();
        }
    }

    public Lugar getIni() {
        return ini;
    }

    public void setIni(Lugar ini) {
        this.ini = ini;
    }

    public Lugar getFin() {
        return fin;
    }

    public void setFin(Lugar fin) {
        this.fin = fin;
    }

}
