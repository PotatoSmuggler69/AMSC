
package electricity.billing.system;

import java.sql.*;

public class Conn {
    Connection c;
    public Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/amsc","root","Abhishek@1");
            s = c.createStatement();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
