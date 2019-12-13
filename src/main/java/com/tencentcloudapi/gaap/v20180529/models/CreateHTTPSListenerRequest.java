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

public class CreateHTTPSListenerRequest extends AbstractModel{

    /**
    * Listener name
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Server certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * Connection ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Client CA certificate ID, which is required only when the mutual authentication is adopted.
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

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
     * Get Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique. 
     * @return Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     * @param Port Listener port, which is based on the listeners of same transport layer protocol (TCP or UDP). The port must be unique.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Server certificate ID 
     * @return CertificateId Server certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Server certificate ID
     * @param CertificateId Server certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS 
     * @return ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
     * @param ForwardProtocol Protocol types of the forwarding from acceleration connection to origin server: HTTP | HTTPS
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get Connection ID 
     * @return ProxyId Connection ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID
     * @param ProxyId Connection ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default. 
     * @return AuthType Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
     * @param AuthType Authentication type, where:
0: one-way authentication;
1: mutual authentication.
The one-way authentication is used by default.
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Client CA certificate ID, which is required only when the mutual authentication is adopted. 
     * @return ClientCertificateId Client CA certificate ID, which is required only when the mutual authentication is adopted.
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set Client CA certificate ID, which is required only when the mutual authentication is adopted.
     * @param ClientCertificateId Client CA certificate ID, which is required only when the mutual authentication is adopted.
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only. 
     * @return PolyClientCertificateIds IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
     * @param PolyClientCertificateIds IDs of multiple new client CA certificates. This field or the `ClientCertificateId` field is required for mutual authentication only.
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);

    }
}

