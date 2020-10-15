package upeu.edu.pe.DaoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.Dao.Detalle_PedidoDao;
import upeu.edu.pe.Entity.Detalle_Pedido;

@Repository
public class Detalle_PedidoDaoImp implements Detalle_PedidoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Detalle_Pedido read(int id) {
			// TODO Auto-generated method stub
			String SQL = "select *from detalle_pedido where iddetalle_pedido=?";
			return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Detalle_Pedido>(Detalle_Pedido.class));
	}

}
