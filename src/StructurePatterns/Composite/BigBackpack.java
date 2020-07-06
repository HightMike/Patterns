package StructurePatterns.Composite;

public class BigBackpack implements Backpack {

    @Override
    public void putItems() {
        System.out.println("Кладем много вещей в большой рюкзак");
    }
}
