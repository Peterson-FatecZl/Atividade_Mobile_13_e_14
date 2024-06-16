package fateczl.aps.atividade13e14_.model;

public class Livro extends Exemplar {
    private String ISBN;
    private int edicao;

    public Livro() {
        super();
    }

    public Livro(int codigo, String nome, int qtdPaginas, String ISBN, int edicao) {
        super(codigo, nome, qtdPaginas);
        this.ISBN = ISBN;
        this.edicao = edicao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\nISBN=" + ISBN +
                "\nnome=" + getNome() +
                "\nedicao=" + edicao +
                "\ncodigo=" + getCodigo() +
                "\nquantidade paginas=" + getQtdPaginas();
    }
}
