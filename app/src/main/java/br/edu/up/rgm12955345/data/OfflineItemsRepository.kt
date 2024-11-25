package br.edu.up.rgm12955345.data

import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository(private val itemDao: ItemDao) : ItemsRepository {
    override fun getAllItemsStream(): Flow<List<Item>> = itemDao.getAllItems()

    override fun getItemStream(id: Int): Flow<Item?> = itemDao.getItem(id) // Alinhe com o DAO

    override suspend fun insertItem(item: Item): Long = itemDao.insert(item) // Retorno ajustado

    override suspend fun deleteItem(item: Item): Int = itemDao.delete(item) // Retorno ajustado

    override suspend fun updateItem(item: Item): Int = itemDao.update(item) // Retorno ajustado
}
