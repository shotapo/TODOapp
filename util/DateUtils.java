package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 日付関連のユーティリティクラス
 */
public class DateUtils {

    /**
     * 日付を "yyyy/MM/dd" 形式で文字列に変換する
     */
    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format(formatter);
    }
}
