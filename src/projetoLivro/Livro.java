package projetoLivro;

public class Livro implements Publicacao {
    //atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes(){
        System.out.println("=================================");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("aberto? " + this.isAberto());
        System.out.println("leitor: " + this.getLeitor().getNome());
        System.out.println("");
    }

    public Livro(String ti,String au, int tp, Pessoa le){
        this.setTitulo(ti);
        this.setAutor(au);
        this.setTotPaginas(tp);
        this.setLeitor(le);

        this.setAberto(false);
    }


    //metodos especias
    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
        System.out.println("========== LIVRO ABERTO ==========");
        System.out.println(getTitulo());
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
        System.out.println("========== LIVRO FECHADO ==========");

    }

    @Override
    public void folhear(int p) {
        if (isAberto()){
            if (p <= this.getTotPaginas() && p > 0) {
                System.out.println("foleando livro para a página: " + p);
                setPagAtual(p);
            }else{
                System.out.println("Página inválida");
            }
        }else {
            System.out.println("impossível folear com livro fechado!!!");
        }
    }


    @Override
    public void avancarPag() {
        if (isAberto()){
            if ((this.getPagAtual() > 0) && (this.getPagAtual() <= this.getTotPaginas())){
                setPagAtual(getPagAtual() + 1);
                System.out.println("Página atual: " + this.getPagAtual());
            }else{
                System.out.println("página não encontrada");
            }
        }else {
            System.out.println("Impossível avançar a página pois o livro está fechado!");
        }

    }

    @Override
    public void voltarPag() {
        if (isAberto()){
            if ((this.getPagAtual() > 1) && (this.getPagAtual() <= this.getTotPaginas())) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("pagina atual: " + this.getPagAtual());
            }else{
                System.out.println("Página não encontrada");
            }
        }else {
            System.out.println("Impossível voltar a página pois o livro está fechado!");
        }
    }
}
