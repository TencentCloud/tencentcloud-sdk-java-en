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

public class ModifyInstancesVpcAttributeRequest  extends AbstractModel{

    /**
    * IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Configuration about VPC. This parameter is used to specify VPC ID,Subnet ID and VPC IP,etc.Instance will be migrated to specified VPC subnet When the VPC ID and subnet ID are different to the network where the specified instance resides(subnet must on the same availability zone as instance).VPC IP could be specified via `PrivateIpAddresses`（Preconditions:All the specified instances should specify their subnet IPs）,`InstanceIds` and `PrivateIpAddresses` are corresponded. VPC subnet IP would be assigned randomly while `PrivateIpAddresses` is not specified.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * Indicate whether a forced shutdown is performed to running instances. Default is TRUE. 
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * Indicate whether save the name of CVM.Default is FALSE.
    */
    @SerializedName("ReserveHostName")
    @Expose
    private Boolean ReserveHostName;

    /**
     * IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     * @return InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     * @param InstanceIds of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtaining the configuration about VPC. This parameter is used to specify VPC ID,Subnet ID and VPC IP,etc.Instance will be migrated to specified VPC subnet When the VPC ID and subnet ID are different to the network where the specified instance resides(subnet must on the same availability zone as instance).VPC IP could be specified via `PrivateIpAddresses`（Preconditions:All the specified instances should specify their subnet IPs）,`InstanceIds` and `PrivateIpAddresses` are corresponded. VPC subnet IP would be assigned randomly while `PrivateIpAddresses` is not specified.
     * @return VirtualPrivateCloud Configuration about VPC. This parameter is used to specify VPC ID,Subnet ID and VPC IP,etc.Instance will be migrated to specified VPC subnet When the VPC ID and subnet ID are different to the network where the specified instance resides(subnet must on the same availability zone as instance).VPC IP could be specified via `PrivateIpAddresses`（Preconditions:All the specified instances should specify their subnet IPs）,`InstanceIds` and `PrivateIpAddresses` are corresponded. VPC subnet IP would be assigned randomly while `PrivateIpAddresses` is not specified.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Setting the configuration about VPC. This parameter is used to specify VPC ID,Subnet ID and VPC IP,etc.Instance will be migrated to specified VPC subnet When the VPC ID and subnet ID are different to the network where the specified instance resides(subnet must on the same availability zone as instance).VPC IP could be specified via `PrivateIpAddresses`（Preconditions:All the specified instances should specify their subnet IPs）,`InstanceIds` and `PrivateIpAddresses` are corresponded. VPC subnet IP would be assigned randomly while `PrivateIpAddresses` is not specified.
     * @param VirtualPrivateCloud Configuration about VPC. This parameter is used to specify VPC ID,Subnet ID and VPC IP,etc.Instance will be migrated to specified VPC subnet When the VPC ID and subnet ID are different to the network where the specified instance resides(subnet must on the same availability zone as instance).VPC IP could be specified via `PrivateIpAddresses`（Preconditions:All the specified instances should specify their subnet IPs）,`InstanceIds` and `PrivateIpAddresses` are corresponded. VPC subnet IP would be assigned randomly while `PrivateIpAddresses` is not specified.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Obtaining whether to force shutdown is performed to running instances. Default is TRUE
     * @return ForceStop Indicate  whether a forced shutdown is performed to running instances. Default is TRUE.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Setting whether a forced shutdown is performed to running instances. Default is TRUE.
     * @param ForceStop Indicate whether a forced shutdown is performed to running instances. Default is TRUE.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Obtaining whether to save the CVM name.Default is FALSE.
     * @return ReserveHostName Whether to save the CVM name.Default is FALSE.
     */
    public Boolean getReserveHostName() {
        return this.ReserveHostName;
    }

    /**
     * Setting whether to save the CVM name.Default is FALSE.
     * @param ReserveHostName Whether to save the CVM name.Default is FALSE.
     */
    public void setReserveHostName(Boolean ReserveHostName) {
        this.ReserveHostName = ReserveHostName;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "ReserveHostName", this.ReserveHostName);

    }
}

