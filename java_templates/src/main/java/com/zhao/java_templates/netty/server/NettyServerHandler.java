package com.zhao.java_templates.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.StandardCharsets;

public class NettyServerHandler  extends ChannelInboundHandlerAdapter {
    //客户端连接成功之后触发该事件，只会触发一次
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("Hello World".getBytes()));
    }

    //接受服务端响应时触发该事件
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf buffer=(ByteBuf)msg;
        byte[] bytes=new byte[buffer.readableBytes()];
        buffer.readBytes(bytes);
        String res=new String(bytes, StandardCharsets.UTF_8);
        System.out.println("客户端响应："+res);
    }
}
