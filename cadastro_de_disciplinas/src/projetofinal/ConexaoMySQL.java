/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

//Classes necessárias para uso de Banco de dados 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */

public class ConexaoMySQL {

    private static ConexaoMySQL instance = null;
    private Connection connection = null;
    

    private ConexaoMySQL() {
        try {
            
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "127.0.0.1";    
            
            /* 
            *  Nesta linha estará o nome do seu banco de dados. Olhe no workbench
            *  o nome do banco. Caso voce tenha criado o modelo no workbench e não
            *  tenha modificado o nome do banco, o nome padrão é "mydb". 
            */
            
            String dbName = "projetofinalbd";
            String url = "jdbc:mysql://127.0.0.1:3306/projetofinalbd?useTimezone=true&serverTimezone=UTC";
            
            // Ajuste o username e password de acordo com o que voce utiliza para acessar o banco
             String username = "root";             
             String password = "root";      
            
            connection = DriverManager.getConnection(url, username, password);
              
            if (connection != null) {
                System.out.println("STATUS--->Conectado "
                        + "com sucesso!");
            } else {
                System.err.println("STATUS--->Não foi "
                        + "possivel realizar conexão");
            }
            connection.setAutoCommit(true);
        } catch (ClassNotFoundException e) {  
            
            System.out.println("O driver expecificado"
                    + " nao foi encontrado.");
        } catch (SQLException e) {
            
            System.out.println("Nao foi possivel"
                    + " conectar ao Banco de Dados.");
            e.printStackTrace();
        }
        }

    public static ConexaoMySQL getInstance() {
        if (instance == null) {
            instance = new ConexaoMySQL();
        }
        return instance;
    }

    public java.sql.Connection getConnection() {
        return connection;
    }

    
}
