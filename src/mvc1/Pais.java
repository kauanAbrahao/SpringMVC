package mvc1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public enum Pais {
	
	BRASIL("Brasil", "BRA"),
	ARGENTINA("Argentina", "ARG"),
	PERU("Peru", "PER"),
	URUGUAI("Uruguai", "URU"),
	BOLIVIA("Bolivia", "BOL");
	
	private String nome;
	private String descricao;
	private static HashMap<String, String> paises = new LinkedHashMap<>();
	
	private Pais(final String nome, final String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Pais fromValue(String value) {
		for(Pais pais: Pais.values()) {
			if(pais.getNome().equalsIgnoreCase(value)){
				return pais;
			}
		}
		return null;
		
		
	}

	public static HashMap<String, String> getPaises() {
		for(Pais pais : Pais.values()) {
			paises.put(pais.descricao, pais.nome);
		}
		return paises;
	}	

}
