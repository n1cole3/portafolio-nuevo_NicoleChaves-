/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda_nueva.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tienda_nueva.demo.domain.Usuario;


public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
    Usuario findByUsername(String username);
    
}
