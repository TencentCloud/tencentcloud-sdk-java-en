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

public class ModifyRuleAttributeRequest  extends AbstractModel{

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Forwarding rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Scheduling policy:
rr: round robin;
wrr: weighted round robin;
lc: least connections.
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Whether to enable the origin server health check:
1: enable;
0: disable.
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * Health check configuration parameters
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * Forwarding rule path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Protocol types of the forwarding from acceleration connection to origin server, which supports default, HTTP and HTTPS.
If `ForwardProtocol=default`, the `ForwardProtocol` of the listener will be used.
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * The ‘host’ carried in the request forwarded from the acceleration connection to the origin server.
If `ForwardHost=default`, the domain name of rule will be used. For other cases, the value set in this field will be used.
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

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
     * Get Forwarding rule ID 
     * @return RuleId Forwarding rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID
     * @param RuleId Forwarding rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Scheduling policy:
rr: round robin;
wrr: weighted round robin;
lc: least connections. 
     * @return Scheduler Scheduling policy:
rr: round robin;
wrr: weighted round robin;
lc: least connections.
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Scheduling policy:
rr: round robin;
wrr: weighted round robin;
lc: least connections.
     * @param Scheduler Scheduling policy:
rr: round robin;
wrr: weighted round robin;
lc: least connections.
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Whether to enable the origin server health check:
1: enable;
0: disable. 
     * @return HealthCheck Whether to enable the origin server health check:
1: enable;
0: disable.
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Whether to enable the origin server health check:
1: enable;
0: disable.
     * @param HealthCheck Whether to enable the origin server health check:
1: enable;
0: disable.
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Health check configuration parameters 
     * @return CheckParams Health check configuration parameters
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * Set Health check configuration parameters
     * @param CheckParams Health check configuration parameters
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * Get Forwarding rule path 
     * @return Path Forwarding rule path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Forwarding rule path
     * @param Path Forwarding rule path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Protocol types of the forwarding from acceleration connection to origin server, which supports default, HTTP and HTTPS.
If `ForwardProtocol=default`, the `ForwardProtocol` of the listener will be used. 
     * @return ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server, which supports default, HTTP and HTTPS.
If `ForwardProtocol=default`, the `ForwardProtocol` of the listener will be used.
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set Protocol types of the forwarding from acceleration connection to origin server, which supports default, HTTP and HTTPS.
If `ForwardProtocol=default`, the `ForwardProtocol` of the listener will be used.
     * @param ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server, which supports default, HTTP and HTTPS.
If `ForwardProtocol=default`, the `ForwardProtocol` of the listener will be used.
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get The ‘host’ carried in the request forwarded from the acceleration connection to the origin server.
If `ForwardHost=default`, the domain name of rule will be used. For other cases, the value set in this field will be used. 
     * @return ForwardHost The ‘host’ carried in the request forwarded from the acceleration connection to the origin server.
If `ForwardHost=default`, the domain name of rule will be used. For other cases, the value set in this field will be used.
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * Set The ‘host’ carried in the request forwarded from the acceleration connection to the origin server.
If `ForwardHost=default`, the domain name of rule will be used. For other cases, the value set in this field will be used.
     * @param ForwardHost The ‘host’ carried in the request forwarded from the acceleration connection to the origin server.
If `ForwardHost=default`, the domain name of rule will be used. For other cases, the value set in this field will be used.
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);

    }
}

