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

public class ModifyInstancesAttributeRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance’s name.You can name it as you like,60 characters limited.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * The list of appointed security group id,CVM will reconnect to the appointed security group,the original security group id will be unbinded.
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances for each request is 100.
     * @param InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get the name of instance.You can name it as you like,60 characters limited.
     * @return InstanceName The name of instance.You can name it as you like,60 characters limited.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set the name of instance.You can name it as you like,60 characters limited.
     * @param InstanceName The name of instance.You can name it as you like,60 characters limited.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get the appointed instances’ security group id list,CVM will reconnect to the appointed security group,the original security group id will be unbinded.
     * @return SecurityGroups Appointed instances’ security group id list，CVM will reconnect to the appointed security group,the original security group id will be unbinded.
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set the appointed instances’ security group id list,CVM will reconnect to the appointed security group,the original security group id will be unbinded.
     * @param SecurityGroups Appointed instances’ security group id list,CVM will reconnect to the appointed security group,the original security group id will be unbinded.
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);

    }
}

