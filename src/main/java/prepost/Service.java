package prepost;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * JSR250实现
 * <p>
 * service create
 * init
 * destroy
 */
@Component
public class Service
{
    public Service()
    {
        System.out.println("service create");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy");
    }
}
