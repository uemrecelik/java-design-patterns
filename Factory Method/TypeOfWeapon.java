public enum TypeOfWeapon {
    sSword("short sword"),//short knife
    spear("spear"),//spear
    axe("axe"),
    any("");

    private String type;

    TypeOfWeapon(String type)
    {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
