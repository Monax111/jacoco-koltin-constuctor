import org.junit.jupiter.api.Test

class AnchorTest {

    @Test
    fun defaultConstructor() {
        val anchor = Anchor("").apply {
            field1 = ""
            field2 = ""
            field10 = ""
            field1
            field2
            field10
            name
        }
    }

    @Test
    fun secondaryConstructor() {
        Anchor("", null, null, null)
    }

}