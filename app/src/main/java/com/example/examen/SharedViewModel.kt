package com.example.examen


    import androidx.lifecycle.LiveData
    import androidx.lifecycle.MutableLiveData
    import androidx.lifecycle.ViewModel


class SharedViewModel : ViewModel() {


        val nom = MutableLiveData<String>()
        val edat = MutableLiveData<String>()
        val alumne = MutableLiveData<Alumne>()

        

        fun guardarAlumno(alumno: Alumne){
            alumne.value = alumno
        }

        fun getAlumneById(): LiveData<Alumne?>? {
            return alumne
        }
    }
