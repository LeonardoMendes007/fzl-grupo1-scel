package com.fatec.scel;
import java.util.ArrayList;
import java.util.List;

public class ListaLivros {

	List<Livro> listaDeLivros = new ArrayList<Livro>();
	
	public void cadastrarLivro(Livro livro) {
		System.out.println("Livro cadastrado");
	}
	
	public boolean ISBNCadastrado(String isbn) {
		return false;
	}
	
	public boolean ISBNemBranco(String isbn) {
		return false;
	}
	
	public boolean tituloEmBranco(String titulo) {
		return false;
	}
	
	public boolean autorEmBranco(String titulo) {
		return false;
	}
}
