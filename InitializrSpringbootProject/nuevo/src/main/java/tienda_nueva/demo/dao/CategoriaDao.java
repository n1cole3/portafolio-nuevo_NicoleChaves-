/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda_nueva.demo.dao;


import tienda_nueva.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 El Dao lo que hace es darme conexion con la base de datos 
 Por lo tanto hay que ver que entidad hay en la base de datos para cambiarlo aca 
*/

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}