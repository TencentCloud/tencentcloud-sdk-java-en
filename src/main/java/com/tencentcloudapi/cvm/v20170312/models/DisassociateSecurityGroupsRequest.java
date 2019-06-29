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

public class DisassociateSecurityGroupsRequest  extends AbstractModel{

    /**
    * Specify security group `SecurityGroupID` you want to disassociate, e.g. sg-efil73jd, only support disassociate one security group at a time.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Specify CVM instance ID(s) `InstanceID` to disassociate from, e.g. ins-lesecurk, disassociate multiple instances at same time is supported.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get security group `SecurityGroupID` you want to disassociate, e.g. sg-efil73jd, only support disassociate one security group at a time.
     * @return SecurityGroupIds security group `SecurityGroupID` you want to disassociate, e.g. sg-efil73jd, only support disassociate one security group at a time.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set security group `SecurityGroupID` you want to disassociate, e.g. sg-efil73jd, only support disassociate one security group at a time.
     * @param SecurityGroupIds security group `SecurityGroupID` you want to disassociate, e.g. sg-efil73jd, only support disassociate one security group at a time.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get CVM instance ID(s) `InstanceID` to disassociate from, e.g. ins-lesecurk, disassociate multiple instances at same time is supported.
     * @return InstanceIds CVM instance ID(s) `InstanceID` to disassociate from, e.g. ins-lesecurk, disassociate multiple instances at same time is supported.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set CVM instance ID(s) `InstanceID` to disassociate from, e.g. ins-lesecurk, disassociate multiple instances at same time is supported.
     * @param InstanceIds CVM instance ID(s) `InstanceID` to disassociate from, e.g. ins-lesecurk, disassociate multiple instances at same time is supported.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

