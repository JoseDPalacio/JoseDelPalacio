import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Conexion BBDD
        String url = "jdbc:mysql://localhost:3306/universidad";
        Connection connection = DriverManager.getConnection(url, "root", "");
        System.out.println("Conexion con la BD establecida");


        //Variables
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(1,"Julio", 25, 8));
        estudiantes.add(new Estudiante(2, "Jaime",23,9));
        estudiantes.add(new Estudiante(3,"Javier", 29,10));

        System.out.println("Personas que van a ser ingresadas a la BBDD");
        System.out.println("---------------------------------------");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
            System.out.println("---------------------------------------");
            //insertar registros en una Tabla de la BD
            insert(connection, estudiante);
        }
        System.out.println("Estudiantes insertados con exito"+'\n');

        //Mostrar de la BD
        System.out.println("Mostrar estudiantes");
        mostrar(connection);


    }

    public static void insert(Connection connection, Estudiante estudiante) throws SQLException {
        String insertSql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(insertSql);

        statement.setString(1, estudiante.getNombre());
        statement.setInt(2, estudiante.getEdad());
        statement.setInt(3, estudiante.getCalificacion());
        statement.execute();
    }

    public static void mostrar(Connection connection) throws SQLException {
        String selectSql = "SELECT * FROM estudiantes";
        Statement statement1 = connection.createStatement();
        ResultSet rs = statement1.executeQuery(selectSql);
        //Recorrer el resulset para mostrar los registros obtenidos
        System.out.println("---------------------------------------");
        while (rs.next()) {

            System.out.println("Estudiante -> ID: " + rs.getInt("id") + '\n' +
                    "Nombre: " + rs.getString("nombre")  + '\n' +
                    "Edad: "+ rs.getInt("edad") + '\n' +
                    "Calificacion: "+rs.getInt("calificacion"));

            System.out.println("---------------------------------------");
        }
    }
}
