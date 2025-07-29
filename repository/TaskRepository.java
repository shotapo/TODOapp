package repository;

import dto.Task;
import java.util.Optional;
import java.util.List;

public class TaskRepository {
    

    @Override
    public void saveTasks(List<Task> tasks) {
        // 実際はファイルやDBに保存する処理を書く
        System.out.println("タスクを保存しました");
    }   

    @Override
    public List <Task> loadTasks() {
        // 実際はファイルやDBから読み込む処理を書く
        System.out.println("タスクを読み込みました");
        return List.of(); // 空のリストを返す
    }

    @Override
    public void saveTask(Task task) {
        // タスクを保存する処理を書く
        System.out.println("タスク '" + task.getTitle() + "件を保存しました");
    }

    @Override
    public Task findTaskById(Long id) {
        // タスクをIDで検索する処理を書く
        System.out.println("IDで " + id + " を検索しました");
        return null; // 仮の実装ではnullを返す
    }
}
