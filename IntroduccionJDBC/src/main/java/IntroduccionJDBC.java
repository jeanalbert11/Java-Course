
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IntroduccionJDBC {

    public static void main(String[] args) {
        //Paso1. Creamos nuestra cadena de conexion a la DB
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezon=UTC";

        try {
            //Paso 2. Creamos el objeto de conexion a la base de datos
            Connection conexion = DriverManager.getConnection(url, "root", "111ZZZ...");
            //Paso 3. Creamos un objeto de tipo Statement
            Statement sentencia = conexion.createStatement();
            //Paso 4. Creamos el consulta
            String sql = "SELECT id, nombre, apellido, correo, telefono FROM persona";
            //Paso 6. Ejecucion del query
            ResultSet resultado = sentencia.executeQuery(sql);
            //Paso 7. Procesamos  el resultado
            while (resultado.next()) { //Pone el cursor en primer registro de la db              
                System.out.print(" Id: " + resultado.getInt(1));
                System.out.print(", Nombre: " + resultado.getString(2));
                System.out.print(", Apellido: " + resultado.getString(3));
                System.out.print(", Correo: " + resultado.getString(4));
                System.out.println(", Telefono: " + resultado.getString(5));
            }
            //paso 8. Cerramos cada objeto que  hemos utilizado: Para no dejar conexiones a db abriertas
            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);//Para mandar la exepcion 
        }
    }
}
