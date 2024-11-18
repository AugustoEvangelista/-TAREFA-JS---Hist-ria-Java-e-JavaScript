
public class JavaOrientacaoAObjetos {

    public class Pessoa {
        String nome;
        public Pessoa(String nome) {
            this.nome = nome;
        }
        public void saudacao() {
            System.out.println("Olá, meu nome é " + nome);
        }
    }
    public static void main(String[] args) {
        JavaOrientacaoAObjetos obj = new JavaOrientacaoAObjetos();
        Pessoa pessoa = obj.new Pessoa("Carlos");
        pessoa.saudacao();
    }
}

