package Semana3.Ejercicio2.Despues;

import java.sql.Connection;

public class DatabaseConnectorV2 {

    private Connection connection;
    private static DatabaseConnectorV2 instance;

    public DatabaseConnectorV2() {
        // Lógica de conexión a la base de datos
        try {
            System.out.println("Database connected");
        } catch (Error e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static DatabaseConnectorV2 getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectorV2();
        }
        return instance;
    }
}
