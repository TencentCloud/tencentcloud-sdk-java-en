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

public class DescribeClassicalLBListenersRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * List of CLB listener IDs
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * CLB listening protocol. Value range: TCP, UDP, HTTP, HTTPS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * CLB listening port. Value range: [1-65535]
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * Listener status. Value range: 0 (creating), 1 (running)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get List of CLB listener IDs 
     * @return ListenerIds List of CLB listener IDs
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set List of CLB listener IDs
     * @param ListenerIds List of CLB listener IDs
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get CLB listening protocol. Value range: TCP, UDP, HTTP, HTTPS 
     * @return Protocol CLB listening protocol. Value range: TCP, UDP, HTTP, HTTPS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set CLB listening protocol. Value range: TCP, UDP, HTTP, HTTPS
     * @param Protocol CLB listening protocol. Value range: TCP, UDP, HTTP, HTTPS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get CLB listening port. Value range: [1-65535] 
     * @return ListenerPort CLB listening port. Value range: [1-65535]
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set CLB listening port. Value range: [1-65535]
     * @param ListenerPort CLB listening port. Value range: [1-65535]
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get Listener status. Value range: 0 (creating), 1 (running) 
     * @return Status Listener status. Value range: 0 (creating), 1 (running)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Listener status. Value range: 0 (creating), 1 (running)
     * @param Status Listener status. Value range: 0 (creating), 1 (running)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

