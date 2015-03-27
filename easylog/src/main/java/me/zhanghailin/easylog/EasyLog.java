package me.zhanghailin.easylog;

import android.util.Log;

/**
 * A wrapper for {@link android.util.Log}, which automatically set the "fileName#lineNumber" as the
 * tag.
 * <p/>
 * Created by zhanghailin on 26/3/15.
 */
public class EasyLog {
    private EasyLog() {
    }

    private static String generateTag() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        return fileName + "#" + lineNumber;
    }

    private static String generateMsg(Throwable t, String format, Object... formatArgs) {
        String msg = formatArgs.length == 0 ? format : String.format(format, formatArgs);

        if (t != null) {
            msg = msg + '\n' + Log.getStackTraceString(t);
        }

        return msg;
    }

    private static void log(int logLevel, Throwable t, String format, Object... formatArgs) {
        Log.println(logLevel, generateTag(), generateMsg(t, format, formatArgs));
    }

    ;

    @SuppressWarnings("unused")
    public static void v(Throwable t, String format, Object... formatArgs) {
        log(Log.VERBOSE, t, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void v(String format, Object... formatArgs) {
        log(Log.VERBOSE, null, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void d(Throwable t, String format, Object... formatArgs) {
        log(Log.DEBUG, t, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void d(String format, Object... formatArgs) {
        log(Log.DEBUG, null, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void i(Throwable t, String format, Object... formatArgs) {
        log(Log.INFO, t, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void i(String format, Object... formatArgs) {
        log(Log.INFO, null, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void w(Throwable t, String format, Object... formatArgs) {
        log(Log.WARN, t, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void w(String format, Object... formatArgs) {
        log(Log.WARN, null, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void e(Throwable t, String format, Object... formatArgs) {
        log(Log.ERROR, t, format, formatArgs);
    }

    @SuppressWarnings("unused")
    public static void e(String format, Object... formatArgs) {
        log(Log.ERROR, null, format, formatArgs);
    }
}
