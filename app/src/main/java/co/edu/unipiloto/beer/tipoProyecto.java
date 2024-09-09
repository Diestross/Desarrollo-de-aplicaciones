package co.edu.unipiloto.beer;

import java.util.ArrayList;
import java.util.List;

public class tipoProyecto {
    List<String> getProyectos(String tipoProyectos){
        List<String> proyectos = new ArrayList<>();
        switch (tipoProyectos){
            case "Infraestructura":
                proyectos.add("Zonas verdes");
                proyectos.add("Ciclovias");
                proyectos.add("Vias");
                break;
            case "Recreacion":
                proyectos.add("Parques");
                proyectos.add("Acuarios");
                proyectos.add("Instalaciones deportivas");
                break;
            case "Educacion":
                proyectos.add("Colegios");
                proyectos.add("Bibliotecas");
                proyectos.add("Museos y Galerias");
                break;
            case "Salud":
                proyectos.add("Famacias");
                proyectos.add("Clinicas");
                proyectos.add("Clinicas Especializadas");
                break;
        }
        return proyectos;
    }

}
