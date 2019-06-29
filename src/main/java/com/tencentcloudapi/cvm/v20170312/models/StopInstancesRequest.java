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

public class StopInstancesRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether to perform a forced shutdown on the instance in case of a failure of normal shutdown.<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown in case of a failed normal shutdown.<br><br>Default: FALSE.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * Instance shutdown mode. Value range:<br><li>SOFT_FIRST: Perform a forced shutdown in case of a failure of the normal shutdown.<br><li>HARD: Perform a forced shutdown directly.<br><li>SOFT: Soft shutdown.<br>Default value: SOFT.
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
    * Shutdown billing mode for a pay-as-you-go instance. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<br>Default: KEEP_CHARGING. This parameter is only valid for part of pay-as-you-go cloud disk instances. For more information, see [No Charges When Shut down for Pay-as-You-Go Instances Details](https://intl.cloud.tencent.com/document/product/213/19918).
    */
    @SerializedName("StoppedMode")
    @Expose
    private String StoppedMode;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
     * @param Instance Ids of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Whether to perform a forced shutdown on the instance in case of a failure of normal shutdown.<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     * @return ForceStop Whether to perform a forced shutdown on the instance in case of a failure of normal shutdown.<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Configure whether to perform a forced shutdown on the instance in case of a failure of normal shutdown.<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     * @param ForceStop Whether to perform a forced shutdown on the instance in case of a failure of normal shutdown.<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Obtain instance shutdown mode. Value range:<br><li>SOFT_FIRST: Perform a forced shutdown in case of a failure of the normal shutdown.<br><li>HARD: Perform a forced shutdown directly.<br><li>SOFT: Soft shutdown.<br>Default value: SOFT.
     * @return StopType Instance shutdown mode. Value range:<br><li>SOFT_FIRST: Perform a forced shutdown in case of a failure of the normal shutdown.<br><li>HARD: Perform a forced shutdown directly.<br><li>SOFT: Soft shutdown.<br>Default value: SOFT.
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Instance shutdown mode. Value range:<br><li>SOFT_FIRST: Perform a forced shutdown in case of a failure of the normal shutdown.<br><li>HARD: Perform a forced shutdown directly.<br><li>SOFT: Soft shutdown.<br>Default value: SOFT.
     * @param StopType Instance shutdown mode. Value range:<br><li>SOFT_FIRST: Perform a forced shutdown in case of a failure of the normal shutdown.<br><li>HARD: Perform a forced shutdown directly.<br><li>SOFT: Soft shutdown.<br>Default value: SOFT.
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    /**
     * Shutdown billing mode for a pay-as-you-go instance. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<br>Default: KEEP_CHARGING. This parameter is only valid for part of pay-as-you-go cloud disk instances. For more information, see [No Charges When Shut down for Pay-as-You-Go Instances Details](https://intl.cloud.tencent.com/document/product/213/19918).
     * @return StoppedMode Shutdown billing mode for pay-as-you-go instances. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<br>Default: KEEP_CHARGING. This parameter is only valid for part of pay-as-you-go cloud disk instances. For more information, see [No Charges When Shut down for Pay-as-You-Go Instances Details](https://intl.cloud.tencent.com/document/product/213/19918).
     */
    public String getStoppedMode() {
        return this.StoppedMode;
    }

    /**
     * Configure Shutdown billing mode for pay-as-you-go instances. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<br>Default: KEEP_CHARGING. This parameter is only valid for part of pay-as-you-go cloud disk instances. For more information, see [No Charges When Shut down for Pay-as-You-Go Instances Details](https://intl.cloud.tencent.com/document/product/213/19918).
     * @param StoppedMode Shutdown billing mode for pay-as-you-go instances. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<br>Default: KEEP_CHARGING. This parameter is only valid for part of pay-as-you-go cloud disk instances. For more information, see [No Charges When Shut down for Pay-as-You-Go Instances Details](https://intl.cloud.tencent.com/document/product/213/19918).
     */
    public void setStoppedMode(String StoppedMode) {
        this.StoppedMode = StoppedMode;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "StopType", this.StopType);
        this.setParamSimple(map, prefix + "StoppedMode", this.StoppedMode);

    }
}

