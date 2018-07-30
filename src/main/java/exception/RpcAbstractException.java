package exception;

/**
 * @author: xuemin5
 * @date: Create at 2018/7/30 14:58
 * @description:
 **/
public class RpcAbstractException extends RuntimeException {

    private ExceptionType exceptionType;

    public RpcAbstractException() {
        super();
    }

    public RpcAbstractException(ExceptionType type) {
        super();
        this.exceptionType = type;
    }
    public RpcAbstractException(String message) {
        super(message);
    }

    public RpcAbstractException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcAbstractException(Throwable cause) {
        super(cause);
    }

    protected RpcAbstractException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
