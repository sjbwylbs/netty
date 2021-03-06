/*
 * Copyright 2011 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel;

import java.net.SocketAddress;

/**
 * A {@link ChannelEvent} which represents the transmission or reception of a
 * message.  It can mean the notification of a received message or the request
 * for writing a message, depending on whether it is an upstream event or a
 * downstream event respectively.  Please refer to the {@link ChannelEvent}
 * documentation to find out what an upstream event and a downstream event are
 * and what fundamental differences they have.
 */
public interface MessageEvent extends ChannelEvent {

    /**
     * Returns the message.
     */
    Object getMessage();

    /**
     * Returns the remote address of the message.
     */
    SocketAddress getRemoteAddress();
}
