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

public class RenewInstancesRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.this parameter is mandatory in monthly subscription.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Whether to renew elastic data disks，value range:<br><li>TRUE： Indicates renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><li>FALSE: Indicates not renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><br>Default: TRUE
    */
    @SerializedName("RenewPortableDataDisk")
    @Expose
    private Boolean RenewPortableDataDisk;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @return InstanceIds ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @param InstanceIds Ids of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/9388) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get the relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.this parameter is mandatory in monthly subscription.
     * @return InstanceChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the rerenewing usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. this parameter is mandatory in monthly subscription.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Setting the relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.
     * @param InstanceChargePrepaid The relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.this parameter is necessary in monthly subscription.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Obtaining whether to renew elastic data disks，value range:<br><li>True: Indicates renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><li>FALSE: Indicates not renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><br>Default: TRUE
     * @return RenewPortableDataDisk whether to renew elastic data disks，value range:<br><li>TRUE: Indicates renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><li>FALSE: Indicates not renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><br>Default: TRUE
     */
    public Boolean getRenewPortableDataDisk() {
        return this.RenewPortableDataDisk;
    }

    /**
     * Setting whether to renew elastic data disks，value range:<br><li>TRUE: Indicates renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><li>FALSE: Indicates not renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><br>Default: TRUE
     * @param RenewPortableDataDisk whether to renew elastic data disks，value range:<br><li>TRUE: Indicates renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><li>FALSE: Indicates not renewing the elastic data disks mounted to the instance when renewing a prepaid instance<br><br>Default: TRUE
     */
    public void setRenewPortableDataDisk(Boolean RenewPortableDataDisk) {
        this.RenewPortableDataDisk = RenewPortableDataDisk;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "RenewPortableDataDisk", this.RenewPortableDataDisk);

    }
}

