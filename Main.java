public class Main{
    public static void main(String[] args) {
        
        var examples = new ExampleVectors();

        //Умножения вектора на скаляр
        examples.scalarMultiply();
        //сложения двух векторов
        examples.addVectors();
        //нахождения скалярного произведения двух векторов в java
        examples.dotProduct();

        //пример arrayList
        examples.arrayListExample();
        //пример linkedList
        examples.linkedListExample();

        //пример Write and Read Vectors
        examples.writeAndReadVectorExample();

        //пример outputVector
        examples.outputVectorExample();
        //пример inputVector
        examples.inputVectorExample();
    }
}
