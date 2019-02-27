package highlight_spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ComponentScan
public class ProfileConfig
{
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean()
    {
        return new DemoBean("from development highlight_spring.profile");

    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean()
    {
        return new DemoBean("from production highlight_spring.profile");
    }
}
