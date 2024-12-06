package PaymentSystem.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("PaymentBean.xml");
        PaymentType pay=Context.getBean(PaymentType.class);
        pay.paymentProcess(1200.00);
        
    }
}
