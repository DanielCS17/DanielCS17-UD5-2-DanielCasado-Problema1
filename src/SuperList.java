import java.util.Iterator;

public class SuperList extends ListManager{
    @Override
    public void addElement(Object element) {
        list.add(element);
        System.out.println("Se ha añadido el elemento: " + element + " a la lista.");
    }

    @Override
    public Object removeElement(int position) {
        System.out.println("Se ha eliminado el elemento Nº" + position + " (" + list.get(position - 1) + ")" + " de la lista.");
        list.remove(position - 1);
        return null;
    }

    @Override
    public void showElements() {
        int contador = 1;
        Iterator<SuperList> it = list.iterator();

        System.out.println("\n<<<<<<<<<<ELEMENTOS DE LA LISTA>>>>>>>>>>");

        while (it.hasNext()){
            System.out.println("Elemento Nº" + contador + ": " + it.next());
            contador ++;
        }
        System.out.println("");
    }

    @Override
    public void showReversedElements() {
        System.out.println("\n<<<<<<<<<<REVÉS AL LISTA LA DE ELEMENTOS>>>>>>>>>>");
        int actualSize = list.size();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elemento Nº" + actualSize + ": " + list.get(actualSize - 1));
            actualSize --;
        }
        System.out.println("");
    }
}
