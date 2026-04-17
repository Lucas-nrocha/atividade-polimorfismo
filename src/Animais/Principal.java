package Animais;

public class Principal {
        public static void main(String[] args) {
            Animal[] animais = {
                    new Cachorro ("Lola", 5),
                    new Cavalo("Marley", 7),
                    new Preguica("Pitoco", 3)
            };

            for (Animal animal : animais) {
                System.out.println(animal.getNome() + ":");
                animal.emitirSom();
                System.out.println();
            }

            Veterinario veterinario = new Veterinario();

            for(Animal animal : animais){
                veterinario.examinar(animal);
            }
        }
}
