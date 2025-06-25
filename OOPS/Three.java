//Copyconstructor
class Three{
    int []b = {0};//catch karna
    Three(int b[]){
        this.b[0] = b[0];
        System.out.println("parameterized constructor " + this.b[0]);
    }

 Three(Three obj){
        this.b[0] = obj.b[0];
        System.out.print("copy constructor " + this.b[0]);
    }

    public static void main(String args[]){

    
    int arr[]={15};
    Three obj = new Three(arr);
    Three obj1 = new Three(obj);
    }
}