/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taximanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
public class MakeConnection
{
    public static Connection getDatabaseConnection()
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) 
        {
            System.out.println(e.toString());
        }
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jamil", "1304117");
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return conn;
    }
}
