package mvc1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class BemVindoController {
	
	@RequestMapping("/mostraFormulario")
	public String mostraFormulario() {
		return "formulario";
	}
	
	@RequestMapping("/formularioProcessado")
	public String processaFormulario() {
		return "formularioProcessado";
	}
	
	@RequestMapping("/formularioLendoModel")
	public String formularioLendoModel(HttpServletRequest request, Model model) {
		//Primeiro, vamos ler o request, que veio da página html
		String nome = request.getParameter("nomeEstudante"); //Esse nomeEstudante vem de formulario.jsp
		
		//Agora que capturamos o que o usuário inseriu em nomeEstudante, podemos manipular da forma que quisermos
		nome = nome.toUpperCase() + "!!!!!!!!!!!!!!!!!!";
		
		//Vamos agora adicionar a variável nome ao model
		model.addAttribute("nomeModel", nome); //O primeiro é o nome do atributo, o segundo é o conteúdo do atributo.
		//Repare que em formularioProcessadoComModel, usamos ${nomeModel}
		
		return "formularioProcessadoComModel";
		
	}
	
	@RequestMapping("/formularioRequestParam")
	public String formularioRequestParam(@RequestParam("nomeEstudante") String name, Model model) {
		
		//Esse @RequestMapping faz a mesma coisa que o método acima
		name = name.toUpperCase() + "!!!";
		model.addAttribute("nomeModel", name);
		
		return "formularioProcessadoComModel";
	}

}
