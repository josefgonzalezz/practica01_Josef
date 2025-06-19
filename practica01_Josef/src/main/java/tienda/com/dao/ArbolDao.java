/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package tienda.com.dao;

/**
 *
 * @author XPC
 */
import tienda.com.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao extends JpaRepository<Arbol, Long> {

}
