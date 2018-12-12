package aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AwareService implements BeanNameAware, ResourceLoaderAware
{
    private String BeanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader)
    {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String s)
    {
        this.BeanName = s;
    }

    public void outputResult()
    {
        System.out.println("Bean的名称:" + BeanName);
        Resource resource = loader.getResource("aware/test.txt");
        try
        {
            System.out.println("加载的内容:" + IOUtils.toString(resource.getInputStream(), "UTF-8"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
