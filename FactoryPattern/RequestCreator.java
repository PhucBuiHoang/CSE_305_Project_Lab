package FactoryPattern;

public abstract class RequestCreator {
    public abstract requestProduct createRequest();

    public void processRequest() {
        requestProduct product = createRequest();
        product.setPriority();
        product.setExpire();
        product.setStatus();
        product.processRequest();
    }
}
