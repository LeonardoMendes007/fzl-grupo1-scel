package com.fatec.scel;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cap09ScelWebdriver1ApplicationTests {
	ListaLivros lista = new ListaLivros();

	@Test
	void contextLoads() {
	}

	@Test
	public void CT01_CadastroLivroComSucesso() {

		Livro livro = new Livro("Teste de software", "123456", "Bezerra");

		lista.cadastrarLivro(livro);

		assertEquals(1, lista.listaDeLivros.size());
	}

	@Test
	public void CT02_CadastrarISBNPresenteNaLista() {
		Livro livro = new Livro("Teste de software", "123456", "Bezerra");

		lista.cadastrarLivro(livro);

		boolean isbnCadastrado = lista.ISBNCadastrado(livro.getIsbn());

		
		
		assertEquals(true, isbnCadastrado);

	}

	@Test
	public void CT03_CadastrarISBNBranco() {
		Livro livro = new Livro("Teste de software", "", "Bezerra");
		lista.cadastrarLivro(livro);

		boolean isbnBranco = lista.ISBNemBranco(livro.getIsbn());

		assertEquals(true, isbnBranco);

	}

	@Test
	public void CT04_CadastrarTituloBranco() {
		Livro livro = new Livro("", "123456", "Bezerra");
		lista.cadastrarLivro(livro);

		boolean tituloBranco = lista.tituloEmBranco(livro.getTitulo());

		assertEquals(true, tituloBranco);

	}

	@Test
	public void CT05_CadastrarComNomeAutorBranco() {
		Livro livro = new Livro("Teste de software", "123456", "");
		lista.cadastrarLivro(livro);

		boolean autorBranco = lista.autorEmBranco(livro.getAutor());

		assertEquals(true, autorBranco);

	}

}
