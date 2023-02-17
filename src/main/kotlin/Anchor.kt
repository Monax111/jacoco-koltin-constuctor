open class Anchor(
    val name: String,
) {
    var field1: String? = null
    var field2: String? = null
        //
    var field10:String? = null

    constructor(
        name: String,
        field1: String? = null,
        field2: String? = null,
        field10:String? = null,
    ) : this(name) {
        this.field1 = field1
        this.field2 = field2
        this.field10 = field10
    }
}