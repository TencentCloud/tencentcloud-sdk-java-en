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

public class Placement  extends AbstractModel{

    /**
    * ID of the [Availability Zone](/document/product/213/9452#zone) where the instance resides. To obtain the availability zone IDs, you can call [DescribeZones](/document/api/213/9455) and look for the `Zone` fields in the response.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ID of the project to which the instance belongs. To obtain the project IDs, you can call [DescribeProject](/document/api/378/4400) and look for the `projectId` fields in the response. If this parameter is not specified, the default project will be used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Master host IP used to create the CVM
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
     * Get ID of the [Availability Zone](/document/product/213/9452#zone) where the instance resides. To obtain the availability zone IDs, you can call [DescribeZones](/document/api/213/9455) and look for the `Zone` fields in the response. 
     * @return Zone ID of the [Availability Zone](/document/product/213/9452#zone) where the instance resides. To obtain the availability zone IDs, you can call [DescribeZones](/document/api/213/9455) and look for the `Zone` fields in the response.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set ID of the [Availability Zone](/document/product/213/9452#zone) where the instance resides. To obtain the availability zone IDs, you can call [DescribeZones](/document/api/213/9455) and look for the `Zone` fields in the response.
     * @param Zone ID of the [Availability Zone](/document/product/213/9452#zone) where the instance resides. To obtain the availability zone IDs, you can call [DescribeZones](/document/api/213/9455) and look for the `Zone` fields in the response.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ID of the project to which the instance belongs. To obtain the project IDs, you can call [DescribeProject](/document/api/378/4400) and look for the `projectId` fields in the response. If this parameter is not specified, the default project will be used. 
     * @return ProjectId ID of the project to which the instance belongs. To obtain the project IDs, you can call [DescribeProject](/document/api/378/4400) and look for the `projectId` fields in the response. If this parameter is not specified, the default project will be used.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of the project to which the instance belongs. To obtain the project IDs, you can call [DescribeProject](/document/api/378/4400) and look for the `projectId` fields in the response. If this parameter is not specified, the default project will be used.
     * @param ProjectId ID of the project to which the instance belongs. To obtain the project IDs, you can call [DescribeProject](/document/api/378/4400) and look for the `projectId` fields in the response. If this parameter is not specified, the default project will be used.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs. 
     * @return HostIds ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
     * @param HostIds ID list of CDHs from which the instance can be created. If you have purchased CDHs and specify this parameter, the instances you purchase will be randomly deployed on the CDHs.
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get Master host IP used to create the CVM 
     * @return HostIps Master host IP used to create the CVM
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set Master host IP used to create the CVM
     * @param HostIps Master host IP used to create the CVM
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);

    }
}

