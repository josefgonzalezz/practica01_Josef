/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package tienda.com.service;

/**
 *
 * @author XPC
 */
import tienda.com.domain.Arbol;
import java.util.List;

public interface ArbolService {

    // Obtiene una lista de árboles, con opción a filtrar por si están activos
    public List<Arbol> getArboles(boolean activo);

    // Obtiene un árbol específico a partir de su ID
    public Arbol getArbol(Arbol arbol);

    // Guarda un nuevo árbol o actualiza uno existente
    public void save(Arbol arbol);

    // Elimina un árbol por ID
    public void delete(Arbol arbol);
}
