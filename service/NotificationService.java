package service;

import dto.Task;

/**
 * タスクの通知を行うサービスクラス
 */
public class NotificationService {

/**
* タスクの締め切りが近づいていることを通知する（仮の処理）
*/ 

public void sendReminder(Task task) {
     System.out.println("通知: タスク '" + task.getTitle() + "' の締切が近づいています！"); }


/** 
 * タスクの完了を通知する（仮の処理）
 */
public void sentCompletionNotification(Task task) {
    System.out.println("通知: タスク '" + task.getTitle() + "' が完了しました！"); 
}

@Override
public String toString() {
    return "NotificationService []";
    }
}