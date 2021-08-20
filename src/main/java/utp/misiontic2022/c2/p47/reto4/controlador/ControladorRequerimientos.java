package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.ComprasDAO;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    // Recomendación: En esta clase controlador Crear un objeto DAO

    ComprasDAO dao = new ComprasDAO(); 
    Requerimiento_2Dao dao2 = new Requerimiento_2Dao();
    Requerimiento_3Dao dao3 = new Requerimiento_3Dao();
    
    public ArrayList<Compras> consultarRequerimiento1() throws SQLException {
        // Su código
        return dao.comprasPagadas(); //Para que aquí yo pueda llamar el metodo. y no crear el objeto dentro de este metodo! 
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return dao2.comprasInferior(); 
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return dao3.compraParcialConFecha();
    }
}
