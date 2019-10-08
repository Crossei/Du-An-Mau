/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duannhom5;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class Connect {
     public static Connection ketnoi(){
        Connection con = null;
        try {
            String user = "sa";
            String pass = "sa";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://localhost:1433;databaseName=qlhocsinh";
            con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
