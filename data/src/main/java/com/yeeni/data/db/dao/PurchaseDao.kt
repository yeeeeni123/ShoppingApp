package com.yeeni.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yeeni.data.db.entity.LikeProductEntity
import com.yeeni.data.db.entity.PurchaseProductEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PurchaseDao {

    @Query("SELECT * FROM purchase")
    fun getAll() : Flow<List<PurchaseProductEntity>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: PurchaseProductEntity)

    @Query("DELETE FROM purchase WHERE productId=:id")
    suspend fun delete(id: String)
}