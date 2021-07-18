package mvc1;

public class Main {
	
	
/* Spring MVC � um Framework para desenvolvimento de aplica��es web em Java:
	  M = Model
	  V = View
	  C = Controller
	 
	 Utilizando os conceitos de Invers�o de Controle + Inje��o de Depend�ncias
	 

	
	
	
               (model)                    (model)              (model)  
	 WEB BROWSER -------> FRONT CONTROLLER --------> CONTROLLER --------> VIEW TEMPLATE 
	      ^                                                               |
	      |                                                               v
	      -----------------------------------------------------------------
	      
	      - Front Controller (DispatcherServlet) � parte do SpringFramework;
	      - M (model) --> possui os dados. Transporta os dados entre as diferentes partes do framework.
	      - V (controller) --> l�gica de neg�cio e lida com a request do web browser (mando pro db, processa algo etc)
	      - C (view template) --> sua p�gina jsp. Normalmente JSP+JSTL, mas pode ser usado Thymeleaf, Groovy etc
	 
	 
	 =================================== CONFIGURA��O ==================================================
	 ===================================== POR XML =====================================================
	 
	 N�s temos um arquivo web.xml no qual precisamos configurar o DispatcherServlet (Front Controller) e setar um mapping:
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
	 
	 <!-- Step 1: Configurar o Spring MVC DispatcherServlet -->
	<servlet>
		<servlet-name>dispatcher</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value> //Arquivo de configura��o do servlet. No curso era spring-mvc-demo-servlet, no nosso exemplo ser� springmvc-config.xml
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
	
	

	<!-- Step 2: Set up URL mapping for Spring MVC Dispatcher Servlet -->
	<servlet-mapping>
		<servlet-name>dispatcher</servlet-name>
		<url-pattern>/</url-pattern> // Poderia ser /qualquercoisa. Colocando /, toda URL ser� tratada pelo dispatcher.
	</servlet-mapping>
	
	
	
	
	
		 Agora, vamos configurar o springmvc-config.xml, adicionando suporte ao ComponentScan, convers�o, formata��o e valida��o:
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
	 <!-- Step 1: Add support for component scanning -->
	<context:component-scan base-package="com.luv2code.springdemo.mvc" />

	<!-- Step 2: Add support for conversion, formatting and validation --> 
	<mvc:annotation-driven/>
	
	
	
	
			 Por fim, ainda no springmvc-config.xml, vamos definir onde as p�ginas estar�o localizadas (view resolver):
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
	
		<!-- Step 1: Define Spring MVC view resolver -->
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/" />
		<property name="suffix" value=".jsp" />
		
	</bean>


EXPLICA��O: Digamos que pedimos um view com o nome lista-de-produtos. O Spring ir� acrescentar o prefixo e o sufixo, resultando em:
/WEB-INF/view/lista-de-produtos.jsp
 
 Ou seja, o Spring ir� buscar no caminho /WEB-INF/view uma p�gina chamada lista-de-produtos.jsp
  
  
	
	
*/ 
	
	
/*             											CRIANDO PRIMEIRA CONTROLLER E VIEW
 * -------------------------------------------------------------------------------------------------------------------------------------------
 * Certo, vamos criar uma controller e uma view:
 * 
 * Passo 1: Criar uma classe controller;
 * Passo 2: Definir os m�todos da controller;
 * Passo 3: Adicionar um RequestMapping aos m�todos;
 * Passo 4: Retornar uma view name;
 * Passo 5: Criar a view page.
 * 
 * 
 * ------ Passo 1:
 		A classe controller se chamar� HomeController com anota��o @Controller.
 		Lembrando que @Controller herda @Component!! Ou seja, suporte ao ComponentScan!
 		
 * -----  Passo 2:
        O m�todo chamar� showMypage, retornando uma String, que ser� o view name.
        
 * ----- Passo 3:
        Adicionar a anota��o @RequestMapping("/"). / representa root. Estamos usando root pq � nossa p�gina principal (Home).
        
 * ----- Passo 4:
        Retornar um view name. No nosso caso, ser� a main-page. Lembre-se que se tornar� /WEB-INF/view/main-page.jsp
        
 * ---- Passo 5:
        Criar a p�gina no diret�rio que est� mapeado, ou seja, /WEB-INF/view/ 		
	 
*/
	
	
/* 
 * /*             											LENDO DADOS DE UM HTML
 * -------------------------------------------------------------------------------------------------------------------------------------------
 	N�s teremos um formul�rio apresentado ao usu�rio, onde ele ir� inserir seu nome. Ap�s inserir e clicar em submeter,
 	mostraremos a ele uma p�gina de boas vindas!!!!
 	
 	A classe controller se chamar� BemVindoController
 	
 	 * ------ Passo 1:
 		Criar a classe BemVindoController com @Controller
 		
 * -----  Passo 2:
        Criar um m�todo para mostrar o formul�rio, e outro que ir� process�-lo.
        
 * ----- Passo 3:
        Adicionar a anota��o @RequestMapping nos metodos.
        
 * ----- Passo 4:
        Retornar um view name.
        
 * ---- Passo 5:
        Criar a p�gina no diret�rio que est� mapeado, ou seja, /WEB-INF/view/ 
        
        (RETORNAR A EXEMPLO ANTERIOR EM CASO DE D�VIDAS)
        (REPARE NOS HTML! {param.nomeEstudante} vem de input name)
        
        


*/
	/*
															TRABALHANDO COM MODELS
	 * -------------------------------------------------------------------------------------------------------------------------------------------
	
	- Na Controller, n�s podemos adicionar atributos ao nosso model (objeto).
	- A view page(JSP) pode acessar esses atributos da model e exibir!
	
	Exemplo:
	- Na classe BemVindoController, n�s temos um m�todo com @RequestMapping("/formularioLendoModel")
	- Ler o passo a passo comentado no m�todo!
	
	 */
	
	
	/*
															B�SICO: USANDO CSS E JS NO SPRING
		* -------------------------------------------------------------------------------------------------------------------------------------------
		
		- vamos criar um diret�rio para inserir nossos arquivos CSS ou JS. No nosso exemplo, /WebConcent/resources/css
		- indicaremos em nosso springmvc-config.xml o caminho: <mvc:resources mapping="/resources/**" location="/resources/"></mvc:resources>
		- no html, dentro do href do link, indicar o caminho com ${pageContext.request.contextPath}/resources/css/meuCss.css"
*/
	
	
	
	
	
	
	
	
	
	
	

}
