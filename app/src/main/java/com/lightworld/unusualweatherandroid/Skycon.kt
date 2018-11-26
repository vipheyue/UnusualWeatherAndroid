package com.lightworld.unusualweatherandroid

object Skycon {
    var CLEAR_DAY = "\uD83C\uDF1E️"
    var CLEAR_NIGHT = "\uD83C\uDF1A"
    var PARTLY_CLOUDY_DAY = "☁️"
    var PARTLY_CLOUDY_NIGHT = "☁️"
    var CLOUDY = "☁️"
    var RAIN = "\uD83C\uDF27️"
    var SNOW = "❄️"
    var WIND = "\uD83D\uDCA8"
    var HAZE = "\uD83C\uDF2A️"

    fun getLogo(skq: String): String {
        when (skq) {
            "CLEAR_DAY" -> {
                return CLEAR_DAY
            }
            "CLEAR_NIGHT" -> {
                return CLEAR_NIGHT
            }
            "PARTLY_CLOUDY_DAY" -> {
                return PARTLY_CLOUDY_DAY
            }
            "PARTLY_CLOUDY_NIGHT" -> {
                return PARTLY_CLOUDY_NIGHT
            }
            "CLOUDY" -> {
                return CLOUDY
            }
            "RAIN" -> {
                return RAIN
            }

            "SNOW" -> {
                return SNOW
            }

            "WIND" -> {
                return WIND
            }

            "HAZE" -> {
                return HAZE
            }

            else -> {
                return ""
            }
        }
    }
}
