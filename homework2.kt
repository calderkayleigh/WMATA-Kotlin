/**
 * A class which represents a Metro station.
 *
 * In Kotlin, a `data class` is similar to a regular `class`, but is meant for holding strictly data (as opposed to a class
 * meant to do some processing or implement some behavior). We'll learn more about data classes in a future lecture.
 *
 * https://kotlinlang.org/docs/reference/data-classes.html
 *
 * You can access the fields in a data class using getters / dot-notation:
 *     val foggyBottom = Station(name = "Foggy Bottom-GWU", code = "C04")
 *     println(foggyBottom.name)
 *     println(foggyBottom.code)
 *
 * @param name The human-readable name of the station (e.g. "Foggy Bottom-GWU")
 * @param code The unique identifier for a particular station / station platform (e.g. "C04")
 *
 * YOU MAY NOT MODIFY THIS CLASS.
 */
data class Station(val name: String, val code: String)

/**
 * Stations, in order, for the Silver line.
 *
 * YOU MAY NOT MODIFY THIS LIST.
 */
val SILVER_LINE = listOf(
        Station(name = "Wiehle-Reston East", code = "N06"),
        Station(name = "Spring Hill", code = "N04"),
        Station(name = "Greensboro", code = "N03"),
        Station(name = "Tysons Corner", code = "N02"),
        Station(name = "McLean", code = "N01"),
        Station(name = "East Falls Church", code = "K05"),
        Station(name = "Ballston-MU", code = "K04"),
        Station(name = "Virginia Square-GMU", code = "K03"),
        Station(name = "Clarendon", code = "K02"),
        Station(name = "Court House", code = "K01"),
        Station(name = "Rosslyn", code = "C05"),
        Station(name = "Foggy Bottom-GWU", code = "C04"),
        Station(name = "Farragut West", code = "C03"),
        Station(name = "McPherson Square", code = "C02"),
        Station(name = "Metro Center", code = "C01"),
        Station(name = "Federal Triangle", code = "D01"),
        Station(name = "Smithsonian", code = "D02"),
        Station(name = "L'Enfant Plaza", code = "D03"),
        Station(name = "Federal Center SW", code = "D04"),
        Station(name = "Capitol South", code = "D05"),
        Station(name = "Eastern Market", code = "D06"),
        Station(name = "Potomac Ave", code = "D07"),
        Station(name = "Stadium-Armory", code = "D08"),
        Station(name = "Benning Road", code = "G01"),
        Station(name = "Capitol Heights", code = "G02"),
        Station(name = "Addison Road-Seat Pleasant", code = "G03"),
        Station(name = "Morgan Boulevard", code = "G04"),
        Station(name = "Largo Town Center", code = "G05")
)

/**
 * Stations, in order, for the Orange line.
 *
 * YOU MAY NOT MODIFY THIS LIST.
 */
val ORANGE_LINE = listOf(
        Station(name = "Vienna/Fairfax-GMU", code = "K08"),
        Station(name = "Dunn Loring-Merrifield", code = "K07"),
        Station(name = "West Falls Church-VT/UVA", code = "K06"),
        Station(name = "East Falls Church", code = "K05"),
        Station(name = "Ballston-MU", code = "K04"),
        Station(name = "Virginia Square-GMU", code = "K03"),
        Station(name = "Clarendon", code = "K02"),
        Station(name = "Court House", code = "K01"),
        Station(name = "Rosslyn", code = "C05"),
        Station(name = "Foggy Bottom-GWU", code = "C04"),
        Station(name = "Farragut West", code = "C03"),
        Station(name = "McPherson Square", code = "C02"),
        Station(name = "Metro Center", code = "C01"),
        Station(name = "Federal Triangle", code = "D01"),
        Station(name = "Smithsonian", code = "D02"),
        Station(name = "L'Enfant Plaza", code = "D03"),
        Station(name = "Federal Center SW", code = "D04"),
        Station(name = "Capitol South", code = "D05"),
        Station(name = "Eastern Market", code = "D06"),
        Station(name = "Potomac Ave", code = "D07"),
        Station(name = "Stadium-Armory", code = "D08"),
        Station(name = "Minnesota Ave", code = "D09"),
        Station(name = "Deanwood", code = "D10"),
        Station(name = "Cheverly", code = "D11"),
        Station(name = "Landover", code = "D12"),
        Station(name = "New Carrollton", code = "D13")
)

/**
 * Stations, in order, for the Blue line.
 *
 * YOU MAY NOT MODIFY THIS LIST.
 */
val BLUE_LINE = listOf(
        Station(name = "Franconia-Springfield", code = "J03"),
        Station(name = "Van Dorn Street", code = "J02"),
        Station(name = "King St-Old Town", code = "C13"),
        Station(name = "Braddock Road", code = "C12"),
        Station(name = "Ronald Reagan Washington National Airport", code = "C10"),
        Station(name = "Crystal City", code = "C09"),
        Station(name = "Pentagon City", code = "C08"),
        Station(name = "Pentagon", code = "C07"),
        Station(name = "Arlington Cemetery", code = "C06"),
        Station(name = "Rosslyn", code = "C05"),
        Station(name = "Foggy Bottom-GWU", code = "C04"),
        Station(name = "Farragut West", code = "C03"),
        Station(name = "McPherson Square", code = "C02"),
        Station(name = "Metro Center", code = "C01"),
        Station(name = "Federal Triangle", code = "D01"),
        Station(name = "Smithsonian", code = "D02"),
        Station(name = "L'Enfant Plaza", code = "D03"),
        Station(name = "Federal Center SW", code = "D04"),
        Station(name = "Capitol South", code = "D05"),
        Station(name = "Eastern Market", code = "D06"),
        Station(name = "Potomac Ave", code = "D07"),
        Station(name = "Stadium-Armory", code = "D08"),
        Station(name = "Benning Road", code = "G01"),
        Station(name = "Capitol Heights", code = "G02"),
        Station(name = "Addison Road-Seat Pleasant", code = "G03"),
        Station(name = "Morgan Boulevard", code = "G04"),
        Station(name = "Largo Town Center", code = "G05")
)

// If needed, you may add additional data structures / variables in this global scope

fun main(args: Array<String>) {
    val exampleInput = "C01" // Metro Center

    pathFromFoggyBottom(exampleInput)
}

fun pathFromFoggyBottom(destinationCode: String) {
    // TODO Implement this function according to the homework description
}
