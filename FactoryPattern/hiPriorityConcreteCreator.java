package FactoryPattern;

public class hiPriorityConcreteCreator extends RequestCreator {
    @Override
    public requestProduct createRequest() {
        return new highPriorityConcrete();
    }
}
