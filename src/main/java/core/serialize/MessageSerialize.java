package core.serialize;

import exception.RpcAbstractException;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author: xuemin5
 * @date: Create at 2018/7/30 16:18
 * @description:
 **/
public interface MessageSerialize {

    void serialize(OutputStream outputStream , Object value) throws RpcAbstractException;

    Object deSerialize(InputStream inputStream) throws RpcAbstractException;
}
