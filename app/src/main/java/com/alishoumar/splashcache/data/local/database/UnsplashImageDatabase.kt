package com.alishoumar.splashcache.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alishoumar.splashcache.data.local.dao.UnsplashImageDao
import com.alishoumar.splashcache.data.local.dao.UnsplashRemoteKeyDao
import com.alishoumar.splashcache.data.models.UnSplashImage
import com.alishoumar.splashcache.data.models.UnsplashRemoteKeys

@Database(
    entities = [UnSplashImage::class, UnsplashRemoteKeys::class],
    version = 1
)
abstract class UnsplashImageDatabase : RoomDatabase(){

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeyDao


}