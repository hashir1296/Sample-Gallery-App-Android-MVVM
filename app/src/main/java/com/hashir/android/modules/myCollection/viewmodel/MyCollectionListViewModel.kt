package com.hashir.android.modules.myCollection.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hashir.android.db.PhotoEntity
import com.hashir.android.network.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyCollectionListViewModel @Inject constructor(
    private val repository: UserRepository,
) :
    ViewModel() {

    val photos: LiveData<List<PhotoEntity>> = repository.myCollection.asLiveData()

    suspend fun deletePhotoFromCollection(photo : PhotoEntity){
        repository.deleteFromMyCollection(photo)
    }

}