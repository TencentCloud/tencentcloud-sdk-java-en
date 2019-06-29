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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteScalingPolicyRequest  extends AbstractModel{

    /**
    * Alarm scaling policy ID.
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * Indicates whether check is enabled. The check monitors if scaling group activity is in cooldown period. The default value is false.
    */
    @SerializedName("HonorCooldown")
    @Expose
    private Boolean HonorCooldown;

    /**
     * Obtain the alarming scaling policy ID.
     * @return AutoScalingPolicyId Alarm scaling policy ID.
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Configure the alarming scaling policy ID.
     * @param AutoScalingPolicyId Alarm scaling policy ID.
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Obtain whether to check that the scaling group activity is in the cooldown period. The default value is false.
     * @return HonorCooldown Indicates Whether check is enabled. The check monitors if scaling group activity is in cooldown. The default value is false.
     */
    public Boolean getHonorCooldown() {
        return this.HonorCooldown;
    }

    /**
     * Configure if check is enabled. The check monitors if scaling group activity is in cooldown period. The default value is false.
     * @param HonorCooldown Indicates Whether check is enabled. The check monitors if scaling group activity is in cooldown period. The default value is false.
     */
    public void setHonorCooldown(Boolean HonorCooldown) {
        this.HonorCooldown = HonorCooldown;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "HonorCooldown", this.HonorCooldown);

    }
}

