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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerHealth extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * List of listeners
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Listeners")
    @Expose
    private ListenerHealth [] Listeners;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadBalancerName CLB instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadBalancerName CLB instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get List of listeners
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Listeners List of listeners
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ListenerHealth [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set List of listeners
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Listeners List of listeners
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListeners(ListenerHealth [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);

    }
}

