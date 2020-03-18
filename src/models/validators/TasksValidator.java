package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasks;

public class TasksValidator {
    // バリデーションを実行する
    public static List<String> validate(Tasks m) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String status_error = _validateStatus(m.getStatus());
        if(!status_error.equals("")) {
            errors.add(status_error);
        }

        return errors;
    }

    // タスクの必須入力チェック
    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスクを入力してください。";
        }

        return "";
    }

    // ステータスの必須入力チェック
    private static String _validateStatus(String status) {
        if(status == null || status.equals("")) {
            return "ステータスを入力してください。";
        }

        return "";
    }
}