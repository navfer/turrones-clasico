# Turrones Vega Baja   
![Banner de proyecto](banner.png)  

Aplicación móvil sencilla de gestión de tienda de turrones y su compra de productos.
Este proyecto está desarrollado utilizando la arquitectura tradicional de Android, con vistas XML y actividades.  

Integra los siguientes elementos:  
- Actividades.  
- Fragmentos.  
- Navegación.  

## Construcción
Se utilizaron las siguientes tecnologías para su construcción:  
- `Kotlin`: lenguaje oficial y principal del desarrollo Android.
- `LiveData`: objeto observable que notifica cambios de datos en la vista.
- `ViewModel`: actuando como puente entre la vista y el modelo.
- `Android Studio` como IDE de trabajo.

## Estructura del directorio del proyecto
```plaintext
.
├── main
│   ├── AndroidManifest.xml
│   ├── java
│   │   └── com
│   │       └── navfer
│   │           └── turronesvegabajaclasico
│   │               ├── Categoria.kt
│   │               ├── CategoriaAdaptador.kt
│   │               ├── CombinadosFragment.kt
│   │               ├── MainActivity.kt
│   │               ├── MainFragment.kt
│   │               ├── Pedido.kt
│   │               ├── PedidoFragment.kt
│   │               ├── Producto.kt
│   │               ├── ProductoAdaptador.kt
│   │               ├── carrito
│   │               │   ├── CarritoAdaptador.kt
│   │               │   ├── CarritoFragment.kt
│   │               │   └── CarritoViewModel.kt
│   │               ├── pasteleria
│   │               │   ├── PasteleriaSeccionFragment.kt
│   │               │   ├── PMazapanesFragment.kt
│   │               │   ├── PPastelesFragment.kt
│   │               │   └── PPolvoronesFragment.kt
│   │               └── turrones
│   │                   ├── TAlicanteFragment.kt
│   │                   ├── TCacahueteFragment.kt
│   │                   ├── TGuirlacheFragment.kt
│   │                   ├── TJijonaFragment.kt
│   │                   ├── TMazapanFragment.kt
│   │                   ├── TPiedraFragment.kt
│   │                   └── TurronesSeccionFragment.kt
│   └── res
│       ├── drawable
│       │   ├── alicante_antiu.jpg
│       │   ├── alicante_chocoblanco.jpg
│       │   ├── alicante_chocolate.jpg
│       │   ├── alicante_nueces.jpg
│       │   ├── alicante_torta.jpg
│       │   ├── alicante_yema.jpg
│       │   ├── cacahuete_blando.png
│       │   ├── cacahuete_conguitos.jpg
│       │   ├── cacahuete_normal.jpg
│       │   ├── carrito_compra.xml
│       │   ├── categoria_cacahuete.jpg
│       │   ├── categoria_guirlache.jpg
│       │   ├── categoria_mazapan.jpg
│       │   ├── categoria_pasteles.jpeg
│       │   ├── categoria_piedra.jpg
│       │   ├── categoria_polvorones.jpg
│       │   ├── categoria_turron_mazapan.jpg
│       │   ├── chimuelo.jpg
│       │   ├── guirlache_almendras.jpg
│       │   ├── guirlache_choco.jpg
│       │   ├── guirlache_musico.jpg
│       │   ├── guirlache_nueces.jpg
│       │   ├── guirlache_porciones.jpg
│       │   ├── ic_launcher_background.xml
│       │   ├── ic_launcher_foreground.xml
│       │   ├── jijona_choco.jpg
│       │   ├── jijona_fruta.jpg
│       │   ├── jijona_normal.jpg
│       │   ├── jijona_sin.jpg
│       │   ├── jijona_yema.jpg
│       │   ├── logototal.png
│       │   ├── mazapan_figuras.jpg
│       │   ├── mazapan_gloria.jpg
│       │   ├── mazapan_guinda.jpg
│       │   ├── mazapan_hueso.jpg
│       │   ├── mazapan_pino.jpg
│       │   ├── mazapan_sin.jpg
│       │   ├── pack_azucar.jpg
│       │   ├── pack_imagen.jpg
│       │   ├── pack_mezquita.jpg
│       │   ├── pack_sin.jpg
│       │   ├── pack_tradicional.jpg
│       │   ├── pack_turroncillos.jpg
│       │   ├── pack_variedad.jpg
│       │   ├── pack_xixona.jpg
│       │   ├── pasteleria_imagen.jpg
│       │   ├── pasteles_yema.jpg
│       │   ├── pastel_empanadas.jpg
│       │   ├── pastel_esfera.jpg
│       │   ├── pastel_reno.png
│       │   ├── pastel_rosco.jpg
│       │   ├── piedra_artesanal.jpg
│       │   ├── piedra_eco.jpg
│       │   ├── piedra_sin.jpg
│       │   ├── piedra_suprem.jpg
│       │   ├── polvoron_almendra.jpg
│       │   ├── polvoron_choco.jpg
│       │   ├── polvoron_estepa.jpg
│       │   ├── polvoron_nueces.jpg
│       │   ├── polvoron_tortas.jpg
│       │   ├── sintr.png
│       │   ├── t.png
│       │   ├── tmazapan_cabello.jpg
│       │   ├── tmazapan_coco.jpg
│       │   ├── tmazapan_fruta.jpg
│       │   ├── tmazapan_mango.jpg
│       │   ├── tmazapan_platano.jpg
│       │   ├── tmazapan_praline.jpg
│       │   └── turron_imagen.jpg
│       └── layout
│           ├── activity_main.xml
│           ├── card_carrito.xml
│           ├── card_categoria.xml
│           ├── card_producto.xml
│           ├── fragment_carrito.xml
│           ├── fragment_combinados.xml
│           ├── fragment_main.xml
│           ├── fragment_pasteleria_seccion.xml
│           ├── fragment_pedido.xml
│           ├── fragment_p_mazapanes.xml
│           ├── fragment_p_pasteles.xml
│           ├── fragment_p_polvorones.xml
│           ├── fragment_turrones_seccion.xml
│           ├── fragment_t_alicante.xml
│           ├── fragment_t_cacahuete.xml
│           ├── fragment_t_guirlache.xml
│           ├── fragment_t_jijona.xml
│           ├── fragment_t_mazapan.xml
│           └── fragment_t_piedra.xml
