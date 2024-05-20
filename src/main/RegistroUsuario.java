package src.main;

import java.util.HashMap;
import java.util.Map;

// Clase para manejar el registro de usuarios
public class RegistroUsuario {
    private Map<String, String> usuariosRegistrados; // Almacenar usuarios registrados (nombre de usuario y contraseña)

    public RegistroUsuario() {
        usuariosRegistrados = new HashMap<>();
    }

    // TODO: Método para registrar un nuevo usuario
    public void registrarUsuario(String nombreUsuario, String contraseña) {
        if (!usuariosRegistrados.containsKey(nombreUsuario)) {
            usuariosRegistrados.put(nombreUsuario, contraseña);
            System.out.println("Usuario registrado exitosamente.");
        } else {
            System.out.println("El nombre de usuario ya está en uso.");
        }

    }

    // Método para verificar si un usuario existe y si la contraseña es correcta
    public boolean verificarCredenciales(String nombreUsuario, String contraseña) {
        if (usuariosRegistrados.containsKey(nombreUsuario)
                && usuariosRegistrados.get(nombreUsuario).equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            return false;
        }
    }
}
