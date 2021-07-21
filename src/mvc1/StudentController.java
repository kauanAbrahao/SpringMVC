package mvc1;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
		
	@RequestMapping("/showAluno")
	public String showForm(Model model) {
		
		//Criar o objeto que vai ser inserido no model. LEMBRETE: Model são 'objetos' utilizados para transitar informações entre controller e view
		Aluno aluno = new Aluno();
		HashMap<String, String> paises = Pais.getPaises();
		
		//Adicionando o objeto aluno ao Model, para carregá-lo até a view
		model.addAttribute("aluno", aluno);
		model.addAttribute("paises", paises);
		
		//Dentro de student-form.jsp, nós temos o path, que funciona como método get, quando carregado, e método set, quando enviado.
		return "student-form";
	}
	
	@RequestMapping("/processAluno")
	//@ModelAttribute captura o atributo aluno de Model (veja o método acima, onde adicionamos aluno ao model) e carrega em Aluno aluno.
	public String processAluno(@ModelAttribute("aluno") Aluno aluno){
		System.out.println("Aluno: " + aluno.getPrimeiroNome() + ", " + aluno.getSegundoNome());
		Pais pais = Pais.fromValue(aluno.getPais());
		System.out.println("País: " + pais.getNome() );
		
		//${objeto.atributo} funciona como método get
		return "student-confirmation";
		
	}
	
}
