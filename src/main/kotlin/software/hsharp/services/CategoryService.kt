package software.hsharp.services

import software.hsharp.core.services.BaseDataService
import software.hsharp.models.CrmCategory

/**
 * Category related service
 */
interface CategoryService : BaseDataService<CrmCategory> {
    /**
     * Create a category with [name] and [searchKey]
     */
    fun createCategory(name: String, searchKey: String): CrmCategory
}