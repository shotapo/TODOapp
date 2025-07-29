package repository;

import java.util.List;
import dto.Task;
/**
 * タスクの保存・読み込みを扱うクラス（仮実装）
 */
public class TaskRepository {

    /**
     * タスク一覧を保存する（仮の処理）
     */
    public void saveTasks(List<Task> tasks) {
        // 実際はファイルやDBに保存する処理を書く
        System.out.println("タスクを保存しました（仮）");
    }

    /**
     * タスク一覧を読み込む（仮の処理）
     */
    public List<Task> loadTasks() {
        // 実際はファイルやDBから読み込む処理を書く
        System.out.println("タスクを読み込みました（仮）");
        return List.of(); // 空のリストを返す
    }

    // toStringメソッドのオーバーライド
    @Override
    public String toString() {
        return "TaskRepository []"; // クラス名を返す
    }   

    // 
}
