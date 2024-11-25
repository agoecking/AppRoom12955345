package br.edu.up.rgm12955345.data

import kotlinx.coroutines.flow.Flow
interface ItemsRepository {
    fun getAllItemsStream(): Flow<List<Item>>
    fun getItemStream(id: Int): Flow<Item?> // Suporte para valores nulos

    suspend fun insertItem(item: Item): Long // Retorna o ID inserido
    suspend fun deleteItem(item: Item): Int // Retorna linhas deletadas
    suspend fun updateItem(item: Item): Int // Retorna linhas atualizadas
}
