package FactoryPattern;

import java.time.LocalDate;
import java.util.Date;

public class lowPriorityConcrete implements requestProduct {
    private String priority;
    private Date expireDay;

    private String status;

    @Override
    public void processRequest() {
        this.priority = "Ignore";

    }

    @Override
    public void setExpire() {
        this.expireDay = new Date();

    }

    @Override
    public void setPriority() {
        this.status = "Done";

    }

    @Override
    public void setStatus() {
        System.out.println("Request denied");

    }

}
