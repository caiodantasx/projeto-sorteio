package Caio.Dantas3.periodo.Sorteio.trabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

@SpringBootApplication
public class SorteioTrabalhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SorteioTrabalhoApplication.class, args);
	}
	
public class Sorteio {
    public int id;
    public Date Ano;
	public int indentificador;
	public Date mes;
	public int Valor_premio;
	public String apresentador;
	public String auditor;
	public String premiado;
	public String tipo;

	


    
}

public class Usuario {
    public int id;
    public String nome;
    public String email;
    public String senha;
}
public class Bilhete {
    public int id;
    public int numero;
    public double preco;
    public Sorteio sorteio;

    
}
public class NotaFiscal {
   public int id;
    public int numero;
    public double valor;
    public Usuario usuario;

    
