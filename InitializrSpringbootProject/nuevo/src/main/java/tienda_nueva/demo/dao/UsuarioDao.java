package tienda_nueva.demo.dao;

import tienda_nueva.demo.domain.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC MASTER
 */
public interface UsuarioDao extends JpaRepository<usuario, Long> {
    usuario findByUsername(String username);
}
