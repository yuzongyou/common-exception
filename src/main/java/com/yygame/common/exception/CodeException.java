package com.yygame.common.exception;

/**
 * @author yzy
 */
public class CodeException extends RuntimeException {

    /**
     * 异常代码
     */
    private int code = 500;

    public CodeException() {
        super("未知异常！");
    }

    public CodeException(int code) {
        super("未知异常！");
    }

    public CodeException(String message) {
        super(message);
    }

    public CodeException(int code, String message) {
        super(message);
        this.code = code;
    }

    public CodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public CodeException(Throwable cause) {
        super(cause);
    }

    public CodeException(int code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public CodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CodeException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
