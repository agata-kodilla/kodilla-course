package com.kodilla.good.patterns.challenge.food2door.provider;

public enum ProviderEnum {

    HEALTHY_SHOP("Healthy Shop"),

    EXTRA_FOOD_SHOOP("Extra Food Shop");

    private final String text;

    /**
     * @param text
     */
    ProviderEnum(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }

}
