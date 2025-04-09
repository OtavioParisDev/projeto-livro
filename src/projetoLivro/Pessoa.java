package projetoLivro;
public class Pessoa {
    //atributos
    private String nome, sexo;
    private int idade;
    //metodos publicos
    public void fazerAniver(){
        setIdade(getIdade() + 1);
        System.out.println(this.getNome() + " agora pussúi " + this.getIdade() + " anos! Parabéns pelo aniversário!");
    }
    //metodos especiais
    public Pessoa(String no, String se, int id){
       setNome(no);
       setSexo(se);
       setIdade(id);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
