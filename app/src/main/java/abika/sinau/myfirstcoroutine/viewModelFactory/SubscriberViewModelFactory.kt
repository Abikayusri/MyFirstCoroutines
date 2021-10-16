package abika.sinau.myfirstcoroutine.viewModelFactory

import abika.sinau.myfirstcoroutine.db.SubscriberRepository
import abika.sinau.myfirstcoroutine.ui.SubscriberViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SubscriberViewModelFactory(private val repository: SubscriberRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)) {
            return SubscriberViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}