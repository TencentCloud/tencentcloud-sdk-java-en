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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTCPListenersRequest extends AbstractModel{

    /**
    * Listener name.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * List of listener ports.
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * Origin server scheduling policy of listeners, which supports round robin (rr), weighted round robin (wrr), and least connections (lc).
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * The origin server type of listeners, supporting IP or DOMAIN type. The DOMAIN origin servers do not support the weighted round robin.
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Time interval of origin server health check (unit: seconds). Value range: [5, 300].
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * List of origin server ports, which only supports the listeners of version 1.0 and connection group.
    */
    @SerializedName("RealServerPorts")
    @Expose
    private Long [] RealServerPorts;

    /**
     * Get Listener name. 
     * @return ListenerName Listener name.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name.
     * @param ListenerName Listener name.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get List of listener ports. 
     * @return Ports List of listener ports.
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set List of listener ports.
     * @param Ports List of listener ports.
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Origin server scheduling policy of listeners, which supports round robin (rr), weighted round robin (wrr), and least connections (lc). 
     * @return Scheduler Origin server scheduling policy of listeners, which supports round robin (rr), weighted round robin (wrr), and least connections (lc).
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Origin server scheduling policy of listeners, which supports round robin (rr), weighted round robin (wrr), and least connections (lc).
     * @param Scheduler Origin server scheduling policy of listeners, which supports round robin (rr), weighted round robin (wrr), and least connections (lc).
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check. 
     * @return HealthCheck Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
     * @param HealthCheck Whether origin server has the health check enabled. 1: enabled; 0: disabled. UDP listeners do not support health check.
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get The origin server type of listeners, supporting IP or DOMAIN type. The DOMAIN origin servers do not support the weighted round robin. 
     * @return RealServerType The origin server type of listeners, supporting IP or DOMAIN type. The DOMAIN origin servers do not support the weighted round robin.
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set The origin server type of listeners, supporting IP or DOMAIN type. The DOMAIN origin servers do not support the weighted round robin.
     * @param RealServerType The origin server type of listeners, supporting IP or DOMAIN type. The DOMAIN origin servers do not support the weighted round robin.
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both. 
     * @return ProxyId Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     * @param ProxyId Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both. 
     * @return GroupId Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     * @param GroupId Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Time interval of origin server health check (unit: seconds). Value range: [5, 300]. 
     * @return DelayLoop Time interval of origin server health check (unit: seconds). Value range: [5, 300].
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set Time interval of origin server health check (unit: seconds). Value range: [5, 300].
     * @param DelayLoop Time interval of origin server health check (unit: seconds). Value range: [5, 300].
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop. 
     * @return ConnectTimeout Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
     * @param ConnectTimeout Response timeout of origin server health check (unit: seconds). Value range: [2, 60]. The timeout value shall be less than the time interval for health check DelayLoop.
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get List of origin server ports, which only supports the listeners of version 1.0 and connection group. 
     * @return RealServerPorts List of origin server ports, which only supports the listeners of version 1.0 and connection group.
     */
    public Long [] getRealServerPorts() {
        return this.RealServerPorts;
    }

    /**
     * Set List of origin server ports, which only supports the listeners of version 1.0 and connection group.
     * @param RealServerPorts List of origin server ports, which only supports the listeners of version 1.0 and connection group.
     */
    public void setRealServerPorts(Long [] RealServerPorts) {
        this.RealServerPorts = RealServerPorts;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamArraySimple(map, prefix + "RealServerPorts.", this.RealServerPorts);

    }
}

