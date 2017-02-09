/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.UUID;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for GetFromTask operation.
 */
public class FileGetFromTaskHeaders {
    /**
     * The client-request-id provided by the client during the request. This
     * will be returned only if the return-client-request-id parameter was set
     * to true.
     */
    @JsonProperty(value = "client-request-id")
    private UUID clientRequestId;

    /**
     * A unique identifier for the request that was made to the Batch service.
     * If a request is consistently failing and you have verified that the
     * request is properly formulated, you may use this value to report the
     * error to Microsoft. In your report, include the value of this request
     * ID, the approximate time that the request was made, the Batch account
     * against which the request was made, and the region that account resides
     * in.
     */
    @JsonProperty(value = "request-id")
    private UUID requestId;

    /**
     * The ETag HTTP response header. This is an opaque string. You can use it
     * to detect whether the resource has changed between requests. In
     * particular, you can pass the ETag to one of the If-Modified-Since,
     * If-Unmodified-Since, If-Match or If-None-Match headers.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The time at which the resource was last modified.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * The file creation time.
     */
    @JsonProperty(value = "ocp-creation-time")
    private DateTimeRfc1123 ocpCreationTime;

    /**
     * Whether the object represents a directory.
     */
    @JsonProperty(value = "ocp-batch-file-isdirectory")
    private Boolean ocpBatchFileIsdirectory;

    /**
     * The URL of the file.
     */
    @JsonProperty(value = "ocp-batch-file-url")
    private String ocpBatchFileUrl;

    /**
     * The file mode attribute in octal format.
     */
    @JsonProperty(value = "ocp-batch-file-mode")
    private String ocpBatchFileMode;

    /**
     * The content type of the file.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * The length of the file.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /**
     * Get the clientRequestId value.
     *
     * @return the clientRequestId value
     */
    public UUID clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId value.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withClientRequestId(UUID clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withLastModified(DateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the ocpCreationTime value.
     *
     * @return the ocpCreationTime value
     */
    public DateTime ocpCreationTime() {
        if (this.ocpCreationTime == null) {
            return null;
        }
        return this.ocpCreationTime.dateTime();
    }

    /**
     * Set the ocpCreationTime value.
     *
     * @param ocpCreationTime the ocpCreationTime value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withOcpCreationTime(DateTime ocpCreationTime) {
        if (ocpCreationTime == null) {
            this.ocpCreationTime = null;
        } else {
            this.ocpCreationTime = new DateTimeRfc1123(ocpCreationTime);
        }
        return this;
    }

    /**
     * Get the ocpBatchFileIsdirectory value.
     *
     * @return the ocpBatchFileIsdirectory value
     */
    public Boolean ocpBatchFileIsdirectory() {
        return this.ocpBatchFileIsdirectory;
    }

    /**
     * Set the ocpBatchFileIsdirectory value.
     *
     * @param ocpBatchFileIsdirectory the ocpBatchFileIsdirectory value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withOcpBatchFileIsdirectory(Boolean ocpBatchFileIsdirectory) {
        this.ocpBatchFileIsdirectory = ocpBatchFileIsdirectory;
        return this;
    }

    /**
     * Get the ocpBatchFileUrl value.
     *
     * @return the ocpBatchFileUrl value
     */
    public String ocpBatchFileUrl() {
        return this.ocpBatchFileUrl;
    }

    /**
     * Set the ocpBatchFileUrl value.
     *
     * @param ocpBatchFileUrl the ocpBatchFileUrl value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withOcpBatchFileUrl(String ocpBatchFileUrl) {
        this.ocpBatchFileUrl = ocpBatchFileUrl;
        return this;
    }

    /**
     * Get the ocpBatchFileMode value.
     *
     * @return the ocpBatchFileMode value
     */
    public String ocpBatchFileMode() {
        return this.ocpBatchFileMode;
    }

    /**
     * Set the ocpBatchFileMode value.
     *
     * @param ocpBatchFileMode the ocpBatchFileMode value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withOcpBatchFileMode(String ocpBatchFileMode) {
        this.ocpBatchFileMode = ocpBatchFileMode;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentLength value.
     *
     * @return the contentLength value
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength value.
     *
     * @param contentLength the contentLength value to set
     * @return the FileGetFromTaskHeaders object itself.
     */
    public FileGetFromTaskHeaders withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

}
