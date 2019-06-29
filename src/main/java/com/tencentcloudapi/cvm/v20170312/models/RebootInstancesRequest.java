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

public class RebootInstancesRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether to perform a forced restart on the instance in case of a failure of normal restart.<br><li>TRUE: Perform a forced restart in case of a failed normal restart.<br><li>FALSE：Do not perform a forced restart on the instance in case of a failure of normal restart<br><br>Default: FALSE.
    */
    @SerializedName("ForceReboot")
    @Expose
    private Boolean ForceReboot;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @return InstanceIds ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @param Instance Ids of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtaining whether to perform a forced shutdown on the instance in case of a failure of normal restart.<br><li>TRUE: Perform a forced restart in case of a failed normal restart.<br><li>FALSE：Do not perform a forced restart in case of a ffail normal restart<br><br>Default: FALSE.
     * @return ForceReboot  Whether to perform a forced restart in case of a failure of noral restart.<br><li>TRUE: Perform a forced restart in case of a failed normal restart.<br><li>FALSE：Do not perform a forced restart in case of a failed normal restart.<br><br>Default: FALSE.
     */
    public Boolean getForceReboot() {
        return this.ForceReboot;
    }

    /**
     * Setting whether to perform a forced restart on the instance in case of a failure of normal restart.value range:<br><li>TRUE: Perform a forced restart in case of a failed normal restart.<br><li>FALSE：Do not perform a forced restart in case of a failed normal restart.<br><br>Default: FALSE.
     * @param ForceReboot whether to perform a forced restart on the instance in case of a failure of normal restart.value range:<br><li>TRUE: Perform a forced restart in case of a failed normal restart.<br><li>FALSE：Do not perform a forced restart in case of a failed normal restart.<br><br>Default: FALSE.
     */
    public void setForceReboot(Boolean ForceReboot) {
        this.ForceReboot = ForceReboot;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForceReboot", this.ForceReboot);

    }
}

