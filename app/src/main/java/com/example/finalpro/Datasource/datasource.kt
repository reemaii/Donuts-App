package com.example.finalpro.Datasource

import com.example.finalpro.R
import com.example.finalpro.model.flavormodel

class datasource {
    // list of items
    fun loadapp() : List<flavormodel>{
        return listOf(
            flavormodel(R.string.flavorone, R.drawable.chocolate),
            flavormodel(R.string.flavortwo, R.drawable.glazed),
            flavormodel(R.string.flavorthree, R.drawable.img_1
            ),
            flavormodel(R.string.flavorfour, R.drawable.img),



            )
    }
}