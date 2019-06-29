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

public class MetricAlarm  extends AbstractModel{

    /**
    * Comparison operator. Available values include:<br><li>GREATER_THAN: ></li><li>GREATER_THAN_OR_EQUAL_TO: > or =</li><li>LESS_THAN: <</li><li> LESS_THAN_OR_EQUAL_TO: < or =</li><li> EQUAL_TO: =</li> <li>NOT_EQUAL_TO: ≠</li>
    */
    @SerializedName("ComparisonOperator")
    @Expose
    private String ComparisonOperator;

    /**
    * Name of index, available values include:<br><li>CPU_UTILIZATION: CPU utilization</li><li>MEM_UTILIZATION: Memory utilization</li><li>LAN_TRAFFIC_OUT: Outbound bandwidth of private network</li><li>LAN_TRAFFIC_IN: Inbound bandwidth of private network </li><li>WAN_TRAFFIC_OUT: Outbound bandwidth of public network</li><li>WAN_TRAFFIC_IN: Inbound bandwidth of public network</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Alarm threshold:<br><li>CPU_UTILIZATION: [1, 100], unit: %</li><li>MEM_UTILIZATION: [1, 100], unit: %</li><li>LAN_TRAFFIC_OUT: >0, unit: Mbps </li><li>LAN_TRAFFIC_IN: >0, unit: Mbps</li><li>WAN_TRAFFIC_OUT: >0, unit: Mbps</li><li>WAN_TRAFFIC_IN: >0, unit: Mbps</li>
    */
    @SerializedName("Threshold")
    @Expose
    private Integer Threshold;

    /**
    * Time period, unit: sec, enumerated value: 60, 300.
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * Repeat times. Value range: [1, 10]
    */
    @SerializedName("ContinuousTime")
    @Expose
    private Integer ContinuousTime;

    /**
    * Statistic type. Available value:<br><li>AVERAGE: Average value</li><li>MAXIMUM: Maximum value<li>MINIMUM: Minimum value</li><br> Default: AVERAGE
    */
    @SerializedName("Statistic")
    @Expose
    private String Statistic;

    /**
     * Obtain the comparison operator. Available values include:<br><li>GREATER_THAN: ></li><li>GREATER_THAN_OR_EQUAL_TO: > or =</li><li>LESS_THAN: <</li><li> LESS_THAN_OR_EQUAL_TO: < or =</li><li> EQUAL_TO: =</li> <li>NOT_EQUAL_TO: ≠</li>
     * @return ComparisonOperator Comparison operator. Available values include:<br><li>GREATER_THAN: ></li><li>GREATER_THAN_OR_EQUAL_TO: > or =</li><li>LESS_THAN: <</li><li> LESS_THAN_OR_EQUAL_TO: < or =</li><li> EQUAL_TO: =</li> <li>NOT_EQUAL_TO: ≠</li>
     */
    public String getComparisonOperator() {
        return this.ComparisonOperator;
    }

    /**
     * Configure the comparison operator. Available values include:<br><li>GREATER_THAN: ></li><li>GREATER_THAN_OR_EQUAL_TO: > or =</li><li>LESS_THAN: <</li><li> LESS_THAN_OR_EQUAL_TO: < or =</li><li> EQUAL_TO: =</li> <li>NOT_EQUAL_TO: ≠</li>
     * @param ComparisonOperator Comparison operator. Available values include:<br><li>GREATER_THAN: ></li><li>GREATER_THAN_OR_EQUAL_TO: > or =</li><li>LESS_THAN: <</li><li> LESS_THAN_OR_EQUAL_TO: < or =</li><li> EQUAL_TO: =</li> <li>NOT_EQUAL_TO: ≠</li>
     */
    public void setComparisonOperator(String ComparisonOperator) {
        this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * Obtain the name of index, available values include:<br><li>CPU_UTILIZATION: CPU utilization</li><li>MEM_UTILIZATION: Memory utilization</li><li>LAN_TRAFFIC_OUT: Outbound bandwidth of private network</li><li>LAN_TRAFFIC_IN: Inbound bandwidth of private network </li><li>WAN_TRAFFIC_OUT: Outbound bandwidth of public network</li><li>WAN_TRAFFIC_IN: Inbound bandwidth of public network</li>
     * Name of index, available values include:<br><li>CPU_UTILIZATION: CPU utilization</li><li>MEM_UTILIZATION: Memory utilization</li><li>LAN_TRAFFIC_OUT: Outbound bandwidth of private network</li><li>LAN_TRAFFIC_IN: Inbound bandwidth of private network </li><li>WAN_TRAFFIC_OUT: Outbound bandwidth of public network</li><li>WAN_TRAFFIC_IN: Inbound bandwidth of public network</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Configure the name of index, available values include:<br><li>CPU_UTILIZATION: CPU utilization</li><li>MEM_UTILIZATION: Memory utilization</li><li>LAN_TRAFFIC_OUT: Outbound bandwidth of private network</li><li>LAN_TRAFFIC_IN: Inbound bandwidth of private network </li><li>WAN_TRAFFIC_OUT: Outbound bandwidth of public network</li><li>WAN_TRAFFIC_IN: Inbound bandwidth of public network</li>
     * Name of index, available values include:<br><li>CPU_UTILIZATION: CPU utilization</li><li>MEM_UTILIZATION: Memory utilization</li><li>LAN_TRAFFIC_OUT: Outbound bandwidth of private network</li><li>LAN_TRAFFIC_IN: Inbound bandwidth of private network </li><li>WAN_TRAFFIC_OUT: Outbound bandwidth of public network</li><li>WAN_TRAFFIC_IN: Inbound bandwidth of public network</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Obtain the alarmed threshold:<br><li>CPU_UTILIZATION: [1, 100], unit: %</li><li>MEM_UTILIZATION: [1, 100], unit: %</li><li>LAN_TRAFFIC_OUT: >0, unit: Mbps </li><li>LAN_TRAFFIC_IN: >0, unit: Mbps</li><li>WAN_TRAFFIC_OUT: >0, unit: Mbps</li><li>WAN_TRAFFIC_IN: >0, unit: Mbps</li>
     * @return Threshold Alarm threshold:<br><li>CPU_UTILIZATION: [1, 100], unit: %</li><li>MEM_UTILIZATION: [1, 100], unit: %</li><li>LAN_TRAFFIC_OUT: >0, unit: Mbps </li><li>LAN_TRAFFIC_IN: >0, unit: Mbps</li><li>WAN_TRAFFIC_OUT: >0, unit: Mbps</li><li>WAN_TRAFFIC_IN: >0, unit: Mbps</li>
     */
    public Integer getThreshold() {
        return this.Threshold;
    }

    /**
     * Configure the alarmed threshold:<br><li>CPU_UTILIZATION: [1, 100], unit: %</li><li>MEM_UTILIZATION: [1, 100], unit: %</li><li>LAN_TRAFFIC_OUT: >0, unit: Mbps </li><li>LAN_TRAFFIC_IN: >0, unit: Mbps</li><li>WAN_TRAFFIC_OUT: >0, unit: Mbps</li><li>WAN_TRAFFIC_IN: >0, unit: Mbps</li>
     * @param Threshold Alarm threshold:<br><li>CPU_UTILIZATION: [1, 100], unit: %</li><li>MEM_UTILIZATION: [1, 100], unit: %</li><li>LAN_TRAFFIC_OUT: >0, unit: Mbps </li><li>LAN_TRAFFIC_IN: >0, unit: Mbps</li><li>WAN_TRAFFIC_OUT: >0, unit: Mbps</li><li>WAN_TRAFFIC_IN: >0, unit: Mbps</li>
     */
    public void setThreshold(Integer Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Obtain the time period, unit: sec, enumerated value: 60, 300.
     * @return Period Time period, unit: sec, enumerated value: 60, 300.
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * Configure the time period, unit: sec, enumerated value: 60, 300.
     * @param Period Time period, unit: sec, enumerated value: 60, 300.
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * Obtain the repeat times. Value range: [1, 10]
     * @return ContinuousTime Repeat times. Value range: [1, 10]
     */
    public Integer getContinuousTime() {
        return this.ContinuousTime;
    }

    /**
     * Configure the repeat times. Value range: [1, 10]
     * @param ContinuousTime Repeat times. Value range: [1, 10]
     */
    public void setContinuousTime(Integer ContinuousTime) {
        this.ContinuousTime = ContinuousTime;
    }

    /**
     * Obtain the statistic type. Available value:<br><li>AVERAGE: Average value</li><li>MAXIMUM: Maximum value<li>MINIMUM: Minimum value</li><br> Default: AVERAGE
     * @return Statistic Statistic type. Available value:<br><li>AVERAGE: Average value</li><li>MAXIMUM: Maximum value<li>MINIMUM: Minimum value</li><br> Default: AVERAGE
     */
    public String getStatistic() {
        return this.Statistic;
    }

    /**
     * Configure the statistic type. Available value:<br><li>AVERAGE: Average value</li><li>MAXIMUM: Maximum value<li>MINIMUM: Minimum value</li><br> Default: AVERAGE
     * @param Statistic Statistic type. Available value:<br><li>AVERAGE: Average value</li><li>MAXIMUM: Maximum value<li>MINIMUM: Minimum value</li><br> Default: AVERAGE
     */
    public void setStatistic(String Statistic) {
        this.Statistic = Statistic;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComparisonOperator", this.ComparisonOperator);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ContinuousTime", this.ContinuousTime);
        this.setParamSimple(map, prefix + "Statistic", this.Statistic);

    }
}

