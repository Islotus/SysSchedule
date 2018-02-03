package Islotus;

public class Main {
    public static void main(String args[]) {
        int poolSize = 1000;
        int groupNum = 10;
        int sleepTimeGps = 2000;  //milliSeconds
        int sleepTimeMeter = 4000;  //milliSeconds sleepTimeMeter >= sleepTimeGps
        int aliveTime = 20;  //seconds

        ConfClass conf = new ConfClass(poolSize,groupNum,sleepTimeGps,sleepTimeMeter,aliveTime);
        conf.setThreadConf();

        ScheduleThreadPool scheduleThreadPool = new ScheduleThreadPool(conf);
        scheduleThreadPool.doTask();
    }
}
