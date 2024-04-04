/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_nueva.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/*
  Esta anotación marca esta clase como una entidad de persistencia, 
  lo que significa que está mapeada a una tabla en la base de datos. Cada instancia de esta clase 
  representa una fila en la tabla rol.
*/
@Entity
/*
  La notacion @Data es una extencion de Lombok que incluye metodos set y get
  to string equals entre otros   
*/
@Data
/*
 La anotacion Table hacereferencia a la tabla de la base de datos 
*/
@Table(name="rol")
    
public class rol implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    /*
      Esto hace referencia a la llave primaria de la base de datos por lo cual 
      Se hara referencia a la tabla rol sol con esta llave
    */
    @Id
    /*
        se usa para especificar 
        cómo se generará automáticamente el valor de la clave primaria.
    */
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 't' en 'GenerationType' en minúscula
    private Long idRol;
    
    /*
     Esto es una bean ya echa valida que no sea vacio
    */

    private String nombre;
    
    /*
        Esta anotación se utiliza para especificar el nombre de la columna en la base de datos a 
        la que se mapeará el atributo idUsuario
    */
    @Column(name="id_usuario")
    private Long idUsuario;
    
    
}
