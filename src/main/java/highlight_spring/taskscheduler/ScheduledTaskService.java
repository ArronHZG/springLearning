package highlight_spring.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒"+dateFormat.format(new Date())+"执行");

    }
    @Scheduled(cron = "0 51 18 ? * *")
    public void fixTimeExecution() {
        System.out.println("固定时间"+dateFormat.format(new Date())+"执行");

    }

}
