
package fix;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
    Connection con;
    Statement stm;
    
    public void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/kepala","root","");
            stm = con.createStatement();
            System.out.println("46");
            
    }catch (Exception e){
            System.out.println("69");
    }
        
    }public static void main(String[] args) {
        koneksi k= new koneksi();
        k.koneksi();
    }
}