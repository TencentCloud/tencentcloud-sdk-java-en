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

public class InquiryPriceResetInstancesInternetMaxBandwidthRequest  extends AbstractModel{

    /**
    * Get ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100, however this API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` and the `BANDWIDTH_POSTPAID_BY_HOUR` billing method at the same time.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * The outbound bandwidth configuration of the public network. The bandwidth cap varies with different models. For more information, please see the bandwidth limits page. Only the parameter `InternetMaxBandwidthOut` is supported.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * The date from which the bandwidth takes effect. Format: `YYYY-MM-DD`, such as `2016-10-30`. The start date cannot be earlier than the current date. If the start date is today, the newly set bandwidth takes effect immediately. This parameter is only valid for the prepaid bandwidth, error code will be returned by this API if other billing methods selected.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The date until which the bandwidth is effective. Format: `YYYY-MM-DD`, such as `2016-10-30`. The validity period of the newly set bandwidth includes the end date. The end date cannot be later than the expiry date of the prepaid instance. The expiry date of an instance can be obtained with API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) by `ExpiredTime` field in API response. This parameter is only valid for the prepaid bandwidth. error code will be returned by this API if other billing methods selected.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100, however this API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` and the `BANDWIDTH_POSTPAID_BY_HOUR` billing method at the same time.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100, however this API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` and the `BANDWIDTH_POSTPAID_BY_HOUR` billing method at the same time.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100, however this API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` and the `BANDWIDTH_POSTPAID_BY_HOUR` billing method at the same time.
     * @param InstanceIds ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100, however this API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` and the `BANDWIDTH_POSTPAID_BY_HOUR` billing method at the same time.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get the outbound bandwidth configuration of the public network. The bandwidth cap varies with different models. For more information, please see the bandwidth limits page. Only the parameter `InternetMaxBandwidthOut` is supported.
     * @return InternetAccessible The outbound bandwidth configuration of the public network. The bandwidth cap varies with different models. For more information, please see the bandwidth limits page. Only the parameter `InternetMaxBandwidthOut` is supported.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set the outbound bandwidth configuration of the public network. The bandwidth cap varies with different models. For more information, please see the bandwidth limits page. Only the parameter `InternetMaxBandwidthOut` is supported.
     * @param InternetAccessible The outbound bandwidth configuration of the public network. The bandwidth cap varies with different models. For more information, please see the bandwidth limits page. Only the parameter `InternetMaxBandwidthOut` is supported.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get the date from which the bandwidth takes effect. Format: `YYYY-MM-DD`, such as `2016-10-30`. The start date cannot be earlier than the current date. If the start date is today, the newly set bandwidth takes effect immediately. This parameter is only valid for the prepaid bandwidth, error code will be returned by this API if other billing methods selected.
     * @return StartTime The date from which the bandwidth takes effect. Format: `YYYY-MM-DD`, such as `2016-10-30`. The start date cannot be earlier than the current date. If the start date is today, the newly set bandwidth takes effect immediately. This parameter is only valid for the prepaid bandwidth, error code will be returned by this API if other billing methods selected.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set the date from which the bandwidth takes effect. Format: `YYYY-MM-DD`, such as `2016-10-30`. The start date cannot be earlier than the current date. If the start date is today, the newly set bandwidth takes effect immediately. This parameter is only valid for the prepaid bandwidth, error code will be returned by this API if other billing methods selected.
     * @param StartTime The date from which the bandwidth takes effect. Format: `YYYY-MM-DD`, such as `2016-10-30`. The start date cannot be earlier than the current date. If the start date is today, the newly set bandwidth takes effect immediately. This parameter is only valid for the prepaid bandwidth, error code will be returned by this API if other billing methods selected.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get the date until which the bandwidth is effective. Format: `YYYY-MM-DD`, such as `2016-10-30`. The validity period of the newly set bandwidth includes the end date. The end date cannot be later than the expiry date of the prepaid instance. The expiry date of an instance can be obtained with API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) by `ExpiredTime` field in API response. This parameter is only valid for the prepaid bandwidth. error code will be returned by this API if other billing methods selected.
     * @return EndTime The date until which the bandwidth is effective. Format: `YYYY-MM-DD`, such as `2016-10-30`. The validity period of the newly set bandwidth includes the end date. The end date cannot be later than the expiry date of the prepaid instance. The expiry date of an instance can be obtained with API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) by `ExpiredTime` field in API response. This parameter is only valid for the prepaid bandwidth. error code will be returned by this API if other billing methods selected.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set the date until which the bandwidth is effective. Format: `YYYY-MM-DD`, such as `2016-10-30`. The validity period of the newly set bandwidth includes the end date. The end date cannot be later than the expiry date of the prepaid instance. The expiry date of an instance can be obtained with API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) by `ExpiredTime` field in API response. This parameter is only valid for the prepaid bandwidth. error code will be returned by this API if other billing methods selected.
     * @param EndTime The date until which the bandwidth is effective. Format: `YYYY-MM-DD`, such as `2016-10-30`. The validity period of the newly set bandwidth includes the end date. The end date cannot be later than the expiry date of the prepaid instance. The expiry date of an instance can be obtained with API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) by `ExpiredTime` field in API response. This parameter is only valid for the prepaid bandwidth. error code will be returned by this API if other billing methods selected.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

