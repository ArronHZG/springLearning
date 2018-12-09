package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类
public class JavaConfig
{
    @Bean
    public FunctionService functionService()
    {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService()
    {
        UseFunctionService useFunctionService =new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return  useFunctionService;
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService)
    {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return  useFunctionService;
    }
}
