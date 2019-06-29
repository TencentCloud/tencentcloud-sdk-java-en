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

public class AssociateSecurityGroupsRequest  extends AbstractModel{

    /**
    * the`安全组ID` to be associated，such as sg-efil73jd，only support associate one security group.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * associated`实例ID`，such as ins-lesecurk，multiple instances association is supported.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get `安全组ID` to be associated，such as sg-efil73jd，only support associate one security group.
     * @return SecurityGroupIds `安全组ID` to be associated，such as sg-efil73jd，only support associate one security group.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * set `安全组ID` to be associated，such as sg-efil73jd，only support associate one security group.
     * @param SecurityGroupIds `安全组ID` to be associated，such as sg-efil73jd，only support associate one security group.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get associated `实例ID`，such as ins-lesecurk，multiple instances association is supported.
     * @return InstanceIds associated `实例ID`，such as ins-lesecurk，multiple instances association is supported.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * set associated `实例ID`，such as ins-lesecurk，multiple instances association is supported.
     * @param InstanceIds associated `实例ID`，such as ins-lesecurk，multiple instances association is supported.
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

