package com.example.recycleviewlola

data class Bicicleta(
        var modelo: String,
        var empresa:String,
        var año:Int,
        val imagen:String,
        var precio:Int)


fun getBiciletas():MutableList<Bicicleta>{
    var ListaBicicletas:MutableList<Bicicleta> = ArrayList()
    ListaBicicletas.add(Bicicleta("RC_6_0","BH",2020,"https://www.mountainbike.es/uploads/static/mountainbike/upload/images/gallery/5e30193f0de6944a203495a0/5e301d380ee694a40634955c-compra-ideal-del-ano-2020.jpg",1499))
    ListaBicicletas.add(Bicicleta("B-PRO-M940-29'","B-PRO",2020,"https://www.mountainbike.es/uploads/static/mountainbike/upload/images/gallery/5e30193f0de6944a203495a0/5e301d380ce6946c138b46b0-compra-ideal-del-ano-2020.jpg",449))
    return ListaBicicletas
}