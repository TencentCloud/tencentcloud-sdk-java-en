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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagResource  extends AbstractModel{

    /**
    * Tag key.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Tag key MD5 value.
    */
    @SerializedName("TagKeyMd5")
    @Expose
    private String TagKeyMd5;

    /**
    * Tag value MD5 value.
    */
    @SerializedName("TagValueMd5")
    @Expose
    private String TagValueMd5;

    /**
     * Get Tag key. 
     * @return TagKey Tag key.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key.
     * @param TagKey Tag key.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value. 
     * @return TagValue Tag value.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value.
     * @param TagValue Tag value.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Resource ID. 
     * @return ResourceId Resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID.
     * @param ResourceId Resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Tag key MD5 value. 
     * @return TagKeyMd5 Tag key MD5 value.
     */
    public String getTagKeyMd5() {
        return this.TagKeyMd5;
    }

    /**
     * Set Tag key MD5 value.
     * @param TagKeyMd5 Tag key MD5 value.
     */
    public void setTagKeyMd5(String TagKeyMd5) {
        this.TagKeyMd5 = TagKeyMd5;
    }

    /**
     * Get Tag value MD5 value. 
     * @return TagValueMd5 Tag value MD5 value.
     */
    public String getTagValueMd5() {
        return this.TagValueMd5;
    }

    /**
     * Set Tag value MD5 value.
     * @param TagValueMd5 Tag value MD5 value.
     */
    public void setTagValueMd5(String TagValueMd5) {
        this.TagValueMd5 = TagValueMd5;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TagKeyMd5", this.TagKeyMd5);
        this.setParamSimple(map, prefix + "TagValueMd5", this.TagValueMd5);

    }
}

