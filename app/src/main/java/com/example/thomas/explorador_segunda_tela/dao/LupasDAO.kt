package com.example.thomas.explorador_segunda_tela.dao

import android.content.Context
import com.example.thomas.explorador_segunda_tela.model.Lupa

class LupasDAO(val context: Context) {

    private val qtdeTotalLupas = 8
    var lupas: MutableList<Lupa> = mutableListOf()

    init {
        for (i in 0..qtdeTotalLupas) {
            val resIdImage = context.resources
                    .getIdentifier("ic_launcher", "mipmap", context.packageName)
            val lupa = Lupa("Android custom dialog example!",
                    "Lorem ipsum blandit est netus ultrices lacus vulputate pulvinar, arcu nulla tempus nulla quisque convallis lobortis, et cubilia dui accumsan varius sollicitudin at. tortor arcu tempor at in libero urna aliquam laoreet taciti quisque tempus, praesent ligula ante molestie auctor curabitur vehicula ultricies consectetur vivamus egestas, placerat ut massa dictum potenti semper ac magna odio conubia. libero inceptos netus justo litora fusce lectus ante, per eu placerat orci luctus gravida, quisque conubia quam eu vulputate tincidunt. per mauris nisl tristique id habitant ultricies, fames curae lacinia massa dictum ad, vitae cursus enim vel magna. Turpis aliquam massa ad porta enim fusce, aliquet eros eget commodo nam integer eu, vehicula feugiat tortor elit consectetur. diam nisl feugiat himenaeos erat conubia metus suspendisse fames consequat sodales quisque habitasse, inceptos nisl aptent proin facilisis iaculis eget aliquet nostra habitant sociosqu. aptent ut nostra morbi consectetur conubia donec duis cursus libero, habitasse curae sed tempus lectus porttitor sit facilisis, donec conubia praesent lacinia augue himenaeos pharetra malesuada. habitant himenaeos imperdiet gravida sociosqu felis lacinia eget consectetur congue, dolor nostra consequat ac mi et ante lacinia. ut lectus lobortis nisi hac iaculis interdum donec senectus, phasellus sociosqu himenaeos iaculis a tempor sollicitudin, nibh lobortis ac justo ut in non. ",
                    resIdImage,
                    resIdImage)
            lupas.add(lupa)
        }
    }

    fun add(lupa: Lupa) {

    }

    fun remove(lupa: Lupa) {

    }

}