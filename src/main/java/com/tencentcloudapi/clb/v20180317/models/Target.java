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

public class Target extends AbstractModel{

    /**
    * Listening port of a real server
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Real server type. Value range: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). This parameter does not take effect currently as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Unique ID of a CVM instance, which needs to be passed in when binding a CVM instance and can be obtained from the InstanceId field in the return of the DescribeInstances API.
Note: Either InstanceId or EniIp must be passed in.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * This parameter must be passed in when you bind an ENI, which represents the IP address of the ENI. The ENI has to be bound to a CVM instance first before it can be bound to a CLB instance. Note: Either InstanceId or EniIp must be passed in. To bind an ENI, you need to submit a ticket for application first.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
     * Get Listening port of a real server
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Listening port of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listening port of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Listening port of a real server
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Real server type. Value range: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). This parameter does not take effect currently as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Real server type. Value range: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). This parameter does not take effect currently as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Real server type. Value range: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). This parameter does not take effect currently as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Real server type. Value range: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). This parameter does not take effect currently as an input parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Unique ID of a CVM instance, which needs to be passed in when binding a CVM instance and can be obtained from the InstanceId field in the return of the DescribeInstances API.
Note: Either InstanceId or EniIp must be passed in.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Unique ID of a CVM instance, which needs to be passed in when binding a CVM instance and can be obtained from the InstanceId field in the return of the DescribeInstances API.
Note: Either InstanceId or EniIp must be passed in.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique ID of a CVM instance, which needs to be passed in when binding a CVM instance and can be obtained from the InstanceId field in the return of the DescribeInstances API.
Note: Either InstanceId or EniIp must be passed in.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Unique ID of a CVM instance, which needs to be passed in when binding a CVM instance and can be obtained from the InstanceId field in the return of the DescribeInstances API.
Note: Either InstanceId or EniIp must be passed in.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Forwarding weight of a real server. Value range: [0, 100]. Default value: 10. 
     * @return Weight Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     * @param Weight Forwarding weight of a real server. Value range: [0, 100]. Default value: 10.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get This parameter must be passed in when you bind an ENI, which represents the IP address of the ENI. The ENI has to be bound to a CVM instance first before it can be bound to a CLB instance. Note: Either InstanceId or EniIp must be passed in. To bind an ENI, you need to submit a ticket for application first.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EniIp This parameter must be passed in when you bind an ENI, which represents the IP address of the ENI. The ENI has to be bound to a CVM instance first before it can be bound to a CLB instance. Note: Either InstanceId or EniIp must be passed in. To bind an ENI, you need to submit a ticket for application first.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set This parameter must be passed in when you bind an ENI, which represents the IP address of the ENI. The ENI has to be bound to a CVM instance first before it can be bound to a CLB instance. Note: Either InstanceId or EniIp must be passed in. To bind an ENI, you need to submit a ticket for application first.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EniIp This parameter must be passed in when you bind an ENI, which represents the IP address of the ENI. The ENI has to be bound to a CVM instance first before it can be bound to a CLB instance. Note: Either InstanceId or EniIp must be passed in. To bind an ENI, you need to submit a ticket for application first.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);

    }
}

