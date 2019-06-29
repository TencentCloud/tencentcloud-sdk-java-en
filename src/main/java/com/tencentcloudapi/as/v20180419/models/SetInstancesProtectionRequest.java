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

public class SetInstancesProtectionRequest  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * If the instance needs to be removed from protection
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
     * Obtain the scaling group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Configure the scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain instance ID
     * @return InstanceId Instance ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain the parameter value that indicates if the instance needs to be removed from protection. 
     * @return ProtectedFromScaleIn If the instance needs to be removed from protection. 
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * Set if the instance needs to be removed from protection. 
     * @param ProtectedFromScaleIn If the instance needs to be removed from protection. 
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);

    }
}

