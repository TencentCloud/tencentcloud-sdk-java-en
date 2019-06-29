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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualPrivateCloud  extends AbstractModel{

    /**
    * Private network ID, such as `vpc-xxx`. A valid VpcId can be queried by logging in to the [Console] (https://console.cloud.tencent.com/vpc/vpc?rid=1) or obtained from the `unVpcId` field returned via the API [DescribeVpcEx](/document/api/215/1372). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Private network ID, such as `subnet-xxx`. A valid SubnetId can be queried by logging in to the [Console](https://console.cloud.tencent.com/vpc/subnet?rid=1) or obtained from the `unSubnetId` field returned via the API [DescribeSubnets](/document/api/215/15784). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The public gateway can be used only when the instance has a public IP and resides in a VPC. Value range:<br><li>TRUE: Used as a public gateway.<br><li>FALSE: Do not used as a public gateway.<br><br>Default: FALSE.
    */
    @SerializedName("AsVpcGateway")
    @Expose
    private Boolean AsVpcGateway;

    /**
    * Array of VPC subnet IPs. This parameter can be used to create instances and modify VPC attributes for instances.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
     * Obtain private network ID, such as `vpc-xxx`. A valid VpcId can be queried by logging in to the [Console] (https://console.cloud.tencent.com/vpc/vpc?rid=1) or obtained from the `unVpcId` field returned via the API [DescribeVpcEx](/document/api/215/1372). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     * @return VpcId Private network ID, such as `vpc-xxx`. A valid VpcId can be queried by logging in to the [Console] (https://console.cloud.tencent.com/vpc/vpc?rid=1) or obtained from the `unVpcId` field returned via the API [DescribeVpcEx](/document/api/215/1372). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set private network ID, such as `vpc-xxx`. A valid VpcId can be queried by logging in to the [Console] (https://console.cloud.tencent.com/vpc/vpc?rid=1) or obtained from the `unVpcId` field returned via the API [DescribeVpcEx](/document/api/215/1372). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     * @param VpcId Private network ID, such as `vpc-xxx`. A valid VpcId can be queried by logging in to the [Console] (https://console.cloud.tencent.com/vpc/vpc?rid=1) or obtained from the `unVpcId` field returned via the API [DescribeVpcEx](/document/api/215/1372). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Obtain private network ID, such as `subnet-xxx`. A valid SubnetId can be queried by logging in to the [Console](https://console.cloud.tencent.com/vpc/subnet?rid=1) or obtained from the `unSubnetId` field returned via the API [DescribeSubnets](/document/api/215/15784). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     * @return SubnetId Private network ID, such as `subnet-xxx`. A valid SubnetId can be queried by logging in to the [Console](https://console.cloud.tencent.com/vpc/subnet?rid=1) or obtained from the `unSubnetId` field returned via the API [DescribeSubnets](/document/api/215/15784). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set private network ID, such as `subnet-xxx`. A valid SubnetId can be queried by logging in to the [Console](https://console.cloud.tencent.com/vpc/subnet?rid=1) or obtained from the `unSubnetId` field returned via the API [DescribeSubnets](/document/api/215/15784). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     * @param SubnetId Private network ID, such as `subnet-xxx`. A valid SubnetId can be queried by logging in to the [Console](https://console.cloud.tencent.com/vpc/subnet?rid=1) or obtained from the `unSubnetId` field returned via the API [DescribeSubnets](/document/api/215/15784). If VpcId and SubnetId are both passed to `DEFAULT` while creating a CVM, then VPC network is used by default.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Obtain whether used as a public gateway. The public gateway can be used only when the instance has a public IP and is in VPC. Value range:<br><li>TRUE: Used as a public gateway.<br><li>FALSE: Do not used as a public gateway.<br><br>Default: FALSE.
     * @return AsVpcGateway Whether used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Value range:<br><li>TRUE: Used as a public gateway.<br><li>FALSE: Do not used as a public gateway.<br><br>Default: FALSE.
     */
    public Boolean getAsVpcGateway() {
        return this.AsVpcGateway;
    }

    /**
     * Set whether used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Value range<br><li>TRUE: Used as a public gateway.<br><li>FALSE: Do not used as a public gateway.<br><br>Default: FALSE.
     * @param AsVpcGateway Whether used as a public gateway. The public gateway can be used only when the instance has a public IP and resides in a VPC. Value range<br><li>TRUE: Used as a public gateway.<br><li>FALSE: Do not used as a public gateway.<br><br>Default: FALSE.
     */
    public void setAsVpcGateway(Boolean AsVpcGateway) {
        this.AsVpcGateway = AsVpcGateway;
    }

    /**
     * Obtain array of VPC subnet IPs. This parameter can be used to create instances and modify VPC attributes for instances.
     * @return PrivateIpAddresses Array of VPC subnet IPs. This parameter can be used to create instances and modify VPC attributes for instances.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set array of VPC subnet IPs. This parameter can be used to create instances and modify VPC attributes for instances.
     * @param PrivateIpAddresses Array of VPC subnet IPs. This parameter can be used to create instances and modify VPC attributes for instances.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AsVpcGateway", this.AsVpcGateway);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);

    }
}

