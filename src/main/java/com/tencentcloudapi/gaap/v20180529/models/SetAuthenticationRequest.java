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

public class SetAuthenticationRequest extends AbstractModel{

    /**
    * Listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * The domain name requiring advanced configuration, i.e., the domain name of the listener’s forwarding rules.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Whether to enable the basic authentication:
0: disable basic authentication;
1: enable basic authentication.
The default value is 0.
    */
    @SerializedName("BasicAuth")
    @Expose
    private Long BasicAuth;

    /**
    * Whether to enable the connection authentication, which is for the origin server to authenticate GAAP.
0: disable;
1: enable.
The default value is 0.
    */
    @SerializedName("GaapAuth")
    @Expose
    private Long GaapAuth;

    /**
    * Whether to enable the origin server authentication, which is for GAAP to authenticate the server.
0: disable;
1: enable.
The default value is 0.
    */
    @SerializedName("RealServerAuth")
    @Expose
    private Long RealServerAuth;

    /**
    * Basic authentication configuration ID, which is obtained from the certificate management page.
    */
    @SerializedName("BasicAuthConfId")
    @Expose
    private String BasicAuthConfId;

    /**
    * Connection SSL certificate ID, which is obtained from the certificate management page.
    */
    @SerializedName("GaapCertificateId")
    @Expose
    private String GaapCertificateId;

    /**
    * Origin server CA certificate ID, which is obtained from the certificate management page.
    */
    @SerializedName("RealServerCertificateId")
    @Expose
    private String RealServerCertificateId;

    /**
    * Domain name of the origin server certificate.
    */
    @SerializedName("RealServerCertificateDomain")
    @Expose
    private String RealServerCertificateDomain;

    /**
     * Get Listener ID. 
     * @return ListenerId Listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID.
     * @param ListenerId Listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get The domain name requiring advanced configuration, i.e., the domain name of the listener’s forwarding rules. 
     * @return Domain The domain name requiring advanced configuration, i.e., the domain name of the listener’s forwarding rules.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name requiring advanced configuration, i.e., the domain name of the listener’s forwarding rules.
     * @param Domain The domain name requiring advanced configuration, i.e., the domain name of the listener’s forwarding rules.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Whether to enable the basic authentication:
0: disable basic authentication;
1: enable basic authentication.
The default value is 0. 
     * @return BasicAuth Whether to enable the basic authentication:
0: disable basic authentication;
1: enable basic authentication.
The default value is 0.
     */
    public Long getBasicAuth() {
        return this.BasicAuth;
    }

    /**
     * Set Whether to enable the basic authentication:
0: disable basic authentication;
1: enable basic authentication.
The default value is 0.
     * @param BasicAuth Whether to enable the basic authentication:
0: disable basic authentication;
1: enable basic authentication.
The default value is 0.
     */
    public void setBasicAuth(Long BasicAuth) {
        this.BasicAuth = BasicAuth;
    }

    /**
     * Get Whether to enable the connection authentication, which is for the origin server to authenticate GAAP.
0: disable;
1: enable.
The default value is 0. 
     * @return GaapAuth Whether to enable the connection authentication, which is for the origin server to authenticate GAAP.
0: disable;
1: enable.
The default value is 0.
     */
    public Long getGaapAuth() {
        return this.GaapAuth;
    }

    /**
     * Set Whether to enable the connection authentication, which is for the origin server to authenticate GAAP.
0: disable;
1: enable.
The default value is 0.
     * @param GaapAuth Whether to enable the connection authentication, which is for the origin server to authenticate GAAP.
0: disable;
1: enable.
The default value is 0.
     */
    public void setGaapAuth(Long GaapAuth) {
        this.GaapAuth = GaapAuth;
    }

    /**
     * Get Whether to enable the origin server authentication, which is for GAAP to authenticate the server.
0: disable;
1: enable.
The default value is 0. 
     * @return RealServerAuth Whether to enable the origin server authentication, which is for GAAP to authenticate the server.
0: disable;
1: enable.
The default value is 0.
     */
    public Long getRealServerAuth() {
        return this.RealServerAuth;
    }

    /**
     * Set Whether to enable the origin server authentication, which is for GAAP to authenticate the server.
0: disable;
1: enable.
The default value is 0.
     * @param RealServerAuth Whether to enable the origin server authentication, which is for GAAP to authenticate the server.
0: disable;
1: enable.
The default value is 0.
     */
    public void setRealServerAuth(Long RealServerAuth) {
        this.RealServerAuth = RealServerAuth;
    }

    /**
     * Get Basic authentication configuration ID, which is obtained from the certificate management page. 
     * @return BasicAuthConfId Basic authentication configuration ID, which is obtained from the certificate management page.
     */
    public String getBasicAuthConfId() {
        return this.BasicAuthConfId;
    }

    /**
     * Set Basic authentication configuration ID, which is obtained from the certificate management page.
     * @param BasicAuthConfId Basic authentication configuration ID, which is obtained from the certificate management page.
     */
    public void setBasicAuthConfId(String BasicAuthConfId) {
        this.BasicAuthConfId = BasicAuthConfId;
    }

    /**
     * Get Connection SSL certificate ID, which is obtained from the certificate management page. 
     * @return GaapCertificateId Connection SSL certificate ID, which is obtained from the certificate management page.
     */
    public String getGaapCertificateId() {
        return this.GaapCertificateId;
    }

    /**
     * Set Connection SSL certificate ID, which is obtained from the certificate management page.
     * @param GaapCertificateId Connection SSL certificate ID, which is obtained from the certificate management page.
     */
    public void setGaapCertificateId(String GaapCertificateId) {
        this.GaapCertificateId = GaapCertificateId;
    }

    /**
     * Get Origin server CA certificate ID, which is obtained from the certificate management page. 
     * @return RealServerCertificateId Origin server CA certificate ID, which is obtained from the certificate management page.
     */
    public String getRealServerCertificateId() {
        return this.RealServerCertificateId;
    }

    /**
     * Set Origin server CA certificate ID, which is obtained from the certificate management page.
     * @param RealServerCertificateId Origin server CA certificate ID, which is obtained from the certificate management page.
     */
    public void setRealServerCertificateId(String RealServerCertificateId) {
        this.RealServerCertificateId = RealServerCertificateId;
    }

    /**
     * Get Domain name of the origin server certificate. 
     * @return RealServerCertificateDomain Domain name of the origin server certificate.
     */
    public String getRealServerCertificateDomain() {
        return this.RealServerCertificateDomain;
    }

    /**
     * Set Domain name of the origin server certificate.
     * @param RealServerCertificateDomain Domain name of the origin server certificate.
     */
    public void setRealServerCertificateDomain(String RealServerCertificateDomain) {
        this.RealServerCertificateDomain = RealServerCertificateDomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "BasicAuth", this.BasicAuth);
        this.setParamSimple(map, prefix + "GaapAuth", this.GaapAuth);
        this.setParamSimple(map, prefix + "RealServerAuth", this.RealServerAuth);
        this.setParamSimple(map, prefix + "BasicAuthConfId", this.BasicAuthConfId);
        this.setParamSimple(map, prefix + "GaapCertificateId", this.GaapCertificateId);
        this.setParamSimple(map, prefix + "RealServerCertificateId", this.RealServerCertificateId);
        this.setParamSimple(map, prefix + "RealServerCertificateDomain", this.RealServerCertificateDomain);

    }
}

