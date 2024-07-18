/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class KetNoiSQL {
    public static Connection openConnettion() throws Exception {
//1.Nap Driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//2.
        String url = "jdbc:sqlserver://localhost; databaseName=QLSV";
        String user = "sa";
        String pass = "01688787936bao0";
//3.connect
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;

    } 
}
