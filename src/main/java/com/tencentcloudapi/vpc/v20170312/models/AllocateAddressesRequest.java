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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateAddressesRequest extends AbstractModel{

    /**
    * The number of EIPs. Default: 1.
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP whitelist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * The EIP billing method.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, possible values are:<ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://cloud.tencent.com/document/product/684/15255) (The bandwidth sharing whitelist must be activated additionally.)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: bandwidth postpaid by hour</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: traffic postpaid by hour</li></ul>Default: TRAFFIC_POSTPAID_BY_HOUR</li>.
<li>For users who do not use bill-by-bandwidth billing mode, InternetChargeType is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The maximum EIP outbound bandwidth. Unit: Mbps.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, the value range is determined by the EIP billing method:<ul><li>BANDWIDTH_PACKAGE: 1 Mbps to 1,000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li></ul>Default: 1 Mbps</li>.
<li>For a user who has not activated bandwidth billing by IP whitelist, InternetMaxBandwidthOut is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * The EIP type. Default: EIP.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>AnycastEIP: an Anycast EIP address. For more information, see [Anycast Internet Acceleration](https://cloud.tencent.com/document/product/644).</li></ul>Note: Only certain regions support Anycast EIPs.</li></ul>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * The Anycast publishing region.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>ANYCAST_ZONE_GLOBAL: the global publishing region (the global AIA whitelist must be activated additionally.) </li><li>ANYCAST_ZONE_OVERSEAS: the publishing regions outside Mainland China </li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * Whether the Anycast EIP can be bound to Cloud Load Balancer (CLB) instances.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HA virtual IP addresses.</li></ul>Default: FALSE.</li></ul>
    */
    @SerializedName("ApplicableForCLB")
    @Expose
    private Boolean ApplicableForCLB;

    /**
     * Get The number of EIPs. Default: 1. 
     * @return AddressCount The number of EIPs. Default: 1.
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set The number of EIPs. Default: 1.
     * @param AddressCount The number of EIPs. Default: 1.
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP whitelist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul> 
     * @return InternetServiceProvider The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP whitelist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP whitelist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
     * @param InternetServiceProvider The EIP line type. Default: BGP.
<ul style="margin:0"><li>For a user who has activated the static single-line IP whitelist, possible values are:<ul><li>CMCC: China Mobile</li>
<li>CTCC: China Telecom</li>
<li>CUCC: China Unicom</li></ul>Note: Only certain regions support static single-line IP addresses.</li></ul>
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get The EIP billing method.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, possible values are:<ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://cloud.tencent.com/document/product/684/15255) (The bandwidth sharing whitelist must be activated additionally.)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: bandwidth postpaid by hour</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: traffic postpaid by hour</li></ul>Default: TRAFFIC_POSTPAID_BY_HOUR</li>.
<li>For users who do not use bill-by-bandwidth billing mode, InternetChargeType is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul> 
     * @return InternetChargeType The EIP billing method.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, possible values are:<ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://cloud.tencent.com/document/product/684/15255) (The bandwidth sharing whitelist must be activated additionally.)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: bandwidth postpaid by hour</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: traffic postpaid by hour</li></ul>Default: TRAFFIC_POSTPAID_BY_HOUR</li>.
<li>For users who do not use bill-by-bandwidth billing mode, InternetChargeType is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set The EIP billing method.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, possible values are:<ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://cloud.tencent.com/document/product/684/15255) (The bandwidth sharing whitelist must be activated additionally.)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: bandwidth postpaid by hour</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: traffic postpaid by hour</li></ul>Default: TRAFFIC_POSTPAID_BY_HOUR</li>.
<li>For users who do not use bill-by-bandwidth billing mode, InternetChargeType is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
     * @param InternetChargeType The EIP billing method.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, possible values are:<ul><li>BANDWIDTH_PACKAGE: paid by the [bandwidth package](https://cloud.tencent.com/document/product/684/15255) (The bandwidth sharing whitelist must be activated additionally.)</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: bandwidth postpaid by hour</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: traffic postpaid by hour</li></ul>Default: TRAFFIC_POSTPAID_BY_HOUR</li>.
<li>For users who do not use bill-by-bandwidth billing mode, InternetChargeType is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get The maximum EIP outbound bandwidth. Unit: Mbps.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, the value range is determined by the EIP billing method:<ul><li>BANDWIDTH_PACKAGE: 1 Mbps to 1,000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li></ul>Default: 1 Mbps</li>.
<li>For a user who has not activated bandwidth billing by IP whitelist, InternetMaxBandwidthOut is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul> 
     * @return InternetMaxBandwidthOut The maximum EIP outbound bandwidth. Unit: Mbps.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, the value range is determined by the EIP billing method:<ul><li>BANDWIDTH_PACKAGE: 1 Mbps to 1,000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li></ul>Default: 1 Mbps</li>.
<li>For a user who has not activated bandwidth billing by IP whitelist, InternetMaxBandwidthOut is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum EIP outbound bandwidth. Unit: Mbps.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, the value range is determined by the EIP billing method:<ul><li>BANDWIDTH_PACKAGE: 1 Mbps to 1,000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li></ul>Default: 1 Mbps</li>.
<li>For a user who has not activated bandwidth billing by IP whitelist, InternetMaxBandwidthOut is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
     * @param InternetMaxBandwidthOut The maximum EIP outbound bandwidth. Unit: Mbps.
<ul style="margin:0"><li>For a user who has activated bandwidth billing by IP whitelist, the value range is determined by the EIP billing method:<ul><li>BANDWIDTH_PACKAGE: 1 Mbps to 1,000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR: 1 Mbps to 100 Mbps</li></ul>Default: 1 Mbps</li>.
<li>For a user who has not activated bandwidth billing by IP whitelist, InternetMaxBandwidthOut is consistent with that of the instance bound to the EIP. Therefore, it is unnecessary to pass in this parameter.</li></ul>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get The EIP type. Default: EIP.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>AnycastEIP: an Anycast EIP address. For more information, see [Anycast Internet Acceleration](https://cloud.tencent.com/document/product/644).</li></ul>Note: Only certain regions support Anycast EIPs.</li></ul> 
     * @return AddressType The EIP type. Default: EIP.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>AnycastEIP: an Anycast EIP address. For more information, see [Anycast Internet Acceleration](https://cloud.tencent.com/document/product/644).</li></ul>Note: Only certain regions support Anycast EIPs.</li></ul>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set The EIP type. Default: EIP.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>AnycastEIP: an Anycast EIP address. For more information, see [Anycast Internet Acceleration](https://cloud.tencent.com/document/product/644).</li></ul>Note: Only certain regions support Anycast EIPs.</li></ul>
     * @param AddressType The EIP type. Default: EIP.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>AnycastEIP: an Anycast EIP address. For more information, see [Anycast Internet Acceleration](https://cloud.tencent.com/document/product/644).</li></ul>Note: Only certain regions support Anycast EIPs.</li></ul>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get The Anycast publishing region.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>ANYCAST_ZONE_GLOBAL: the global publishing region (the global AIA whitelist must be activated additionally.) </li><li>ANYCAST_ZONE_OVERSEAS: the publishing regions outside Mainland China </li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul> 
     * @return AnycastZone The Anycast publishing region.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>ANYCAST_ZONE_GLOBAL: the global publishing region (the global AIA whitelist must be activated additionally.) </li><li>ANYCAST_ZONE_OVERSEAS: the publishing regions outside Mainland China </li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set The Anycast publishing region.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>ANYCAST_ZONE_GLOBAL: the global publishing region (the global AIA whitelist must be activated additionally.) </li><li>ANYCAST_ZONE_OVERSEAS: the publishing regions outside Mainland China </li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
     * @param AnycastZone The Anycast publishing region.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>ANYCAST_ZONE_GLOBAL: the global publishing region (the global AIA whitelist must be activated additionally.) </li><li>ANYCAST_ZONE_OVERSEAS: the publishing regions outside Mainland China </li></ul>Default: ANYCAST_ZONE_OVERSEAS.</li></ul>
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get Whether the Anycast EIP can be bound to Cloud Load Balancer (CLB) instances.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HA virtual IP addresses.</li></ul>Default: FALSE.</li></ul> 
     * @return ApplicableForCLB Whether the Anycast EIP can be bound to Cloud Load Balancer (CLB) instances.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HA virtual IP addresses.</li></ul>Default: FALSE.</li></ul>
     */
    public Boolean getApplicableForCLB() {
        return this.ApplicableForCLB;
    }

    /**
     * Set Whether the Anycast EIP can be bound to Cloud Load Balancer (CLB) instances.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HA virtual IP addresses.</li></ul>Default: FALSE.</li></ul>
     * @param ApplicableForCLB Whether the Anycast EIP can be bound to Cloud Load Balancer (CLB) instances.
<ul style="margin:0"><li>For a user who has activated the AIA whitelist, possible values are:<ul><li>TRUE: the Anycast EIP can be bound to CLB instances.</li>
<li>FALSE: the Anycast EIP can be bound to CVMs, NAT gateways, and HA virtual IP addresses.</li></ul>Default: FALSE.</li></ul>
     */
    public void setApplicableForCLB(Boolean ApplicableForCLB) {
        this.ApplicableForCLB = ApplicableForCLB;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);
        this.setParamSimple(map, prefix + "ApplicableForCLB", this.ApplicableForCLB);

    }
}

