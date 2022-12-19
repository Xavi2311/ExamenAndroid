package com.example.examen


    import androidx.lifecycle.LiveData
    import androidx.lifecycle.MutableLiveData
    import androidx.lifecycle.ViewModel


class SharedViewModel : ViewModel() {


        val nom = MutableLiveData<String>()
        val edat = MutableLiveData<String>()
        val alumne = MutableLiveData<Alumne>()

        fun guardarNombre(text: String) {
            nom.value = text
        }
        fun guardarEdad(text: String) {
            nom.value = text
        }

        fun guardarAlumno(alumno: Alumne){
            alumne.value = alumno
        }

        fun getPetById(): LiveData<Alumne?>? {
            return alumne
        }
    }
