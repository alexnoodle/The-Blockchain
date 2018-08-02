package theblockchain

class User {
    String name
    int id
    String password
    static hasMany = [resources: Resource, converters: Converter, monetaryUnits: Currency]

    static constraints = {
        resources nullable: true
        converters nullable: true
        monetaryUnits nullable: true
    }
}
