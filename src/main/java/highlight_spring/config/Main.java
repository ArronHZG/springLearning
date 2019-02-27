package highlight_spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService=
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java highlight_spring.config"));
        context.close();
    }
}
