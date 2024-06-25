/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuário
 */
public class ConexaoPostgres {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/programacaoDesktop"; //endereço da base de dados  -- 5432 é a porta
    private static final String USER = "postgres"; // é o usuario que eu crio no postgres
    private static final String PASSWORD = "postgres"; // é a senha que eu defini no momento de criar o postgres 

    // abrir conexão com o BD
    public static Connection getConection() {
        try {
            //tratamento de excessão
            //quando não sei as excessões especificas fasso:  (exeption ex cai qualquer erro, a abaixo é uma específica)

            Class.forName(DRIVER);

            return DriverManager.getConnection(URL,
                    USER,
                    PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);

        }

        return null; // preciso dar um return (para o CATCH)
    }

    //fechar a conexão com a BD
    public static void closeConnection(Connection conn) { // não preciso retornar nada; preciso receber a conexão que vou fechar
        if (conn != null) { //testando se exixte a conexão (se não esta fechada também)
            try {
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(ConexaoPostgres.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }

    }

    //fechar transação (quando faço uma operação em uma tabela)
    public static void closeTransaction(Connection conn, PreparedStatement ps) {
        if (ps != null) { // testando se esta aberta a conexão
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        closeConnection(conn);
    }
    
}
