
package Semana11.Ejercicio2;


public class UsuarioService {

    private EmailService emailService;

    public UsuarioService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registrarUsuario(Usuario usuario) {

        System.out.println("Registrando usuario...");

        emailService.enviarCorreo(usuario.getCorreo());
    }

}
