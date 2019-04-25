/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Planets;

/**
 *
 * @author leonardo
 */
public interface CRUD {
    
    public List listar();
    public Planets list(int id);
    public boolean add(Planets planets);
    public boolean edit(Planets planets);
    public boolean delete(int id);
}
