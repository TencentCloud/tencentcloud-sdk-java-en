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

public class SetInstancesProtectionRequest extends AbstractModel{

    /**
    * Auto scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether the instance needs to be protected from scale-in.
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
     * Get Auto scaling group ID. 
     * @return AutoScalingGroupId Auto scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID.
     * @param AutoScalingGroupId Auto scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Instance ID. 
     * @return InstanceIds Instance ID.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID.
     * @param InstanceIds Instance ID.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether the instance needs to be protected from scale-in. 
     * @return ProtectedFromScaleIn Whether the instance needs to be protected from scale-in.
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * Set Whether the instance needs to be protected from scale-in.
     * @param ProtectedFromScaleIn Whether the instance needs to be protected from scale-in.
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);

    }
}

