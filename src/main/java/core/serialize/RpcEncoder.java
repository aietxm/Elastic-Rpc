package core.serialize;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author: xuemin5
 * @date: Create at 2018/7/30 16:39
 * @description:
 **/
public class RpcEncoder extends MessageToByteEncoder<Object> {

    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, ByteBuf byteBuf) throws Exception {

    }
}
