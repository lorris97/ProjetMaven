package com.ensup.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.ensup.BO.compteBO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class CompteDAO {

    
    public ArrayList<compteBO> selectAll() throws SQLException {
        ArrayList<compteBO> List = new ArrayList<compteBO>();
        BDD bdd = new BDD();
        Statement stm = bdd.connection();
        ResultSet res = stm.executeQuery("SELECT * FROM comptes");

        while (res.next()) {
            compteBO bo = new compteBO();
            bo.setId(Integer.parseInt(res.getString("id")));
            bo.setLogin(res.getString("login"));
            bo.setMdp(res.getString("mdp"));

            List.add(bo);
        }

        return List;
    }
//
//    @Override
//    public void DeleteAvengerById(int id) throws SQLException {
//        BDD bdd = new BDD();
//        Statement stm = bdd.connection();
//        stm.executeUpdate("DELETE FROM avengers WHERE ID = " + id);
//    }
//
//    @Override
//    public void InsertAvenger(Avengersbo b) throws SQLException {
//        BDD bdd = new BDD();
//        Statement stm = bdd.connection();
//        stm.executeUpdate("INSERT INTO avengers(age, name, costume, pouvoir) VALUES ('" + b.getAge() + "','" + b.getName() + "','" + b.getCostume() + "','" + b.getPouvoir() + "')");
//    }
//
//    @Override
//    public void updateAvengerById(Avengersbo b, int id) throws SQLException {
//        BDD bdd = new BDD();
//        Statement stm = bdd.connection();
//        String req = "UPDATE avengers SET age = '" + b.getAge() + "' , name = '" + b.getName() + "' , costume = '" + b.getCostume() + "' , pouvoir = '" + b.getPouvoir() + "' WHERE ID = '" + id + "'";
//        stm.executeUpdate(req);
//
//    }

}
