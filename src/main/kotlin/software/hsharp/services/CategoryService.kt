package software.hsharp.services

import org.compiere.model.CrmCategory
import software.hsharp.core.models.BaseDataService

interface CategoryService : BaseDataService<CrmCategory> {
    fun createCategory(name: String, searchKey: String): CrmCategory
}