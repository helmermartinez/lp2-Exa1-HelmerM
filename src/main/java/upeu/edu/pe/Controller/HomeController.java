package upeu.edu.pe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.Entity.Usuario;
import upeu.edu.pe.Security.JwtUtil;

@RestController
public class HomeController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenidos al Restaurante Pimpoyo";
	}
	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody Usuario authRequest) throws Exception {
        try {
        	System.out.println(authRequest.getNomuser());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
        } catch (Exception ex) {
            throw new Exception("Error: "+ ex);
        }
        return jwtUtil.generateToken(authRequest.getNomuser());
    }
}
