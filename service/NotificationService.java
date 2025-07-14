package service;


import model.Task;

/**
 * タスクの通知を行うサービスクラス
 */
public class NotificationService {

/**
* タスクの締め切りが地数いていることを通知する（仮の処理）
*/ 

public void sendReminder(Task task) {
     System.out.println("通知: タスク '" + task.getTitle() + "' の締切が近づいています！"); }

@Override
public String toString() {
    return "NotificationService []";
    }
}