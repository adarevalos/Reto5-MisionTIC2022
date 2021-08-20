package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    Connection conexion; 
    public Requerimiento_3Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento_3> compraParcialConFecha() throws SQLException {
        ArrayList <Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
        String sql = "SELECT ID_Proyecto , STRFTIME('%Y',Fecha ) FROM Compra c WHERE Pagado = 'Parcialmente' and Fecha LIKE '_____02%'";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql); //Este resultado ya tiene todo el SELECT de arriba -> Todas las compras que hayan pasado el filtro ! 
        while(resultado.next()){
            Requerimiento_3 compraConsulta = new Requerimiento_3(); 
            compraConsulta.setID_Compra(resultado.getInt(1));//Coge el primer elemento del select (osea el id compra)
            compraConsulta.setFecha(resultado.getString(2));
            lista.add(compraConsulta);            
        }
        return lista; 
    }

}