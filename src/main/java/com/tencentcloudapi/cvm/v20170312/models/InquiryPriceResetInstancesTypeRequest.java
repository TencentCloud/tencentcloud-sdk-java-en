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

public class InquiryPriceResetInstancesTypeRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance models. Different resource specifications are specified for different instance models. For specific values, please see the table of instance resource specifications. You can also obtain the latest specification list using the API for querying the list of instance resource specifications.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances for each request is 1.
     * @param InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain instance models. Different resource specifications are specified for different instance models. For specific values, please see the table of instance resource specifications. You can also obtain the latest specification list using the API for querying the list of instance resource specifications.
     * @return InstanceType Instance model. Different resource specifications are specified for different instance models. For specific values, please see the table of instance resource specifications. You can also obtain the latest specification list using the API for querying the list of instance resource specifications. |
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set instance models. Different resource specifications are specified for different instance models. For specific values, please see the table of instance resource specifications. You can also obtain the latest specification list using the API for querying the list of instance resource specifications.
     * @param InstanceType Instance model. Different resource specifications are specified for different instance models. For specific values, please see the table of instance resource specifications. You can also obtain the latest specification list using the API for querying the list of instance resource specifications. |
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

