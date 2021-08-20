package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class ComprasDAO {

    Connection conexion; 

    public ComprasDAO(){ //Este es el constructor! Que hace la conexión con la base de datos 
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }


    public ArrayList<Compras> comprasPagadas() throws SQLException { //Retorna el listado de todas las compras que si estén pagadas -> Retorna listado de tipo Compras.java
        ArrayList <Compras> lista = new ArrayList<Compras>();
        String sql = "SELECT ID_Compra, Proveedor FROM Compra WHERE Pagado = 'Si'";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql); //Este resultado ya tiene todo el SELECT de arriba -> Todas las compras que hayan pasado el filtro ! 
        while(resultado.next()){
            Compras compra = new Compras(); 
            compra.setID_Compra(resultado.getInt(1));
            compra.setProveedor(resultado.getString(2));
            lista.add(compra);            
        }
        return lista; 
    }
}