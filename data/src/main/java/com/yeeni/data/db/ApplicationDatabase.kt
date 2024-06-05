package com.yeeni.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yeeni.data.db.dao.LikeDao
import com.yeeni.data.db.dao.PurchaseDao
import com.yeeni.data.db.dao.BasketDao
import com.yeeni.data.db.entity.BasketProductEntity
import com.yeeni.data.db.entity.LikeProductEntity
import com.yeeni.data.db.entity.PurchaseProductEntity


@Database(
    entities = [
        PurchaseProductEntity::class,
        LikeProductEntity::class,
        BasketProductEntity::class
    ],
    version = 1
)
abstract class ApplicationDatabase :RoomDatabase(){
    companion object{
        const val DB_NAME = "applicationDatabase.db"
    }

    abstract fun purchaseDao() : PurchaseDao
    abstract fun likeDao() : LikeDao
    abstract fun basketDao() : BasketDao


}