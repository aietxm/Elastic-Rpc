package core.response;

import java.io.Serializable;

/**
 * @author xuemin5
 */
public class BaseResponse implements Serializable {
    private String requestId;
    private Object response;
    private Throwable exception;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }
}
