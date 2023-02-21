package media;

public class Newspapers extends Media {
    @Override
    public void deviceNeeded() {
        System.out.println("No device is needed to consume this form of media. If you need help with accessibility please approach the nearest librarian. Thank you, have a great day!");
    }

    @Override
    public void materialMadeOf() {
        System.out.println("Newspapers are made from an uncoated ground wood paper made by mechanically grinding wood pulp without first removing lignin and other wood pulp components");

    }

    @Override
    public void demolish() {
        System.out.println("So sad, other people could have enjoyed that.");
    }
}
