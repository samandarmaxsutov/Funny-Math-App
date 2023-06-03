package uz.it_school.funnymathapp.app

import android.app.Application
import uz.it_school.funnymathapp.model.room.AppDatabase
import uz.it_school.funnymathapp.model.shared.LocalStorage

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        LocalStorage.init(this)
        AppDatabase.init(this)
    }
}