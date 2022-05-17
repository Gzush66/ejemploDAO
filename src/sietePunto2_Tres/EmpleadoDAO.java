package sietePunto2_Tres;
import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

import sietePunto2_Tres.Empleado;


/** VERSION 3.0.1
 * @author Jesus
 *
 */
		public interface EmpleadoDAO {
			

				/**		version 3.0.0
				 * @author Jesus
				 *
				 */
			
			
			public List<Empleado> getEmpleados() ;
			
			public boolean insertar (Empleado empleado);
			
			public Empleado buscar(String dni) ;	
			
			public boolean borrar(String dni) ;
			
			
			public void imprimir(ResultSet resultado);	
			
			public boolean actualizarSueldo(String dni, float sueldo) ;

			boolean actualizar(String dni, float sueldo);

			
			
				
				
				

	}
