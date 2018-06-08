package com.example.bottomnavigation.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.DrawableRes
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_challenge_creation.*

class ChallengeCreationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var categorySelected:Int? = null

        setContentView(R.layout.activity_challenge_creation)

        back_arrow.setOnClickListener(View.OnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        listenClickOnCategorie(categorySelected)
        listenClickOnDifficulty()

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun listenClickOnCategorie(categorySelected: Int?) {
        // Il y a deux layouts
        // Il faut ecouter le click sur les bouton categories présent dans ces layout
        // Dans le deuxieme layout, il ne faut s'interesser qu'au deux premier enfants.


            for (i in 0..(layoutCategoriesLineOne.childCount - 1)) {
                val currentCategorie = layoutCategoriesLineOne.getChildAt(i)
                if (currentCategorie != null) {
                    currentCategorie.setOnClickListener(View.OnClickListener{
                        // remove previous One
                      //  it.setBackgroundResource(categorySelected)

                        // Add new One
                        // sa bordure doit devenir rouge.
                        val transitionName = it.transitionName
                        val newCategorySelected_id: Int = resources.getIdentifier(transitionName , "drawable", packageName);
                        it.setBackgroundResource(newCategorySelected_id)
                    })
                }
            }
            for (i in 0..1) {
                val currentCategorie = layoutCategoriesLineTwo.getChildAt(i)
                if (currentCategorie != null) {
                    currentCategorie.setOnClickListener(View.OnClickListener{
                        // sa bordure doit devenir rouge.
                        val transitionName = it.transitionName
                        val id: Int = resources.getIdentifier(transitionName , "drawable", packageName);
                        it.setBackgroundResource(id)
                    })
                }
            }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun listenClickOnDifficulty() {
        // difficultes
        for (i in 0..(difficultes.childCount - 1)) {
            val currentDifficulty = difficultes.getChildAt(i)
            if (currentDifficulty != null) {
                currentDifficulty.setOnClickListener(View.OnClickListener{
                    // remove previous One
                    //  it.setBackgroundResource(categorySelected)

                    // Add new One
                    it.background = getDrawable(R.color.highlight)
                })
            }
        }
    }
}
