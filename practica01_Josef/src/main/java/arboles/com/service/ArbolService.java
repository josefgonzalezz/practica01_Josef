/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package arboles.com.service;

/**
 *
 * @author XPC
 */
import arboles.com.domain.Arbol;
import java.util.List;

public interface ArbolService {

   
    public List<Arbol> getArboles(boolean activo);

   
    public Arbol getArbol(Arbol arbol);

   
    public void save(Arbol arbol);

    
    public void delete(Arbol arbol);
}
