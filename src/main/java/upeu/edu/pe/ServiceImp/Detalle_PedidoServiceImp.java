package upeu.edu.pe.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Entity.Detalle_Pedido;
import upeu.edu.pe.Service.Detalle_PedidoService;

@Service
public class Detalle_PedidoServiceImp implements Detalle_PedidoService{
	
	@Autowired
	private Detalle_Pedido detalle_Pedido;

	@Override
	public Detalle_Pedido read(int id) {
		// TODO Auto-generated method stub
		return read(id);
	}
}
