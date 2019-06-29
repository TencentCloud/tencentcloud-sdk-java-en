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

public class DisassociateInstancesKeyPairsRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with. A maximum of 100 instances are allowed in a batch for each request.<br><br>Instance ID(s) can be retrieved using methods below:<br><li>Find instance ID by log in to the [CVM console](https://console.cloud.tencent.com/cvm/index).<br><li>Utilize method [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728), find `InstanceId` in response as instance ID.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * ID(s) of one or more key pairs you are working with. The maximum number of key pairs in a batch for each request is 100. A key pair ID takes a format as: `skey-11112222` .<br><br>SSH key pair ID(s) can be retrieved using methods below:<br><li>Find SSH key pair ID by log in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Utilize method [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699), find `KeyId` in response as SSH key pair ID.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before disassociate instance key pairs. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get ID(s) of one or more instances. A maximum of 100 instances are allowed in a batch for each request.<br><br>Instance ID(s) can be retrieved using methods below:<br><li>Find instance ID by log in to the [CVM console](https://console.cloud.tencent.com/cvm/index).<br><li>Utilize method [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728), find `InstanceId` in response as instance ID.
     * @return InstanceIds ID(s) of one or more instances you are working with. A maximum of 100 instances are allowed in a batch for each request.<br><br>Instance ID(s) can be retrieved using methods below:<br><li>Find instance ID by log in to the [CVM console](https://console.cloud.tencent.com/cvm/index).<br><li>Utilize method [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728), find `InstanceId` in response as instance ID.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID(s) of one or more instances. A maximum of 100 instances are allowed in a batch for each request.<br><br>Instance ID(s) can be retrieved using methods below:<br><li>Find instance ID by log in to the [CVM console](https://console.cloud.tencent.com/cvm/index).<br><li>Utilize method [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728), find `InstanceId` in response as instance ID.
     * @param InstanceIds ID(s) of one or more instances you are working with. A maximum of 100 instances are allowed in a batch for each request.<br><br>Instance ID(s) can be retrieved using methods below:<br><li>Find instance ID by log in to the [CVM console](https://console.cloud.tencent.com/cvm/index).<br><li>Utilize method [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728), find `InstanceId` in response as instance ID.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get list of key pair IDs. A maximum of 100 key pairs are allowed in a batch for each request. A key pair ID takes a format as: `skey-11112222` .<br><br>Available key pair ID(s) can be retrieved using methods below:<br><li>Find SSH key pair ID by log in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Utilize method [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699), find `KeyId` in response as SSH key pair ID.
     * @return KeyIds list of key pair IDs. A maximum of 100 key pairs are allowed in a batch for each request. A key pair ID takes a format as: `skey-11112222` .<br><br>Available key pairs ID(s) can be retrieved using methods below:<br><li>Find SSH key pair ID by log in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Utilize method [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699), find `KeyId` in response as SSH key pair ID.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set list of key pair IDs. A maximum of 100 key pairs are allowed in a batch for each request. A key pair ID takes a format as: `skey-11112222` .<br><br>Available SSH key pair ID(s) can be retrieved using methods below:<br><li>Find SSH key pair ID by log in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Utilize method [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699), find `KeyId` in response as SSH Key ID.
     * @param KeyIds list of key pair IDs. A maximum of 100 key pairs are allowed in a batch for each request. A key pair ID takes a format as: `skey-11112222` .<br><br>Available SSH key pairs ID(s) can be retrieved using methods below:<br><li>Find SSH key pair ID by log in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Utilize method [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15699), find `KeyId` in response as SSH key pair ID.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before disassociate instance key pairs. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     * @return ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before disassociate instance key pairs. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before disassociate instance key pairs. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     * @param ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before disassociate instance key pairs. Values: <br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
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

