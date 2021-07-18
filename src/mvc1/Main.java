package mvc1;

public class Main {
	
	
/* Spring MVC é um Framework para desenvolvimento de aplicações web em Java:
	  M = Model
	  V = View
	  C = Controller
	 
	 Utilizando os conceitos de Inversão de Controle + Injeção de Dependências
	 

	
	
	
               (model)                    (model)              (model)  
	 WEB BROWSER -------> FRONT CONTROLLER --------> CONTROLLER --------> VIEW TEMPLATE 
	      ^                                                               |
	      |                                                               v
	      -----------------------------------------------------------------
	      
	      - Front Controller (DispatcherServlet) é parte do SpringFramework;
	      - M (model) --> possui os dados. Transporta os dados entre as diferentes partes do framework.
	      - V (controller) --> lógica de negócio e lida com a request do web browser (mando pro db, processa algo etc)
	      - C (view template) --> sua página jsp. Normalmente JSP+JSTL, mas pode ser usado Thymeleaf, Groovy etc
	 
	 
	 =================================== CONFIGURAÇÃO ==================================================
	 ===================================== POR XML =====================================================
	 
	 Nós temos um arquivo web.xml no qual precisamos configurar o DispatcherServlet (Front Controller) e setar um mapping:
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
	 
	 <!-- Step 1: Configurar o Spring MVC DispatcherServlet -->
	<servlet>
		<servlet-name>dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value> //Arquivo de configuração do servlet. No curso era spring-mvc-demo-servlet, no nosso exemplo será springmvc-config.xml
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
	
	

	<!-- Step 2: Set up URL mapping for Spring MVC Dispatcher Servlet -->
	<servlet-mapping>
		<servlet-name>dispatcher</servlet-name>
		<url-pattern>/</url-pattern> // Poderia ser /qualquercoisa. Colocando /, toda URL será tratada pelo dispatcher.
	</servlet-mapping>
	
	
	
	
	
		 Agora, vamos configurar o springmvc-config.xml, adicionando suporte ao ComponentScan, conversão, formatação e validação:
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
	 <!-- Step 1: Add support for component scanning -->
	<context:component-scan base-package="com.luv2code.springdemo.mvc" />

	<!-- Step 2: Add support for conversion, formatting and validation --> 
	<mvc:annotation-driven/>
	
	
	
	
			 Por fim, ainda no springmvc-config.xml, vamos definir onde as páginas estarão localizadas (view resolver):
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
	
		<!-- Step 1: Define Spring MVC view resolver -->
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/" />
		<property name="suffix" value=".jsp" />
		
	</bean>


EXPLICAÇÃO: Digamos que pedimos um view com o nome lista-de-produtos. O Spring irá acrescentar o prefixo e o sufixo, resultando em:
/WEB-INF/view/lista-de-produtos.jsp
 
 Ou seja, o Spring irá buscar no caminho /WEB-INF/view uma página chamada lista-de-produtos.jsp
  
  
	
	
*/ 
	
	
/*             											CRIANDO PRIMEIRA CONTROLLER E VIEW
 * -------------------------------------------------------------------------------------------------------------------------------------------
 * Certo, vamos criar uma controller e uma view:
 * 
 * Passo 1: Criar uma classe controller;
 * Passo 2: Definir os métodos da controller;
 * Passo 3: Adicionar um RequestMapping aos métodos;
 * Passo 4: Retornar uma view name;
 * Passo 5: Criar a view page.
 * 
 * 
 * ------ Passo 1:
 		A classe controller se chamará HomeController com anotação @Controller.
 		Lembrando que @Controller herda @Component!! Ou seja, suporte ao ComponentScan!
 		
 * -----  Passo 2:
        O método chamará showMypage, retornando uma String, que será o view name.
        
 * ----- Passo 3:
        Adicionar a anotação @RequestMapping("/"). / representa root. Estamos usando root pq é nossa página principal (Home).
        
 * ----- Passo 4:
        Retornar um view name. No nosso caso, será a main-page. Lembre-se que se tornará /WEB-INF/view/main-page.jsp
        
 * ---- Passo 5:
        Criar a página no diretório que está mapeado, ou seja, /WEB-INF/view/ 		
	 
*/
	
	
/* 
 * /*             											LENDO DADOS DE UM HTML
 * -------------------------------------------------------------------------------------------------------------------------------------------
 	Nós teremos um formulário apresentado ao usuário, onde ele irá inserir seu nome. Após inserir e clicar em submeter,
 	mostraremos a ele uma página de boas vindas!!!!
 	
 	A classe controller se chamará BemVindoController
 	
 	 * ------ Passo 1:
 		Criar a classe BemVindoController com @Controller
 		
 * -----  Passo 2:
        Criar um método para mostrar o formulário, e outro que irá processá-lo.
        
 * ----- Passo 3:
        Adicionar a anotação @RequestMapping nos metodos.
        
 * ----- Passo 4:
        Retornar um view name.
        
 * ---- Passo 5:
        Criar a página no diretório que está mapeado, ou seja, /WEB-INF/view/ 
        
        (RETORNAR A EXEMPLO ANTERIOR EM CASO DE DÚVIDAS)
        (REPARE NOS HTML! {param.nomeEstudante} vem de input name)
        
        


*/
	/*
															TRABALHANDO COM MODELS
	 * -------------------------------------------------------------------------------------------------------------------------------------------
	
	- Na Controller, nós podemos adicionar atributos ao nosso model (objeto).
	- A view page(JSP) pode acessar esses atributos da model e exibir!
	
	Exemplo:
	- Na classe BemVindoController, nós temos um método com @RequestMapping("/formularioLendoModel")
	- Ler o passo a passo comentado no método!
	
	 */
	
	
	/*
															BÁSICO: USANDO CSS E JS NO SPRING
		* -------------------------------------------------------------------------------------------------------------------------------------------
		
		- vamos criar um diretório para inserir nossos arquivos CSS ou JS. No nosso exemplo, /WebConcent/resources/css
		- indicaremos em nosso springmvc-config.xml o caminho: <mvc:resources mapping="/resources/**" location="/resources/"></mvc:resources>
		- no html, dentro do href do link, indicar o caminho com ${pageContext.request.contextPath}/resources/css/meuCss.css"
*/
	
	
	
	
	
	
	
	
	
	
	

}
