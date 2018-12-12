package event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher
{
    ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext)
    {
        this.applicationContext = applicationContext;
    }

    public void publish(String msg)
    {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
