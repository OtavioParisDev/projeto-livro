package projetoLivro;

public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("Gabriel", "Masculino", 24);
        p[1] = new Pessoa("léo", "Masculino", 26);
        p[2] = new Pessoa("Matheus", "Masculino", 22);

        Livro l[] = new Livro[3];
        l[0] = new Livro("Uma terra prometida", "Barack Obama", 764, p[0]);
        l[1] = new Livro("Suíte Tóquio", "Giovana Madalosso", 208, p[2]);
        l[2] = new Livro("A vida não é útil", "Ailton Krenak", 128, p[1]);

        l[0].detalhes();
        l[0].abrir();
        l[0].folhear(764);
        l[0].detalhes();
    }
}