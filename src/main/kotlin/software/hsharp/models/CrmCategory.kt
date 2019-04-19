package software.hsharp.models

import org.idempiere.icommon.model.PersistentObject

/**
 * A universal category you can put e.g. business partner to.
 */
interface CrmCategory : PersistentObject {
    /**
     * Category name
     */
    val name: String
    /**
     * Category search key
     */
    val searchKey: String
}