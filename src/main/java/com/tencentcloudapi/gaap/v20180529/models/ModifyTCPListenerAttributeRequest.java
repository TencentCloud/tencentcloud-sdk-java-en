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

public class ModifyTCPListenerAttributeRequest  extends AbstractModel{

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Connection group ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Connection ID; Either `ProxyId` or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Origin server scheduling policy of listeners, which supports round robin (rr), weighted round robin (wrr), and least connections (lc).
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

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
    * Whether to enable health check. 1: enable; 0: disable.
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
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
     * Get Listener name 
     * @return ListenerName Listener name
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Listener name
     * @param ListenerName Listener name
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
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
     * Get Whether to enable health check. 1: enable; 0: disable. 
     * @return HealthCheck Whether to enable health check. 1: enable; 0: disable.
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether to enable health check. 1: enable; 0: disable.
     * @param HealthCheck Whether to enable health check. 1: enable; 0: disable.
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);

    }
}

