package br.edu.up.rgm12955345.data
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item): Long // Retorna o ID da nova linha inserida

    @Update
    suspend fun update(item: Item): Int // Retorna o número de linhas afetadas

    @Delete
    suspend fun delete(item: Item): Int // Retorna o número de linhas afetadas

    @Query("SELECT * FROM items WHERE id = :id")
    fun getItem(id: Int): Flow<Item?> // Permite valores nulos

    @Query("SELECT * FROM items ORDER BY name ASC")
    fun getAllItems(): Flow<List<Item>>
}
