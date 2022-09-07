public class Main {

  public static void main(String[] args) {
    System.out.println("Criando personagem normal: ");
    System.out.println(Personagem.personagemNormal());

    System.out.println("Criando personagem poderoso: ");
    System.out.println(Personagem.personagemPoderosos(100));

    System.out.println("Criando personagem soturno: ");
    System.out.println(Personagem.personagemSoturno(10));

    System.out.println("Criando personagem customizado: ");
    System.out.println(Personagem.personagemCustomizado(50,90,5));

    System.out.println("Criando um personagem aleatorio: ");
    System.out.println(Personagem.gerarPersonagemAleatorio());

  }

}
