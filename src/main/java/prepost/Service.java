package prepost;

public class Service
{
    public void init()
    {
        System.out.println("init");
    }

    public  Service()
    {
        System.out.println("service create");
    }

    public void destroy()
    {
        System.out.println("destroy");
    }
}
