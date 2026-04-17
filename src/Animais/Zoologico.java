package Animais;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Lola", 5);
        jaulas[1] = new Cavalo("Marley", 7);
        jaulas[2] = new Preguica("Pitoco", 3);
        jaulas[3] = new Cachorro("Belem", 7);
        jaulas[4] = new Cavalo("Thor", 4);
        jaulas[5] = new Preguica("Soninho", 1);
        jaulas[6] = new Cachorro("Raulf", 2);
        jaulas[7] = new Cavalo("Rex", 6);
        jaulas[8] = new Preguica("Vasco", 8);
        jaulas[9] = new Cachorro("Bolt", 10);

        for (int i = 0; i < jaulas.length; i++){
            System.out.println("Jaula" + (i + 1) + ": " + jaulas[i].getNome());
            jaulas[i].emitirSom();

            if(jaulas[i] instanceof Cachorro){
                ((Cachorro) jaulas[i]).correr();
            }else if(jaulas[i] instanceof Cavalo){
                ((Cavalo) jaulas[i]).correr();
            }

            System.out.println();
        }
    }
}
