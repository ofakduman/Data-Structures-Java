public abstract class Pet {
    // data fields
    private int id;
    private String genus;
    private String diet;
    private String owner;
    private boolean nocturnal;
    private boolean posinous;
    private boolean flies;
    private boolean sex;

    //Constructors
    Pet(int _id, String _genus, String _diet, String _owner,
        boolean _nocturnal,boolean _posinous, boolean _flies, boolean _sex){
        id = _id;
        genus = _genus;
        diet = _diet;
        owner = _owner;
        nocturnal = _nocturnal;
        posinous = _posinous;
        flies = _flies;
        sex = _sex;
    }

    // Accessors
    public int getId() {
        return id;
    }

    public boolean isPosinous() {
        return posinous;
    }

    public void setPosinous(boolean posinous) {
        this.posinous = posinous;
    }

    public String getGenus() {
        return genus;
    }

    public String getDiet() {
        return diet;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public boolean isFlies() {
        return flies;
    }

    public boolean isSex() {
        return sex;
    }

    // Modifiers

    public void setId(int id) {
        this.id = id;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNocturnal(boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    public void setFlies(boolean flies) {
        this.flies = flies;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
