package config;

public class UseFunctionService
{
    FunctionService functionService;

    public void setFunctionService(config.FunctionService functionService)
    {
        this.functionService = functionService;
    }

    public String sayHello(String word)
    {
        return functionService.sayHello(word);
    }
}
