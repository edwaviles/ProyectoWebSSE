/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.conexion;
import java.sql.*;
        
/**
 *
 * @author Aviles
 */
public class Conexion {
    Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public void conectar() throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectosse","root","");
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            throw  e;
        }
    }
    public void desconectar() throws Exception
    {
        try 
        {
            if (con!=null) 
            {
                if (!con.isClosed()) 
                {
                    con.close();
                }
            }
        } 
        catch (SQLException e) 
        {
            throw  e;
        }
    }
}
