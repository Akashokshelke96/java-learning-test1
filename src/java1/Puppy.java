package java1;

public class Puppy {
    int puppyAge;
    public void Puppy(String name){
        System.out.println("Puppy name is" + name);

    }
    void biting(){
        System.out.println("puppy is biting");

    }
   public void setAge(int age){
       puppyAge = age;

    }
   public int getAge(){
        System.out.println(puppyAge);
        return puppyAge;

    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.getAge();
        myPuppy.setAge(12);
        myPuppy.getAge();
    }

}
