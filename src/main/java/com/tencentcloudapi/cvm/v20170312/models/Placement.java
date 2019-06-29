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
    * ID of the [Availability Zone](/document/product/213/9452#zone) to which the instance belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](/document/api/213/9455)
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the returned values of [DescribeProject](/document/api/378/4400). If this is left empty, default project is used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * The CDHs ID list which the instance is belonged to.If you have purchased CDHs and specified this parameter, the instances you purchased will be randomly deployed on these CDHs.
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
     * Obtaining the ID of the [Availability Zone](/document/product/213/9452#zone) to which the instance belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](/document/api/213/9455).
     * @return Zone ID of the [Availability Zone](/document/product/213/9452#zone) to which the instance belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](/document/api/213/9455). |
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Setting the ID of the [Availability Zone](/document/product/213/9452#zone) to which the instance belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](/document/api/213/9455).
     * @param Zone ID of the [Availability Zone](/document/product/213/9452#zone) to which the instance belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](/document/api/213/9455). |
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Getting the ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the returned values of [DescribeProject](/document/api/378/4400). If this is left empty, default project is used. 
     * @return ProjectId ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the returned values of [DescribeProject](/document/api/378/4400). If this is left empty, default project is used. 
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Setting the ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the returned values of [DescribeProject](/document/api/378/4400). If this is left empty, default project is used. 
     * @param ProjectId ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the returned values of [DescribeProject](/document/api/378/4400). If this is left empty, default project is used. 
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Obtaining the CDHs ID list which the instance is belonged to.If you have purchased CDHs and specified this parameter, the instances you purchased will be randomly deployed on these CDHs.
     * @return HostIds The CDHs ID list which the instance is belonged to.If you have purchased CDHs and specified this parameter, the instances you purchased will be randomly deployed on these CDHs.
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Setting the CDHs ID list which the instance is belonged to.If you have purchased CDHs and specified this parameter, the instances you purchased will be randomly deployed on these CDHs.
     * @param HostIds The CDHs ID list which the instance is belonged to.If you have purchased CDHs and specified this parameter, the instances you purchased will be randomly deployed on these CDHs.
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);

    }
}

