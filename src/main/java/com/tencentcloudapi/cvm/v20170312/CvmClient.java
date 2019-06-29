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
package com.tencentcloudapi.cvm.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvm.v20170312.models.*;

public class CvmClient extends AbstractClient{
    private static String endpoint = "cvm.tencentcloudapi.com";
    private static String version = "2017-03-12";

    /**
     * Construct client
     * @param credential client credentials
     * @param region product region
     */
    public CvmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * Construct client
     * @param credential client credentials
     * @param region product region
     * @param profile client profile
     */
    public CvmClient(Credential credential, String region, ClientProfile profile) {
        super(CvmClient.endpoint, CvmClient.version, credential, region, profile);
    }

    /**
     *This API (AllocateHosts) is used to create one or more CDH instances with specified configuration.
* When HostChargeType is PREPAID, the HostChargePrepaid parameter must be specified.
     * @param req AllocateHostsRequest
     * @return AllocateHostsResponse
     * @throws TencentCloudSDKException
     */
    public AllocateHostsResponse AllocateHosts(AllocateHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateHostsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateHostsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AllocateHosts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssociateInstancesKeyPairs) is used to associate a key pair to an instance.

* When the public key of a key pair is written to the`SSH`configuration of the instance, you can log in to the instance through the private key of the key pair.
* If the instance has associated with a key, the old key will be invalid.
* If the instance was originally logged in through a password, the password will become unavailable if the instance associate a key.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100. If any instance that does not allow batch operation, an [error code] is returned.
     * @param req AssociateInstancesKeyPairsRequest
     * @return AssociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateInstancesKeyPairsResponse AssociateInstancesKeyPairs(AssociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateInstancesKeyPairsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateInstancesKeyPairsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateInstancesKeyPairs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AssociateSecurityGroups) is used to associate a security group to a specified instance.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateDisasterRecoverGroup) is used to create[spread placement group](https://cloud.tencent.com/document/product/213/15486). You can assign an exist placement group when[create instance](https://cloud.tencent.com/document/api/213/15730).
     * @param req CreateDisasterRecoverGroupRequest
     * @return CreateDisasterRecoverGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisasterRecoverGroupResponse CreateDisasterRecoverGroup(CreateDisasterRecoverGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisasterRecoverGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisasterRecoverGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDisasterRecoverGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateImage) is used to create an new image from the system disk of an instance. The created image can be used to create instances.
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This (CreateKeyPair) is used to create a `OpenSSH RSA` KeyPair，can be used to log in `Linux` instance.

* You only need to specify the KeyPair name, and the system can automatically create a KeyPair and return the KeyPair `ID` as well as its public and private keys.
* The KeyPair name must be unique.
* The content of private key can be saved to a file as an `SSH` authentication method.
* Tencent Cloud does not preserve user's private key. Please keep it well.
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKeyPairResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKeyPairResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateKeyPair"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteDisasterRecoverGroups) is used to delete[spread placement group](https://cloud.tencent.com/document/product/213/15486). Only empty placement group will be deleted，non empty placement group need to terminate all the CVMs in the group before delete, otherwise the deletion may fail.
     * @param req DeleteDisasterRecoverGroupsRequest
     * @return DeleteDisasterRecoverGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDisasterRecoverGroupsResponse DeleteDisasterRecoverGroups(DeleteDisasterRecoverGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDisasterRecoverGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDisasterRecoverGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDisasterRecoverGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteImages) is used to delete one or more images.

* when[image status](https://cloud.tencent.com/document/api/213/9452#image_state) are`创建中`and`使用中`, it’s not allowed to delete. You can get image status via[DescribeImages](https://cloud.tencent.com/document/api/213/9418).
* A maximum of 10 custom images are allowed to be created for each region. Deletion of images can free the quota on account.
* A shared image cannot be deleted.
     * @param req DeleteImagesRequest
     * @return DeleteImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImagesResponse DeleteImages(DeleteImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImagesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImagesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImages"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteKeyPairs) is used to delete the key pairs hosted in Tencent Cloud.

* A shared image cannot be deleted.
* The KeyPair referenced by an instance or image cannot be deleted. You need to verify whether all the key pairs have been deleted successfully.
     * @param req DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKeyPairsResponse DeleteKeyPairs(DeleteKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteKeyPairsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteKeyPairsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteKeyPairs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDisasterRecoverGroupQuota) is used to query the quota of[spread placement group](https://cloud.tencent.com/document/product/213/15486).
     * @param req DescribeDisasterRecoverGroupQuotaRequest
     * @return DescribeDisasterRecoverGroupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverGroupQuotaResponse DescribeDisasterRecoverGroupQuota(DescribeDisasterRecoverGroupQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisasterRecoverGroupQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisasterRecoverGroupQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDisasterRecoverGroupQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDisasterRecoverGroups)is used to query information of[spread placement group](https://cloud.tencent.com/document/product/213/15486).
     * @param req DescribeDisasterRecoverGroupsRequest
     * @return DescribeDisasterRecoverGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisasterRecoverGroupsResponse DescribeDisasterRecoverGroups(DescribeDisasterRecoverGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisasterRecoverGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisasterRecoverGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDisasterRecoverGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeHosts) is used to get the details of one or more CDH instances.
     * @param req DescribeHostsRequest
     * @return DescribeHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsResponse DescribeHosts(DescribeHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHosts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeImageQuota) is used to query the image quota under the user account.
     * @param req DescribeImageQuotaRequest
     * @return DescribeImageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageQuotaResponse DescribeImageQuota(DescribeImageQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeImageSharePermission) is used to query the information on image sharing.
     * @param req DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSharePermissionResponse DescribeImageSharePermission(DescribeImageSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSharePermissionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSharePermissionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageSharePermission"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeImages) is used to view the image list.

* You can query the details of the specified images by specifying image IDs, or set filters to query the details of the images that satisfy the filter conditions.
* You can specify Offset and Limit to select a part of the results. The information of the first 20 images satisfying the condition is returned by default.
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImages"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeImportImageOs) is used to view the operating system information of an imported image.
     * @param req DescribeImportImageOsRequest
     * @return DescribeImportImageOsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportImageOsResponse DescribeImportImageOs(DescribeImportImageOsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImportImageOsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImportImageOsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImportImageOs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstanceFamilyConfigs) is used to query the list of model families supported by the current user and region.
     * @param req DescribeInstanceFamilyConfigsRequest
     * @return DescribeInstanceFamilyConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceFamilyConfigsResponse DescribeInstanceFamilyConfigs(DescribeInstanceFamilyConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceFamilyConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceFamilyConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceFamilyConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstanceInternetBandwidthConfigs) is used to query the instance bandwidth configuration.

* Only support query the bandwidth configuration of billing mode `BANDWIDTH_PREPAID`.
* All bandwidth configuration information (including historical bandwidth configuration information) of an instance is returned via the API.
     * @param req DescribeInstanceInternetBandwidthConfigsRequest
     * @return DescribeInstanceInternetBandwidthConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceInternetBandwidthConfigsResponse DescribeInstanceInternetBandwidthConfigs(DescribeInstanceInternetBandwidthConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceInternetBandwidthConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceInternetBandwidthConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceInternetBandwidthConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstanceTypeConfigs) is used to query the instance model configuration.

* You can query instance specification via`zone` and `instance-family`. Check filter`Filter`.
* If the parameter is empty, all instances specification under the specified region are returned.
     * @param req DescribeInstanceTypeConfigsRequest
     * @return DescribeInstanceTypeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypeConfigsResponse DescribeInstanceTypeConfigs(DescribeInstanceTypeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceTypeConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceTypeConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceTypeConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstanceVncUrl) is used to query the URL to the instance management client.

* CVM under status `STOPPED` can not use this functionality.
* The validity period of the management client URL is 15 sec. If the URL is not accessed within 15 sec after the API is called, it will become invalid automatically. You have to query a URL again.
* Once the client URL is accessed, it will become invalid automatically. You have to query a URL again.
* If the access is disconnected, reconnect attempts within one minute cannot exceed 30 times.
* After get `InstanceVncUrl` ，need to add <https: //img.qcloud.com/qcloud/app/active_vnc/index.html?> parameter `InstanceVncUrl=xxxx`  at the end of link.  - Parameter `InstanceVncUrl` ：Successfully call API will return value of `InstanceVncUrl` .    The final URLs are in the following format:

```
https://img.qcloud.com/qcloud/app/active_vnc/index.html?InstanceVncUrl=wss%3A%2F%2Fbjvnc.qcloud.com%3A26789%2Fvnc%3Fs%3DaHpjWnRVMFNhYmxKdDM5MjRHNlVTSVQwajNUSW0wb2tBbmFtREFCTmFrcy8vUUNPMG0wSHZNOUUxRm5PMmUzWmFDcWlOdDJIbUJxSTZDL0RXcHZxYnZZMmRkWWZWcEZia2lyb09XMzdKNmM9
```

     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceVncUrlResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceVncUrlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstanceVncUrl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstances) is used to query the details of one or more instances.

* You can query the details of an instance according to instance`ID`, instance name or billing method. See `Filter` for filtering information`Filter`.
* If the parameter is empty, a certain number (specified by ``Limit``, the default is 20) of instances are returned to the current user.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API（DescribeInstancesOperationLimit）is used to query operation limitation of instances.

* the query for adjusting the number of configuration operation limitation is supported
     * @param req DescribeInstancesOperationLimitRequest
     * @return DescribeInstancesOperationLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesOperationLimitResponse DescribeInstancesOperationLimit(DescribeInstancesOperationLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesOperationLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesOperationLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstancesOperationLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstancesStatus) is used to query the status of one or more instances.

* You can query instance status via instance `ID`.
* If the parameter is empty, a certain number (specified by `Limit`, the default is 20) of status are returned to the current user.
     * @param req DescribeInstancesStatusRequest
     * @return DescribeInstancesStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesStatusResponse DescribeInstancesStatus(DescribeInstancesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstancesStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInternetChargeTypeConfigs) is used to query the network billing type.
     * @param req DescribeInternetChargeTypeConfigsRequest
     * @return DescribeInternetChargeTypeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInternetChargeTypeConfigsResponse DescribeInternetChargeTypeConfigs(DescribeInternetChargeTypeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInternetChargeTypeConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInternetChargeTypeConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInternetChargeTypeConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeKeyPairs) is used to query key pair information.

* A keyPair is a pair of keys generated with an algorithm. In the generated key pair, one key is open to the public and called public key, and the other key kept by users is called private key. The public key content of the key pair can be queried through this API, but the private key content is not retained by system.
     * @param req DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKeyPairsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKeyPairsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeKeyPairs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeRegions) is used to query regions.
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRegions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeZoneInstanceConfigInfos) is used to obtain the model information in an availability zone.
     * @param req DescribeZoneInstanceConfigInfosRequest
     * @return DescribeZoneInstanceConfigInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneInstanceConfigInfosResponse DescribeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneInstanceConfigInfosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneInstanceConfigInfosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZoneInstanceConfigInfos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeZones) is used to query availability zones.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeZones"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateInstancesKeyPairs) is used to unbind a key pair from an instance.

* Only support instances with operation system `Linux` and status [`STOPPED`](https://cloud.tencent.com/document/api/213/9452#INSTANCE_STATE).
* After the key pair is unassociated, the instance can be logged in with the original password.
* If password was not set before, you couldn’t use `SSH` to login after unassociated. Call API [ResetInstancesPassword](https://cloud.tencent.com/document/api/213/15736) to set login password.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100. If any instance that does not allow batch operations, an [error code] is returned.
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateInstancesKeyPairsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateInstancesKeyPairsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateInstancesKeyPairs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisassociateSecurityGroups) is used to disassociate a security group from specified instances.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ImportImage) is used to import images that can be used to create instances.
     * @param req ImportImageRequest
     * @return ImportImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportImageResponse ImportImage(ImportImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ImportKeyPair) is used to import key pairs.

* This API is designed to import the key pair to the user account, instead of binding it to an instance automatically. You can bind the key pair to an instance using API [AssociasteInstancesKeyPair](https://cloud.tencent.com/document/api/213/9404).
* The key pair name and the public key text of the key pair need to be specified.
* If you have only the private key, you can convert the private key to a public key using `SSL` tool before importing it.
     * @param req ImportKeyPairRequest
     * @return ImportKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public ImportKeyPairResponse ImportKeyPair(ImportKeyPairRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportKeyPairResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImportKeyPairResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImportKeyPair"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceModifyInstancesChargeType) is used to inquire the price for the switched billing method of an instance.

* This API only supports switching the billing method from `POSTPAID_BY_HOUR` to `PREPAID`.
* This operation is not supported for instances that are not charged for shutdown period, that belong to `BC1` and `BS1` model families, and that will be terminated at a certain time.
     * @param req InquiryPriceModifyInstancesChargeTypeRequest
     * @return InquiryPriceModifyInstancesChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceModifyInstancesChargeTypeResponse InquiryPriceModifyInstancesChargeType(InquiryPriceModifyInstancesChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceModifyInstancesChargeTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceModifyInstancesChargeTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceModifyInstancesChargeType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceRenewInstances) is used to inquiry the price of prepaid instance renewal.

* Only supports querying the renewal price of the prepaid instances.
     * @param req InquiryPriceRenewInstancesRequest
     * @return InquiryPriceRenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewInstancesResponse InquiryPriceRenewInstances(InquiryPriceRenewInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceRenewInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceResetInstance) is used to inquire the prices of reinstalled instances.* If you have specified `ImageId` parameter, the price inquiry is performed with the specified image. Otherwise, the image used by the current instance is used.* You can use this API to inquire prices after the operating system switch between `Linux` and `Windows` only for the instances with a [system disk type](/document/api/213/9452#block_device) of `CLOUD_BASIC`, `CLOUD_PREMIUM` and `CLOUD_SSD`.* For the instances in overseas regions, this operation is not supported.
     * @param req InquiryPriceResetInstanceRequest
     * @return InquiryPriceResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstanceResponse InquiryPriceResetInstance(InquiryPriceResetInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceResetInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceResetInstancesInternetMaxBandwidth) is used to inquire the price of the adjusted public network bandwidth cap of an instance.

* The bandwidth cap varies with different models. For details, please see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/509).
* For a bandwidth with the `BANDWIDTH_PREPAID` billing mode, the parameters `StartTime` and `EndTime` need to be input to specify the validity period of the adjusted bandwidth. Bandwidth downgrade is not supported currently in this scenario. Since fee deduction is involved, make sure to keep sufficient balance in your account. You can query the balance via the API [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397).
* For a bandwidth with the `TRAFFIC_POSTPAID_BY_HOUR`, the `BANDWIDTH_POSTPAID_BY_HOUR`, or the `BANDWIDTH_PACKAGE` billing method, the adjustment of the bandwidth cap using this API takes effect in real time. Bandwidth upgrade and downgrade in the permitted range are supported, and the input of parameters `StartTime` and `EndTime` is not supported.
* This API does not support adjusting a bandwidth with the `BANDWIDTH_POSTPAID_BY_MONTH` billing method.
* This API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` or the `BANDWIDTH_POSTPAID_BY_HOUR` billing method.
* This API does not support batch adjustment of bandwidths with hybrid billing methods. For instance, it does not support adjusting bandwidths with the `TRAFFIC_POSTPAID_BY_HOUR` and the `BANDWIDTH_PACKAGE` billing methods at the same time.
     * @param req InquiryPriceResetInstancesInternetMaxBandwidthRequest
     * @return InquiryPriceResetInstancesInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstancesInternetMaxBandwidthResponse InquiryPriceResetInstancesInternetMaxBandwidth(InquiryPriceResetInstancesInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetInstancesInternetMaxBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetInstancesInternetMaxBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceResetInstancesInternetMaxBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceResetInstancesType) is used to inquire the price of adjusting the model of an instance.

* Currently, using this API for inquiring about the price of adjusting models is only supported for the instances with a [system disk type](https://cloud.tencent.com/document/api/213/9452#block_device) of `CLOUD_BASIC`, `CLOUD_PREMIUM` and `CLOUD_SSD`.
* Currently, using this API for inquiring about the price of adjusting models is only supported for the instances with a [system disk type](https://cloud.tencent.com/document/api/213/9452#block_device) of `CLOUD_BASIC`, `CLOUD_PREMIUM` and `CLOUD_SSD`.
* For prepaid instances, fee deduction will be involved in using this API, so make sure to keep sufficient balance in your account. You can query the balance via the API [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397).
     * @param req InquiryPriceResetInstancesTypeRequest
     * @return InquiryPriceResetInstancesTypeResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetInstancesTypeResponse InquiryPriceResetInstancesType(InquiryPriceResetInstancesTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetInstancesTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetInstancesTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceResetInstancesType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceResizeInstanceDisks) is used to inquiry the price of data disk capacity expansion of the instance.

* Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. 
* Currently, the [CDH](https://cloud.tencent.com/document/product/416) instance is not supported to use this API to inquiry the price of data disk capacity expansion.* Only data disks purchased along with prepaid instances are supported.* Inquiring the price of expanding the capacity of only one data disk is supported.
     * @param req InquiryPriceResizeInstanceDisksRequest
     * @return InquiryPriceResizeInstanceDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResizeInstanceDisksResponse InquiryPriceResizeInstanceDisks(InquiryPriceResizeInstanceDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResizeInstanceDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResizeInstanceDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceResizeInstanceDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceRunInstances) is used to inquire the price for instance creation. With this API, you can only inquire the price according to the instance configuration within the range of purchase limits. For more information, please see [Create Instance](https://cloud.tencent.com/document/api/213/15730).
     * @param req InquiryPriceRunInstancesRequest
     * @return InquiryPriceRunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRunInstancesResponse InquiryPriceRunInstances(InquiryPriceRunInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRunInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRunInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceRunInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDisasterRecoverGroupAttribute) is used modify attribution of [spread placement group].
     * @param req ModifyDisasterRecoverGroupAttributeRequest
     * @return ModifyDisasterRecoverGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisasterRecoverGroupAttributeResponse ModifyDisasterRecoverGroupAttribute(ModifyDisasterRecoverGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisasterRecoverGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisasterRecoverGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDisasterRecoverGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyHostsAttribute) is used to modify the attributes of CDH instance, such as instance name and renewal flag. Either the parameter HostName or RenewFlag must be set, but not both.
     * @param req ModifyHostsAttributeRequest
     * @return ModifyHostsAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsAttributeResponse ModifyHostsAttribute(ModifyHostsAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostsAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostsAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHostsAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyImageAttribute) is used to modify the image attributes.

* Modifying attributes is not allowed for a shared image.
     * @param req ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAttributeResponse ModifyImageAttribute(ModifyImageAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyImageAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyImageSharePermission) is used to modify the image sharing information.

* The accounts to which an image is shared can create instances from this image.
* Each custom image can be shared to a maximum of 50 accounts.
* A shared image can only be used to create instances and its name and description cannot be changed.
* An image can only be shared to the accounts in the same region with the source account.

     * @param req ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSharePermissionResponse ModifyImageSharePermission(ModifyImageSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageSharePermissionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageSharePermissionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyImageSharePermission"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstancesAttribute) is used to modify the attributes of an instance (only the modification to instance name is supported).

* "Instance name" is only used by users for their management. Tencent Cloud does not use the name as the basis for ticket submission or instance management.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
* The instance associated security group will be disassociated if the associated security group is modified.
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstancesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstancesChargeType) is used to switch the billing method of an instance.

* Only support switch billing mode from `POSTPAID_BY_HOUR` to `PREPAID`.
* No charges when shut down instances, `BC1`and`BS1` type instances, instances will be terminated at a certain time are not supported.
     * @param req ModifyInstancesChargeTypeRequest
     * @return ModifyInstancesChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesChargeTypeResponse ModifyInstancesChargeType(ModifyInstancesChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesChargeTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesChargeTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstancesChargeType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstancesProject) is used to modify the project to which an instance belongs.

* The project is a virtual concept. Users can create multiple projects under one account to manage different resources in each project, and assign the different instances to different projects. The API [`DescribeInstances`](https://cloud.tencent.com/document/api/213/9388) can be used to query instances and the project ID can be used to filter the results.
* The project of the instances bound with load balancers cannot be modified until the load balancers are unbound using the API [`DeregisterInstancesFromLoadBalancer`](https://cloud.tencent.com/document/api/214/1258).
* The security groups associated with the instances are automatically disassociated when the project of the instances is modified. You can use the API [`ModifySecurityGroupsOfInstance`](https://cloud.tencent.com/document/api/213/1367) to associate security groups after modification.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
     * @param req ModifyInstancesProjectRequest
     * @return ModifyInstancesProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesProjectResponse ModifyInstancesProject(ModifyInstancesProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstancesProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstancesRenewFlag) is used to modify the renewal flags of prepaid instances.

* Any instance marked "Auto Renewal" is automatically renewed for one month whenever it expires.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
     * @param req ModifyInstancesRenewFlagRequest
     * @return ModifyInstancesRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesRenewFlagResponse ModifyInstancesRenewFlag(ModifyInstancesRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstancesRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyInstancesVpcAttribute) is used to modify VPC attributes, such as IP
* Instances are shut down by default when you perform this operation， and restart when completed.
* when the VPC ID and subnet ID (the subnet must be in the same AZ with instance) are different with the VPC of the specified instance, will migrate the instances to the subnet of specified VPC. Please make sure there is no associated[ENI](https://cloud.tencent.com/document/product/576) and [Cloud Load Balancer](https://cloud.tencent.com/document/product/214) in specified instances.
     * @param req ModifyInstancesVpcAttributeRequest
     * @return ModifyInstancesVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesVpcAttributeResponse ModifyInstancesVpcAttribute(ModifyInstancesVpcAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstancesVpcAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstancesVpcAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyInstancesVpcAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyKeyPairAttribute) is used to modify the attributes of key pairs.

* This API modifies the name and description of the key pair identified by the key pair ID.
* The KeyPair name must be unique.
* Key pair ID is the unique identifier of key pair and cannot be modified.
     * @param req ModifyKeyPairAttributeRequest
     * @return ModifyKeyPairAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKeyPairAttributeResponse ModifyKeyPairAttribute(ModifyKeyPairAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyKeyPairAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyKeyPairAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyKeyPairAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RebootInstances) is used to restart an instance.

* This operation is only allowed for the instances with a status of `RUNNING`
* When the API call is successful, the instance goes into the `REBOOTING` status. When restart successfully, it goes into the `RUNNING` status.
* Forced restart is supported. Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RebootInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RebootInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RenewHosts) is used to renew the prepaid CDH instances.

* Only the prepaid instances are supported, otherwise a specific [error code](#4.-.E9.94.99.E8.AF.AF.E7.A0.81) will be returned.
* Make sure the account balance is sufficient when renewing. You can query the account balance via the [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397) API.
     * @param req RenewHostsRequest
     * @return RenewHostsResponse
     * @throws TencentCloudSDKException
     */
    public RenewHostsResponse RenewHosts(RenewHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewHostsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewHostsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewHosts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RenewInstances) is used to renew prepaid instances.

* Only the prepaid instances are supported.
* Make sure the account balance is sufficient when renewing. You can query the account balance via the [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397) API.
     * @param req RenewInstancesRequest
     * @return RenewInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstancesResponse RenewInstances(RenewInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenewInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenewInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetInstance) is used to reinstall the operating system for the specified instance.

* If you have specified `ImageId` parameter, the re-installation is performed with the specified image. Otherwise, the image used by the current instance is used.
* The system disk will be formatted and reset. Please ensure that there is no important file in the system disk.
* As the operating system is switched between `Linux` and `Windows`, the system disk `ID` of the instance will change, and the snapshot associated with the system disk can't be used to roll back and recover data.
* If no password is specified, a password is issued randomly via internal message.
* You can use this API to inquire prices after the operating system switch between `Linux` and `Windows` only for the instances with a [system disk type](https://cloud.tencent.com/document/api/213/9452#block_device) of `CLOUD_BASIC`, `CLOUD_PREMIUM` and `CLOUD_SSD`.
* For the instances in overseas regions, this operation is not supported.
     * @param req ResetInstanceRequest
     * @return ResetInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstanceResponse ResetInstance(ResetInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetInstancesInternetMaxBandwidth) is used to adjust the public network bandwidth cap of an instance.

* The bandwidth cap varies with different models. For details, please see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/509).
* For a bandwidth with the `BANDWIDTH_PREPAID` billing method, the parameters `StartTime` and `EndTime` need to be input to specify the validity period of the adjusted bandwidth. Bandwidth downgrade is not supported currently in this scenario. Since fee deduction is involved, make sure to keep sufficient balance in your account. You can query the balance via the API [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397).
* For a bandwidth with the `TRAFFIC_POSTPAID_BY_HOUR`, the `BANDWIDTH_POSTPAID_BY_HOUR`, or the `BANDWIDTH_PACKAGE` billing method, the adjustment of the bandwidth cap using this API takes effect in real time. Bandwidth upgrade and downgrade in the permitted range are supported, and the input of parameters `StartTime` and `EndTime` is not supported.
* This API does not support adjusting a bandwidth with the `BANDWIDTH_POSTPAID_BY_MONTH` billing method.
* This API does not support batch adjustment of bandwidths with the `BANDWIDTH_PREPAID` or the `BANDWIDTH_POSTPAID_BY_HOUR` billing method.
* This API does not support batch adjustment of bandwidths with hybrid billing methods. For instance, it does not support adjusting bandwidths with the `TRAFFIC_POSTPAID_BY_HOUR` and the `BANDWIDTH_PACKAGE` billing methods at the same time.
     * @param req ResetInstancesInternetMaxBandwidthRequest
     * @return ResetInstancesInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesInternetMaxBandwidthResponse ResetInstancesInternetMaxBandwidth(ResetInstancesInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesInternetMaxBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesInternetMaxBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetInstancesInternetMaxBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetInstancesPassword) is used to reset the password of the instance operating system to a user-defined one.

* This API only modifies the password of administrator account. The administrator account ID varies with the operating system of instance (e.g., `Administrator` for `Windows`, `ubuntu` for `Ubuntu`, and `root` for other systems).
* To reset the password for a running instance, you need to explicitly specify the parameter `ForceStop` for a forced shutdown. If not, you can only reset password for the instances that have been shut down.
* The bandwidth cap varies with different models. For details, please see [Purchase Network Bandwidth](https://cloud.tencent.com/document/product/213/509).
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetInstancesPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResetInstancesType) is used to adjust the model of an instance.
* Using this API for adjusting models is only supported for the instances with a [system disk type](/document/api/213/9452#block_device) of `CLOUD_BASIC`, `CLOUD_PREMIUM` and `CLOUD_SSD`.
* Currently, using this API for adjusting mode is not supported for the [CDH](https://cloud.tencent.com/document/product/416) instances. For prepaid instances, fee deduction will be involved in using this API, so make sure to keep sufficient balance in your account. You can query the balance via the API [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397).
     * @param req ResetInstancesTypeRequest
     * @return ResetInstancesTypeResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesTypeResponse ResetInstancesType(ResetInstancesTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetInstancesTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetInstancesTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetInstancesType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResizeInstanceDisks) is used to expand the capacity of the data disk of an instance.

* Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. 
* Currently, the [CDH](https://cloud.tencent.com/document/product/416) instance is not supported to use this API to inquiry the price of data disk capacity expansion.
* For prepaid instances, fee deduction will be involved in using this API, so make sure to keep sufficient balance in your account. You can query the balance via the API [`DescribeAccountBalance`](https://cloud.tencent.com/document/product/378/4397).
* Only one data disk is allowed for capacity expansion.
     * @param req ResizeInstanceDisksRequest
     * @return ResizeInstanceDisksResponse
     * @throws TencentCloudSDKException
     */
    public ResizeInstanceDisksResponse ResizeInstanceDisks(ResizeInstanceDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeInstanceDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeInstanceDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResizeInstanceDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RunInstances) is used to create one or more instances with specified configuration.

* After the instance is created successfully, it will start on boot and the [instance status](/document/api/213/9452#instance_state) will become "running".
* For prepaid instances, the required amount will be pre-deducted; for postpaid instances billed on an hourly basis, the amount equal to an hourly rate of the instance will be pre-frozen. Make sure your account balance is sufficient before calling this API.
* The instances allowed to be purchased by this API are subject to the number limit described in the [Restrictions on CVM Instance Purchase] (https://cloud.tencent.com/document/product/213/2664), and share the quota with the instances created by the official website entry.
* This API is an asynchronous API. An instance `ID` list will be returned when the creation request is issued successfully, but the instance is not created immediately. During this period, the status of the instance is "Pending". You can call API [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) to query the status of the instance to check whether it is created. If the status changes from "Pending" to "Running", the instance is created successfully.
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RunInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RunInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (StartInstances) is used to start one or more instances.

* This operation is only allowed for the instances with a status of `STOPPED`.
* When the API is called successfully, the instance goes into the `STARTING` status. When started, it goes into the `RUNNING` status.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (StopInstances) is used to shut down one or more instances.

* This operation is only allowed for the instances with a status of `RUNNING`.
* When the API is called successfully, the instance goes into the `STOPPING` status. When the instance is shut down, it goes into the `STOPPED` status.
*  Forced shutdown is supported. Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (SyncImages) is used to sync a custom image to other regions.

* Each call to this API can only sync a single image.
* This API supports syncing to multiple regions.
* A maximum of 10 custom images are allowed to be created for each region. 
     * @param req SyncImagesRequest
     * @return SyncImagesResponse
     * @throws TencentCloudSDKException
     */
    public SyncImagesResponse SyncImages(SyncImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncImagesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SyncImagesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SyncImages"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (TerminateInstances) is used to return instances.

* The instances that are no longer used can be returned via this API.
* Postpaid instances can be directly returned via this API. Prepaid instances that conform to the [rules for return](https://cloud.tencent.com/document/product/213/9711) can also be returned via this API.
* Batch operations are supported. The maximum number of instances in a batch for each request is 100.
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
