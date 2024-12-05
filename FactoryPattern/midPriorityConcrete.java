package FactoryPattern;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class midPriorityConcrete implements requestProduct {
    private String priority;
    private Date expireDay;

    private String status;

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1); // One month from current day
        this.expireDay = cal.getTime();
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + this.expireDay);
    }
}
