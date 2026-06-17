package Semana11.Ejercicio1;

public class ProductoService {

    private ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public Producto obtenerProducto(int id) {
        return repository.buscarPorId(id);
    }

    public void registrarProducto(Producto producto) {
        repository.guardar(producto);
    }
}
