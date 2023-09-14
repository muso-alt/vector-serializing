package Core;
import java.io.*;

public class Vectors 
{
    // Реализация умножения вектора на скаляр
    public static Vector<Double> scalarMultiply(Vector<Double> v, double scalar) {
        int size = v.size();
        var result = new ArrayVector(size);

        for (int i = 0; i < size; i++) {
            double newValue = (double)v.get(i) * scalar;
            result.set(i, newValue);
        }

        return result;
    }

    // Реализация сложения двух векторов
    public static Vector<Double> add(Vector<Double> v1, Vector v2) {
        if (v1.size() != v2.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }

        int size = v1.size();
        var result = new ArrayVector(size);

        for (int i = 0; i < size; i++) {
            double sum = (double) v1.get(i) + (double) v2.get(i);
            result.set(i, sum);
        }

        return result;
    }

    //Реализация нахождения скалярного произведения двух векторов в java
    public static double dotProduct(Vector<Double> v1, Vector<Double> v2) {
        if (v1.size() != v2.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }

        double result = 0.0;
        for (int i = 0; i < v1.size(); i++) {
            result += (double) v1.get(i) * (double)v2.get(i);
        }
        return result;
    }

    public static void outputVector(Vector<Double> v, OutputStream out) throws IOException {
        // Запись вектора в байтовый поток
        DataOutputStream dataOut = new DataOutputStream(out);
        dataOut.writeInt(v.size());
        for (int i = 0; i < v.size(); i++) {
            dataOut.writeDouble((double) v.get(i));
        }
    }

    public static Vector<Double> inputVector(InputStream in) throws IOException {
        // Чтение вектора из байтового потока
        DataInputStream dataIn = new DataInputStream(in);
        int size = dataIn.readInt();
        var v = new ArrayVector(size);
        for (int i = 0; i < size; i++) {
            v.set(i, dataIn.readDouble());
        }
        return v;
    }

    public static void writeVector(Vector<Double> v, Writer out) throws IOException {
        // Запись вектора в символьный поток
        PrintWriter writer = new PrintWriter(out);
        writer.print(v.size());
        writer.print(" ");
        for (int i = 0; i < v.size(); i++) {
            writer.print(v.get(i));
            writer.print(" ");
        }
        writer.println();
        writer.flush();
    }

    public static Vector<Double> readVector(Reader in) throws IOException {
        // Чтение вектора из символьного потока
        StreamTokenizer tokenizer = new StreamTokenizer(in);
        tokenizer.nextToken(); // Чтение размерности вектора
        int size = (int) tokenizer.nval;
        var v = new ArrayVector(size);
        for (int i = 0; i < size; i++) {
            tokenizer.nextToken(); // Чтение значения координаты
            v.set(i, tokenizer.nval);
        }
        return v;
    }
    
}