import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import Core.ArrayVector;
import Core.LinkedListVector;
import Core.Vectors;

public class ExampleVectors {
    
    public void scalarMultiply(){
        var v1 = new ArrayVector(new double[]{1.0, 2.0, 3.0});
        double scalar = 2.0;

        var result = Vectors.scalarMultiply(v1, scalar);

        System.out.println(result); // Выведет вектор [2.0, 4.0, 6.0]
    }
    
    public void addVectors(){
        var v1 = new ArrayVector(new double[]{1.0, 2.0, 3.0});
        var v2 = new ArrayVector(new double[]{2.0, 3.0, 5.0});

        var result = Vectors.add(v1, v2);

        System.out.println(result); // Выведет вектор [2.0, 4.0, 6.0]
    }

    public void dotProduct(){
        var v1 = new ArrayVector(new double[]{1.0, 2.0, 3.0});
        var v2 = new ArrayVector(new double[]{2.0, 3.0, 5.0});

        var result = Vectors.dotProduct(v1, v2);

        System.out.println(result); // Выведет вектор [2.0, 4.0, 6.0]
    }

    public void arrayListExample(){
         // Пример ArrayVector
         var arrayVector = new ArrayVector(3);

         // Добавляем элементы в вектор
         arrayVector.set(0, 3.14);
         arrayVector.set(1, 2.71);
         arrayVector.set(2, 1.618);
 
         // Получаем и выводим элементы
         System.out.println("Элементы вектора:");
         for (int i = 0; i < arrayVector.size(); i++) {
             System.out.println("Элемент " + i + ": " + arrayVector.get(i));
         }
 
         // Выводим размер вектора и проверяем, пуст ли он
         System.out.println("Размер вектора: " + arrayVector.size());
         System.out.println("Пуст ли вектор: " + arrayVector.isEmpty());
 
         // Попытка доступа к несуществующему элементу
         // arrayVector.get(10); // Приведет к IndexOutOfBoundsException
    }

    public void linkedListExample(){
         // Пример LinkedListVector
        var linkedListVector = new LinkedListVector();

        // Добавляем элементы в вектор
        linkedListVector.set(0,42);
        linkedListVector.set(1,17);
        linkedListVector.set(2, 99);

        // Получаем и выводим элементы
        System.out.println("Элементы вектора:");
        for (int i = 0; i < linkedListVector.size(); i++) {
            System.out.println("Элемент " + i + ": " + linkedListVector.get(i));
        }

        // Удаляем элемент
        linkedListVector.remove(1);

        // Выводим размер вектора и проверяем, пуст ли он
        System.out.println("Размер вектора: " + linkedListVector.size());
        System.out.println("Пуст ли вектор: " + linkedListVector.isEmpty());

        // Проверяем элементы после удаления
        System.out.println("Элементы вектора после удаления:");
        for (int i = 0; i < linkedListVector.size(); i++) {
            System.out.println("Элемент " + i + ": " + linkedListVector.get(i));
        }
    }

    public void writeAndReadVectorExample(){
        var v = new ArrayVector(new double[]{1.0, 2.0, 3.0});

        // Пример использования writeVector
        try (Writer writer = new FileWriter("vector_output.txt")) {
            Vectors.writeVector(v, writer);
            System.out.println("Vector written to text file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Пример использования readVector
        try (Reader reader = new FileReader("vector_output.txt")) {
            var readVector = Vectors.readVector(reader);
            System.out.println("Vector read from text file: " + readVector);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputVectorExample(){
        // Создаем вектор
        var v = new ArrayVector(new double[]{1.0, 2.0, 3.0});

        // Пример использования outputVector
        try (OutputStream outputStream = new FileOutputStream("vector_output.dat")) {
            Vectors.outputVector(v, outputStream);
            System.out.println("Vector written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputVectorExample(){
        // Пример использования inputVector
        try (InputStream inputStream = new FileInputStream("vector_output.dat")) {
            var readVector = Vectors.inputVector(inputStream);
            System.out.println("Vector read from file: " + readVector);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
