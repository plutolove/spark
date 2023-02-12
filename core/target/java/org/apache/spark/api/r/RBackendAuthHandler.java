package org.apache.spark.api.r;
/**
 * Authentication handler for connections from the R process.
 */
public  class RBackendAuthHandler extends io.netty.channel.SimpleChannelInboundHandler<byte[]> implements org.apache.spark.internal.Logging {
  // not preceding
  public   RBackendAuthHandler (java.lang.String secret)  { throw new RuntimeException(); }
  // not preceding
  public  void channelRead0 (io.netty.channel.ChannelHandlerContext ctx, byte[] msg)  { throw new RuntimeException(); }
}
