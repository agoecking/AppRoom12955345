package br.edu.up.rgm12955345.data

import android.content.Context
import br.edu.up.rgm12955345.InventoryDatabase

interface AppContainer {
    val itemsRepository: ItemsRepository
}

/**
 * [AppContainer] implementation that provides an instance of [OfflineItemsRepository].
 */
class AppDataContainer(private val context: Context) : AppContainer {

    /**
     * Implementation for [ItemsRepository].
     */
    override val itemsRepository: ItemsRepository by lazy {
        // Inicializa o repositório offline usando o DAO do banco de dados
        OfflineItemsRepository(InventoryDatabase.getDatabase(context).itemDao())
    }
}
