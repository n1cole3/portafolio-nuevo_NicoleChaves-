/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda_nueva.demo.service;

import java.util.List;
import tienda_nueva.demo.domain.usuario;

/**
 *
 * @author gabriel badilla
 */
public interface UsuarioService {
    // Se obtiene un listado de usuarios en un List
    public List<usuario> getUsuarios();
    
    // Se obtiene un Usuario, a partir del id de un usuario
    public usuario getUsuario(usuario usuario);
    
    // Se obtiene un Usuario, a partir del username de un usuario
    public usuario getUsuarioPorUsername(String username);

    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public usuario getUsuarioPorUsernameYPassword(String username, String password);
    
    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public usuario getUsuarioPorUsernameOCorreo(String username, String correo);
    
    // Se valida si existe un Usuario considerando el username
    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo);
    
    // Se inserta un nuevo usuario si el id del usuario esta vacío
    // Se actualiza un usuario si el id del usuario NO esta vacío
    public void save(usuario usuario,boolean crearRolUser);
    
    // Se elimina el usuario que tiene el id pasado por parámetro
    public void delete(usuario usuario);

}