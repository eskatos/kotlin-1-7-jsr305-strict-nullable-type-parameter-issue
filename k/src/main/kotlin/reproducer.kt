import some.Provider


val provider: Provider<String>
    get() = TODO()

fun main() {

    val one: Provider<String?> = provider.mapNullable<String?> { null }
    val two: Provider<String> = provider.mapNonNullable { null }
}
