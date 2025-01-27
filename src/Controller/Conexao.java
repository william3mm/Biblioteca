package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static Connection con;

    private static final String url = "jdbc:mysql://127.0.0.1:3306/Biblioteca?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root@admin";

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado! Verifique se o MySQL Connector está no classpath.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
        }

        return con;
    }
}
