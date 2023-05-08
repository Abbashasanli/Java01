package homeworks.happyfamily;

import java.util.Arrays;
import java.util.Objects;

public final class  Family {
    private Human mother;
     private Human father;
     private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father,  Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = pet;
    }
   public void addChildren(Human child) {

       Human[] newChildren = new Human[children.length + 1];
       for (int i = 0; i < children.length; i++) {
           newChildren[i]=children[i];
       }
           newChildren [children.length]=child;
   }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}", mother, father, Arrays.toString(children), pet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
