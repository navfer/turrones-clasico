package com.navfer.turronesvegabajaclasico

/**
 * La clase Categoria contiene las categorías que contiene la empresa de turrones.
 * Cada categoría contiene su lista de productos y subcategorías en caso de contener.
 */
data class Categoria(
    var nombre: String,
    var imagen: Int,
    var descripcion: String,
    var estado: Boolean,
    val productos: MutableList<Producto> = mutableListOf(),
    val subcategorias: MutableList<Categoria> = mutableListOf()

) {
    companion object {
        val listaCategorias = mutableListOf<Categoria>()

        init {
            //Inicializacion de los productos
            //Productos seccion turrones
            val productosTurronesAlicante = mutableListOf(
                Producto("Torta Imperial","Con avellanas tostadas (65 %)",5.0,R.drawable.alicante_torta,true),
                Producto("Turrón Nata-Nuez"," Almendra molida (35.8%) procedencia España, azúcar, nueces 7 %",0.100,R.drawable.alicante_nueces,true),
                Producto("Turrón Yema con almendra","Con yema confitada (yema de huevo, azúcar, glucosa y conservante E200)",0.100,R.drawable.alicante_yema,true),
                Producto("Turrón Choco Blanco","Chocolate blanco y 40 % de almendras marconas. 300 grs",0.300,R.drawable.alicante_chocoblanco,true),
                Producto("Turrón Chocolate Crujiente","Chocolate con leche y arroz hinchado",0.200,R.drawable.alicante_chocolate,true),
                Producto("Turrón Antiu Xixona","Turrón de Jijona Antiu Xixona.",0.200,R.drawable.alicante_antiu,true)
            )

            val productosTurronesJijona = mutableListOf(
                Producto("Turrón blando SIN azúcar","Turron blando sin azucar Antiu Xixona 150g.",0.150,R.drawable.jijona_sin,true),
                Producto("Turrón Antiu Xixona","Turrón Antiu Xixona 200gr.",0.200,R.drawable.jijona_normal,true),
                Producto("Turrón de Yema tostado","Turron de yema tostada Antiu Xixona 200g.",0.200,R.drawable.jijona_yema,true),
                Producto("Turrón de fruta","Turron de fruta Antiu Xixona 250g.",0.250,R.drawable.jijona_fruta,true),
                Producto("Turrón de Chocolate","Chocolate con almendra Antiu Xixona 200g.",0.200,R.drawable.jijona_choco,true)
            )

            val productosTurronesGuirlache = mutableListOf(
                Producto("Turrón Guirlache Almendra","Bañados con deliciosa miel",0.300,R.drawable.guirlache_almendras,true),
                Producto("Turrón Guirlache Almendra con Chocolate","La mejor selección de frutos secos de nuestra tierra",0.300,R.drawable.guirlache_choco,true),
                Producto("Turrón Guirlache en Porciones","Barra de turrón de guirlache con almendras enteras en porciones de 35g.",0.280,R.drawable.guirlache_porciones,true),
                Producto("Turrón de Guirlache Nueces","El placer de degustar el sabor tradicional y textura crujiente de las nueces.",0.250,R.drawable.guirlache_nueces,true),
                Producto("Turrón de Guirlache Músico","Degusta el sabor tradicional de este turrón. Frutos secos tostados y caramelizados que son un deleite para el paladar",0.300,R.drawable.guirlache_musico,true)
            )

            val productosTurronesMazapan = mutableListOf(
                Producto("Turrón de Mazapán con Fruta","Una selección de fruta confitada, combinada con el tradicional mazapán elaborado artesanalmente.",0.250,R.drawable.tmazapan_fruta,true),
                Producto("Turrón de Mazapán de Plátano con Chocolate","Combinacion del dulce chocolate con platano",0.300,R.drawable.tmazapan_platano,true),
                Producto("Turrón de Mango, Fruta de la Pasión y Coco","Turrón sorprendente elaborado con mazapán de frutas exóticas y bañado con exquisito chocolate negro. ",0.300,R.drawable.tmazapan_mango,true),
                Producto("Turrón de Mazapán con Cabello de Ángel","Una base de mazapán con el punto de frescor y color que aporta una fruta confitada junto con el punto dulce del cabello de ángel dan como resultado este delicioso turrón.",0.300,R.drawable.tmazapan_cabello,true),
                Producto("Turrón de Mazapán con Praliné","Turrón Mazapán con Praline 300gr.",0.300,R.drawable.tmazapan_praline,true),
                Producto("Turrón de Coco Naranja","La combinación del dulce del coco con el sabor ácido de la naranja crean este turrón refrescante y delicioso",0.300,R.drawable.tmazapan_coco,true)
            )

            val productosTurronesCacahuete = mutableListOf(
                Producto("Turrón de Crema de Cacahuete","Este turrón es imprescindible en tu mesa, está elaborado con materias primas de calidad superior, con un alto porcentaje de cacahuetes (51%) y azúcar.",0.300,R.drawable.cacahuete_normal,true),
                Producto("Turrón de Cacahuete Blando","Cacahuete tostado (60%), azúcar y clara de huevo.",0.200,R.drawable.cacahuete_blando,true),
                Producto("Turrón Conguitos Peanut Cream","Innovadora y deliciosa propuesta de Conguitos",0.250,R.drawable.cacahuete_conguitos,true)
            )

            val productosTurronesPiedra = mutableListOf(
                Producto("Turrón Piedra artesanal","Turron a la Piedra artesanal 300 g.",0.300,R.drawable.piedra_artesanal,true),
                Producto("Turrón Piedra Ecologico El Abuelo","Turrón a base de almendra marcona, azúcar de caña, canela y ralladura de limón. Todo de proveniente de la agricultura ecológica.",0.200,R.drawable.piedra_eco,true),
                Producto("Turrón Piedra sin azúcar","Nuestro producto estrella turron a la piedra sin azúcar añadido con 65% de almendra marcona seleccionada.",0.300,R.drawable.piedra_sin,true),
                Producto("Turrón Piedra Suprem","La versión suprema al tradicional turrón.",0.300,R.drawable.piedra_suprem,true)
            )


            //Productos sección de pasteleria
            val productosMazapanes = mutableListOf(
                Producto("Mazapán Sin Azúcar","Versión sin azúcar de nuestro mazapán.",0.500,R.drawable.mazapan_sin,true),
                Producto("Huesos de Santo","Los huesos de santo son un dulce típico de la Festividad de Todos los Santos y también de la Navidad.",0.500,R.drawable.mazapan_hueso,true),
                Producto("Piñonate Especial","Estos piñonates especiales son piezas de mazapán recubiertos por una capa de piñones.",0.500,R.drawable.mazapan_pino,true),
                Producto("Pastel de Gloria","Los pasteles de gloria son pastelitos rectangulares de mazapán y rellenos de yema confitada",0.500,R.drawable.mazapan_gloria,true),
                Producto("Suspiros de Almendra","Los suspiros de almendra son pastelitos de mazapán decorados con guindas confitadas.",0.300,R.drawable.mazapan_guinda,true),
                Producto("Figuras Mazapán","En estas fechas tan señaladas como la Navidad, las figuritas de mazapán son dulces que nuncan pueden faltar en nuestras mesas,",0.300,R.drawable.mazapan_figuras,true)

            )

            val productosPolvorones = mutableListOf(
                Producto("Polvorón Almendra Artesano Bañado Chocolate","Modificación del reconocido Polvorón con Almendras de Estepa",0.300,R.drawable.polvoron_choco,true),
                Producto("Polvorón de Estepa de Almendra Artesano","Amasado con trozos de almendra tostada y espolvoreado con azúcar glass en la superficie.",0.300,R.drawable.polvoron_estepa,true),
                Producto("Polvorón de Nueces","Manjar elaborado con nueces troceadas de calidad suprema, siendo uno de los polvorones gourmet más selectos.",0.300,R.drawable.polvoron_nueces,true),
                Producto("Tortas de Obrador Artesanas","Exquisitas tortas de polvorón con espléndido sabor a anís dulce que hace este selecto bocado inconfundible.",0.300,R.drawable.polvoron_tortas,true),
                Producto("Polvorón de Estepa de Almendra Artesano","Este dulce es elaborado artesanalmente con las materias primas más selectas y el máximo cariño, característico de nuestro trabajo.",0.300,R.drawable.polvoron_almendra,true)
            )

            val productosPasteles = mutableListOf(
                Producto("Tarta Esferas","Pastel con forma de esfera.",2.50,R.drawable.pastel_esfera,true),
                Producto("Tarta Reno","Tarta con forma de reno, de chocolate.",2.000,R.drawable.pastel_reno,true),
                Producto("Pasteles de Yemas","Pastelitos de yema El Corte Inglés.",0.800,R.drawable.pasteles_yema,true),
                Producto("Empanadas de Mazapán","Empanadas rellenas de Yema.",0.500,R.drawable.pastel_empanadas,true),
                Producto("Roscos de vino","Rosco de vino, estuche de 400gr.",0.400,R.drawable.pastel_rosco,true)
            )


            //Productos seccion de packs
            val productosPacks = mutableListOf(
                Producto("Surtido mini Antiu Xixona","Surtido con gran variedad de productos.",1.200,R.drawable.pack_xixona,true),
                Producto("Bandeja Especialidades","Esta bandeja con nuestro surtido más premium de dulces tradicionales navideños es una magnífica opción para poner como centro de mesa en la cena de navidad.",1.00,R.drawable.pack_variedad,true),
                Producto("Surtido de Turroncillos","Clásico surtido de turrones a granel con las diferentes variedades de turroncillos tradicionales españoles.",0.300,R.drawable.pack_turroncillos,true),
                Producto("Surtido Especial Mezquita","Completo surtido de dulces navideños tradicionales de 1,7 kg con la imagen de la Mezquita de Córdoba.",0.300,R.drawable.pack_mezquita,true),
                Producto("Surtido Sin Gluten","El surtido de dulces navideños más tradicionales sin gluten adecuado para celiacos.",0.500,R.drawable.pack_sin,true),
                Producto("Surtido Tradicional","El original surtido de mantecados, polvorones y dulces de Estepa.",0.300,R.drawable.pack_tradicional,true),
                Producto("Surtido Especial Sin Azúcar","Este surtido con los dulces más tradicionales sin azúcar contiene mantecados caseros sin azúcar, polvorones de almendra sin azúcar, roscos sin azúcar y hojaldradas sin azúcar.",0.300,R.drawable.pack_azucar,true)
            )

            //Inicializacion de subcategorias
            val subTurrones = mutableListOf(
                Categoria("Alicante",R.drawable.pack_imagen ,"El turrón de Alicante,su elaboración se realiza con una pasión y delicadeza que no es fácil de encontrar.",true, productos = productosTurronesAlicante ),
                Categoria("Jijona", R.drawable.turron_imagen, "Turrones de Jijona a tu casa.",true, productos = productosTurronesJijona),
                Categoria("Guirlache", R.drawable.categoria_guirlache, "La palabra Guirlache tiene su origen en el francés Grillage que significa Algo Tostado. Típico de Zaragoza y de Alcoy.",true, productos = productosTurronesGuirlache),
                Categoria("Mazapan", R.drawable.categoria_turron_mazapan, "Dos postres unidos en una rica tableta para estas fiestas.",true, productos = productosTurronesMazapan),
                Categoria("Cacahuete", R.drawable.categoria_cacahuete, "Un sabor que te transportará a esos momentos especiales de la infancia.",true, productos = productosTurronesCacahuete),
                Categoria("A la piedra", R.drawable.categoria_piedra, "Elaborado con un molino de piedra que va triturando las almendras.",true, productos = productosTurronesPiedra)
            )
            val subPasteleria = mutableListOf(
                Categoria("Mazapanes",R.drawable.categoria_mazapan ,"Elaborados con almendras trituradas, azúcar y huevos, relleno con boniato o yema",true, productos = productosMazapanes),
                Categoria("Polvorones",R.drawable.categoria_polvorones ,"Torta, comúnmente pequeña, de harina, manteca y azúcar, cocida en horno fuerte y que se deshace en polvo al comerla.",true, productos = productosPolvorones),
                Categoria("Pasteles",R.drawable.categoria_pasteles ,"Pasteles de todas las formas, colores y sabores.",true, productos = productosPasteles),
            )

            //Inicializacion categorias
            listaCategorias.add(Categoria("Turrones", R.drawable.turron_imagen, "Turrones de todas las clases.", true, subcategorias = subTurrones))
            listaCategorias.add(Categoria("Pasteleria", R.drawable.pasteleria_imagen, "Nuestra sección de pastelería con todo lo necesario para estas fiestas.", true, subcategorias = subPasteleria))
            listaCategorias.add(Categoria("Packs", R.drawable.pack_imagen, "Nuestros pack combinados, las mejores selecciones para todos los gustos.", true, productos = productosPacks))
        }

        fun getCategorias(): List<Categoria> = listaCategorias

        fun getSubcategorias(nombre:String): List<Categoria>{
            val categorias = Categoria.getCategorias().find { it.nombre == nombre }
            val sub = categorias?.subcategorias ?: listOf()
            return sub
        }
    }

    fun addProducto(producto: Producto) {
        productos.add(producto)
    }

    // Agregar una subcategoría
    fun addSubcategoria(subcategoria: Categoria) {
        subcategorias.add(subcategoria)
    }
}
