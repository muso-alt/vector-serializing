package Core;
import java.io.Serializable;

    // Реализация класса ArrayVector
public class ArrayVector implements Vector<Double>, Serializable {
    private double[] array;

    public ArrayVector(int size) {
        array = new double[size];
    }

    public ArrayVector(double[] array) {
        this.array = array;
    }

    public int size() {
        return array.length;
    }

    public Double get(int index) {
        return array[index];
    }

    public void set(int index, double value) {
        array[index] = value;
    }

    public Boolean isEmpty(){
        return array.length <= 0;
    }
}