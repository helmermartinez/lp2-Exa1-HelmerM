package upeu.edu.pe.DaoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.Dao.UsuarioDao;
import upeu.edu.pe.Entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}	
	
}
