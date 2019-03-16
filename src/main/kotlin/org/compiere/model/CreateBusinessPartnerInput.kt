package org.compiere.model

/**
 * A list of parameters usable to create a Business Partner using the [software.hsharp.services.BusinessPartnerService]
 */
interface CreateBusinessPartnerInput {
    /**
     * search key
     */
    val searchKey: String
    /**
     * business partner legal name
     */
    val legalName: String
    /**
     * description
     */
    val description: String?
    /**
     * business partner category name
     */
    val categoryName: String?
    /**
     * DUNS number
     */
    val dunsNumber: String?
    /**
     * VAT number
     */
    val vatNumber: String?
    /**
     * company email
     */
    val email: String?
    /**
     * true if the business partner is a customer
     */
    val isCustomer: Boolean?
    /**
     * Note
     */
    val note: String?
    /**
     * flat discount
     */
    val flatDiscount: Int?
    /**
     * sales representative id
     */
    val salesRepresentativeId: Int
    /**
     * Name of the main branch
     */
    val branchName: String?
    /**
     * Main branch phone
     */
    val branchPhone: String?
    /**
     * Main branch street
     */
    val branchStreet: String?
    /**
     * Main branch city
     */
    val branchCity: String?
    /**
     * Main branch zip code
     */
    val branchZip: String?
    /**
     * Main branch country id
     */
    val branchCountryId: Int?
    /**
     * owner phone or other way to contact a legal representative
     */
    val ownerPhone: String?
    /**
     * The legal correspondence street
     */
    val legalStreet: String?
    /**
     * The legal correspondence city
     */
    val legalCity: String?
    /**
     * The legal correspondence zip
     */
    val legalZip: String?
    /**
     * The legal correspondence country id
     */
    val legalCountryId: Int?
    /**
     * Who is responsible for orders
     */
    val orderContactName: String?
    /**
     * Who is responsible for orders - phone
     */
    val orderContactPhone: String?
    /**
     * Who is responsible for orders - email
     */
    val orderContactEmail: String?
    /**
     * Decision maker
     */
    val decisionMakerContactName: String?
    /**
     * Decision maker - phone
     */
    val decisionMakerContactPhone: String?
    /**
     * Decision maker - email
     */
    val decisionMakerContactEmail: String?
    /**
     * who is processing invoices
     */
    val invoicingContactName: String?
    /**
     * who is processing invoices - phone
     */
    val invoicingContactPhone: String?
    /**
     * who is processing invoices - email
     */
    val invoicingContactEmail: String?
}