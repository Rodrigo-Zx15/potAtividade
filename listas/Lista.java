/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.NoSuchElementException;

public class Lista implements I_Lista {

    private int qnt = 0;
    private Node start;
    private Node end;

    public Lista() {
        start = end = null;
    }

    @Override
    public boolean isEmpty() {
        return qnt == 0;
    }

    @Override
    public int size() {
        return qnt;
    }

    @Override
    public void add(int index, int element) throws NoSuchElementException {
        if (index >= 0 && index <= qnt) {
            Node novo = new Node(element);
            //inserçao no inicio
            if (index == 0) {
                if (isEmpty()) {
                    end = novo;
                }
                novo.proximo = start;
                start = novo;
            } else {
                //inserçao no fim
                if (index == qnt) {
                    end.proximo = novo;
                    end = novo;
                }
                //inserçao no meio
                Node aux = start;
                for (int i = 0; i < index - 1; i++) {
                    aux = aux.proximo;
                }
                novo.proximo = aux.proximo;
                aux.proximo = novo;

            }
            qnt++;
        }else{
            throw new NoSuchElementException("que isso man ta loco! index inválido...");

        }
        
    }

    @Override
    public int remove(int index) throws IndexOutOfBoundsException {
        Node removed = start;
        if(!isEmpty() && index >= 0 && index < qnt){
            //remoçao no inicio
            if(index == 0){
                start = start.proximo;
                removed.proximo = null;
                if(qnt == 1){
                    start = end = null;
                }
            }else{
                
                //remoçao no meio
                Node aux = start;
                for(int i = 0;i < index-1;i++){
                    aux = aux.proximo;
                }
                removed = aux.proximo;
                aux.proximo = removed.proximo;
                //remoçao no fim
                if(removed == end){
                    end = aux;
                }
            }
            
            removed.proximo = null;    
            qnt--;
            return removed.element;
        }else{
        
            throw new IndexOutOfBoundsException("kkkkkkkkkkk ta moscando bixao index invalido");
        }
        
    }

    @Override
    public int update(int index, int element) throws IndexOutOfBoundsException {
        if(!isEmpty() && (index >= 0 && index <= qnt)){
            Node aux = start;
            for(int i = 0; i <= index;i++){
                aux = aux.proximo;
            }
            aux.element = element;
        }else{
            throw new IndexOutOfBoundsException("alerta de macaco");
        }
        return element; //???????????
        
    }

    /*@Override
    //esse metodo nao existe
    public int get(int index) throws IndexOutOfBoundsException {
        if (!isEmpty() && index >= 0 && index <= qnt) {
            Node aux = start;
            for(int i = 0; i <= index;i++){
                aux = aux.proximo;
            }
            return aux.element;
        }else{
            throw new IndexOutOfBoundsException("kkkkkkkkkkk ta moscando bixao index invalido");
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
        
}


