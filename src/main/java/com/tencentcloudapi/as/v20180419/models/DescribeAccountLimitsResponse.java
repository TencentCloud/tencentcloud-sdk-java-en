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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountLimitsResponse  extends AbstractModel{

    /**
    * The maximum number of launch configurations that can be created under your account
    */
    @SerializedName("MaxNumberOfLaunchConfigurations")
    @Expose
    private Integer MaxNumberOfLaunchConfigurations;

    /**
    * The number of existing launch configurations under your account
    */
    @SerializedName("NumberOfLaunchConfigurations")
    @Expose
    private Integer NumberOfLaunchConfigurations;

    /**
    * The maximum number of scaling groups that can be created under your account
    */
    @SerializedName("MaxNumberOfAutoScalingGroups")
    @Expose
    private Integer MaxNumberOfAutoScalingGroups;

    /**
    * The number of existing scaling groups under your account
    */
    @SerializedName("NumberOfAutoScalingGroups")
    @Expose
    private Integer NumberOfAutoScalingGroups;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain the maximum number of launch configurations that can be created under your account
     * @return MaxNumberOfLaunchConfigurations The maximum number of launch configurations that can be created under your account
     */
    public Integer getMaxNumberOfLaunchConfigurations() {
        return this.MaxNumberOfLaunchConfigurations;
    }

    /**
     * Set the maximum number of launch configurations that can be created under your account
     * @param MaxNumberOfLaunchConfigurations The maximum number of launch configurations that can be created under your account
     */
    public void setMaxNumberOfLaunchConfigurations(Integer MaxNumberOfLaunchConfigurations) {
        this.MaxNumberOfLaunchConfigurations = MaxNumberOfLaunchConfigurations;
    }

    /**
     * Obtain the number of existing launch configurations under your account
     * @return NumberOfLaunchConfigurations The number of existing launch configurations under your account
     */
    public Integer getNumberOfLaunchConfigurations() {
        return this.NumberOfLaunchConfigurations;
    }

    /**
     * Set the number of existing launch configurations under your account
     * @param NumberOfLaunchConfigurations The number of existing launch configurations under your account
     */
    public void setNumberOfLaunchConfigurations(Integer NumberOfLaunchConfigurations) {
        this.NumberOfLaunchConfigurations = NumberOfLaunchConfigurations;
    }

    /**
     * Obtain the number of existing scaling groups under your account
     * @return MaxNumberOfAutoScalingGroups The maximum number of scaling groups that can be created under your account
     */
    public Integer getMaxNumberOfAutoScalingGroups() {
        return this.MaxNumberOfAutoScalingGroups;
    }

    /**
     * Set the maximum number of scaling groups that can be created under your account
     * @param MaxNumberOfAutoScalingGroups The maximum number of scaling groups that can be created under your account
     */
    public void setMaxNumberOfAutoScalingGroups(Integer MaxNumberOfAutoScalingGroups) {
        this.MaxNumberOfAutoScalingGroups = MaxNumberOfAutoScalingGroups;
    }

    /**
     * Obtain the number of existing scaling groups under your account
     * @return NumberOfAutoScalingGroups The number of existing scaling groups under your account
     */
    public Integer getNumberOfAutoScalingGroups() {
        return this.NumberOfAutoScalingGroups;
    }

    /**
     * Set the number of existing scaling groups under your account
     * @param NumberOfAutoScalingGroups The number of existing scaling groups under your account
     */
    public void setNumberOfAutoScalingGroups(Integer NumberOfAutoScalingGroups) {
        this.NumberOfAutoScalingGroups = NumberOfAutoScalingGroups;
    }

    /**
     * Obtain the unique ID of a request, which is required for each troubleshooting case.
     * @return RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of a request, which is required for each troubleshooting case.
     * @param RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxNumberOfLaunchConfigurations", this.MaxNumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "NumberOfLaunchConfigurations", this.NumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "MaxNumberOfAutoScalingGroups", this.MaxNumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "NumberOfAutoScalingGroups", this.NumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

