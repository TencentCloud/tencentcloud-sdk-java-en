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

public class ModifyInstancesRenewFlagRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

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
     * Get the auto renewal flag. Value range:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     * @return RenewFlag Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：neither notify expiry nor renew automatically<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Setting the auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     * @param RenewFlag Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：neither notify expiry nor renew automatically<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

