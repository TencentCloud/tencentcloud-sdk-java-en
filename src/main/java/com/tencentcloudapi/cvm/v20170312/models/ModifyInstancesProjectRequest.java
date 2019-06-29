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

public class ModifyInstancesProjectRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Project ID. A project can be created using the API [AddProject](https://intl.cloud.tencent.com/document/api/378/4398). During the query of instance using the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388), the project ID can be used to filter the results.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances for each request is 100.
     * @param InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get the Project ID. A project can be created using the API [AddProject](https://intl.cloud.tencent.com/document/api/378/4398). During the query of instance using the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388), the project ID can be used to filter the results.
     * @return ProjectId. A project can be created using the API [AddProject](https://intl.cloud.tencent.com/document/api/378/4398). During the query of instance using the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388), the project ID can be used to filter the results.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Setting Project ID. A project can be created using the API [AddProject](https://intl.cloud.tencent.com/document/api/378/4398). During the query of instance using the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388), the project ID can be used to filter the results.
     * @param ProjectId Project ID. A project can be created using the API [AddProject](https://intl.cloud.tencent.com/document/api/378/4398). During the query of instance using the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388), the project ID can be used to filter the results.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

