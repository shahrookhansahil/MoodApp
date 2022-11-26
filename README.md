# Android Mood App

## Android Widgets: Button, Image View, Chcekbox, TextView

## Main Activit Code

```
package com.example.moodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Mod(view:View){
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.full)
        findViewById<TextView>(R.id.textView).setText("I Am Full")
        findViewById<Button>(R.id.button).setText("Jhall Dam")
    }
}
```

## UI Code

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="400dp"
        android:layout_height="453dp"
        android:layout_marginTop="4dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.454"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/hungry" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="405dp"
        android:layout_height="137dp"
        android:layout_marginStart="3dp"
        android:layout_marginLeft="3dp"
        android:layout_marginTop="9dp"
        android:layout_marginEnd="3dp"
        android:layout_marginRight="3dp"
        android:layout_marginBottom="86dp"
        android:text="I am Hungry"
        app:autoSizeTextType="uniform"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="22dp"
        android:layout_marginLeft="22dp"
        android:layout_marginTop="5dp"
        android:layout_marginEnd="296dp"
        android:layout_marginRight="296dp"
        android:layout_marginBottom="33dp"
        android:onclick="Mod"
        android:text=" Eat Daal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />
</androidx.constraintlayout.widget.ConstraintLayout>
```