package com.yeeni.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yeeni.data.db.entity.BasketProductEntity
import com.yeeni.data.db.entity.LikeProductEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LikeDao {
    @Query("SELECT * FROM likes")
    fun getAll() : Flow<List<LikeProductEntity>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: LikeProductEntity)

    @Query("DELETE FROM likes WHERE productId=:id")
    suspend fun delete(id: String)


}