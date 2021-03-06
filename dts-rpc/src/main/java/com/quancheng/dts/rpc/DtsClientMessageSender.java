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
package com.quancheng.dts.rpc;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 
 * @author liushiming
 * @version TxcClientMessageSender.java, v 0.0.1 2017年7月18日 下午4:06:25 liushiming
 * @since JDK 1.8
 */
public interface DtsClientMessageSender {

  public Object invoke(Object msg, long timeout) throws IOException, TimeoutException;

  public Object invoke(String serverAddress, Object msg, long timeout)
      throws IOException, TimeoutException;

  public Object invoke(Object msg) throws IOException, TimeoutException;

  public void sendResponse(long msgId, String serverAddress, Object msg);
}
