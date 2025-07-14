package manager;

import model.Task;
import java.util.ArrayList;
import java.util.List;

/**
 * タスクを管理するクラス
 */
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // タスクを追加する
    public void addTask(Task task) {
        tasks.add(task);
    }

    // タスク一覧を取得する
    public List<Task> getTasks() {
        return tasks;
    }

    // タスクをIDで検索する（オプション）
    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
