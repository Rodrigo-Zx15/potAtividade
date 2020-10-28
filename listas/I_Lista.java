
package listas;

import java.util.NoSuchElementException;


public interface I_Lista {


    public void add(int index, int element) throws NoSuchElementException;
    public boolean isEmpty();
    public int size();
    public int remove(int index)throws IndexOutOfBoundsException;
    public int  update(int index, int element) throws IndexOutOfBoundsException;
    //public int get(int index);
}
