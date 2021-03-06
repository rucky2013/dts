/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.quancheng.dts.message;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author liushiming
 * @version ComomCodec.java, v 0.0.1 2017年7月5日 下午4:50:56 liushiming
 * @since JDK 1.8
 */
public interface DtsCodec {
  /**
   * 获取编码类型
   * 
   * @author liushiming
   * @return
   * @since JDK 1.8
   */
  short getTypeCode();

  /**
   * 编码
   * 
   * @author liushiming
   * @return
   * @since JDK 1.8
   */
  byte[] encode();

  /**
   * 解码
   * 
   * @author liushiming
   * @param in
   * @return
   * @since JDK 1.8
   */
  boolean decode(ByteBuf in);


  /**
   * Help Method for set
   * 
   * @author liushiming
   * @param ctx
   * @since JDK 1.8
   */
  void setChannelHandlerContext(ChannelHandlerContext ctx);

  /**
   * Help Method for get
   * 
   * @author liushiming
   * @return
   * @since JDK 1.8
   */
  ChannelHandlerContext getChannelHandlerContext();
}
