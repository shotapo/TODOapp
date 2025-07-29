package service;

import dto.Task;
import org.springframework.stereotype.Service;
/**
 * タスクの通知を行うサービスクラス
 */
@Service
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

// ===== ゲッターとセッター =======
public void setTask(Task task) {
    // タスクを設定する処理（必要に応じて実装）
}

public Task getTask() {
    // タスクを取得する処理（必要に応じて実装）
    return null; // 仮の実装ではnullを返す
}

public void deleteTask(Long id) {
    // タスクを削除する処理を書く
    System.out.println("タスクID " + id + " を削除しました");
}

public void saveTask(Task task) {
    // タスクを保存する処理を書く
    System.out.println("タスク '" + task.getTitle() + "' を保存しました");
}   

public Task findTaskById(Long id) {
    // タスクをIDで検索する処理を書く
    System.out.println("IDで " + id + " を検索しました");
    return null; // 仮の実装ではnullを返す
}

}   