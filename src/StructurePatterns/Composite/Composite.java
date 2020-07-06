package StructurePatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Backpack{

    private List<Backpack> backpacks = new ArrayList<>();

    @Override
    public void putItems() {
        for (Backpack backpack: backpacks) {
            backpack.putItems();
        }
    }

    public void addComposite (Backpack backpack) {
        this.backpacks.add(backpack);
    }
    public void removeComposite (Backpack backpack) {
        this.backpacks.remove(backpack);
    }

}
