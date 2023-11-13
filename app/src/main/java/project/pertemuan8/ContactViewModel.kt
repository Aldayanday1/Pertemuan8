package project.pertemuan8

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import project.pertemuan8.data.ContactUiState

class ContactViewModel: ViewModel() {
    private  val _stateUI = MutableStateFlow(ContactUiState())
    val stateUI: StateFlow<ContactUiState> = _stateUI.asStateFlow()

    fun setContact(list: MutableList<String>){
        _stateUI.update {
            stateSaatIni -> stateSaatIni.copy(
                nama = list[0],
                alamat = list[1],
                tlp = list[2]
            )
        }
    }
}