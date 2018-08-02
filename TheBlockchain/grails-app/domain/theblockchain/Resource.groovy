package theblockchain

class Resource {
    String name
    int id
    static belongsTo = [user: User]

    static constraints = {
        name nullable: true
    }
}
