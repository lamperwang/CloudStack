// Copyright 2012 Citrix Systems, Inc. Licensed under the
// Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License.  Citrix Systems, Inc.
// reserves all rights not expressly granted by the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.agent.api;

public class CreatePrivateTemplateFromVolumeCommand extends SnapshotCommand {
    private String _vmName;
    private String _volumePath;
    private String _userSpecifiedName;
    private String _uniqueName;
    private long _templateId;
    private long _accountId;
    // For XenServer
    private String _secondaryStorageUrl;

    public CreatePrivateTemplateFromVolumeCommand() {
    }

    public CreatePrivateTemplateFromVolumeCommand(String StoragePoolUUID, String secondaryStorageUrl, long templateId, long accountId, String userSpecifiedName, String uniqueName, String volumePath, String vmName, int wait) {
        _secondaryStorageUrl = secondaryStorageUrl;
        _templateId = templateId;
        _accountId = accountId;
        _userSpecifiedName = userSpecifiedName;
        _uniqueName = uniqueName;
        _volumePath = volumePath;
        _vmName = vmName;
        primaryStoragePoolNameLabel = StoragePoolUUID;
        setWait(wait);
    }

    @Override
    public boolean executeInSequence() {
        return false;
    }

    public String getSecondaryStorageUrl() {
        return _secondaryStorageUrl;
    }

    public String getTemplateName() {
        return _userSpecifiedName;
    }

    public String getUniqueName() {
        return _uniqueName;
    }

    public long getTemplateId() {
        return _templateId;
    }

    public String getVmName() {
        return _vmName;
    }

    public void setVolumePath(String _volumePath) {
        this._volumePath = _volumePath;
    }

    public String getVolumePath() {
        return _volumePath;
    }

    public Long getAccountId() {
        return _accountId;
    }

    public void setTemplateId(long templateId) {
        _templateId = templateId;
    }
}
