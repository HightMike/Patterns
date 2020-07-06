package StructurePatterns.Composite;

public class ChildrenBackpack implements Backpack{

    @Override
    public void putItems() {
        System.out.println("Кладем вещи в детский рюкзак");
    }
}
