/**
 * Created by jaime on 3/3/16.
 */


public class Set {
   private Object[] aSet = null;
    private int size;

    public Set() {
        aSet = new Object[10];
        size = 0;
    }

    public Set(int size){
        aSet = new Object[size];
        size =0;

    }

    public void add(Object element){
        if(!contains(element)) {
            aSet[size] = element;
            size++;
        }

    }

    public void remove(Object element){
        for (int i = 0; i < size ; i++)
            if (aSet[i].equals(element)) {
                aSet[i] = aSet[size - 1];
                size = size - 1;
                size--;
            }
    }

    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (aSet[i].equals(element))
                return true;
        }
        return false;
    }

    public String toString(){
        String s = "";
        for (int i =0; i<size; i++) {
           s = s + " " + aSet[i].toString();

        }
        return s;
    }

}
