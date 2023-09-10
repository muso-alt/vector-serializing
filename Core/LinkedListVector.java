package Core;
import java.io.Serializable;
import java.util.LinkedList;

    // Реализация класса LinkedListVector
public class LinkedListVector implements Vector<Double>, Serializable {
    private LinkedList<Double> list;

    public LinkedListVector() {
        list = new LinkedList<>();
    }

    public int size() {
        return list.size();
    }

    public Double get(int index) {
        return list.get(index);
    }

    public void set(int index, double value) {
        list.add(index, value);
    }

    public void remove(int index){
        list.remove(index);
    }
    
    public Boolean isEmpty(){
        return size() == 0;
    }
}