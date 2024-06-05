package com.yeeni.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.yeeni.data.db.converter.BasketConverter
import com.yeeni.data.db.converter.LikeConverter
import com.yeeni.domain.model.Category
import com.yeeni.domain.model.Price
import com.yeeni.domain.model.Product
import com.yeeni.domain.model.SalesStatus
import com.yeeni.domain.model.Shop

@Entity(tableName = "likes")
@TypeConverters(LikeConverter::class)
data class LikeProductEntity(
    @PrimaryKey
    val productId: String,
    val productName: String,
    val imageUrl: String,
    val price: Price,
    val category: Category,
    val shop: Shop,
    val isNew: Boolean,
    val isFreeShipping: Boolean
)


fun LikeProductEntity.toDomainModel() : Product {
    return Product(
        productId = productId,
        productName = productName,
        imageUrl = imageUrl,
        price = price,
        category = category,
        shop = shop,
        isNew = isNew,
        isFreeShipping = isFreeShipping
    )
}