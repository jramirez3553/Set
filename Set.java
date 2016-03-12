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

    private int indexOf(Object element){
        for (int i = 0; i < size; i++) {
            if (aSet[i].equals(element))
                return i;
        }

                return -1;
    }

    public void remove(Object element){
           int i = indexOf(element);
            if(i == -1)
                return;
           aSet[i] = aSet[size - 1];
           size--;

    }

    public boolean contains(Object element) {
       if(indexOf(element) == -1)
           return false;
        else return true;
    }

    public boolean equals(Object element){
        if(element == null)
            return false;
        if(getClass() != element.getClass())
            return false;
        Set anotherSet = (Set)element;
        if (size() != anotherSet.size())
            return false;

        int count =0;
        for (int i = 0; i < size; i++) {
            for(int j=0; j < size; j++)
                if(aSet[i].equals(anotherSet.aSet[j]))
                    count++;
        }
            return count == size ? true : false;

    }
    public int size(){
        return size;
    }

    public String toString(){
        String s = "";
        for (int i =0; i<size; i++) {
           s = s + " " + aSet[i].toString();

        }
        return s;
    }

}
