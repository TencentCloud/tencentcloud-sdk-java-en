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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigRequest  extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Operation type. changeVip: modify the VIP of an instance; changeVpc: modify the subnet of an instance; changeBaseToVpc: change from basic network to VPC
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * VIP address, which is required for the `changeVip` operation. If this parameter is left blank, a random one will be assigned by default
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * VPC ID, which is required for `changeVpc` and `changeBaseToVpc` operations
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID, which is required for `changeVpc` and `changeBaseToVpc` operations
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Operation type. changeVip: modify the VIP of an instance; changeVpc: modify the subnet of an instance; changeBaseToVpc: change from basic network to VPC 
     * @return Operation Operation type. changeVip: modify the VIP of an instance; changeVpc: modify the subnet of an instance; changeBaseToVpc: change from basic network to VPC
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type. changeVip: modify the VIP of an instance; changeVpc: modify the subnet of an instance; changeBaseToVpc: change from basic network to VPC
     * @param Operation Operation type. changeVip: modify the VIP of an instance; changeVpc: modify the subnet of an instance; changeBaseToVpc: change from basic network to VPC
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get VIP address, which is required for the `changeVip` operation. If this parameter is left blank, a random one will be assigned by default 
     * @return Vip VIP address, which is required for the `changeVip` operation. If this parameter is left blank, a random one will be assigned by default
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP address, which is required for the `changeVip` operation. If this parameter is left blank, a random one will be assigned by default
     * @param Vip VIP address, which is required for the `changeVip` operation. If this parameter is left blank, a random one will be assigned by default
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get VPC ID, which is required for `changeVpc` and `changeBaseToVpc` operations 
     * @return VpcId VPC ID, which is required for `changeVpc` and `changeBaseToVpc` operations
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, which is required for `changeVpc` and `changeBaseToVpc` operations
     * @param VpcId VPC ID, which is required for `changeVpc` and `changeBaseToVpc` operations
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID, which is required for `changeVpc` and `changeBaseToVpc` operations 
     * @return SubnetId Subnet ID, which is required for `changeVpc` and `changeBaseToVpc` operations
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID, which is required for `changeVpc` and `changeBaseToVpc` operations
     * @param SubnetId Subnet ID, which is required for `changeVpc` and `changeBaseToVpc` operations
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

