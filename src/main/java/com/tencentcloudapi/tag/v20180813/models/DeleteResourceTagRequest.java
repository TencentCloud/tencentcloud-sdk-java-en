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

public class DeleteResourceTagRequest extends AbstractModel{

    /**
    * Tag key.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Resource description in six-piece format.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

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
     * Get Resource description in six-piece format. 
     * @return Resource Resource description in six-piece format.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource description in six-piece format.
     * @param Resource Resource description in six-piece format.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

