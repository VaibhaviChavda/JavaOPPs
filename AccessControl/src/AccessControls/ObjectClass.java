/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessControls;

/**
 *
 * @author Vaibhavi
 */
public class ObjectClass {
   //by default ervry class extends object class
//  Class {@code Object} is the root of the class hierarchy.
// * Every class has {@code Object} as a superclass. All objects,
// * including arrays, implement the methods of this class.
    
    int num;

    public ObjectClass(int num) {
        this.num = num;
    }
    
    //gives a number represenation of an object
    //unique represention of an object via number
    @Override
        public int hashCode(){
            return super.hashCode();
        }
        
     //
    @Override
      public boolean equals(Object obj){
          return this.num == ((ObjectClass)obj).num;
      }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
      
    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(24);
         ObjectClass obj1 = new ObjectClass(24);
         //both value will be different
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        
        //==  : checks both are pointing to same one
        if(obj == obj1){
            System.out.println("obj is euals to obj1");
        }
        
        //equals() checks content of it 
        if(obj.equals(obj1)){
            System.out.println("obj is euals to obj1");
        }
        
        System.out.println(obj instanceof  ObjectClass);  //true
        System.out.println(obj1.getClass());
  }
    
}
