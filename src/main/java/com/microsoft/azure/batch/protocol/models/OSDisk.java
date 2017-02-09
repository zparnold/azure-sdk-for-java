/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an OS disk image.
 */
public class OSDisk {
    /**
     * The collection of Virtual Hard Disk (VHD) URIs.
     * All the VHDs must be identical and must reside in an Azure Storage
     * account within the same subscription and same region as the Batch
     * account. For best performance, it is recommended that each VHD resides
     * in a separate Azure Storage account. Each VHD can serve upto 20 Windows
     * compute nodes or 40 Linux compute nodes. You must supply enough VHD URIs
     * to satisfy the 'targetDedicated' property of the pool. If you do not
     * supply enough VHD URIs, the pool will partially allocate compute nodes,
     * and a resize error will occur.
     */
    @JsonProperty(value = "imageUris", required = true)
    private List<String> imageUris;

    /**
     * The type of caching to enable for the OS disk.
     * none - The caching mode for the disk is not enabled. readOnly - The
     * caching mode for the disk is read only. readWrite - The caching mode for
     * the disk is read and write. The default value for caching is none. For
     * information about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     * Possible values include: 'none', 'readOnly', 'readWrite'.
     */
    @JsonProperty(value = "caching")
    private CachingType caching;

    /**
     * Get the imageUris value.
     *
     * @return the imageUris value
     */
    public List<String> imageUris() {
        return this.imageUris;
    }

    /**
     * Set the imageUris value.
     *
     * @param imageUris the imageUris value to set
     * @return the OSDisk object itself.
     */
    public OSDisk withImageUris(List<String> imageUris) {
        this.imageUris = imageUris;
        return this;
    }

    /**
     * Get the caching value.
     *
     * @return the caching value
     */
    public CachingType caching() {
        return this.caching;
    }

    /**
     * Set the caching value.
     *
     * @param caching the caching value to set
     * @return the OSDisk object itself.
     */
    public OSDisk withCaching(CachingType caching) {
        this.caching = caching;
        return this;
    }

}
