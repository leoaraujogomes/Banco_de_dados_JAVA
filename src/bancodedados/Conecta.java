package bancodedados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author leoar
 */
public class Conecta 
{
    public static Connection getConexao() throws SQLException
    {
        Connection con = null;
        try
        {
        String serverName = "localhost";
        String mydatabase = "alunos";
        String username = "root";
        String password = "";
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);
        String url = "jdbc:mysql://"+serverName+"/"+mydatabase;
        //JOptionPane.showMessageDialog(null,"url:" +url+"\nusername:"+username+"\npassword:"+password);
        con = DriverManager.getConnection(url, username, password);
        
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não foi encrontrado"+e.toString());
        }catch(SQLException e){
            System.out.println("Erro ao conectar com o BD "+e.toString());
        }
        return con;
    }
    
}