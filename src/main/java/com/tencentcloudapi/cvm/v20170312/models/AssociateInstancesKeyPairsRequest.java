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

public class AssociateInstancesKeyPairsRequest  extends AbstractModel{

    /**
    * One or more instance IDs to be operated, the maximum of each request for batch instance is 100.<br>You can get available instance ID by the following ways:<br><li>Log in console to query instance ID [Console](https://console.cloud.tencent.com/cvm/index).<br><li>Call interface [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，get instance ID from return message `InstanceId`.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * One or more KeyPairs to be operated, the maximum of each request for batch KeyPairs is 100. KeyPairs ID for instance：`skey-3glfot13`.<br>You can get available KeyPairs by the following ways:<br><li>Log in console to query KeyPairs ID [Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPairs ID from return message`KeyId`.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Whether to forced shutdown running instance. It is recommended to manually shut down the running instance before associate the security key. Values:<br><li>TRUE: Perform a forced shutdown if normal shutdown failed<br><li>FALSE: Do not perform a forced shutdown if normal shutdown failed<br>Default: FALSE.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get one or more instance IDs to be operated, the maximum of each request for batch instance is 100.<br>You can get available instance ID by the following ways:<br><li>Log in console to query instance ID [Console](https://console.cloud.tencent.com/cvm/index).<br><li>Call interface [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，get instance ID from return message`InstanceId`.
     * @return InstanceIds one or more instance IDs to be operated, the maximum of each request for batch instance is 100.<br>You can get available instance ID by the following ways:<br><li>Log in console to query instance ID [Console](https://console.cloud.tencent.com/cvm/index).<br><li>Call interface [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，get instance ID from return message`InstanceId`.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set one or more instance IDs to be operated, the maximum of each request for batch instance is 100.<br>You can get available instance ID by the following ways:<br><li>Log in console to query instance ID [Console](https://console.cloud.tencent.com/cvm/index).<br><li>Call interface [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，get instance ID from return message`InstanceId`.
     * @param InstanceIds One or more instance IDs to be operated, the maximum of each request for batch instance is 100.<br>You can get available instance ID by the following ways:<br><li>Log in console to query instance ID [Console](https://console.cloud.tencent.com/cvm/index).<br><li>Call interface [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，get instance ID from return message`InstanceId`.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get one or more KeyPairs to be operated, the maximum of each request for batch KeyPairs is 100. KeyPairs ID for instance: `skey-3glfot13`。<br>You can get available KeyPairs ID by the following ways:<br><li>Log in console to query KeyPairs ID [Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPairs ID from return message`KeyId`.
     * @return KeyIds One or more KeyPairs to be operated, the maximum of each request for batch KeyPairs is 100. KeyPairs ID for instance：`skey-3glfot13`。<br>You can get available KeyPairs ID by the following ways:<br><li>Log in console to query KeyPairs ID [Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPairs ID from return message`KeyId`.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set one or more KeyPairs to be operated, the maximum of each request for batch KeyPairs is 100. KeyPairs ID for instance：`skey-3glfot13`.<br>You can get available KeyPairs ID by the following ways:<br><li>Log in console to query KeyPairs ID [Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPairs ID from return message`KeyId`.
     * @param KeyIds One or more KeyPairs to be operated, the maximum of each request for batch KeyPairs is 100. KeyPairs ID for instance：`skey-3glfot13`<br>You can get available KeyPairs ID by the following ways:<br><li>Log in console to query KeyPairs ID [Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Call interface [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，get KeyPairs ID from return message`KeyId`.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get whether to forced shutdown running instance. It is recommended to manually shut down the running instance before associate the security key. Values:<br><li>TRUE: Perform a forced shutdown if normal shutdown failed<br><li>FALSE: Do not perform a forced shutdown.<br>Default: FALSE.
     * @return ForceStop Whether to forced shutdown running instance. It is recommended to manually shut down the running instance before associate the security key. Values:<br><li>TRUE: Perform a forced shutdown if normal shutdown failed<br><li>FALSE: Do not perform a forced shutdown.<br>Default: FALSE.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set whether to forced shutdown running instance. It is recommended to manually shut down the running instance before associate the security key. Values:<br><li>TRUE: Perform a forced shutdown if normal shutdown failed<br><li>FALSE: Do not perform a forced shutdown.<br>Default: FALSE.
     * @param ForceStop whether to forced shutdown running instance. It is recommended to manually shut down the running instance before associate the security key. Values:<br><li>TRUE: Perform a forced shutdown if normal shutdown failed<br><li>FALSE: Do not perform a forced shutdown.<br>Default: FALSE.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

