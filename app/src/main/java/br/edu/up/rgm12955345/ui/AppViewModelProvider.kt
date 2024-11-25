

package br.edu.up.rgm12955345.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import br.edu.up.rgm12955345.ui.item.ItemEntryViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Other Initializers
        // Initializer for ItemEntryViewModel
//        initializer {
//            ItemEditViewModel(
//                this.createSavedStateHandle()
//            )
//        }
        // Initializer for ItemEntryViewModel
//        initializer {
//            ItemEntryViewModel()
//        }

        // Initializer for ItemDetailsViewModel
//        initializer {
//            ItemDetailsViewModel(
//                this.createSavedStateHandle()
//            )
//        }

        // Initializer for HomeViewModel
//        initializer {
//            HomeViewModel()
//        }
//        initializer {
//            ItemEntryViewModel(inventoryApplication().container.itemsRepository)
//        }
        //...
    }
}

//fun CreationExtras.inventoryApplication(): InventoryApplication =
//    (this[AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)
