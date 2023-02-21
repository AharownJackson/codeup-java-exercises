package media;

public class Cds extends Media {
    @Override
    public void deviceNeeded() {
        System.out.println("If you have a CD-Player, you can listen to this CD.");
    }

    @Override
    public void materialMadeOf() {
        System.out.println("CDs are made from clear polycarbonate plastic substrate, a reflective metallic layer, and a clear protective coating of acrylic plastic");
    }

    @Override
    public void demolish() {
        System.out.println("So sad, other people could have enjoyed that.");
    }

    public Cds(boolean adultOnly, String name) {
        this.adultOnly = adultOnly;
        this.name = name;
    }
}
