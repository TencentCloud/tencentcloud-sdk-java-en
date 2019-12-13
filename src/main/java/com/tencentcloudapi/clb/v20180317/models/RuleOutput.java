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

public class RuleOutput extends AbstractModel{

    /**
    * Forwarding rule ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Session persistence time
    */
    @SerializedName("SessionExpireTime")
    @Expose
    private Long SessionExpireTime;

    /**
    * Health check information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheck HealthCheck;

    /**
    * Certificate information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateOutput Certificate;

    /**
    * Request forwarding method of the rule
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * ID of the listener to which the forwarding rule belongs
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Redirect target information of a forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RewriteTarget")
    @Expose
    private RewriteTarget RewriteTarget;

    /**
    * Whether to enable gzip
    */
    @SerializedName("HttpGzip")
    @Expose
    private Boolean HttpGzip;

    /**
    * Whether the forwarding rule is automatically created
    */
    @SerializedName("BeAutoCreated")
    @Expose
    private Boolean BeAutoCreated;

    /**
    * Whether to use as the default domain name
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * Whether to enable Http2
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * Forwarding protocol between CLB and real server
    */
    @SerializedName("ForwardType")
    @Expose
    private String ForwardType;

    /**
    * Forwarding rule creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Real server type
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Basic information of a bound target group. This field will be returned if a target group is bound to a rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetGroup")
    @Expose
    private BasicTargetGroupInfo TargetGroup;

    /**
    * WAF instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WafDomainId")
    @Expose
    private String WafDomainId;

    /**
    * 
    */
    @SerializedName("TrpcCallee")
    @Expose
    private String TrpcCallee;

    /**
    * 
    */
    @SerializedName("TrpcFunc")
    @Expose
    private String TrpcFunc;

    /**
     * Get Forwarding rule ID 
     * @return LocationId Forwarding rule ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID
     * @param LocationId Forwarding rule ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name of the forwarding rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Forwarding rule path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding rule path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Forwarding rule path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Session persistence time 
     * @return SessionExpireTime Session persistence time
     */
    public Long getSessionExpireTime() {
        return this.SessionExpireTime;
    }

    /**
     * Set Session persistence time
     * @param SessionExpireTime Session persistence time
     */
    public void setSessionExpireTime(Long SessionExpireTime) {
        this.SessionExpireTime = SessionExpireTime;
    }

    /**
     * Get Health check information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthCheck Health check information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthCheck Health check information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthCheck(HealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get Certificate information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Certificate Certificate information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CertificateOutput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Certificate information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Certificate Certificate information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(CertificateOutput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get Request forwarding method of the rule 
     * @return Scheduler Request forwarding method of the rule
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set Request forwarding method of the rule
     * @param Scheduler Request forwarding method of the rule
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get ID of the listener to which the forwarding rule belongs 
     * @return ListenerId ID of the listener to which the forwarding rule belongs
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set ID of the listener to which the forwarding rule belongs
     * @param ListenerId ID of the listener to which the forwarding rule belongs
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Redirect target information of a forwarding rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RewriteTarget Redirect target information of a forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RewriteTarget getRewriteTarget() {
        return this.RewriteTarget;
    }

    /**
     * Set Redirect target information of a forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RewriteTarget Redirect target information of a forwarding rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRewriteTarget(RewriteTarget RewriteTarget) {
        this.RewriteTarget = RewriteTarget;
    }

    /**
     * Get Whether to enable gzip 
     * @return HttpGzip Whether to enable gzip
     */
    public Boolean getHttpGzip() {
        return this.HttpGzip;
    }

    /**
     * Set Whether to enable gzip
     * @param HttpGzip Whether to enable gzip
     */
    public void setHttpGzip(Boolean HttpGzip) {
        this.HttpGzip = HttpGzip;
    }

    /**
     * Get Whether the forwarding rule is automatically created 
     * @return BeAutoCreated Whether the forwarding rule is automatically created
     */
    public Boolean getBeAutoCreated() {
        return this.BeAutoCreated;
    }

    /**
     * Set Whether the forwarding rule is automatically created
     * @param BeAutoCreated Whether the forwarding rule is automatically created
     */
    public void setBeAutoCreated(Boolean BeAutoCreated) {
        this.BeAutoCreated = BeAutoCreated;
    }

    /**
     * Get Whether to use as the default domain name 
     * @return DefaultServer Whether to use as the default domain name
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set Whether to use as the default domain name
     * @param DefaultServer Whether to use as the default domain name
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get Whether to enable Http2 
     * @return Http2 Whether to enable Http2
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set Whether to enable Http2
     * @param Http2 Whether to enable Http2
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get Forwarding protocol between CLB and real server 
     * @return ForwardType Forwarding protocol between CLB and real server
     */
    public String getForwardType() {
        return this.ForwardType;
    }

    /**
     * Set Forwarding protocol between CLB and real server
     * @param ForwardType Forwarding protocol between CLB and real server
     */
    public void setForwardType(String ForwardType) {
        this.ForwardType = ForwardType;
    }

    /**
     * Get Forwarding rule creation time 
     * @return CreateTime Forwarding rule creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Forwarding rule creation time
     * @param CreateTime Forwarding rule creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Real server type 
     * @return TargetType Real server type
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Real server type
     * @param TargetType Real server type
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Basic information of a bound target group. This field will be returned if a target group is bound to a rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetGroup Basic information of a bound target group. This field will be returned if a target group is bound to a rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BasicTargetGroupInfo getTargetGroup() {
        return this.TargetGroup;
    }

    /**
     * Set Basic information of a bound target group. This field will be returned if a target group is bound to a rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetGroup Basic information of a bound target group. This field will be returned if a target group is bound to a rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetGroup(BasicTargetGroupInfo TargetGroup) {
        this.TargetGroup = TargetGroup;
    }

    /**
     * Get WAF instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WafDomainId WAF instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWafDomainId() {
        return this.WafDomainId;
    }

    /**
     * Set WAF instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WafDomainId WAF instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWafDomainId(String WafDomainId) {
        this.WafDomainId = WafDomainId;
    }

    /**
     * Get  
     * @return TrpcCallee 
     */
    public String getTrpcCallee() {
        return this.TrpcCallee;
    }

    /**
     * Set 
     * @param TrpcCallee 
     */
    public void setTrpcCallee(String TrpcCallee) {
        this.TrpcCallee = TrpcCallee;
    }

    /**
     * Get  
     * @return TrpcFunc 
     */
    public String getTrpcFunc() {
        return this.TrpcFunc;
    }

    /**
     * Set 
     * @param TrpcFunc 
     */
    public void setTrpcFunc(String TrpcFunc) {
        this.TrpcFunc = TrpcFunc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SessionExpireTime", this.SessionExpireTime);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamObj(map, prefix + "RewriteTarget.", this.RewriteTarget);
        this.setParamSimple(map, prefix + "HttpGzip", this.HttpGzip);
        this.setParamSimple(map, prefix + "BeAutoCreated", this.BeAutoCreated);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "ForwardType", this.ForwardType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamObj(map, prefix + "TargetGroup.", this.TargetGroup);
        this.setParamSimple(map, prefix + "WafDomainId", this.WafDomainId);
        this.setParamSimple(map, prefix + "TrpcCallee", this.TrpcCallee);
        this.setParamSimple(map, prefix + "TrpcFunc", this.TrpcFunc);

    }
}

