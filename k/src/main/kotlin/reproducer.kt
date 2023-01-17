import some.Provider


val provider: Provider<String>
    get() = TODO()

fun main() {

    // This is now working fine
    val one: Provider<String?> = provider.mapNullable<String?> { null }

    // I would have expected the compiler to fail on this one though
    val two: Provider<String> = provider.mapNonNullable { null }
}
