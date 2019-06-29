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

public class ResetInstancesTypeRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API [`DescribeInstanceTypeConfigs`] (https://intl.cloud.tencent.com/document/api/213/15749) or in the [instance type] (https://intl.cloud.tencent.com/document/product/213/11518) description.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances for each request is 1.
     * @param InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API [`DescribeInstanceTypeConfigs`] (https://intl.cloud.tencent.com/document/api/213/15749) or in the [instance type] (https://intl.cloud.tencent.com/document/product/213/11518) description.
     * @return InstanceType Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [`DescribeInstanceTypeConfigs`] (https://intl.cloud.tencent.com/document/api/213/15749) or in the [instance type] (https://intl.cloud.tencent.com/document/product/213/11518) description.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Configure Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [`DescribeInstanceTypeConfigs`] (https://intl.cloud.tencent.com/document/api/213/15749) or in the [instance type] (https://intl.cloud.tencent.com/document/product/213/11518) description.
     * @param InstanceType Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API [`DescribeInstanceTypeConfigs`] (https://intl.cloud.tencent.com/document/api/213/15749) or in the [instance type] (https://intl.cloud.tencent.com/document/product/213/11518) description.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Understand whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     * @return ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Configure whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     * @param ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values: <br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

