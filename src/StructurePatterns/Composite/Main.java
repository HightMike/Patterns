package StructurePatterns.Composite;

public class Main {

    public static void main(String[] args) {

        Backpack bigBackpack1 = new BigBackpack();
        Backpack childrenBackpack1 = new ChildrenBackpack();
        Backpack childrenBackpack2 = new ChildrenBackpack();

        Backpack womanBackpack1 = new WomanBackpack();
        Backpack womanBackpack2 = new WomanBackpack();

        Composite composite1 = new Composite();
        composite1.addComposite(childrenBackpack1);
        composite1.addComposite(womanBackpack2);
        composite1.addComposite(bigBackpack1);

        Composite composite2 = new Composite();
        composite2.addComposite(childrenBackpack2);
        composite2.addComposite(womanBackpack1);
        composite2.addComposite(womanBackpack2);
        composite2.addComposite(bigBackpack1);

        Composite composite = new Composite();
        composite.addComposite(composite1);
        composite.addComposite(composite2);
        composite.putItems();

    }

}
