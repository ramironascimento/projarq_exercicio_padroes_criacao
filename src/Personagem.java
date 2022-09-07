import java.util.Random;

public class Personagem {

  private int visibilidade;
  private int poder;
  private int vida;


  public static Personagem gerarPersonagemAleatorio() {
    Random random = new Random(1287346817);

    if (random.nextInt(100) >= 90) {
      return personagemCustomizado(1, 2, 3);
    } else if (random.nextInt(100) >= 75) {
      return personagemPoderosos(100);
    } else if (random.nextInt(100) >= 60) {
      return personagemSoturno(10);
    } else {
      return personagemNormal();
    }
  }


  private Personagem(int visibilidade, int poder, int vida) {
    this.visibilidade = visibilidade;
    this.poder = poder;
    this.vida = vida;
  }

  public static Personagem personagemCustomizado(int visibilidade, int poder, int vida) {
    return new Personagem(visibilidade, poder, vida);
  }

  public static Personagem personagemNormal() {
    return new Personagem(10, 50, 3);
  }

  public static Personagem personagemPoderosos(int poder) {
    return new Personagem(10, poder, 3);
  }

  public static Personagem personagemSoturno(int visibilidade) {

    return new Personagem(visibilidade, 50, 3);
  }


  public int getVisibilidade() {
    return visibilidade;
  }

  public int getVida() {
    return vida;
  }

  public int getPoder() {
    return poder;
  }

  @Override
  public String toString() {
    return "Personagem{" +
        "visibilidade=" + visibilidade +
        ", poder=" + poder +
        ", vida=" + vida +
        '}';
  }
}