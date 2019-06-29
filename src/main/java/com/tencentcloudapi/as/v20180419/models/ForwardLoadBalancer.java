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

public class ForwardLoadBalancer  extends AbstractModel{

    /**
    * ID of Load balancer.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * ID of the application-based load balancer listener.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of target rule attributes.
    */
    @SerializedName("TargetAttributes")
    @Expose
    private TargetAttribute [] TargetAttributes;

    /**
    * ID of forwarding rule.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * Obtain the ID of Load balancer.
     * @return LoadBalancerId ID of Load balancer.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Configure the ID of Load balancer.
     * @param LoadBalancerId ID of Load balancer.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Obtain an ID of the application-based load balancer listener.
     * @return ListenerId ID of the application-based load balancer listener.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Configure an ID of the application-based load balancer listener.
     * @param ListenerId ID of the application-based load balancer listener.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Obtain a list of target rule attributes.
     * @return TargetAttributes List of target rule attributes.
     */
    public TargetAttribute [] getTargetAttributes() {
        return this.TargetAttributes;
    }

    /**
     * Configure a list of target rule attributes.
     * @param TargetAttributes List of target rule attributes.
     */
    public void setTargetAttributes(TargetAttribute [] TargetAttributes) {
        this.TargetAttributes = TargetAttributes;
    }

    /**
     * Obtain the ID of forwarding rule.
     * @return LocationId ID of forwarding rule.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Configure the ID of forwarding rule.
     * @param LocationId ID of forwarding rule.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "TargetAttributes.", this.TargetAttributes);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}

