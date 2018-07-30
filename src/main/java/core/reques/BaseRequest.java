package core.reques;

import java.io.Serializable;

public class BaseRequest implements Serializable {
    private String requestId;
    private String className;
    private String methodName;
    private Object[] arguments;
    private Class<?>[] argumentsTypes;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object[] arguments) {
        this.arguments = arguments;
    }

    public Class<?>[] getArgumentsTypes() {
        return argumentsTypes;
    }

    public void setArgumentsTypes(Class<?>[] argumentsTypes) {
        this.argumentsTypes = argumentsTypes;
    }
}
