package software.hsharp.services

import software.hsharp.models.CrmCategory
import software.hsharp.core.models.BaseDataService

/**
 * Category related service
 */
interface CategoryService : BaseDataService<CrmCategory> {
    /**
     * Create a category with [name] and [searchKey]
     */
    fun createCategory(name: String, searchKey: String): CrmCategory
}