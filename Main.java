import Core.ArrayVector;
import Core.LinkedListVector;

public class Main{
    public static void main(String[] args) {
        // Создаем ArrayVector
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
        
        ////////////////////////////////////////////////
        
        // Создаем LinkedListVector
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
}
