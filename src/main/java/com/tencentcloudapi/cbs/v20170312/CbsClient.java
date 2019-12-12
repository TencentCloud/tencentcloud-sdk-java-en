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
package com.tencentcloudapi.cbs.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cbs.v20170312.models.*;

public class CbsClient extends AbstractClient{
    private static String endpoint = "cbs.tencentcloudapi.com";
    private static String version = "2017-03-12";

    public CbsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CbsClient(Credential credential, String region, ClientProfile profile) {
        super(CbsClient.endpoint, CbsClient.version, credential, region, profile);
    }

    /**
     *This API (ApplySnapshot) is used to roll back a snapshot to the original cloud disk.

* The snapshot can only be rolled back to the original cloud disk. For data disk snapshots, if you need to copy the snapshot data to other cloud disks, use the API [CreateDisks](/document/product/362/16312) to create an elastic cloud disk and then copy the snapshot data to the created cloud disk. 
* The snapshot for rollback must be in NORMAL status. The snapshot status can be queried in the SnapshotState field in the output parameters through the API [DescribeSnapshots](/document/product/362/15647).
* For elastic cloud disks, the cloud disk must be in UNMOUNTED status. The cloud disk status can be queried in the Attached field returned by the API [DescribeDisks](/document/product/362/16315). For non-elastic cloud disks purchased together with instances, the instance must be in SHUTDOWN status. The instance status can be queried through the API [DescribeInstancesStatus](/document/product/213/15738).
     * @param req ApplySnapshotRequest
     * @return ApplySnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplySnapshotResponse ApplySnapshot(ApplySnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplySnapshotResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ApplySnapshotResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplySnapshot"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (AttachDisks) is used to mount cloud disks.
 
* Batch operations are supported. Multiple cloud disks can be mounted to a CVM. If there is a cloud disk that does not allow this operation, the operation is not performed and a specific error code is returned.
* This API is an asynchronous API. If the request for mounting the cloud disk successfully returns results, the operation of mounting cloud disk has been initiated at the background. You can use the API [DescribeDisks](/document/product/362/16315) to query the cloud disk status. If the status changes from "ATTACHING" to "ATTACHED", the cloud disk is mounted.
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (BindAutoSnapshotPolicy) is used to bind the cloud disk to the specified scheduled snapshot policy.

* For the scheduled snapshot policy limit of each region, see [Scheduled Snapshots](/document/product/362/8191).
* When a cloud disk that is bound to a scheduled snapshot policy is in the unused state (that is, an elastic cloud disk has not been mounted or the server of an inelastic disk is powered off) scheduled snapshots are not created.
     * @param req BindAutoSnapshotPolicyRequest
     * @return BindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoSnapshotPolicyResponse BindAutoSnapshotPolicy(BindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAutoSnapshotPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindAutoSnapshotPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindAutoSnapshotPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAutoSnapshotPolicy) is used to create a scheduled snapshot policy.

* For the limits on the number of scheduled snapshot policies that can be created in each region, see [Scheduled Snapshots](/document/product/362/8191).
* The quantity and capacity of the snapshots that can be created in each region are limited. For more information, see the **Snapshots** page on the Tencent Cloud Console. If the number of snapshots exceeds the quota, the creation of the scheduled snapshots will fail.
     * @param req CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoSnapshotPolicyResponse CreateAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoSnapshotPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoSnapshotPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAutoSnapshotPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more cloud disks.

* This API supports creating a cloud disk with a data disk snapshot so that the snapshot data can be copied to the purchased cloud disk.
* This API is an async API. A cloud disk ID list will be returned when a request is made successfully, but it does not mean that the creation has been completed. You can call the [DescribeDisks](/document/product/362/16315) API to query cloud disks by `DiskId`. If a new cloud disk can be found and its state is 'UNATTACHED' or 'ATTACHED', it means that the cloud disk has been created successfully.
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateSnapshot) is used to create a snapshot of a specified cloud disk.

* Snapshots can only be created for cloud disks with the snapshot capability. To check whether a cloud disk has the snapshot capability, see the SnapshotAbility field returned by the API [DescribeDisks](/document/product/362/16315).
* For the number of snapshots that can be created, please see [Product Usage Restriction](https://cloud.tencent.com/doc/product/362/5145).
     * @param req CreateSnapshotRequest
     * @return CreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotResponse CreateSnapshot(CreateSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSnapshot"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAutoSnapshotPolicies) is used to delete scheduled snapshot policies.

* Batch operations are supported. If one of the scheduled snapshot policies in a batch cannot be deleted, the operation is not performed and a specific error code is returned.
     * @param req DeleteAutoSnapshotPoliciesRequest
     * @return DeleteAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoSnapshotPoliciesResponse DeleteAutoSnapshotPolicies(DeleteAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAutoSnapshotPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAutoSnapshotPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAutoSnapshotPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteSnapshots) is used to delete snapshots.

* The snapshot must be in NORMAL status. The snapshot status can be queried in the SnapshotState field in the output parameters through the API [DescribeSnapshots](/document/product/362/15647).
* Batch operations are supported. If one of the snapshots in a batch cannot be deleted, the operation is not performed and a specific error code is returned.
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSnapshots"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAutoSnapshotPolicies) is used to query scheduled snapshot policies.

* You can query the detailed information of scheduled snapshot policies by ID, name, or status. Insert `AND` between different values. For details on filtering information, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`; the default is 20) of the scheduled snapshot policy lists are returned to the current user.

     * @param req DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoSnapshotPoliciesResponse DescribeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoSnapshotPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoSnapshotPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoSnapshotPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDiskAssociatedAutoSnapshotPolicy) is used to query the scheduled snapshot policy bound to a cloud disk.
     * @param req DescribeDiskAssociatedAutoSnapshotPolicyRequest
     * @return DescribeDiskAssociatedAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyResponse DescribeDiskAssociatedAutoSnapshotPolicy(DescribeDiskAssociatedAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskAssociatedAutoSnapshotPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskAssociatedAutoSnapshotPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDiskAssociatedAutoSnapshotPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDiskConfigQuota) is used to query the cloud disk quota.
     * @param req DescribeDiskConfigQuotaRequest
     * @return DescribeDiskConfigQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskConfigQuotaResponse DescribeDiskConfigQuota(DescribeDiskConfigQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskConfigQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskConfigQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDiskConfigQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDiskOperationLogs) is used to query a list of cloud disk operation logs.

This can be filtered according to the cloud disk ID. The format of cloud disk IDs is as follows: disk-a1kmcp13.

     * @param req DescribeDiskOperationLogsRequest
     * @return DescribeDiskOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskOperationLogsResponse DescribeDiskOperationLogs(DescribeDiskOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskOperationLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskOperationLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDiskOperationLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDisks) is used to query the list of cloud disks.

* The details of the cloud disk can be queried based on the ID, type or status of the cloud disk. The relationship between different conditions is AND. For more information about filtering, please see the `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`; the default is 20) of cloud disk lists are returned to the current user.
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstancesDiskNum) is used to query the number of cloud disks mounted in the instance.

* Batch operations are supported. If multiple CVM instance IDs are specified, the returned results will list the number of cloud disks mounted on each CVM.
     * @param req DescribeInstancesDiskNumRequest
     * @return DescribeInstancesDiskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDiskNumResponse DescribeInstancesDiskNum(DescribeInstancesDiskNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDiskNumResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDiskNumResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstancesDiskNum"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSnapshotOperationLogs) is used to query a list of snapshot operation logs.

You can filter according to the snapshot ID. The snapshot ID format is as follows: snap-a1kmcp13.

     * @param req DescribeSnapshotOperationLogsRequest
     * @return DescribeSnapshotOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotOperationLogsResponse DescribeSnapshotOperationLogs(DescribeSnapshotOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotOperationLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotOperationLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSnapshotOperationLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the sharing information of snapshots.
     * @param req DescribeSnapshotSharePermissionRequest
     * @return DescribeSnapshotSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotSharePermissionResponse DescribeSnapshotSharePermission(DescribeSnapshotSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotSharePermissionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotSharePermissionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSnapshotSharePermission"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSnapshots) is used to query the details of snapshots.

* Filter the results by the snapshot ID, the ID of cloud disk, for which the snapshot is created, and the type of cloud disk, for which the snapshot is created. The relationship between different conditions is AND. For more information about filtering, please see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`; the default is 20) of snapshot lists are returned to the current user.
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSnapshots"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachDisks) is used to unmount cloud disks.

* Batch operations are supported. Multiple cloud disks mounted to the same CVM can be unmounted in batch. If there is a cloud disk that does not allow this operation, the operation is not performed and a specific error code is returned.
* This API is an asynchronous API. When the request successfully returns results, the cloud disk is not unmounted from the CVM immediately. You can use the API [DescribeDisks](/document/product/362/16315) to query the cloud disk status. If the status changes from "ATTACHED" to "UNATTACHED", the cloud disk is unmounted.
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (InquiryPriceCreateDisks) is used to inquire the price for cloud disk creation.

* It supports inquiring the price for the creation of multiple cloud disks. The total price for the creation is returned.
     * @param req InquiryPriceCreateDisksRequest
     * @return InquiryPriceCreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDisksResponse InquiryPriceCreateDisks(InquiryPriceCreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price of renewing one or more cloud disks.

* You can query the price for renewing cloud disks together with their bound instances. To do so, you need to specify `CurInstanceDeadline` in the [DiskChargePrepaid](/document/product/362/15669#DiskChargePrepaid) parameter, In this case, the API will query the price for renewing the cloud disk to the expiration time of the bound instance.
* You can specify different renewal lengths for multiple cloud disks in a single request. In such cases, the price returned will be the total price of renewing multiple cloud disks.
     * @param req InquiryPriceRenewDisksRequest
     * @return InquiryPriceRenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewDisksResponse InquiryPriceRenewDisks(InquiryPriceRenewDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceRenewDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for expanding cloud disks.
     * @param req InquiryPriceResizeDiskRequest
     * @return InquiryPriceResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResizeDiskResponse InquiryPriceResizeDisk(InquiryPriceResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResizeDiskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResizeDiskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceResizeDisk"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAutoSnapshotPolicyAttribute) is used to modify the attributes of an automatic snapshot policy.

* You can use this API to modify the attributes of a scheduled snapshot policy, including the execution policy, name, and activation.
* When modifying the number of days for retention, you must ensure that there is no clash with the permanent retention attribute. Otherwise, the entire operation will fail and a specific error code will be returned.
     * @param req ModifyAutoSnapshotPolicyAttributeRequest
     * @return ModifyAutoSnapshotPolicyAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoSnapshotPolicyAttributeResponse ModifyAutoSnapshotPolicyAttribute(ModifyAutoSnapshotPolicyAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoSnapshotPolicyAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoSnapshotPolicyAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoSnapshotPolicyAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** Only the project ID of elastic cloud disk can be modified. The project ID of the cloud disk created with the CVM is linked with the CVM. The project ID can be can be queried in the Portable field in the output parameters through the API [DescribeDisks](/document/product/362/16315).
* "Cloud disk name" is only used by users for their management. Tencent Cloud does not use the name as the basis for ticket submission or cloud disk management.
* Batch operations are supported. If multiple cloud disk IDs are specified, all the specified cloud disks must have the same attribute. If there is a cloud disk that does not allow this operation, the operation is not performed and a specific error code is returned.
     * @param req ModifyDiskAttributesRequest
     * @return ModifyDiskAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskAttributesResponse ModifyDiskAttributes(ModifyDiskAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDiskAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *API domain name: cbs.tencentcloudapi.com.

This API is used to change the billing mode of cloud disks.

You can only use this API to change the billing method from `POSTPAID_BY_HOUR` to `PREPAID`.
This API does not support non-elastic cloud disks. Please use `modifyinstanceschargetype` API to convert CVM instances and the bound non-elastic cloud disks. 
Default API request frequency limit: 10 times/second.

     * @param req ModifyDisksChargeTypeRequest
     * @return ModifyDisksChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksChargeTypeResponse ModifyDisksChargeType(ModifyDisksChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisksChargeTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisksChargeTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDisksChargeType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDisksRenewFlag) is used to modify the renewal flag of the cloud disk, which supports batch modification.
     * @param req ModifyDisksRenewFlagRequest
     * @return ModifyDisksRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksRenewFlagResponse ModifyDisksRenewFlag(ModifyDisksRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisksRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisksRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDisksRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifySnapshotAttribute) is used to modify the attributes of a specified snapshot.

* Currently, you can only modify snapshot name and change non-permanent snapshots into permanent snapshots.
* "Snapshot name" is only used by users for their management. Tencent Cloud does not use the name as the basis for ticket submission or snapshot management.
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySnapshotAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify snapshot sharing information.

After snapshots are shared, the accounts they are shared to can use the snapshot to create cloud disks.
* Each snapshot can be shared to at most 50 accounts.
* You can use a shared snapshot to create cloud disks, but you cannot change its name or description.
* Snapshots can only be shared with accounts in the same region.
* Only data disk snapshots can be shared.
     * @param req ModifySnapshotsSharePermissionRequest
     * @return ModifySnapshotsSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotsSharePermissionResponse ModifySnapshotsSharePermission(ModifySnapshotsSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotsSharePermissionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotsSharePermissionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySnapshotsSharePermission"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ResizeDisk) is used to expand the capacity of the cloud disk.

* Only elastic cloud disks can be expanded. The cloud disk type can be queried in the Portable field in the output parameters through the API [DescribeDisks](/document/product/362/16315). For the cloud disk created along with the CVM, the capacity can only be expanded via the API [ResizeInstanceDisks](/document/product/213/15731).
* This API is an asynchronous API. The cloud disk is not immediately expanded to the specified size as the API successfully returns results. You can use the API [DescribeDisks](/document/product/362/16315) to query the cloud disk status. The cloud disk in the status of "EXPANDING" is in the process of capacity expansion. When the status changes to "UNATTACHED", the capacity expansion is completed. 
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeDiskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeDiskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResizeDisk"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return cloud disks.

* You can use this API to return cloud disks you no longer need.
* This API can be used to return pay-as-you-go cloud disks billed on hourly basis. 
* Batch operations are supported. The maximum number of cloud disks in each request is 50. If there is any specified cloud disk that cannot be returned, an error code will be returned.
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDisksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDisksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TerminateDisks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UnbindAutoSnapshotPolicy) is used to unbind the cloud disk from the specified scheduled snapshot policy.

* Batch operations are supported. Multiple cloud disks can be unbound from a snapshot policy at one time. 
* If the passed-in cloud disks are not bound to the current scheduled snapshot policy, they will be skipped. Only cloud disks that are bound to the current scheduled snapshot policy are processed.
     * @param req UnbindAutoSnapshotPolicyRequest
     * @return UnbindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoSnapshotPolicyResponse UnbindAutoSnapshotPolicy(UnbindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindAutoSnapshotPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindAutoSnapshotPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindAutoSnapshotPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
