package ui;

import model.User;
import model.Task;
import model.TaskStatus;
import manager.TaskManager;
import service.NotificationService;
import java.time.LocalDate;


/**
 * アプリのメインクラス（起動点）
 * ユーザーの新規作成
 */
public class Main {
    public static void main(String[] args) {
        // ユーザー作成
        //user変数を新しく定義
        // 例として山田太郎さんのメールアドレスを登録する文章
        User user = new User(1, "山田太郎", "yamada@example.com");

        // タスク作成
        // 
        Task task = new Task(101, "資料作成", "会議用資料を作成する", LocalDate.now().plusDays(2), TaskStatus.NOT_STARTED, user);

        // タスク管理
        TaskManager manager = new TaskManager();
        manager.addTask(task);

        // 通知サービス
        // タスクが来たときにユーザーに通知を行う
        NotificationService notifier = new NotificationService();
        notifier.sendReminder(task);

        // 表示
        System.out.println("登録されたタスク: " + task.getTitle());
    }
}
