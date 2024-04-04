/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_nueva.demo.service.impl;

import tienda_nueva.demo.dao.CategoriaDao;
import tienda_nueva.demo.domain.Categoria;
import tienda_nueva.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired//se conecta durectamente con este de abajo
    private CategoriaDao categoriaDao;

    @Transactional(readOnly=true)//dimplemente se lee lo que hay en la base de datos
    public List<Categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();//obtenemos todos los objetos de la categoria de la base de datos
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    
    public void save(Categoria categoria) {
       categoriaDao.save(categoria);
    }

    
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
}