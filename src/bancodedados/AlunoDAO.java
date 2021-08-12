
package bancodedados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author leoar
 */
public class AlunoDAO {
    public String gravarAluno(Aluno aluno) throws SQLException
    {
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO DADOS(rgm, nome, nota1, nota2)";
            sql += "VALUES ('"+aluno.getRgm()+"', '"+aluno.getNome()+"','";
            sql += aluno.getNota1()+"', '"+aluno.getNota2()+"')";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        }catch(Exception e)
        {
            resp = e.toString();
        }
        return resp;
    }
    public String pesquisarAluno(Aluno aluno) throws SQLException
    {
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM DADOS WHERE RGM = '" + aluno.getRgm() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next())
            {
                aluno.setNome(rs.getString("NOME"));
                aluno.setNota1(rs.getFloat("NOTA1"));
                aluno.setNota2(rs.getFloat("NOTA2"));
                stmt.close();
                con.close();
                resp = "OK";
            }
            else
            {
                stmt.close();
                con.close();
                resp = "Aluno não encontrado pelo sistema.";
            }
            
        }catch(Exception e)
        {
            resp = e.toString();
        }
        return resp;
    }
    public String alterarAluno(Aluno aluno) throws SQLException
    {
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "UPDATE DADOS SET NOME = '" + aluno.getNome() + ""
                    + "', NOTA1 = '" + aluno.getNota1() + ""
                    + "', NOTA2 = '" + aluno.getNota2() + ""
                    + "' WHERE RGM = '" + aluno.getRgm() + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
            
        }catch(Exception e)
        {
            resp = e.toString();
        }
        return resp;
    }
    public String excluirAluno(Aluno aluno) throws SQLException
    {
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM DADOS WHERE RGM = '" + aluno.getRgm() + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
            
        }catch(Exception e)
        {
            resp = e.toString();
        }
        return resp;
    }
    public String verificaexistenciaAluno(Aluno aluno) throws SQLException
    {
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM DADOS WHERE RGM = '" + aluno.getRgm() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next())
            {
                resp = "OK";
            }
            else
            {
                stmt.close();
                con.close();
                resp = "Aluno não encontrado pelo sistema.";
            }
            
        }catch(Exception e)
        {
            resp = e.toString();
        }
        return resp;
    }
}
