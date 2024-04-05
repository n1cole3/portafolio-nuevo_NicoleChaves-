package tienda_nueva.demo.dao;

import tienda_nueva.demo.domain.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC MASTER
 */
public interface UsuarioDao extends JpaRepository<usuario, Long> {
    usuario findByUsername(String username);

    public boolean existsByUsernameOrCorreo(String username, String correo);

    public usuario findByUsernameOrCorreo(String username, String correo);

    public usuario findByUsernameAndPassword(String username, String password);
}
