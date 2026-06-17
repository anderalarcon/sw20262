package Semana11.Ejercicio1;

public interface ProductoRepository {

    Producto buscarPorId(int id);

    void guardar(Producto producto);

}
