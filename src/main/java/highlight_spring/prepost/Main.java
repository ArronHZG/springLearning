package highlight_spring.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        Service service = context.getBean(Service.class);
        context.close();
        /**
         * service create
         * init
         * destroy
         */
    }
}
