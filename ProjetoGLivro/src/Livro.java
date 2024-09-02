
public class Livro {
	private String titulo;
	private String autor;
	private Integer paginas;
	private Integer qntd;
	
	public Livro(String titulo, String autor, Integer paginas, Integer qntd) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.qntd = qntd;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getQntd() {
		return qntd;
	}

	public void setQntd(Integer qntd) {
		this.qntd = qntd;
	}

	public String getAutor() {
		return autor;
	}
	public Integer getPaginas() {
		return paginas;
	}
	
	public void emprestarLivro(int val) {
		if (val > qntd) {
            System.out.println("Não há livros suficientes para emprestar!");
        } else {
            System.out.println("Livro emprestado com sucesso!");
            qntd -= val;
        }	
	}
	
	public void devolverLivro(int val) {
		if (val > 0) {
            System.out.println("Livro devolvido com sucesso!");
            qntd += val;
        } else {
            System.out.println("Quantidade inválida!");
        }
	}
	
	public void verificarLivro() {
		System.out.println("Temos " + qntd + " livros disponiveis!");
	}
	
	public void verificarQuantosPegou(int qntsPegou) {
		System.out.println("Você pegou " + qntsPegou + " livros.");
	}

	
}
