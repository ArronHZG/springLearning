package highlight_spring.taskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskService
{
    @Async
    public void executeAsyncTask(int i)
    {
        System.out.println("执行异步任务:"+i);
    }
    @Async
    public void executeAsyncTaskPlus(int i)
    {
        System.out.println("执行异步任务"+i+"+1:"+(i+1));
    }
}
