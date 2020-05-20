/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import com.microsoft.azure.management.support.v2020_04_01.SeverityLevel;
import com.microsoft.azure.management.support.v2020_04_01.ContactProfile;
import com.microsoft.azure.management.support.v2020_04_01.ServiceLevelAgreement;
import com.microsoft.azure.management.support.v2020_04_01.SupportEngineer;
import org.joda.time.DateTime;
import com.microsoft.azure.management.support.v2020_04_01.TechnicalTicketDetails;
import com.microsoft.azure.management.support.v2020_04_01.QuotaTicketDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Object that represents SupportTicketDetails resource.
 */
@JsonFlatten
public class SupportTicketDetailsInner extends ProxyResource {
    /**
     * System generated support ticket Id that is unique.
     */
    @JsonProperty(value = "properties.supportTicketId")
    private String supportTicketId;

    /**
     * Detailed description of the question or issue.
     */
    @JsonProperty(value = "properties.description", required = true)
    private String description;

    /**
     * Each Azure service has its own set of issue categories, also known as
     * problem classification. This parameter is the unique Id for the type of
     * problem you are experiencing.
     */
    @JsonProperty(value = "properties.problemClassificationId", required = true)
    private String problemClassificationId;

    /**
     * Localized name of problem classification.
     */
    @JsonProperty(value = "properties.problemClassificationDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String problemClassificationDisplayName;

    /**
     * A value that indicates the urgency of the case, which in turn determines
     * the response time according to the service level agreement of the
     * technical support plan you have with Azure. Note: 'Highest critical
     * impact' severity is reserved only for our Premium customers. Possible
     * values include: 'minimal', 'moderate', 'critical',
     * 'highestcriticalimpact'.
     */
    @JsonProperty(value = "properties.severity", required = true)
    private SeverityLevel severity;

    /**
     * Enrollment Id associated with the support ticket.
     */
    @JsonProperty(value = "properties.enrollmentId", access = JsonProperty.Access.WRITE_ONLY)
    private String enrollmentId;

    /**
     * Indicates if this requires a 24x7 response from Azure.
     */
    @JsonProperty(value = "properties.require24X7Response")
    private Boolean require24X7Response;

    /**
     * Contact information of the user requesting to create a support ticket.
     */
    @JsonProperty(value = "properties.contactDetails", required = true)
    private ContactProfile contactDetails;

    /**
     * Service Level Agreement information for this support ticket.
     */
    @JsonProperty(value = "properties.serviceLevelAgreement")
    private ServiceLevelAgreement serviceLevelAgreement;

    /**
     * Information about the support engineer working on this support ticket.
     */
    @JsonProperty(value = "properties.supportEngineer")
    private SupportEngineer supportEngineer;

    /**
     * Support plan type associated with the support ticket.
     */
    @JsonProperty(value = "properties.supportPlanType", access = JsonProperty.Access.WRITE_ONLY)
    private String supportPlanType;

    /**
     * Title of the support ticket.
     */
    @JsonProperty(value = "properties.title", required = true)
    private String title;

    /**
     * Time in UTC (ISO 8601 format) when the problem started.
     */
    @JsonProperty(value = "properties.problemStartTime")
    private DateTime problemStartTime;

    /**
     * This is the resource Id of the Azure service resource associated with
     * the support ticket.
     */
    @JsonProperty(value = "properties.serviceId", required = true)
    private String serviceId;

    /**
     * Localized name of the Azure service.
     */
    @JsonProperty(value = "properties.serviceDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceDisplayName;

    /**
     * Status of the support ticket.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Time in UTC (ISO 8601 format) when the support ticket was created.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * Time in UTC (ISO 8601 format) when the support ticket was last modified.
     */
    @JsonProperty(value = "properties.modifiedDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime modifiedDate;

    /**
     * Additional ticket details associated with a technical support ticket
     * request.
     */
    @JsonProperty(value = "properties.technicalTicketDetails")
    private TechnicalTicketDetails technicalTicketDetails;

    /**
     * Additional ticket details associated with a quota support ticket
     * request.
     */
    @JsonProperty(value = "properties.quotaTicketDetails")
    private QuotaTicketDetails quotaTicketDetails;

    /**
     * Get system generated support ticket Id that is unique.
     *
     * @return the supportTicketId value
     */
    public String supportTicketId() {
        return this.supportTicketId;
    }

    /**
     * Set system generated support ticket Id that is unique.
     *
     * @param supportTicketId the supportTicketId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportTicketId(String supportTicketId) {
        this.supportTicketId = supportTicketId;
        return this;
    }

    /**
     * Get detailed description of the question or issue.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set detailed description of the question or issue.
     *
     * @param description the description value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get each Azure service has its own set of issue categories, also known as problem classification. This parameter is the unique Id for the type of problem you are experiencing.
     *
     * @return the problemClassificationId value
     */
    public String problemClassificationId() {
        return this.problemClassificationId;
    }

    /**
     * Set each Azure service has its own set of issue categories, also known as problem classification. This parameter is the unique Id for the type of problem you are experiencing.
     *
     * @param problemClassificationId the problemClassificationId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemClassificationId(String problemClassificationId) {
        this.problemClassificationId = problemClassificationId;
        return this;
    }

    /**
     * Get localized name of problem classification.
     *
     * @return the problemClassificationDisplayName value
     */
    public String problemClassificationDisplayName() {
        return this.problemClassificationDisplayName;
    }

    /**
     * Get a value that indicates the urgency of the case, which in turn determines the response time according to the service level agreement of the technical support plan you have with Azure. Note: 'Highest critical impact' severity is reserved only for our Premium customers. Possible values include: 'minimal', 'moderate', 'critical', 'highestcriticalimpact'.
     *
     * @return the severity value
     */
    public SeverityLevel severity() {
        return this.severity;
    }

    /**
     * Set a value that indicates the urgency of the case, which in turn determines the response time according to the service level agreement of the technical support plan you have with Azure. Note: 'Highest critical impact' severity is reserved only for our Premium customers. Possible values include: 'minimal', 'moderate', 'critical', 'highestcriticalimpact'.
     *
     * @param severity the severity value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSeverity(SeverityLevel severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get enrollment Id associated with the support ticket.
     *
     * @return the enrollmentId value
     */
    public String enrollmentId() {
        return this.enrollmentId;
    }

    /**
     * Get indicates if this requires a 24x7 response from Azure.
     *
     * @return the require24X7Response value
     */
    public Boolean require24X7Response() {
        return this.require24X7Response;
    }

    /**
     * Set indicates if this requires a 24x7 response from Azure.
     *
     * @param require24X7Response the require24X7Response value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withRequire24X7Response(Boolean require24X7Response) {
        this.require24X7Response = require24X7Response;
        return this;
    }

    /**
     * Get contact information of the user requesting to create a support ticket.
     *
     * @return the contactDetails value
     */
    public ContactProfile contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set contact information of the user requesting to create a support ticket.
     *
     * @param contactDetails the contactDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withContactDetails(ContactProfile contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get service Level Agreement information for this support ticket.
     *
     * @return the serviceLevelAgreement value
     */
    public ServiceLevelAgreement serviceLevelAgreement() {
        return this.serviceLevelAgreement;
    }

    /**
     * Set service Level Agreement information for this support ticket.
     *
     * @param serviceLevelAgreement the serviceLevelAgreement value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
        this.serviceLevelAgreement = serviceLevelAgreement;
        return this;
    }

    /**
     * Get information about the support engineer working on this support ticket.
     *
     * @return the supportEngineer value
     */
    public SupportEngineer supportEngineer() {
        return this.supportEngineer;
    }

    /**
     * Set information about the support engineer working on this support ticket.
     *
     * @param supportEngineer the supportEngineer value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportEngineer(SupportEngineer supportEngineer) {
        this.supportEngineer = supportEngineer;
        return this;
    }

    /**
     * Get support plan type associated with the support ticket.
     *
     * @return the supportPlanType value
     */
    public String supportPlanType() {
        return this.supportPlanType;
    }

    /**
     * Get title of the support ticket.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set title of the support ticket.
     *
     * @param title the title value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get time in UTC (ISO 8601 format) when the problem started.
     *
     * @return the problemStartTime value
     */
    public DateTime problemStartTime() {
        return this.problemStartTime;
    }

    /**
     * Set time in UTC (ISO 8601 format) when the problem started.
     *
     * @param problemStartTime the problemStartTime value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemStartTime(DateTime problemStartTime) {
        this.problemStartTime = problemStartTime;
        return this;
    }

    /**
     * Get this is the resource Id of the Azure service resource associated with the support ticket.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set this is the resource Id of the Azure service resource associated with the support ticket.
     *
     * @param serviceId the serviceId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get localized name of the Azure service.
     *
     * @return the serviceDisplayName value
     */
    public String serviceDisplayName() {
        return this.serviceDisplayName;
    }

    /**
     * Get status of the support ticket.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get time in UTC (ISO 8601 format) when the support ticket was created.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get time in UTC (ISO 8601 format) when the support ticket was last modified.
     *
     * @return the modifiedDate value
     */
    public DateTime modifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Get additional ticket details associated with a technical support ticket request.
     *
     * @return the technicalTicketDetails value
     */
    public TechnicalTicketDetails technicalTicketDetails() {
        return this.technicalTicketDetails;
    }

    /**
     * Set additional ticket details associated with a technical support ticket request.
     *
     * @param technicalTicketDetails the technicalTicketDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withTechnicalTicketDetails(TechnicalTicketDetails technicalTicketDetails) {
        this.technicalTicketDetails = technicalTicketDetails;
        return this;
    }

    /**
     * Get additional ticket details associated with a quota support ticket request.
     *
     * @return the quotaTicketDetails value
     */
    public QuotaTicketDetails quotaTicketDetails() {
        return this.quotaTicketDetails;
    }

    /**
     * Set additional ticket details associated with a quota support ticket request.
     *
     * @param quotaTicketDetails the quotaTicketDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withQuotaTicketDetails(QuotaTicketDetails quotaTicketDetails) {
        this.quotaTicketDetails = quotaTicketDetails;
        return this;
    }

}