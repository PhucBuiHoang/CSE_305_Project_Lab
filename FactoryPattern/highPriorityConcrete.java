package FactoryPattern;

import java.time.LocalDate;
import java.util.Date;

public class highPriorityConcrete implements requestProduct {
    private String priority;
    private Date expireDay;

    private String status;

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        this.expireDay = new Date(); // Current day
    }

    @Override
    public void setStatus() {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administrator will contact you immediately!");
    }
}
