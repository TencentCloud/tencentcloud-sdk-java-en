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

public class ModifyProxiesAttributeRequest  extends AbstractModel{

    /**
    * ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Connection name. Up to 30 characters.
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * ID of one or multiple connections to be operated; It’s a new parameter.
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
     * Get ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds. 
     * @return InstanceIds ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
     * @param InstanceIds ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Connection name. Up to 30 characters. 
     * @return ProxyName Connection name. Up to 30 characters.
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set Connection name. Up to 30 characters.
     * @param ProxyName Connection name. Up to 30 characters.
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence. 
     * @return ClientToken A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     * @param ClientToken A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get ID of one or multiple connections to be operated; It’s a new parameter. 
     * @return ProxyIds ID of one or multiple connections to be operated; It’s a new parameter.
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set ID of one or multiple connections to be operated; It’s a new parameter.
     * @param ProxyIds ID of one or multiple connections to be operated; It’s a new parameter.
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);

    }
}
