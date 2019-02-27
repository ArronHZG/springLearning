package highlight_spring.config;

public class UseFunctionService
{
    FunctionService functionService;

    public void setFunctionService(highlight_spring.config.FunctionService functionService)
    {
        this.functionService = functionService;
    }

    public String sayHello(String word)
    {
        return functionService.sayHello(word);
    }
}
