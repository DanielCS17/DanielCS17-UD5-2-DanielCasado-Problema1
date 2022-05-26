public class Main {

    public static void main(String[] args) {
        SuperList miLista = new SuperList();

        miLista.addElement(10);
        miLista.addElement(20);
        miLista.addElement(30);
        miLista.addElement(40);
        miLista.showElements();
        miLista.removeElement(3);
        miLista.showElements();
        miLista.showReversedElements();
    }
}
