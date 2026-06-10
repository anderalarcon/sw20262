package Semana10.EjercicioBonus;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

    private List<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(String tarea) {
        tareas.remove(tarea);
    }

    public boolean contieneTarea(String tarea) {
        return tareas.contains(tarea);
    }

    public int obtenerCantidadTareas() {
        return tareas.size();
    }

    public List<String> obtenerTareas() {
        return tareas;
    }

}
