/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensup.DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lorris
 */
public class BDD {

    private static Statement statement;

    public Statement connection() throws SQLException {
        java.sql.Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost/gestionformations?user=root&password=");
            statement = conn.createStatement();

        } catch (ClassNotFoundException e) {

            System.out.println("Connextion avec la base de données impossible");
        }
        return statement;

    }

}
