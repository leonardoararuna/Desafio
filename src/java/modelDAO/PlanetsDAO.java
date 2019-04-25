/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Planets;

/**
 *
 * @author leonardo
 */
public class PlanetsDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Planets planets = new Planets();

    @Override
    public List listar() {

        ArrayList<Planets> list = new ArrayList();
        String sql = "select * from planetas";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Planets plan = new Planets();

                plan.setId(rs.getInt("id"));

                plan.setName(rs.getString("name"));
                plan.setClimate(rs.getString("climate"));
                plan.setTerrain(rs.getString("Terrain"));
                plan.setQtdFilmes(rs.getInt("qtd_filmes"));
                plan.setStatus(rs.getInt("status"));

                list.add(plan);

            }

        } catch (Exception e) {

        }

        return list;

    }

    public List listarAPI() {

        ArrayList<Planets> list = new ArrayList();
        String sql = "select * from planetas where status=0";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Planets plan = new Planets();

                plan.setId(rs.getInt("id"));

                plan.setName(rs.getString("name"));
                plan.setClimate(rs.getString("climate"));
                plan.setTerrain(rs.getString("Terrain"));
                plan.setQtdFilmes(rs.getInt("qtd_filmes"));
                plan.setStatus(rs.getInt("status"));

                list.add(plan);

            }

        } catch (Exception e) {

        }

        return list;

    }

    public List ShowbyNome(String nome) {

        ArrayList<Planets> list = new ArrayList();
        String sql = "select * from planetas where name=" + nome;

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Planets plan = new Planets();

                plan.setId(rs.getInt("id"));

                plan.setName(rs.getString("name"));
                plan.setClimate(rs.getString("climate"));
                plan.setTerrain(rs.getString("Terrain"));
                plan.setQtdFilmes(rs.getInt("qtd_filmes"));
                plan.setStatus(rs.getInt("status"));

                list.add(plan);

            }

        } catch (Exception e) {

        }

        return list;

    }

    public List ShowbyId(int id) {

        ArrayList<Planets> list = new ArrayList();
        String sql = "select * from planetas where id=" + id;

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Planets plan = new Planets();

                plan.setId(rs.getInt("id"));

                plan.setName(rs.getString("name"));
                plan.setClimate(rs.getString("climate"));
                plan.setTerrain(rs.getString("Terrain"));
                plan.setQtdFilmes(rs.getInt("qtd_filmes"));
                plan.setStatus(rs.getInt("status"));

                list.add(plan);

            }

        } catch (Exception e) {

        }

        return list;

    }

    public boolean delete(int id) {
        String sql = "delete from planetas where id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Planets list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Planets planets) {
        String sql = "insert into planetas(name,climate,Terrain,qtd_filmes,status)values('" + planets.getName() + "','" + planets.getClimate() + "','" + planets.getTerrain() + "','" + planets.getQtdFilmes() + "','" + planets.getStatus() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Planets planets) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean population(Planets planets) {
        String sql = "insert into planetas(name,climate,Terrain,qtd_filmes,status)values('" + planets.getName() + "','" + planets.getClimate() + "','" + planets.getTerrain() + "','" + planets.getQtdFilmes() + "','0')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    //método de verificação de dados para gatilho do population
//    public boolean inicio() {
//        ArrayList<Planets>list= new ArrayList();
//        String sql = "select * from planetas";
//        
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        
//        try{
//            
//            con = cn.getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//            System.out.println(ps.executeQuery());
//            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//            
//                
//                
//                Planets plan = new Planets();
//               
//                plan.setId(rs.getInt("id"));
//            
//                plan.setName(rs.getString("name"));
//                plan.setClimate(rs.getString("climate"));
//                plan.setTerrain(rs.getString("Terrain"));
//                plan.setQtdFilmes(rs.getInt("qtd_filmes"));
//                plan.setStatus(rs.getInt("status"));
//                
//                list.add(plan);
//         
//            
//            
//        } catch(Exception e){
//            return true;
//        }
//        
//        
//            return false;
//        
//        
//        
//    }
}
