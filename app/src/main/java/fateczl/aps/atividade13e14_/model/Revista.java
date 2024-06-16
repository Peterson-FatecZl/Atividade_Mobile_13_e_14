package fateczl.aps.atividade13e14_.model;

public class Revista extends Exemplar {
    private String ISSN;

    public Revista() {
        super();
    }

    public Revista(int codigo, String nome, int qtdPaginas, String ISSN) {
        super(codigo, nome, qtdPaginas);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "\nISSN=" + ISSN +
                "\nnome" + getNome() +
                "\ncodigo" + getCodigo() +
                "\nquantidade paginas=" + getQtdPaginas();
    }
}
