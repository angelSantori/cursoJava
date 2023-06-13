package main;

import java.sql.*;

public class Main {
    //static final String DB_URL = "jdbc:mysql://localhost/mascotas";
    static final String DB_URL = "jdbc:mysql://localhost/shapes";

    static final String USER = "root";
    static final String PASS = "99PerroEstupido99.";

    //static final String QUERY = "SELECT * FROM mascota where id = ?";
    //static final int ID_PET = 1;

    //static final String QUERY = "SELECT * FROM mascota";

    static final String QUERY = "insert into figuras (color) values (?)";
    static final String QUERY2 = "insert into circulos (id,radio) values (?,?)";




    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement sentencia = conn.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS);
        //sentencia.setInt(1,ID_PET);
        sentencia.setInt(1,7);
        //ResultSet result = sentencia.executeQuery();
        sentencia.executeUpdate();
        ResultSet result = sentencia.getGeneratedKeys();
        result.next();
        int id = result.getInt(1);

        PreparedStatement sentencia2 = conn.prepareStatement(QUERY2);
        sentencia2.setInt(1,id);
        sentencia2.setInt(2,10);

        int otro_id = sentencia2.executeUpdate();

        System.out.println("Primer id: " + id);
        System.out.println("Segundo id: " + otro_id);

        /*while (result.next()){
            System.out.println(result.getString("Nombre"));
        }*/

        conn.close();
    }
}