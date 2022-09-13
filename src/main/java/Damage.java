public enum Damage {
    NONE(1),
    MINOR(0.98),
    MODERATE(0.95),
    MAJOR(0.9);

    private final double modifier;

    Damage(double modifier) {

        this.modifier = modifier;
    }

    public double getModifier() {
        return this.modifier;
    }

}
