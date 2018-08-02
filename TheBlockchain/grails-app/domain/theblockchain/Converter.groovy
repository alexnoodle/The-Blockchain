package theblockchain

class Converter {
    Resource inResource
    Resource outResource
    int inNumber
    int outNumber
    String name
    int id

    static constraints = {
        name nullable: true
    }
}
