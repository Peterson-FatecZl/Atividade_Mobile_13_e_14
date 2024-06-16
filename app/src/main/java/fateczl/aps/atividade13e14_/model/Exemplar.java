package fateczl.aps.atividade13e14_.model;

public abstract class Exemplar {
    private int codigo;
    private String nome;
    private int qtdPaginas;

    public Exemplar() {
        super();
    }

    public Exemplar(int codigo, String nome, int qtdPaginas) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdPaginas = qtdPaginas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    @Override
    public String toString() {
        return "Exemplar" +
                "\ncodigo=" + codigo +
                "\nnome=" + nome +
                "\nqtdPaginas=" + qtdPaginas;
    }
}
