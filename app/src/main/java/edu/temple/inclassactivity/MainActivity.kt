package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView,//support starts the change to the fragments on screen
                ImageDisplayFragment.newInstance(imageArray)).commit()//creates the franment and passes to image ids,and commit adds the changes
        }


        // Attach an instance of ImageDisplayFragment using factory method

    }
}