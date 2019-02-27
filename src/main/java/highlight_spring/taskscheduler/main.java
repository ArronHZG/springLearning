package highlight_spring.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 计划任务
 * 定时任务
 */
public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
