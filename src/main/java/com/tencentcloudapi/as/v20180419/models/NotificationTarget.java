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

public class NotificationTarget  extends AbstractModel{

    /**
    * Target type.The value range includes `CMQ_QUEUE`,`CMQ_TOPIC`.
<li> CMQ_QUEUE，Tencent Cloud Message Queue - Queue Model.</li>
<li> CMQ_TOPIC，Tencent Cloud Message Queue - Topic Model.</li>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Queue name.If `CMQ_QUEUE` has value `TargetType`,this field must be set.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Topic name.If `TargetType` has value `CMQ_TOPIC`,this field must be set.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Obtain target type,The value range includes `CMQ_QUEUE`,`CMQ_TOPIC`.
<li> CMQ_QUEUE，Tencent Cloud Message Queue - Queue Model.</li>
<li> CMQ_TOPIC，Tencent Cloud Message Queue - Topic Model.</li>
     * @return TargetType Target type.The value range includes `CMQ_QUEUE`,`CMQ_TOPIC`.
<li> CMQ_QUEUE，Tencent Cloud Message Queue - Queue Model.</li>
<li> CMQ_TOPIC，Tencent Cloud Message Queue - Topic Model.</li>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set target type.The value range includes `CMQ_QUEUE`,`CMQ_TOPIC`.
<li> CMQ_QUEUE，Tencent Cloud Message Queue - Queue Model.</li>
<li> CMQ_TOPIC，Tencent Cloud Message Queue - Topic Model.</li>
     * @param TargetType Target type.The value range includes `CMQ_QUEUE`,`CMQ_TOPIC`.
<li> CMQ_QUEUE，Tencent Cloud Message Queue - Queue Model.</li>
<li> CMQ_TOPIC，Tencent Cloud Message Queue - Topic Model.</li>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Obtain queue name,If `TargetType` value equal to `CMQ_QUEUE` , field must be filled.
     * @return QueueName Queue name,If `TargetType` value equal to `CMQ_QUEUE`,this field must be filled.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set queue name,If `TargetType` value equal to `CMQ_QUEUE`,this field must be filled.
     * @param QueueName Queue name,If `TargetType` value equal to `CMQ_QUEUE`,this field must be filled.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Obtain topic name,If `TargetType` value equal to `CMQ_TOPIC`,this field must be filled.
     * @return TopicName Topic name,If `TargetType` value equal to `CMQ_TOPIC`,this field must be filled.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic name,If `TargetType` value equal to `CMQ_TOPIC`,this field must be filled.
     * @param TopicName Topic name,If `TargetType` value equal to `CMQ_TOPIC`,this field must be filled.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

