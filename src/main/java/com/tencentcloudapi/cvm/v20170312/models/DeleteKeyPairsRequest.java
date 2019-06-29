/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteKeyPairsRequest  extends AbstractModel{

    /**
    * one or more KeyPairs ID you are working with. A maximum of 100 key pairs are allowed in a batch for each request.<br>Get the available Key ID by either of the following ways:<br><li>Log in console to query Key ID [console (https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPair ID from return message`KeyId`.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
     * one or more KeyPairs ID you are working with. A maximum of 100 key pairs are allowed in a batch for each request.<br>Get the available Key ID by either of the following ways:<br><li>Log in console to query Key ID [console (https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPair ID from return message`KeyId`. 
     * @return KeyIds one or more KeyPairs ID you are working with. A maximum of 100 key pairs are allowed in a batch for each request.<br>Get the available Key ID by either of the following ways:<br><li>Log in console to query Key ID [console (https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPair ID from return message`KeyId`. 
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set one or more KeyPairs ID you are working with. A maximum of 100 key pairs are allowed in a batch for each request.<br>Get the available Key ID by either of the following ways:<br><li>Log in console to query Key ID [console (https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPair ID from return message`KeyId`. 
     * @param KeyIds one or more KeyPairs ID you are working with. A maximum of 100 key pairs are allowed in a batch for each request.<br>Get the available Key ID by either of the following ways:<br><li>Log in console to query Key ID [console (https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPair ID from return message`KeyId`. 
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);

    }
}

