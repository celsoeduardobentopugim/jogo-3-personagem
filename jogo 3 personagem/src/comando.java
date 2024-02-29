abstract class Personagem {
    String nome;
    int vida;
    int ataque;
    int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    abstract void atacar(Monstro monstro);
    abstract void defender(int ataqueRecebido);
}

abstract class Monstro {
    String nome;
    int vida;
    int ataque;
    int defesa;

    public Monstro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    abstract void receberDano(Personagem personagem);
    abstract void defender(int ataqueRecebido);
}

class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(Monstro monstro) {
        int dano = this.ataque - monstro.defesa;
        monstro.receberDano(this);
    }

    @Override
    void defender(int ataqueRecebido) {
        int dano = ataqueRecebido - this.defesa;
        if (dano > 0) {
            this.vida -= dano;
        }
    }

    void pular() {
        // Implementação do método pular
    }
}

class Mago extends Personagem {
    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(Monstro monstro) {
        // Implementação do ataque do Mago
    }

    @Override
    void defender(int ataqueRecebido) {
        // Implementação da defesa do Mago
    }

    void soltarMagia() {
        // Implementação do método soltarMagia
    }
}

class Arqueiro extends Personagem {
    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    void atacar(Monstro monstro) {
        // Implementação do ataque do Arqueiro
    }

    @Override
    void defender(int ataqueRecebido) {
        // Implementação da defesa do Arqueiro
    }

    void esquivar() {
        // Implementação do método esquivar
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de utilização do RPG
        Guerreiro guerreiro = new Guerreiro("Guerreiro1", 100, 20, 30);
        Mago mago = new Mago("Mago1", 80, 25, 40);
        Arqueiro arqueiro = new Arqueiro("Arqueiro1", 90, 30, 20);

        Monstro monstro = new Monstro("Monstro1", 150, 15, 10);

        // Ação do guerreiro
        guerreiro.atacar(monstro);

        // Ação do mago
        mago.soltarMagia();

        // Ação do arqueiro
        arqueiro.atacar(monstro);
    }
}
