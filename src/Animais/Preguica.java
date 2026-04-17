package Animais;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("som da preguiça");
    }

    public void subirEmArvores(){
        System.out.println("A preguiça está subindo na arvore");
    }
}
