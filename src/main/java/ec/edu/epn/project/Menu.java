package ec.edu.epn.project;

import java.util.ArrayList;

public class Menu {
    public ArrayList<String> opciones = new ArrayList<>();
    private final Usuario usuario;
    public Menu(Usuario usuario) {
        this.usuario = usuario;
    }
    public ArrayList<String> generarListaGerente(){
        opciones.add("0. Salir");
        opciones.add("1. Crear producto");
        opciones.add("2. Actualizar producto");
        opciones.add("2. Eliminar producto");
        return opciones;
    }
}
