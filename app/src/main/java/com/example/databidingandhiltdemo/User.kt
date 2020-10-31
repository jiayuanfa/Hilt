package com.example.databidingandhiltdemo

import dagger.hilt.android.scopes.ActivityScoped
import java.lang.reflect.Constructor
import javax.inject.Inject

@ActivityScoped
data class User constructor(var name: String, var mode: String) {
    @Inject constructor() : this("Fage", "不开心了")
}
