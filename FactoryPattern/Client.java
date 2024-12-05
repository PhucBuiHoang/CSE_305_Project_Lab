package FactoryPattern;

public class Client {
    public static void main(String[] args) {
        RequestCreator lowCreator = new hiPriorityConcreteCreator();
        lowCreator.processRequest();
    }
}
