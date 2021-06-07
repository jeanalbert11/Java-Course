package datos;

import dominio.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDao {

    public List<PersonaDTO> listar() throws SQLException;

    public int insertar(PersonaDTO persona) throws SQLException;

    public int actualizar(PersonaDTO persona) throws SQLException;

    public int eliminar(PersonaDTO persona) throws SQLException;

}
