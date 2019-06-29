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

public class DescribeDisasterRecoverGroupQuotaResponse  extends AbstractModel{

    /**
    * The maximum number of placement groups that can be created.
    */
    @SerializedName("GroupQuota")
    @Expose
    private Integer GroupQuota;

    /**
    * The number of placement groups that have been created by the current user.
    */
    @SerializedName("CurrentNum")
    @Expose
    private Integer CurrentNum;

    /**
    * Quota of instances in a physical-machine-type disaster recovery group.
    */
    @SerializedName("CvmInHostGroupQuota")
    @Expose
    private Integer CvmInHostGroupQuota;

    /**
    * Quota of instances in a switch disaster recovery group.
    */
    @SerializedName("CvmInSwGroupQuota")
    @Expose
    private Integer CvmInSwGroupQuota;

    /**
    * Quota of instances in a rack-type disaster recovery group.
    */
    @SerializedName("CvmInRackGroupQuota")
    @Expose
    private Integer CvmInRackGroupQuota;

    /**
    * Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The maximum number of placement groups that can be created.
     * @return GroupQuota The maximum number of placement groups that can be created.
     */
    public Integer getGroupQuota() {
        return this.GroupQuota;
    }

    /**
     * Set The maximum number of placement groups that can be created.
     * @param GroupQuota The maximum number of placement groups that can be created.
     */
    public void setGroupQuota(Integer GroupQuota) {
        this.GroupQuota = GroupQuota;
    }

    /**
     * Get The number of placement groups that have been created by the current user.
     * @return CurrentNum The number of placement groups that have been created by the current user.
     */
    public Integer getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set The number of placement groups that have been created by the current user.
     * @param CurrentNum The number of placement groups that have been created by the current user.
     */
    public void setCurrentNum(Integer CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get Quota of instances in a physical-machine-type disaster recovery group.
     * @return CvmInHostGroupQuota Quota of instances in a physical-machine-type disaster recovery group.
     */
    public Integer getCvmInHostGroupQuota() {
        return this.CvmInHostGroupQuota;
    }

    /**
     * Set Quota of instances in a physical-machine-type disaster recovery group.
     * @param CvmInHostGroupQuota Quota of instances in a physical-machine-type disaster recovery group.
     */
    public void setCvmInHostGroupQuota(Integer CvmInHostGroupQuota) {
        this.CvmInHostGroupQuota = CvmInHostGroupQuota;
    }

    /**
     * Get Quota of instances in a switch disaster recovery group.
     * @return CvmInSwGroupQuota Quota of instances in a switch disaster recovery group.
     */
    public Integer getCvmInSwGroupQuota() {
        return this.CvmInSwGroupQuota;
    }

    /**
     * Set Quota of instances in a switch disaster recovery group.
     * @param CvmInSwGroupQuota Quota of instances in a switch disaster recovery group.
     */
    public void setCvmInSwGroupQuota(Integer CvmInSwGroupQuota) {
        this.CvmInSwGroupQuota = CvmInSwGroupQuota;
    }

    /**
     * Get Quota of instances in a switch disaster recovery group.
     * @return CvmInRackGroupQuota Quota of instances in a rack-type disaster recovery group.
     */
    public Integer getCvmInRackGroupQuota() {
        return this.CvmInRackGroupQuota;
    }

    /**
     * Set Quota of instances in a rack-type disaster recovery group.
     * @param CvmInRackGroupQuota Quota of instances in a rack-type disaster recovery group.
     */
    public void setCvmInRackGroupQuota(Integer CvmInRackGroupQuota) {
        this.CvmInRackGroupQuota = CvmInRackGroupQuota;
    }

    /**
     * Get Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @return RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @param RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupQuota", this.GroupQuota);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CvmInHostGroupQuota", this.CvmInHostGroupQuota);
        this.setParamSimple(map, prefix + "CvmInSwGroupQuota", this.CvmInSwGroupQuota);
        this.setParamSimple(map, prefix + "CvmInRackGroupQuota", this.CvmInRackGroupQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

