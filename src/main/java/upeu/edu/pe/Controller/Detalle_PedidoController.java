package upeu.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Entity.Detalle_Pedido;
import upeu.edu.pe.Service.Detalle_PedidoService;

@RestController
@RequestMapping("/dpedidos")
public class Detalle_PedidoController {
	
	@Autowired
	private Detalle_PedidoService rolService;
	
	@GetMapping("/{id}")
	public Detalle_Pedido read(@PathVariable int id ) {
		return rolService.read(id);

	}
}
	
