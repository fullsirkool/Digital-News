/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Minh La Anhihi
 */
public class InforContext {

    private static InitialContext initial = null;
    private static Context context = null;

    private static String serverName = null;
    private static String dbName = null;
    private static String portNumber = null;
    private static String userName = null;
    private static String password = null;
    private static String imgPath = null;
    //public static InforContext instance;

    static {
        try {
            initial = new InitialContext();
            Object obj = initial.lookup("java:comp/env");
            context = (Context) obj;
            serverName = context.lookup("serverName").toString();
            dbName = context.lookup("dbName").toString();
            portNumber = context.lookup("portNumber").toString();
            imgPath = context.lookup("image").toString();
            userName = context.lookup("username").toString();
            password = context.lookup("password").toString();
            System.out.println("Chay vao context roi nhe");
        } catch (Exception error) {
        }
    }

    public InforContext(){
    }

    public String getImgPath() {
        return imgPath;
    }

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "; databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userName, password);
    }

    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
