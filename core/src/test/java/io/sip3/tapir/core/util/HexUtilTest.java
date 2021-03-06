/*
 *    Copyright 2017 SIP3.IO CORP.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sip3.tapir.core.util;

import org.junit.Test;

import java.nio.ByteBuffer;

import static org.junit.Assert.assertEquals;

/**
 * Created by agafox.
 */
public class HexUtilTest {

    @Test
    public void checkBytesToHex() {
        ByteBuffer buffer = ByteBuffer.wrap("Hello, World!".getBytes());
        assertEquals("48656C6C6F2C20576F726C6421", HexUtil.bytesToHex(buffer));
    }
}
