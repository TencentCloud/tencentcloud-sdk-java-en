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

public class ModifyLoadBalancersRequest  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * ID list of Traditional CLB: Currently the maximum length is 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * ID list of Application CLB: Currently the maximum length is 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
    */
    @SerializedName("ForwardLoadBalancers")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancers;

    /**
     * Obtain Scaling Group ID.
     * @return AutoScalingGroupId Scaling Group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling Group ID
     * @param AutoScalingGroupId Scaling Group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain ID list of Traditional CLB: Currently the maximum length is 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     * @return LoadBalancerIDs ID List of Traditional CLB, Currently the maximum length 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set ID List of Traditional CLB, Currently the maximum length 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     * @param LoadBalancerIDs ID List of Traditional CLB, Currently the maximum length 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Obtain ID list of Application CLB: Currently the maximum length is 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     * @return ForwardLoadBalancers ID List of Application CLB, Currently the maximum length 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     */
    public ForwardLoadBalancer [] getForwardLoadBalancers() {
        return this.ForwardLoadBalancers;
    }

    /**
     * Set ID List of Application CLB, Currently the maximum length 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     * @param ForwardLoadBalancers ID List of Application CLB, Currently the maximum length 1. Only one of LoadBalancerIds and ForwardLoadBalancers can be defined.
     */
    public void setForwardLoadBalancers(ForwardLoadBalancer [] ForwardLoadBalancers) {
        this.ForwardLoadBalancers = ForwardLoadBalancers;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancers.", this.ForwardLoadBalancers);

    }
}

