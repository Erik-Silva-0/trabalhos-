public class Cadastro {
    
    private String Nome;
    private String sobreNome;
    private String Numero;

    public Cadastro(String nome, String sobrenome, String numero){
        this.Nome=nome;
        this.sobreNome=sobrenome;
        this.Numero=numero;
    }
/*
    public Cadastro(){
    }

    public String getNome() {
        return Nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public int getNumero() {
        return Numero;
    }
*/

    public void getinfo(){
        System.out.format("Nome: %s%nSobrenome: %s%nNumero: %s%n%n", Nome, sobreNome, Numero);
    }

}
