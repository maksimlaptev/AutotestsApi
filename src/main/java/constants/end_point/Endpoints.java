package constants.end_point;

public enum Endpoints {

    pet("pet"),
    user("user");

    private final String path;

    Endpoints(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }

    public String findPetById(int id) { return path + "/"+ id +""; }
}
