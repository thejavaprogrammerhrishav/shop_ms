
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programmer PC
 */
public class Database {
    
   private static Connection conn;
   private static boolean isDB=false;
   private static final String driver="com.mysql.jdbc.Driver";
   
   
   public static Connection Connect(){
       try{
           if(isDB==false){
               Class.forName(driver);
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sk_enterprise", "hrishav", "hrishav");
               isDB=true;
               return conn;
           }
           else
               return conn;
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return null;
   }  
}

